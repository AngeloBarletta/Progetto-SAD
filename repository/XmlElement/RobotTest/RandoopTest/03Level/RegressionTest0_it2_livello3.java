
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement2.removeElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement2.getElement(10);
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


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
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
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement xmlElement9 = new XmlElement("hi!", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement9, (int)(short)1);
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
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    XmlElement xmlElement0 = null;
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement0, "");
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


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = xmlElement2.getParent();
    xmlElement2.removeAllElements();
    int i31 = xmlElement2.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    java.lang.Object obj9 = xmlElement6.clone();
    xmlElement6.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    XmlElement xmlElement32 = xmlElement6.addSubElement(xmlElement31);
    XmlElement xmlElement33 = xmlElement6.getParent();
    xmlElement2.setParent(xmlElement33);
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = xmlElement33.equals((java.lang.Object)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement33);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    xmlElement6.removeAllElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement11 = xmlElement6.getElement((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement2.getElement((int)(byte)100);
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
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.util.List list19 = xmlElement15.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement10 = xmlElement2.addSubElement("");
    java.util.List list11 = xmlElement10.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement2.getElement((int)(short)1);
    xmlElement30.removeFromParent();
    java.lang.Object obj34 = xmlElement30.addAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.lang.String str20 = xmlElement2.getAttribute("hi!");
    xmlElement2.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = xmlElement2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement31 = xmlElement29.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    XmlElement xmlElement2 = new XmlElement("", "hi!");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement31);
    java.lang.Object obj35 = xmlElement31.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement31 = null;
    XmlElement xmlElement32 = xmlElement29.removeElement(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    xmlElement2.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    int i25 = xmlElement24.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement2.notifyObservers((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement29.setName("");
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement51.setName("hi!");
    XmlElement xmlElement54 = xmlElement29.removeElement(xmlElement51);
    java.lang.Object obj57 = xmlElement51.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement9 = null;
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement2.addSubElement(xmlElement9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement30.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration enumeration33 = xmlElement32.getAttributeNames();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement xmlElement9 = xmlElement2.addSubElement("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement9);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement30 = xmlElement27.getElement((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.lang.String str20 = xmlElement2.getAttribute("hi!");
    java.lang.String str21 = xmlElement2.getName();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement23 = xmlElement2.getElement((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement10 = xmlElement2.addSubElement("");
    XmlElement xmlElement12 = xmlElement10.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = xmlElement12.hasChanged();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement12);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.removeAllElements();
    xmlElement18.setData("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement23 = xmlElement18.removeElement((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    xmlElement2.removeFromParent();
    XmlElement xmlElement12 = new XmlElement("hi!", "hi!");
    xmlElement12.deleteObservers();
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    int i17 = xmlElement16.countObservers();
    boolean b18 = xmlElement12.addElement(xmlElement16);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement21.deleteObservers();
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    boolean b27 = xmlElement21.addElement(xmlElement25);
    XmlElement xmlElement28 = xmlElement12.addSubElement(xmlElement25);
    java.util.Enumeration enumeration29 = xmlElement25.getAttributeNames();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement25, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement30.notifyObservers((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    XmlElement xmlElement23 = new XmlElement("hi!", "hi!");
    int i24 = xmlElement23.countObservers();
    java.lang.Object obj27 = xmlElement23.addAttribute("", "hi!");
    xmlElement23.removeFromParent();
    int i29 = xmlElement23.count();
    XmlElement xmlElement31 = xmlElement23.addSubElement("");
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    int i39 = xmlElement38.countObservers();
    boolean b40 = xmlElement34.addElement(xmlElement38);
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    XmlElement xmlElement60 = xmlElement34.addSubElement(xmlElement59);
    XmlElement xmlElement62 = xmlElement34.getElement((int)(short)1);
    XmlElement xmlElement63 = xmlElement31.removeElement(xmlElement62);
    xmlElement15.insertElement(xmlElement62, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement63);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    xmlElement10.deleteObservers();
    XmlElement xmlElement14 = new XmlElement("hi!", "hi!");
    int i15 = xmlElement14.countObservers();
    boolean b16 = xmlElement10.addElement(xmlElement14);
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    xmlElement19.deleteObservers();
    XmlElement xmlElement23 = new XmlElement("hi!", "hi!");
    int i24 = xmlElement23.countObservers();
    boolean b25 = xmlElement19.addElement(xmlElement23);
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    xmlElement28.deleteObservers();
    XmlElement xmlElement32 = new XmlElement("hi!", "hi!");
    int i33 = xmlElement32.countObservers();
    boolean b34 = xmlElement28.addElement(xmlElement32);
    XmlElement xmlElement35 = xmlElement19.addSubElement(xmlElement32);
    xmlElement10.setParent(xmlElement35);
    xmlElement35.notifyObservers();
    java.lang.String str38 = xmlElement35.getName();
    XmlElement xmlElement41 = new XmlElement("hi!", "hi!");
    int i42 = xmlElement41.countObservers();
    java.lang.Object obj45 = xmlElement41.addAttribute("", "hi!");
    xmlElement41.removeFromParent();
    int i47 = xmlElement41.count();
    XmlElement xmlElement50 = new XmlElement("hi!", "hi!");
    int i51 = xmlElement50.countObservers();
    java.lang.Object obj54 = xmlElement50.addAttribute("", "hi!");
    xmlElement50.removeFromParent();
    int i56 = xmlElement50.count();
    XmlElement xmlElement58 = xmlElement50.addSubElement("");
    xmlElement41.append(xmlElement50);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str60 = xmlElement41.getAttributes();
    boolean b61 = xmlElement35.addElement(xmlElement41);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement41);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement64 = xmlElement41.removeElement((int)'4');
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
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement.printNode(xmlElement0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement4 = xmlElement0.getElement(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    xmlElement42.deleteObservers();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    boolean b48 = xmlElement42.addElement(xmlElement46);
    XmlElement xmlElement49 = xmlElement33.addSubElement(xmlElement46);
    java.lang.String str51 = xmlElement33.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str52 = null;
    xmlElement33.setAttributes(hashtable_str_str52);
    XmlElement xmlElement54 = xmlElement2.addSubElement(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement6.getAttributes();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    java.lang.String str29 = xmlElement11.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str30 = null;
    xmlElement11.setAttributes(hashtable_str_str30);
    xmlElement6.notifyObservers((java.lang.Object)xmlElement11);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement11, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "");
    xmlElement2.append(xmlElement31);
    XmlElement xmlElement34 = xmlElement2.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    xmlElement27.removeAllElements();
    java.util.List list32 = xmlElement27.getElements();
    java.util.Enumeration enumeration33 = xmlElement27.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration33);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    xmlElement2.removeAllElements();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    xmlElement25.deleteObservers();
    XmlElement xmlElement29 = new XmlElement("hi!", "hi!");
    int i30 = xmlElement29.countObservers();
    boolean b31 = xmlElement25.addElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.addSubElement(xmlElement29);
    XmlElement xmlElement33 = xmlElement7.addSubElement(xmlElement32);
    XmlElement xmlElement35 = xmlElement7.getElement((int)(short)1);
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    xmlElement38.deleteObservers();
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    int i43 = xmlElement42.countObservers();
    boolean b44 = xmlElement38.addElement(xmlElement42);
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    xmlElement47.deleteObservers();
    XmlElement xmlElement51 = new XmlElement("hi!", "hi!");
    int i52 = xmlElement51.countObservers();
    boolean b53 = xmlElement47.addElement(xmlElement51);
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    xmlElement56.deleteObservers();
    XmlElement xmlElement60 = new XmlElement("hi!", "hi!");
    int i61 = xmlElement60.countObservers();
    boolean b62 = xmlElement56.addElement(xmlElement60);
    XmlElement xmlElement63 = xmlElement47.addSubElement(xmlElement60);
    XmlElement xmlElement64 = xmlElement38.addSubElement(xmlElement63);
    XmlElement xmlElement65 = xmlElement38.getParent();
    xmlElement7.setParent(xmlElement65);
    XmlElement xmlElement67 = xmlElement2.removeElement(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement67);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement2.getElement((int)(short)1);
    xmlElement30.removeFromParent();
    xmlElement30.setData("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    java.lang.String str30 = xmlElement28.getAttribute("hi!");
    java.lang.Object obj31 = xmlElement28.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement2.getElement((int)(short)1);
    xmlElement30.removeFromParent();
    XmlElement.printNode(xmlElement30, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    int i4 = xmlElement3.countObservers();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    xmlElement25.deleteObservers();
    XmlElement xmlElement29 = new XmlElement("hi!", "hi!");
    int i30 = xmlElement29.countObservers();
    boolean b31 = xmlElement25.addElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.addSubElement(xmlElement29);
    XmlElement xmlElement33 = xmlElement7.addSubElement(xmlElement32);
    XmlElement xmlElement34 = xmlElement7.getParent();
    xmlElement3.setParent(xmlElement34);
    XmlElement xmlElement36 = xmlElement0.removeElement(xmlElement34);
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    xmlElement39.deleteObservers();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    boolean b45 = xmlElement39.addElement(xmlElement43);
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    xmlElement48.deleteObservers();
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    int i53 = xmlElement52.countObservers();
    boolean b54 = xmlElement48.addElement(xmlElement52);
    XmlElement xmlElement55 = xmlElement39.addSubElement(xmlElement52);
    XmlElement xmlElement58 = new XmlElement("hi!", "hi!");
    xmlElement39.append(xmlElement58);
    XmlElement xmlElement61 = xmlElement39.getElement("hi!");
    java.lang.String str64 = xmlElement39.getAttribute("", "hi!");
    XmlElement xmlElement67 = new XmlElement("hi!", "hi!");
    int i68 = xmlElement67.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str69 = xmlElement67.getAttributes();
    java.lang.String str71 = xmlElement67.getAttribute("hi!");
    XmlElement xmlElement72 = xmlElement39.addSubElement(xmlElement67);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement36.append(xmlElement39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement72);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement29.setName("");
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement51.setName("hi!");
    XmlElement xmlElement54 = xmlElement29.removeElement(xmlElement51);
    xmlElement51.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    XmlElement xmlElement23 = new XmlElement("hi!", "hi!");
    int i24 = xmlElement23.countObservers();
    java.lang.Object obj27 = xmlElement23.addAttribute("", "hi!");
    xmlElement23.removeFromParent();
    int i29 = xmlElement23.count();
    XmlElement xmlElement31 = xmlElement23.addSubElement("");
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    int i39 = xmlElement38.countObservers();
    boolean b40 = xmlElement34.addElement(xmlElement38);
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    XmlElement xmlElement60 = xmlElement34.addSubElement(xmlElement59);
    XmlElement xmlElement62 = xmlElement34.getElement((int)(short)1);
    XmlElement xmlElement63 = xmlElement31.removeElement(xmlElement62);
    XmlElement xmlElement64 = xmlElement15.addSubElement(xmlElement31);
    java.lang.String str65 = xmlElement31.getData();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.util.Enumeration enumeration19 = xmlElement15.getAttributeNames();
    XmlElement xmlElement22 = new XmlElement("hi!", "hi!");
    xmlElement22.deleteObservers();
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    int i27 = xmlElement26.countObservers();
    boolean b28 = xmlElement22.addElement(xmlElement26);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement38 = xmlElement22.addSubElement(xmlElement35);
    xmlElement38.setName("hi!");
    xmlElement38.setData("");
    XmlElement xmlElement43 = xmlElement15.addSubElement(xmlElement38);
    java.util.Observer observer44 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement43.addObserver(observer44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement2.notifyObservers();
    java.lang.Object obj30 = xmlElement2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    xmlElement6.setParent(xmlElement31);
    xmlElement31.notifyObservers();
    java.lang.String str34 = xmlElement31.getName();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    xmlElement37.removeFromParent();
    int i43 = xmlElement37.count();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    java.lang.Object obj50 = xmlElement46.addAttribute("", "hi!");
    xmlElement46.removeFromParent();
    int i52 = xmlElement46.count();
    XmlElement xmlElement54 = xmlElement46.addSubElement("");
    xmlElement37.append(xmlElement46);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement37.getAttributes();
    boolean b57 = xmlElement31.addElement(xmlElement37);
    xmlElement2.append(xmlElement31);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement60 = xmlElement31.removeElement((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    int i39 = xmlElement38.countObservers();
    boolean b40 = xmlElement34.addElement(xmlElement38);
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    XmlElement xmlElement60 = xmlElement34.addSubElement(xmlElement59);
    XmlElement xmlElement61 = xmlElement25.addSubElement(xmlElement60);
    XmlElement xmlElement62 = xmlElement25.getParent();
    java.util.Observer observer63 = null;
    xmlElement25.deleteObserver(observer63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement23 = xmlElement7.addSubElement(xmlElement20);
    java.lang.String str25 = xmlElement7.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    xmlElement7.setAttributes(hashtable_str_str26);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement7);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement30 = xmlElement2.removeElement((int)(short)10);
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
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    java.lang.Object obj29 = xmlElement27.clone();
    XmlElement xmlElement31 = xmlElement27.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.removeAllElements();
    xmlElement18.setData("");
    XmlElement xmlElement23 = xmlElement18.getElement("");
    XmlElement xmlElement24 = new XmlElement();
    xmlElement18.setParent(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement31);
    XmlElement xmlElement34 = xmlElement2.getElement((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement.printNode(xmlElement2, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement30.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    xmlElement25.removeFromParent();
    java.util.Observer observer30 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement25.addObserver(observer30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = xmlElement24.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str25);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement20 = xmlElement18.getElement("");
    java.lang.Object obj23 = xmlElement18.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement27 = new XmlElement("hi!", "hi!");
    xmlElement27.deleteObservers();
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    int i32 = xmlElement31.countObservers();
    boolean b33 = xmlElement27.addElement(xmlElement31);
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement43 = xmlElement27.addSubElement(xmlElement40);
    XmlElement.printNode(xmlElement40, "");
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    java.lang.Object obj52 = xmlElement48.addAttribute("", "hi!");
    xmlElement48.removeFromParent();
    int i54 = xmlElement48.count();
    XmlElement xmlElement56 = xmlElement48.addSubElement("");
    XmlElement xmlElement59 = new XmlElement("hi!", "hi!");
    xmlElement59.deleteObservers();
    XmlElement xmlElement63 = new XmlElement("hi!", "hi!");
    int i64 = xmlElement63.countObservers();
    boolean b65 = xmlElement59.addElement(xmlElement63);
    XmlElement xmlElement68 = new XmlElement("hi!", "hi!");
    xmlElement68.deleteObservers();
    XmlElement xmlElement72 = new XmlElement("hi!", "hi!");
    int i73 = xmlElement72.countObservers();
    boolean b74 = xmlElement68.addElement(xmlElement72);
    XmlElement xmlElement77 = new XmlElement("hi!", "hi!");
    xmlElement77.deleteObservers();
    XmlElement xmlElement81 = new XmlElement("hi!", "hi!");
    int i82 = xmlElement81.countObservers();
    boolean b83 = xmlElement77.addElement(xmlElement81);
    XmlElement xmlElement84 = xmlElement68.addSubElement(xmlElement81);
    XmlElement xmlElement85 = xmlElement59.addSubElement(xmlElement84);
    XmlElement xmlElement87 = xmlElement59.getElement((int)(short)1);
    XmlElement xmlElement88 = xmlElement56.removeElement(xmlElement87);
    XmlElement xmlElement89 = xmlElement40.addSubElement(xmlElement56);
    XmlElement xmlElement90 = xmlElement2.addSubElement(xmlElement56);
    java.util.List list91 = xmlElement2.getElements();
    XmlElement xmlElement93 = new XmlElement("");
    xmlElement2.notifyObservers((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    XmlElement xmlElement1 = new XmlElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement1.removeElement((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.removeAllElements();
    int i4 = xmlElement2.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement2.getElement((int)(short)1);
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    boolean b40 = xmlElement2.equals((java.lang.Object)xmlElement37);
    java.lang.String str43 = xmlElement2.getAttribute("", "");
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    xmlElement46.deleteObservers();
    XmlElement xmlElement50 = new XmlElement("hi!", "hi!");
    int i51 = xmlElement50.countObservers();
    boolean b52 = xmlElement46.addElement(xmlElement50);
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    xmlElement55.deleteObservers();
    XmlElement xmlElement59 = new XmlElement("hi!", "hi!");
    int i60 = xmlElement59.countObservers();
    boolean b61 = xmlElement55.addElement(xmlElement59);
    XmlElement xmlElement64 = new XmlElement("hi!", "hi!");
    xmlElement64.deleteObservers();
    XmlElement xmlElement68 = new XmlElement("hi!", "hi!");
    int i69 = xmlElement68.countObservers();
    boolean b70 = xmlElement64.addElement(xmlElement68);
    XmlElement xmlElement71 = xmlElement55.addSubElement(xmlElement68);
    XmlElement xmlElement72 = xmlElement46.addSubElement(xmlElement71);
    XmlElement xmlElement73 = xmlElement46.getParent();
    XmlElement xmlElement74 = xmlElement2.removeElement(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement74);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    java.lang.String str31 = xmlElement27.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    XmlElement xmlElement2 = new XmlElement("hi!", hashtable_str_str1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    xmlElement2.removeFromParent();
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    xmlElement15.removeAllElements();
    XmlElement xmlElement22 = xmlElement15.getParent();
    xmlElement15.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    xmlElement25.notifyObservers((java.lang.Object)"");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement35 = xmlElement25.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    int i39 = xmlElement38.countObservers();
    boolean b40 = xmlElement34.addElement(xmlElement38);
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    XmlElement xmlElement60 = xmlElement34.addSubElement(xmlElement59);
    XmlElement xmlElement61 = xmlElement25.addSubElement(xmlElement60);
    XmlElement xmlElement62 = xmlElement25.getParent();
    boolean b63 = xmlElement62.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    xmlElement27.removeAllElements();
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    int i35 = xmlElement34.countObservers();
    java.lang.Object obj38 = xmlElement34.addAttribute("", "hi!");
    xmlElement34.removeFromParent();
    int i40 = xmlElement34.count();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    java.lang.Object obj47 = xmlElement43.addAttribute("", "hi!");
    xmlElement43.removeFromParent();
    int i49 = xmlElement43.count();
    XmlElement xmlElement51 = xmlElement43.addSubElement("");
    xmlElement34.append(xmlElement43);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str53 = xmlElement34.getAttributes();
    xmlElement27.setAttributes(hashtable_str_str53);
    XmlElement xmlElement56 = xmlElement27.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement56);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.removeAllElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement22 = xmlElement6.addSubElement(xmlElement19);
    XmlElement.printNode(xmlElement19, "");
    xmlElement19.removeAllElements();
    boolean b26 = xmlElement2.addElement(xmlElement19);
    int i27 = xmlElement2.countObservers();
    java.util.Observer observer28 = null;
    xmlElement2.deleteObserver(observer28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    XmlElement xmlElement0 = new XmlElement();
    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    int i4 = xmlElement3.countObservers();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    xmlElement25.deleteObservers();
    XmlElement xmlElement29 = new XmlElement("hi!", "hi!");
    int i30 = xmlElement29.countObservers();
    boolean b31 = xmlElement25.addElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement16.addSubElement(xmlElement29);
    XmlElement xmlElement33 = xmlElement7.addSubElement(xmlElement32);
    XmlElement xmlElement34 = xmlElement7.getParent();
    xmlElement3.setParent(xmlElement34);
    XmlElement xmlElement36 = xmlElement0.removeElement(xmlElement34);
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = xmlElement40.getAttributes();
    XmlElement xmlElement43 = new XmlElement("", hashtable_str_str42);
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = xmlElement36.addElement(xmlElement43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str42);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    XmlElement xmlElement32 = xmlElement6.addSubElement(xmlElement31);
    XmlElement xmlElement33 = xmlElement6.getParent();
    xmlElement2.setParent(xmlElement33);
    xmlElement2.setName("");
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement61 = new XmlElement("hi!", "hi!");
    xmlElement61.deleteObservers();
    XmlElement xmlElement65 = new XmlElement("hi!", "hi!");
    int i66 = xmlElement65.countObservers();
    boolean b67 = xmlElement61.addElement(xmlElement65);
    XmlElement xmlElement68 = xmlElement52.addSubElement(xmlElement65);
    XmlElement xmlElement69 = xmlElement43.addSubElement(xmlElement68);
    XmlElement xmlElement70 = xmlElement43.getParent();
    xmlElement39.setParent(xmlElement70);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement39, (int)(short)10);
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement70);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    xmlElement2.notifyObservers();
    int i24 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement23 = xmlElement7.addSubElement(xmlElement20);
    java.lang.String str25 = xmlElement7.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    xmlElement7.setAttributes(hashtable_str_str26);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement7);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    xmlElement40.deleteObservers();
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    int i45 = xmlElement44.countObservers();
    boolean b46 = xmlElement40.addElement(xmlElement44);
    XmlElement xmlElement47 = xmlElement31.addSubElement(xmlElement44);
    XmlElement.printNode(xmlElement44, "");
    xmlElement44.removeAllElements();
    XmlElement xmlElement51 = xmlElement44.getParent();
    XmlElement xmlElement52 = xmlElement7.removeElement(xmlElement51);
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    int i56 = xmlElement55.countObservers();
    java.lang.Object obj59 = xmlElement55.addAttribute("", "hi!");
    xmlElement55.removeFromParent();
    int i61 = xmlElement55.count();
    XmlElement xmlElement64 = new XmlElement("hi!", "hi!");
    int i65 = xmlElement64.countObservers();
    java.lang.Object obj68 = xmlElement64.addAttribute("", "hi!");
    xmlElement64.removeFromParent();
    int i70 = xmlElement64.count();
    XmlElement xmlElement72 = xmlElement64.addSubElement("");
    xmlElement55.append(xmlElement64);
    xmlElement64.deleteObservers();
    XmlElement xmlElement75 = xmlElement52.removeElement(xmlElement64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement75);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement26 = xmlElement2.addSubElement("");
    XmlElement xmlElement29 = new XmlElement("hi!", "hi!");
    xmlElement29.deleteObservers();
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    int i34 = xmlElement33.countObservers();
    boolean b35 = xmlElement29.addElement(xmlElement33);
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    xmlElement38.deleteObservers();
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    int i43 = xmlElement42.countObservers();
    boolean b44 = xmlElement38.addElement(xmlElement42);
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    xmlElement47.deleteObservers();
    XmlElement xmlElement51 = new XmlElement("hi!", "hi!");
    int i52 = xmlElement51.countObservers();
    boolean b53 = xmlElement47.addElement(xmlElement51);
    XmlElement xmlElement54 = xmlElement38.addSubElement(xmlElement51);
    XmlElement xmlElement55 = xmlElement29.addSubElement(xmlElement54);
    XmlElement xmlElement57 = xmlElement29.getElement((int)(short)1);
    XmlElement xmlElement60 = new XmlElement("hi!", "hi!");
    xmlElement60.deleteObservers();
    XmlElement xmlElement64 = new XmlElement("hi!", "hi!");
    int i65 = xmlElement64.countObservers();
    boolean b66 = xmlElement60.addElement(xmlElement64);
    XmlElement xmlElement69 = new XmlElement("hi!", "hi!");
    xmlElement69.deleteObservers();
    XmlElement xmlElement73 = new XmlElement("hi!", "hi!");
    int i74 = xmlElement73.countObservers();
    boolean b75 = xmlElement69.addElement(xmlElement73);
    XmlElement xmlElement78 = new XmlElement("hi!", "hi!");
    xmlElement78.deleteObservers();
    XmlElement xmlElement82 = new XmlElement("hi!", "hi!");
    int i83 = xmlElement82.countObservers();
    boolean b84 = xmlElement78.addElement(xmlElement82);
    XmlElement xmlElement85 = xmlElement69.addSubElement(xmlElement82);
    XmlElement xmlElement86 = xmlElement60.addSubElement(xmlElement85);
    XmlElement xmlElement87 = xmlElement60.getParent();
    xmlElement29.setParent(xmlElement87);
    XmlElement xmlElement89 = xmlElement26.addSubElement(xmlElement29);
    XmlElement xmlElement91 = xmlElement89.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement91);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    xmlElement25.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement45 = new XmlElement("hi!", "hi!");
    xmlElement45.deleteObservers();
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    int i50 = xmlElement49.countObservers();
    boolean b51 = xmlElement45.addElement(xmlElement49);
    XmlElement xmlElement52 = xmlElement36.addSubElement(xmlElement49);
    java.lang.String str54 = xmlElement36.getAttribute("hi!");
    java.lang.String str55 = xmlElement36.getName();
    boolean b56 = xmlElement25.equals((java.lang.Object)xmlElement36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.removeAllElements();
    xmlElement18.setData("");
    XmlElement xmlElement23 = xmlElement18.getElement("");
    xmlElement18.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    java.lang.String str10 = xmlElement2.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.removeAllElements();
    java.util.Enumeration enumeration20 = xmlElement18.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement32 = new XmlElement("hi!", "hi!");
    int i33 = xmlElement32.countObservers();
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement45 = new XmlElement("hi!", "hi!");
    xmlElement45.deleteObservers();
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    int i50 = xmlElement49.countObservers();
    boolean b51 = xmlElement45.addElement(xmlElement49);
    XmlElement xmlElement54 = new XmlElement("hi!", "hi!");
    xmlElement54.deleteObservers();
    XmlElement xmlElement58 = new XmlElement("hi!", "hi!");
    int i59 = xmlElement58.countObservers();
    boolean b60 = xmlElement54.addElement(xmlElement58);
    XmlElement xmlElement61 = xmlElement45.addSubElement(xmlElement58);
    XmlElement xmlElement62 = xmlElement36.addSubElement(xmlElement61);
    XmlElement xmlElement63 = xmlElement36.getParent();
    xmlElement32.setParent(xmlElement63);
    XmlElement xmlElement65 = xmlElement29.removeElement(xmlElement63);
    java.util.Enumeration enumeration66 = xmlElement29.getAttributeNames();
    xmlElement28.setParent(xmlElement29);
    java.lang.Object obj68 = xmlElement28.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj68);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement27.addSubElement("");
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement45 = new XmlElement("hi!", "hi!");
    xmlElement45.deleteObservers();
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    int i50 = xmlElement49.countObservers();
    boolean b51 = xmlElement45.addElement(xmlElement49);
    XmlElement xmlElement54 = new XmlElement("hi!", "hi!");
    xmlElement54.deleteObservers();
    XmlElement xmlElement58 = new XmlElement("hi!", "hi!");
    int i59 = xmlElement58.countObservers();
    boolean b60 = xmlElement54.addElement(xmlElement58);
    XmlElement xmlElement61 = xmlElement45.addSubElement(xmlElement58);
    XmlElement xmlElement62 = xmlElement36.addSubElement(xmlElement61);
    XmlElement xmlElement63 = new XmlElement();
    XmlElement xmlElement64 = xmlElement36.addSubElement(xmlElement63);
    xmlElement33.setParent(xmlElement36);
    XmlElement xmlElement66 = xmlElement27.addSubElement(xmlElement36);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str67 = null;
    xmlElement27.setAttributes(hashtable_str_str67);
    xmlElement27.setName("");
    XmlElement xmlElement72 = xmlElement27.getElement((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement72);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement18.addAttribute("hi!", "");
    xmlElement18.notifyObservers();
    java.util.Enumeration enumeration33 = xmlElement18.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration33);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    xmlElement6.setParent(xmlElement31);
    xmlElement31.notifyObservers();
    java.lang.String str34 = xmlElement31.getName();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    xmlElement37.removeFromParent();
    int i43 = xmlElement37.count();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    java.lang.Object obj50 = xmlElement46.addAttribute("", "hi!");
    xmlElement46.removeFromParent();
    int i52 = xmlElement46.count();
    XmlElement xmlElement54 = xmlElement46.addSubElement("");
    xmlElement37.append(xmlElement46);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement37.getAttributes();
    boolean b57 = xmlElement31.addElement(xmlElement37);
    xmlElement2.append(xmlElement31);
    XmlElement xmlElement61 = xmlElement2.addSubElement("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    boolean b24 = xmlElement2.equals((java.lang.Object)(short)10);
    XmlElement xmlElement25 = xmlElement2.getParent();
    xmlElement2.setData("");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    xmlElement30.deleteObservers();
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    int i35 = xmlElement34.countObservers();
    boolean b36 = xmlElement30.addElement(xmlElement34);
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    xmlElement39.deleteObservers();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    boolean b45 = xmlElement39.addElement(xmlElement43);
    XmlElement xmlElement46 = xmlElement30.addSubElement(xmlElement43);
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    xmlElement30.append(xmlElement49);
    boolean b52 = xmlElement30.equals((java.lang.Object)(short)10);
    boolean b53 = xmlElement2.addElement(xmlElement30);
    java.lang.Object obj54 = null;
    xmlElement30.notifyObservers(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    XmlElement xmlElement30 = xmlElement27.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement20 = xmlElement18.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement22 = xmlElement20.getElement("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement20);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    xmlElement27.removeAllElements();
    XmlElement xmlElement32 = xmlElement27.getParent();
    XmlElement xmlElement35 = xmlElement32.addSubElement("", "hi!");
    XmlElement xmlElement38 = xmlElement35.addSubElement("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    java.lang.Object obj29 = xmlElement27.clone();
    XmlElement xmlElement30 = xmlElement27.getParent();
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    xmlElement42.deleteObservers();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    boolean b48 = xmlElement42.addElement(xmlElement46);
    XmlElement xmlElement51 = new XmlElement("hi!", "hi!");
    xmlElement51.deleteObservers();
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    int i56 = xmlElement55.countObservers();
    boolean b57 = xmlElement51.addElement(xmlElement55);
    XmlElement xmlElement58 = xmlElement42.addSubElement(xmlElement55);
    XmlElement xmlElement59 = xmlElement33.addSubElement(xmlElement58);
    XmlElement xmlElement62 = new XmlElement("hi!", "");
    xmlElement33.append(xmlElement62);
    xmlElement30.insertElement(xmlElement62, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = xmlElement2.getParent();
    xmlElement2.removeAllElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement32 = xmlElement2.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.lang.String str27 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement30.getAttributes();
    java.lang.String str34 = xmlElement30.getAttribute("hi!");
    XmlElement xmlElement35 = xmlElement2.addSubElement(xmlElement30);
    java.lang.Object obj36 = xmlElement35.clone();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str41 = xmlElement39.getAttributes();
    java.lang.String str43 = xmlElement39.getAttribute("hi!");
    int i44 = xmlElement39.count();
    boolean b45 = xmlElement35.equals((java.lang.Object)xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement2.getElement("hi!");
    XmlElement xmlElement33 = xmlElement32.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement33);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    xmlElement3.deleteObservers();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    int i8 = xmlElement7.countObservers();
    boolean b9 = xmlElement3.addElement(xmlElement7);
    XmlElement xmlElement12 = new XmlElement("hi!", "hi!");
    xmlElement12.deleteObservers();
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    int i17 = xmlElement16.countObservers();
    boolean b18 = xmlElement12.addElement(xmlElement16);
    XmlElement xmlElement19 = xmlElement3.addSubElement(xmlElement16);
    java.lang.String str21 = xmlElement3.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = null;
    xmlElement3.setAttributes(hashtable_str_str22);
    java.util.Observer observer24 = null;
    xmlElement3.deleteObserver(observer24);
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    java.lang.Object obj32 = xmlElement28.addAttribute("", "hi!");
    xmlElement28.removeFromParent();
    int i34 = xmlElement28.count();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    xmlElement37.removeFromParent();
    int i43 = xmlElement37.count();
    XmlElement xmlElement45 = xmlElement37.addSubElement("");
    xmlElement28.append(xmlElement37);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str47 = xmlElement28.getAttributes();
    xmlElement3.setAttributes(hashtable_str_str47);
    XmlElement xmlElement49 = new XmlElement("hi!", hashtable_str_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str47);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    java.lang.String str33 = xmlElement27.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement31);
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement53 = new XmlElement("hi!", "hi!");
    xmlElement53.deleteObservers();
    XmlElement xmlElement57 = new XmlElement("hi!", "hi!");
    int i58 = xmlElement57.countObservers();
    boolean b59 = xmlElement53.addElement(xmlElement57);
    XmlElement xmlElement60 = xmlElement44.addSubElement(xmlElement57);
    XmlElement xmlElement61 = xmlElement35.addSubElement(xmlElement60);
    XmlElement xmlElement64 = new XmlElement("hi!", "");
    xmlElement35.append(xmlElement64);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement31.insertElement(xmlElement64, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "");
    xmlElement2.append(xmlElement31);
    boolean b33 = xmlElement2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement23 = xmlElement7.addSubElement(xmlElement20);
    java.lang.String str25 = xmlElement7.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    xmlElement7.setAttributes(hashtable_str_str26);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement7);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    xmlElement40.deleteObservers();
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    int i45 = xmlElement44.countObservers();
    boolean b46 = xmlElement40.addElement(xmlElement44);
    XmlElement xmlElement47 = xmlElement31.addSubElement(xmlElement44);
    XmlElement.printNode(xmlElement44, "");
    xmlElement44.removeAllElements();
    XmlElement xmlElement51 = xmlElement44.getParent();
    XmlElement xmlElement52 = xmlElement7.removeElement(xmlElement51);
    java.lang.String str53 = xmlElement7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.lang.String str20 = xmlElement2.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    xmlElement2.setAttributes(hashtable_str_str21);
    xmlElement2.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement26 = xmlElement2.addSubElement("");
    boolean b27 = xmlElement2.hasChanged();
    XmlElement xmlElement29 = xmlElement2.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement27 = new XmlElement("hi!", "hi!");
    xmlElement27.deleteObservers();
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    int i32 = xmlElement31.countObservers();
    boolean b33 = xmlElement27.addElement(xmlElement31);
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement43 = xmlElement27.addSubElement(xmlElement40);
    XmlElement.printNode(xmlElement40, "");
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    java.lang.Object obj52 = xmlElement48.addAttribute("", "hi!");
    xmlElement48.removeFromParent();
    int i54 = xmlElement48.count();
    XmlElement xmlElement56 = xmlElement48.addSubElement("");
    XmlElement xmlElement59 = new XmlElement("hi!", "hi!");
    xmlElement59.deleteObservers();
    XmlElement xmlElement63 = new XmlElement("hi!", "hi!");
    int i64 = xmlElement63.countObservers();
    boolean b65 = xmlElement59.addElement(xmlElement63);
    XmlElement xmlElement68 = new XmlElement("hi!", "hi!");
    xmlElement68.deleteObservers();
    XmlElement xmlElement72 = new XmlElement("hi!", "hi!");
    int i73 = xmlElement72.countObservers();
    boolean b74 = xmlElement68.addElement(xmlElement72);
    XmlElement xmlElement77 = new XmlElement("hi!", "hi!");
    xmlElement77.deleteObservers();
    XmlElement xmlElement81 = new XmlElement("hi!", "hi!");
    int i82 = xmlElement81.countObservers();
    boolean b83 = xmlElement77.addElement(xmlElement81);
    XmlElement xmlElement84 = xmlElement68.addSubElement(xmlElement81);
    XmlElement xmlElement85 = xmlElement59.addSubElement(xmlElement84);
    XmlElement xmlElement87 = xmlElement59.getElement((int)(short)1);
    XmlElement xmlElement88 = xmlElement56.removeElement(xmlElement87);
    XmlElement xmlElement89 = xmlElement40.addSubElement(xmlElement56);
    XmlElement xmlElement90 = xmlElement2.addSubElement(xmlElement56);
    XmlElement xmlElement92 = xmlElement56.addSubElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement92);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    xmlElement3.removeAllElements();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement23 = xmlElement7.addSubElement(xmlElement20);
    XmlElement.printNode(xmlElement20, "");
    xmlElement20.removeAllElements();
    boolean b27 = xmlElement3.addElement(xmlElement20);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = xmlElement20.getAttributes();
    XmlElement xmlElement29 = new XmlElement("hi!", hashtable_str_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str28);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.lang.String str27 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement30.getAttributes();
    java.lang.String str34 = xmlElement30.getAttribute("hi!");
    XmlElement xmlElement35 = xmlElement2.addSubElement(xmlElement30);
    int i36 = xmlElement30.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    xmlElement15.removeAllElements();
    XmlElement xmlElement22 = xmlElement15.getParent();
    XmlElement xmlElement24 = xmlElement22.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement29.setName("");
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement51.setName("hi!");
    XmlElement xmlElement54 = xmlElement29.removeElement(xmlElement51);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str55 = xmlElement54.getData();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement10 = xmlElement2.addSubElement("");
    XmlElement xmlElement13 = new XmlElement("hi!", "hi!");
    xmlElement13.deleteObservers();
    XmlElement xmlElement17 = new XmlElement("hi!", "hi!");
    int i18 = xmlElement17.countObservers();
    boolean b19 = xmlElement13.addElement(xmlElement17);
    XmlElement xmlElement22 = new XmlElement("hi!", "hi!");
    xmlElement22.deleteObservers();
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    int i27 = xmlElement26.countObservers();
    boolean b28 = xmlElement22.addElement(xmlElement26);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement38 = xmlElement22.addSubElement(xmlElement35);
    XmlElement xmlElement39 = xmlElement13.addSubElement(xmlElement38);
    XmlElement xmlElement41 = xmlElement13.getElement((int)(short)1);
    XmlElement xmlElement42 = xmlElement10.removeElement(xmlElement41);
    XmlElement xmlElement45 = xmlElement10.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement45);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    int i9 = xmlElement2.count();
    java.util.Observer observer10 = null;
    xmlElement2.deleteObserver(observer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    java.lang.String str6 = xmlElement2.getAttribute("hi!");
    XmlElement xmlElement8 = xmlElement2.getElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement2.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement10 = xmlElement6.removeElement(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    boolean b24 = xmlElement2.equals((java.lang.Object)(short)10);
    XmlElement xmlElement25 = xmlElement2.getParent();
    xmlElement2.setData("");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    xmlElement30.deleteObservers();
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    int i35 = xmlElement34.countObservers();
    boolean b36 = xmlElement30.addElement(xmlElement34);
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    xmlElement39.deleteObservers();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    boolean b45 = xmlElement39.addElement(xmlElement43);
    XmlElement xmlElement46 = xmlElement30.addSubElement(xmlElement43);
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    xmlElement30.append(xmlElement49);
    boolean b52 = xmlElement30.equals((java.lang.Object)(short)10);
    boolean b53 = xmlElement2.addElement(xmlElement30);
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    xmlElement56.deleteObservers();
    XmlElement xmlElement60 = new XmlElement("hi!", "hi!");
    int i61 = xmlElement60.countObservers();
    boolean b62 = xmlElement56.addElement(xmlElement60);
    XmlElement xmlElement65 = new XmlElement("hi!", "hi!");
    xmlElement65.deleteObservers();
    XmlElement xmlElement69 = new XmlElement("hi!", "hi!");
    int i70 = xmlElement69.countObservers();
    boolean b71 = xmlElement65.addElement(xmlElement69);
    XmlElement xmlElement74 = new XmlElement("hi!", "hi!");
    xmlElement74.deleteObservers();
    XmlElement xmlElement78 = new XmlElement("hi!", "hi!");
    int i79 = xmlElement78.countObservers();
    boolean b80 = xmlElement74.addElement(xmlElement78);
    XmlElement xmlElement81 = xmlElement65.addSubElement(xmlElement78);
    XmlElement xmlElement82 = xmlElement56.addSubElement(xmlElement81);
    XmlElement xmlElement84 = xmlElement56.getElement((int)(short)1);
    xmlElement56.setName("");
    XmlElement xmlElement87 = xmlElement2.removeElement(xmlElement56);
    java.util.Observer observer88 = null;
    xmlElement56.deleteObserver(observer88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement87);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement30 = xmlElement2.getElement((int)(short)1);
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    xmlElement37.removeAllElements();
    boolean b41 = xmlElement2.addElement(xmlElement37);
    xmlElement37.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement27 = new XmlElement("hi!", "hi!");
    xmlElement27.deleteObservers();
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    int i32 = xmlElement31.countObservers();
    boolean b33 = xmlElement27.addElement(xmlElement31);
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement43 = xmlElement27.addSubElement(xmlElement40);
    XmlElement.printNode(xmlElement40, "");
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    java.lang.Object obj52 = xmlElement48.addAttribute("", "hi!");
    xmlElement48.removeFromParent();
    int i54 = xmlElement48.count();
    XmlElement xmlElement56 = xmlElement48.addSubElement("");
    XmlElement xmlElement59 = new XmlElement("hi!", "hi!");
    xmlElement59.deleteObservers();
    XmlElement xmlElement63 = new XmlElement("hi!", "hi!");
    int i64 = xmlElement63.countObservers();
    boolean b65 = xmlElement59.addElement(xmlElement63);
    XmlElement xmlElement68 = new XmlElement("hi!", "hi!");
    xmlElement68.deleteObservers();
    XmlElement xmlElement72 = new XmlElement("hi!", "hi!");
    int i73 = xmlElement72.countObservers();
    boolean b74 = xmlElement68.addElement(xmlElement72);
    XmlElement xmlElement77 = new XmlElement("hi!", "hi!");
    xmlElement77.deleteObservers();
    XmlElement xmlElement81 = new XmlElement("hi!", "hi!");
    int i82 = xmlElement81.countObservers();
    boolean b83 = xmlElement77.addElement(xmlElement81);
    XmlElement xmlElement84 = xmlElement68.addSubElement(xmlElement81);
    XmlElement xmlElement85 = xmlElement59.addSubElement(xmlElement84);
    XmlElement xmlElement87 = xmlElement59.getElement((int)(short)1);
    XmlElement xmlElement88 = xmlElement56.removeElement(xmlElement87);
    XmlElement xmlElement89 = xmlElement40.addSubElement(xmlElement56);
    XmlElement xmlElement90 = xmlElement2.addSubElement(xmlElement56);
    xmlElement2.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement90);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    xmlElement15.removeAllElements();
    XmlElement xmlElement22 = xmlElement15.getParent();
    boolean b23 = xmlElement22.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    xmlElement29.setName("");
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement51.setName("hi!");
    XmlElement xmlElement54 = xmlElement29.removeElement(xmlElement51);
    XmlElement.printNode(xmlElement29, "");
    java.lang.Object obj59 = xmlElement29.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    java.lang.Object obj15 = xmlElement11.addAttribute("", "hi!");
    xmlElement11.removeFromParent();
    int i17 = xmlElement11.count();
    XmlElement xmlElement19 = xmlElement11.addSubElement("");
    xmlElement2.append(xmlElement11);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    xmlElement26.deleteObservers();
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    boolean b32 = xmlElement26.addElement(xmlElement30);
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement26.setParent(xmlElement51);
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    xmlElement26.append(xmlElement55);
    XmlElement.printNode(xmlElement26, "hi!");
    XmlElement xmlElement59 = xmlElement2.removeElement(xmlElement26);
    XmlElement xmlElement60 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement26.insertElement(xmlElement60, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    java.lang.String str30 = xmlElement28.getAttribute("hi!");
    int i31 = xmlElement28.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    xmlElement27.removeAllElements();
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    int i35 = xmlElement34.countObservers();
    java.lang.Object obj38 = xmlElement34.addAttribute("", "hi!");
    xmlElement34.removeFromParent();
    int i40 = xmlElement34.count();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    java.lang.Object obj47 = xmlElement43.addAttribute("", "hi!");
    xmlElement43.removeFromParent();
    int i49 = xmlElement43.count();
    XmlElement xmlElement51 = xmlElement43.addSubElement("");
    xmlElement34.append(xmlElement43);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str53 = xmlElement34.getAttributes();
    xmlElement27.setAttributes(hashtable_str_str53);
    boolean b56 = xmlElement27.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement2.notifyObservers();
    java.util.Observer observer30 = null;
    xmlElement2.deleteObserver(observer30);
    XmlElement xmlElement34 = xmlElement2.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    XmlElement xmlElement4 = new XmlElement("hi!", "hi!");
    int i5 = xmlElement4.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement4.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", hashtable_str_str6);
    XmlElement xmlElement8 = new XmlElement("hi!", hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.removeAllElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement22 = xmlElement6.addSubElement(xmlElement19);
    XmlElement.printNode(xmlElement19, "");
    xmlElement19.removeAllElements();
    boolean b26 = xmlElement2.addElement(xmlElement19);
    xmlElement2.removeFromParent();
    xmlElement2.setData("hi!");
    XmlElement xmlElement31 = xmlElement2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement31);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement.printNode(xmlElement15, "");
    java.lang.String str22 = xmlElement15.getAttribute("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement2.getAttributes();
    java.lang.Object obj32 = xmlElement2.addAttribute("", "");
    XmlElement xmlElement33 = null;
    XmlElement xmlElement34 = xmlElement2.removeElement(xmlElement33);
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    xmlElement40.deleteObservers();
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    int i45 = xmlElement44.countObservers();
    boolean b46 = xmlElement40.addElement(xmlElement44);
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    xmlElement49.deleteObservers();
    XmlElement xmlElement53 = new XmlElement("hi!", "hi!");
    int i54 = xmlElement53.countObservers();
    boolean b55 = xmlElement49.addElement(xmlElement53);
    XmlElement xmlElement58 = new XmlElement("hi!", "hi!");
    xmlElement58.deleteObservers();
    XmlElement xmlElement62 = new XmlElement("hi!", "hi!");
    int i63 = xmlElement62.countObservers();
    boolean b64 = xmlElement58.addElement(xmlElement62);
    XmlElement xmlElement65 = xmlElement49.addSubElement(xmlElement62);
    XmlElement xmlElement66 = xmlElement40.addSubElement(xmlElement65);
    XmlElement xmlElement67 = new XmlElement();
    XmlElement xmlElement68 = xmlElement40.addSubElement(xmlElement67);
    xmlElement37.setParent(xmlElement40);
    XmlElement xmlElement70 = xmlElement2.removeElement(xmlElement37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement70);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    xmlElement42.deleteObservers();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    boolean b48 = xmlElement42.addElement(xmlElement46);
    XmlElement xmlElement49 = xmlElement33.addSubElement(xmlElement46);
    java.util.Enumeration enumeration50 = xmlElement46.getAttributeNames();
    xmlElement2.append(xmlElement46);
    java.lang.String str54 = xmlElement46.getAttribute("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    java.lang.Object obj29 = xmlElement27.clone();
    XmlElement xmlElement30 = xmlElement27.getParent();
    XmlElement.printNode(xmlElement27, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    java.lang.String str34 = xmlElement25.getAttribute("", "");
    XmlElement xmlElement36 = xmlElement25.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement36);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = xmlElement2.getParent();
    xmlElement2.removeAllElements();
    java.lang.Object obj33 = xmlElement2.addAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = xmlElement15.addSubElement("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement21);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.removeAllElements();
    xmlElement18.setData("");
    java.util.Observer observer22 = null;
    xmlElement18.deleteObserver(observer22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    java.lang.Object obj15 = xmlElement11.addAttribute("", "hi!");
    xmlElement11.removeFromParent();
    int i17 = xmlElement11.count();
    XmlElement xmlElement19 = xmlElement11.addSubElement("");
    xmlElement2.append(xmlElement11);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement2.getAttributes();
    xmlElement2.setData("");
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    xmlElement26.deleteObservers();
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    boolean b32 = xmlElement26.addElement(xmlElement30);
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement26.setParent(xmlElement51);
    xmlElement2.setParent(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement2.notifyObservers();
    java.util.Observer observer30 = null;
    xmlElement2.deleteObserver(observer30);
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    xmlElement34.removeFromParent();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement2.insertElement(xmlElement34, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    int i4 = xmlElement3.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement3.getAttributes();
    XmlElement xmlElement6 = new XmlElement("hi!", hashtable_str_str5);
    int i7 = xmlElement6.countObservers();
    java.util.List list8 = xmlElement6.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    xmlElement33.deleteObservers();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    boolean b39 = xmlElement33.addElement(xmlElement37);
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    xmlElement42.deleteObservers();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    boolean b48 = xmlElement42.addElement(xmlElement46);
    XmlElement xmlElement49 = xmlElement33.addSubElement(xmlElement46);
    java.util.Enumeration enumeration50 = xmlElement46.getAttributeNames();
    xmlElement2.append(xmlElement46);
    XmlElement.printNode(xmlElement2, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration50);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.lang.String str20 = xmlElement2.getAttribute("hi!");
    java.lang.String str21 = xmlElement2.getName();
    XmlElement.printNode(xmlElement2, "");
    XmlElement xmlElement25 = xmlElement2.getElement((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    xmlElement2.notifyObservers();
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    int i27 = xmlElement26.countObservers();
    java.lang.Object obj30 = xmlElement26.addAttribute("", "hi!");
    xmlElement26.removeFromParent();
    int i32 = xmlElement26.count();
    XmlElement xmlElement34 = xmlElement26.addSubElement("");
    XmlElement xmlElement36 = xmlElement34.getElement("");
    xmlElement2.notifyObservers((java.lang.Object)xmlElement34);
    xmlElement34.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement36);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    xmlElement40.deleteObservers();
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    int i45 = xmlElement44.countObservers();
    boolean b46 = xmlElement40.addElement(xmlElement44);
    XmlElement xmlElement47 = xmlElement31.addSubElement(xmlElement44);
    xmlElement47.setName("hi!");
    xmlElement47.setData("");
    XmlElement xmlElement54 = new XmlElement("hi!", "hi!");
    int i55 = xmlElement54.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement54.getAttributes();
    boolean b57 = xmlElement47.addElement(xmlElement54);
    xmlElement54.removeFromParent();
    xmlElement27.setParent(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    XmlElement xmlElement7 = new XmlElement("hi!", "hi!");
    xmlElement7.deleteObservers();
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    int i12 = xmlElement11.countObservers();
    boolean b13 = xmlElement7.addElement(xmlElement11);
    XmlElement xmlElement16 = new XmlElement("hi!", "hi!");
    xmlElement16.deleteObservers();
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    int i21 = xmlElement20.countObservers();
    boolean b22 = xmlElement16.addElement(xmlElement20);
    XmlElement xmlElement23 = xmlElement7.addSubElement(xmlElement20);
    java.lang.String str25 = xmlElement7.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = null;
    xmlElement7.setAttributes(hashtable_str_str26);
    xmlElement2.notifyObservers((java.lang.Object)xmlElement7);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    xmlElement40.deleteObservers();
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    int i45 = xmlElement44.countObservers();
    boolean b46 = xmlElement40.addElement(xmlElement44);
    XmlElement xmlElement47 = xmlElement31.addSubElement(xmlElement44);
    XmlElement.printNode(xmlElement44, "");
    xmlElement44.removeAllElements();
    XmlElement xmlElement51 = xmlElement44.getParent();
    XmlElement xmlElement52 = xmlElement7.removeElement(xmlElement51);
    XmlElement xmlElement53 = xmlElement52.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement53);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    xmlElement25.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement35 = xmlElement25.addSubElement("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement10 = xmlElement2.addSubElement("");
    XmlElement xmlElement13 = new XmlElement("hi!", "hi!");
    xmlElement13.deleteObservers();
    XmlElement xmlElement17 = new XmlElement("hi!", "hi!");
    int i18 = xmlElement17.countObservers();
    boolean b19 = xmlElement13.addElement(xmlElement17);
    XmlElement xmlElement22 = new XmlElement("hi!", "hi!");
    xmlElement22.deleteObservers();
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    int i27 = xmlElement26.countObservers();
    boolean b28 = xmlElement22.addElement(xmlElement26);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement38 = xmlElement22.addSubElement(xmlElement35);
    XmlElement xmlElement39 = xmlElement13.addSubElement(xmlElement38);
    XmlElement xmlElement41 = xmlElement13.getElement((int)(short)1);
    XmlElement xmlElement42 = xmlElement10.removeElement(xmlElement41);
    java.util.Enumeration enumeration43 = xmlElement41.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration43);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    xmlElement27.notifyObservers();
    java.lang.String str30 = xmlElement27.getName();
    xmlElement27.removeAllElements();
    XmlElement xmlElement32 = xmlElement27.getParent();
    XmlElement xmlElement35 = xmlElement32.addSubElement("", "hi!");
    XmlElement xmlElement38 = new XmlElement("hi!", "");
    java.util.List list39 = xmlElement38.getElements();
    int i40 = xmlElement38.count();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    java.util.Enumeration enumeration60 = xmlElement56.getAttributeNames();
    XmlElement xmlElement63 = new XmlElement("hi!", "hi!");
    xmlElement63.deleteObservers();
    XmlElement xmlElement67 = new XmlElement("hi!", "hi!");
    int i68 = xmlElement67.countObservers();
    boolean b69 = xmlElement63.addElement(xmlElement67);
    XmlElement xmlElement72 = new XmlElement("hi!", "hi!");
    xmlElement72.deleteObservers();
    XmlElement xmlElement76 = new XmlElement("hi!", "hi!");
    int i77 = xmlElement76.countObservers();
    boolean b78 = xmlElement72.addElement(xmlElement76);
    XmlElement xmlElement79 = xmlElement63.addSubElement(xmlElement76);
    xmlElement79.setName("hi!");
    xmlElement79.setData("");
    XmlElement xmlElement84 = xmlElement56.addSubElement(xmlElement79);
    int i85 = xmlElement56.count();
    boolean b86 = xmlElement38.equals((java.lang.Object)xmlElement56);
    boolean b87 = xmlElement35.equals((java.lang.Object)xmlElement56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    int i3 = xmlElement2.countObservers();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    xmlElement2.removeFromParent();
    int i8 = xmlElement2.count();
    XmlElement xmlElement10 = xmlElement2.addSubElement("");
    xmlElement2.deleteObservers();
    XmlElement xmlElement14 = new XmlElement("hi!", "hi!");
    xmlElement14.deleteObservers();
    XmlElement xmlElement18 = new XmlElement("hi!", "hi!");
    int i19 = xmlElement18.countObservers();
    boolean b20 = xmlElement14.addElement(xmlElement18);
    XmlElement xmlElement23 = new XmlElement("hi!", "hi!");
    xmlElement23.deleteObservers();
    XmlElement xmlElement27 = new XmlElement("hi!", "hi!");
    int i28 = xmlElement27.countObservers();
    boolean b29 = xmlElement23.addElement(xmlElement27);
    XmlElement xmlElement32 = new XmlElement("hi!", "hi!");
    xmlElement32.deleteObservers();
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    int i37 = xmlElement36.countObservers();
    boolean b38 = xmlElement32.addElement(xmlElement36);
    XmlElement xmlElement39 = xmlElement23.addSubElement(xmlElement36);
    xmlElement14.setParent(xmlElement39);
    xmlElement39.notifyObservers();
    java.lang.String str42 = xmlElement39.getName();
    xmlElement39.removeAllElements();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    java.lang.Object obj50 = xmlElement46.addAttribute("", "hi!");
    xmlElement46.removeFromParent();
    int i52 = xmlElement46.count();
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    int i56 = xmlElement55.countObservers();
    java.lang.Object obj59 = xmlElement55.addAttribute("", "hi!");
    xmlElement55.removeFromParent();
    int i61 = xmlElement55.count();
    XmlElement xmlElement63 = xmlElement55.addSubElement("");
    xmlElement46.append(xmlElement55);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str65 = xmlElement46.getAttributes();
    xmlElement39.setAttributes(hashtable_str_str65);
    xmlElement2.setAttributes(hashtable_str_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str65);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.removeAllElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement22 = xmlElement6.addSubElement(xmlElement19);
    XmlElement.printNode(xmlElement19, "");
    xmlElement19.removeAllElements();
    boolean b26 = xmlElement2.addElement(xmlElement19);
    int i27 = xmlElement2.countObservers();
    xmlElement2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    xmlElement2.setName("hi!");
    XmlElement xmlElement9 = new XmlElement("hi!", "hi!");
    int i10 = xmlElement9.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement9.getAttributes();
    XmlElement xmlElement12 = new XmlElement("hi!", hashtable_str_str11);
    int i13 = xmlElement12.countObservers();
    xmlElement2.notifyObservers((java.lang.Object)i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    XmlElement xmlElement26 = xmlElement2.addSubElement("");
    XmlElement xmlElement29 = new XmlElement("hi!", "hi!");
    xmlElement29.deleteObservers();
    XmlElement xmlElement33 = new XmlElement("hi!", "hi!");
    int i34 = xmlElement33.countObservers();
    boolean b35 = xmlElement29.addElement(xmlElement33);
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    xmlElement38.deleteObservers();
    XmlElement xmlElement42 = new XmlElement("hi!", "hi!");
    int i43 = xmlElement42.countObservers();
    boolean b44 = xmlElement38.addElement(xmlElement42);
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    xmlElement47.deleteObservers();
    XmlElement xmlElement51 = new XmlElement("hi!", "hi!");
    int i52 = xmlElement51.countObservers();
    boolean b53 = xmlElement47.addElement(xmlElement51);
    XmlElement xmlElement54 = xmlElement38.addSubElement(xmlElement51);
    XmlElement xmlElement55 = xmlElement29.addSubElement(xmlElement54);
    XmlElement xmlElement57 = xmlElement29.getElement((int)(short)1);
    XmlElement xmlElement60 = new XmlElement("hi!", "hi!");
    xmlElement60.deleteObservers();
    XmlElement xmlElement64 = new XmlElement("hi!", "hi!");
    int i65 = xmlElement64.countObservers();
    boolean b66 = xmlElement60.addElement(xmlElement64);
    XmlElement xmlElement69 = new XmlElement("hi!", "hi!");
    xmlElement69.deleteObservers();
    XmlElement xmlElement73 = new XmlElement("hi!", "hi!");
    int i74 = xmlElement73.countObservers();
    boolean b75 = xmlElement69.addElement(xmlElement73);
    XmlElement xmlElement78 = new XmlElement("hi!", "hi!");
    xmlElement78.deleteObservers();
    XmlElement xmlElement82 = new XmlElement("hi!", "hi!");
    int i83 = xmlElement82.countObservers();
    boolean b84 = xmlElement78.addElement(xmlElement82);
    XmlElement xmlElement85 = xmlElement69.addSubElement(xmlElement82);
    XmlElement xmlElement86 = xmlElement60.addSubElement(xmlElement85);
    XmlElement xmlElement87 = xmlElement60.getParent();
    xmlElement29.setParent(xmlElement87);
    XmlElement xmlElement89 = xmlElement26.addSubElement(xmlElement29);
    boolean b90 = xmlElement29.hasChanged();
    java.util.Observer observer91 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement29.addObserver(observer91);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.removeFromParent();
    xmlElement2.deleteObservers();
    java.util.Enumeration enumeration5 = xmlElement2.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    xmlElement6.setParent(xmlElement31);
    xmlElement31.notifyObservers();
    java.lang.String str34 = xmlElement31.getName();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    xmlElement37.removeFromParent();
    int i43 = xmlElement37.count();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    java.lang.Object obj50 = xmlElement46.addAttribute("", "hi!");
    xmlElement46.removeFromParent();
    int i52 = xmlElement46.count();
    XmlElement xmlElement54 = xmlElement46.addSubElement("");
    xmlElement37.append(xmlElement46);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement37.getAttributes();
    boolean b57 = xmlElement31.addElement(xmlElement37);
    xmlElement2.append(xmlElement31);
    XmlElement.printNode(xmlElement31, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.util.Enumeration enumeration19 = xmlElement15.getAttributeNames();
    XmlElement xmlElement22 = new XmlElement("hi!", "hi!");
    xmlElement22.deleteObservers();
    XmlElement xmlElement26 = new XmlElement("hi!", "hi!");
    int i27 = xmlElement26.countObservers();
    boolean b28 = xmlElement22.addElement(xmlElement26);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    int i36 = xmlElement35.countObservers();
    boolean b37 = xmlElement31.addElement(xmlElement35);
    XmlElement xmlElement38 = xmlElement22.addSubElement(xmlElement35);
    xmlElement38.setName("hi!");
    xmlElement38.setData("");
    XmlElement xmlElement43 = xmlElement15.addSubElement(xmlElement38);
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    xmlElement46.deleteObservers();
    XmlElement xmlElement50 = new XmlElement("hi!", "hi!");
    int i51 = xmlElement50.countObservers();
    boolean b52 = xmlElement46.addElement(xmlElement50);
    XmlElement xmlElement55 = new XmlElement("hi!", "hi!");
    xmlElement55.deleteObservers();
    XmlElement xmlElement59 = new XmlElement("hi!", "hi!");
    int i60 = xmlElement59.countObservers();
    boolean b61 = xmlElement55.addElement(xmlElement59);
    XmlElement xmlElement64 = new XmlElement("hi!", "hi!");
    xmlElement64.deleteObservers();
    XmlElement xmlElement68 = new XmlElement("hi!", "hi!");
    int i69 = xmlElement68.countObservers();
    boolean b70 = xmlElement64.addElement(xmlElement68);
    XmlElement xmlElement71 = xmlElement55.addSubElement(xmlElement68);
    xmlElement46.setParent(xmlElement71);
    xmlElement71.notifyObservers();
    java.lang.String str74 = xmlElement71.getName();
    xmlElement71.removeAllElements();
    java.util.List list76 = xmlElement71.getElements();
    XmlElement xmlElement77 = xmlElement43.addSubElement(xmlElement71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!"+ "'", str74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement77);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.lang.String str27 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement32 = new XmlElement("hi!", "hi!");
    int i33 = xmlElement32.countObservers();
    java.lang.Object obj36 = xmlElement32.addAttribute("", "hi!");
    xmlElement32.removeFromParent();
    int i38 = xmlElement32.count();
    XmlElement xmlElement41 = new XmlElement("hi!", "hi!");
    int i42 = xmlElement41.countObservers();
    java.lang.Object obj45 = xmlElement41.addAttribute("", "hi!");
    xmlElement41.removeFromParent();
    int i47 = xmlElement41.count();
    XmlElement xmlElement49 = xmlElement41.addSubElement("");
    xmlElement32.append(xmlElement41);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str51 = xmlElement32.getAttributes();
    XmlElement xmlElement52 = new XmlElement("", hashtable_str_str51);
    XmlElement xmlElement53 = new XmlElement("", hashtable_str_str51);
    xmlElement2.setAttributes(hashtable_str_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str51);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    java.lang.Object obj31 = null;
    boolean b32 = xmlElement30.equals(obj31);
    java.lang.String str33 = xmlElement30.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement22 = xmlElement6.addSubElement(xmlElement19);
    xmlElement22.setName("hi!");
    xmlElement22.setData("");
    java.lang.String str28 = xmlElement22.getAttribute("hi!");
    boolean b29 = xmlElement2.addElement(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    int i4 = xmlElement3.countObservers();
    java.lang.Object obj7 = xmlElement3.addAttribute("", "hi!");
    xmlElement3.removeFromParent();
    int i9 = xmlElement3.count();
    XmlElement xmlElement12 = new XmlElement("hi!", "hi!");
    int i13 = xmlElement12.countObservers();
    java.lang.Object obj16 = xmlElement12.addAttribute("", "hi!");
    xmlElement12.removeFromParent();
    int i18 = xmlElement12.count();
    XmlElement xmlElement20 = xmlElement12.addSubElement("");
    xmlElement3.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement3.getAttributes();
    XmlElement xmlElement23 = new XmlElement("", hashtable_str_str22);
    xmlElement23.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    java.lang.String str20 = xmlElement2.getAttribute("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = null;
    xmlElement2.setAttributes(hashtable_str_str21);
    java.util.Observer observer23 = null;
    xmlElement2.deleteObserver(observer23);
    xmlElement2.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    XmlElement xmlElement3 = new XmlElement("hi!", "hi!");
    int i4 = xmlElement3.countObservers();
    java.lang.Object obj7 = xmlElement3.addAttribute("", "hi!");
    xmlElement3.removeFromParent();
    int i9 = xmlElement3.count();
    XmlElement xmlElement12 = new XmlElement("hi!", "hi!");
    int i13 = xmlElement12.countObservers();
    java.lang.Object obj16 = xmlElement12.addAttribute("", "hi!");
    xmlElement12.removeFromParent();
    int i18 = xmlElement12.count();
    XmlElement xmlElement20 = xmlElement12.addSubElement("");
    xmlElement3.append(xmlElement12);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement3.getAttributes();
    XmlElement xmlElement23 = new XmlElement("", hashtable_str_str22);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = null;
    xmlElement23.setAttributes(hashtable_str_str24);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement27 = xmlElement23.getElement((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.lang.String str27 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement30.getAttributes();
    java.lang.String str34 = xmlElement30.getAttribute("hi!");
    XmlElement xmlElement35 = xmlElement2.addSubElement(xmlElement30);
    java.lang.String str38 = xmlElement35.getAttribute("hi!", "hi!");
    java.util.Observer observer39 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement35.addObserver(observer39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "");
    java.util.List list3 = xmlElement2.getElements();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    xmlElement6.deleteObservers();
    XmlElement xmlElement10 = new XmlElement("hi!", "hi!");
    int i11 = xmlElement10.countObservers();
    boolean b12 = xmlElement6.addElement(xmlElement10);
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    xmlElement15.deleteObservers();
    XmlElement xmlElement19 = new XmlElement("hi!", "hi!");
    int i20 = xmlElement19.countObservers();
    boolean b21 = xmlElement15.addElement(xmlElement19);
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    xmlElement24.deleteObservers();
    XmlElement xmlElement28 = new XmlElement("hi!", "hi!");
    int i29 = xmlElement28.countObservers();
    boolean b30 = xmlElement24.addElement(xmlElement28);
    XmlElement xmlElement31 = xmlElement15.addSubElement(xmlElement28);
    xmlElement6.setParent(xmlElement31);
    xmlElement31.notifyObservers();
    java.lang.String str34 = xmlElement31.getName();
    XmlElement xmlElement37 = new XmlElement("hi!", "hi!");
    int i38 = xmlElement37.countObservers();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    xmlElement37.removeFromParent();
    int i43 = xmlElement37.count();
    XmlElement xmlElement46 = new XmlElement("hi!", "hi!");
    int i47 = xmlElement46.countObservers();
    java.lang.Object obj50 = xmlElement46.addAttribute("", "hi!");
    xmlElement46.removeFromParent();
    int i52 = xmlElement46.count();
    XmlElement xmlElement54 = xmlElement46.addSubElement("");
    xmlElement37.append(xmlElement46);
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str56 = xmlElement37.getAttributes();
    boolean b57 = xmlElement31.addElement(xmlElement37);
    xmlElement2.append(xmlElement31);
    int i59 = xmlElement2.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement2.getAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    XmlElement xmlElement24 = xmlElement2.getElement("hi!");
    java.lang.String str27 = xmlElement2.getAttribute("", "hi!");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    int i31 = xmlElement30.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement30.getAttributes();
    java.lang.String str34 = xmlElement30.getAttribute("hi!");
    XmlElement xmlElement35 = xmlElement2.addSubElement(xmlElement30);
    java.lang.String str37 = xmlElement35.getAttribute("");
    xmlElement35.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement30 = xmlElement2.addSubElement(xmlElement29);
    XmlElement xmlElement32 = xmlElement2.getElement("hi!");
    XmlElement xmlElement35 = new XmlElement("hi!", "hi!");
    xmlElement35.deleteObservers();
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    int i40 = xmlElement39.countObservers();
    boolean b41 = xmlElement35.addElement(xmlElement39);
    XmlElement xmlElement44 = new XmlElement("hi!", "hi!");
    xmlElement44.deleteObservers();
    XmlElement xmlElement48 = new XmlElement("hi!", "hi!");
    int i49 = xmlElement48.countObservers();
    boolean b50 = xmlElement44.addElement(xmlElement48);
    XmlElement xmlElement51 = xmlElement35.addSubElement(xmlElement48);
    xmlElement51.removeAllElements();
    xmlElement51.setData("");
    XmlElement xmlElement55 = xmlElement32.addSubElement(xmlElement51);
    boolean b56 = xmlElement51.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    XmlElement xmlElement21 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement21);
    boolean b24 = xmlElement2.equals((java.lang.Object)(short)10);
    XmlElement xmlElement25 = xmlElement2.getParent();
    xmlElement2.setData("");
    XmlElement xmlElement30 = new XmlElement("hi!", "hi!");
    xmlElement30.deleteObservers();
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    int i35 = xmlElement34.countObservers();
    boolean b36 = xmlElement30.addElement(xmlElement34);
    XmlElement xmlElement39 = new XmlElement("hi!", "hi!");
    xmlElement39.deleteObservers();
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    int i44 = xmlElement43.countObservers();
    boolean b45 = xmlElement39.addElement(xmlElement43);
    XmlElement xmlElement46 = xmlElement30.addSubElement(xmlElement43);
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    xmlElement30.append(xmlElement49);
    boolean b52 = xmlElement30.equals((java.lang.Object)(short)10);
    boolean b53 = xmlElement2.addElement(xmlElement30);
    XmlElement xmlElement55 = xmlElement30.getElement("hi!");
    xmlElement30.removeFromParent();
    java.lang.Object obj59 = xmlElement30.addAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    xmlElement2.setParent(xmlElement27);
    XmlElement xmlElement31 = new XmlElement("hi!", "hi!");
    xmlElement2.append(xmlElement31);
    xmlElement31.setName("hi!");
    xmlElement31.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    XmlElement xmlElement25 = new XmlElement("hi!", "hi!");
    int i26 = xmlElement25.countObservers();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement25.getAttributes();
    boolean b28 = xmlElement18.addElement(xmlElement25);
    java.lang.Object obj31 = xmlElement25.addAttribute("hi!", "");
    XmlElement xmlElement34 = new XmlElement("hi!", "hi!");
    xmlElement34.deleteObservers();
    XmlElement xmlElement38 = new XmlElement("hi!", "hi!");
    int i39 = xmlElement38.countObservers();
    boolean b40 = xmlElement34.addElement(xmlElement38);
    XmlElement xmlElement43 = new XmlElement("hi!", "hi!");
    xmlElement43.deleteObservers();
    XmlElement xmlElement47 = new XmlElement("hi!", "hi!");
    int i48 = xmlElement47.countObservers();
    boolean b49 = xmlElement43.addElement(xmlElement47);
    XmlElement xmlElement52 = new XmlElement("hi!", "hi!");
    xmlElement52.deleteObservers();
    XmlElement xmlElement56 = new XmlElement("hi!", "hi!");
    int i57 = xmlElement56.countObservers();
    boolean b58 = xmlElement52.addElement(xmlElement56);
    XmlElement xmlElement59 = xmlElement43.addSubElement(xmlElement56);
    XmlElement xmlElement60 = xmlElement34.addSubElement(xmlElement59);
    XmlElement xmlElement61 = xmlElement25.addSubElement(xmlElement60);
    XmlElement xmlElement63 = xmlElement60.addSubElement("");
    java.lang.String str64 = xmlElement63.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + ""+ "'", str64.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement18 = xmlElement2.addSubElement(xmlElement15);
    xmlElement18.setName("hi!");
    xmlElement18.setData("");
    boolean b23 = xmlElement18.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    XmlElement xmlElement2 = new XmlElement("hi!", "hi!");
    xmlElement2.deleteObservers();
    XmlElement xmlElement6 = new XmlElement("hi!", "hi!");
    int i7 = xmlElement6.countObservers();
    boolean b8 = xmlElement2.addElement(xmlElement6);
    XmlElement xmlElement11 = new XmlElement("hi!", "hi!");
    xmlElement11.deleteObservers();
    XmlElement xmlElement15 = new XmlElement("hi!", "hi!");
    int i16 = xmlElement15.countObservers();
    boolean b17 = xmlElement11.addElement(xmlElement15);
    XmlElement xmlElement20 = new XmlElement("hi!", "hi!");
    xmlElement20.deleteObservers();
    XmlElement xmlElement24 = new XmlElement("hi!", "hi!");
    int i25 = xmlElement24.countObservers();
    boolean b26 = xmlElement20.addElement(xmlElement24);
    XmlElement xmlElement27 = xmlElement11.addSubElement(xmlElement24);
    XmlElement xmlElement28 = xmlElement2.addSubElement(xmlElement27);
    XmlElement xmlElement29 = new XmlElement();
    XmlElement xmlElement32 = new XmlElement("hi!", "hi!");
    int i33 = xmlElement32.countObservers();
    XmlElement xmlElement36 = new XmlElement("hi!", "hi!");
    xmlElement36.deleteObservers();
    XmlElement xmlElement40 = new XmlElement("hi!", "hi!");
    int i41 = xmlElement40.countObservers();
    boolean b42 = xmlElement36.addElement(xmlElement40);
    XmlElement xmlElement45 = new XmlElement("hi!", "hi!");
    xmlElement45.deleteObservers();
    XmlElement xmlElement49 = new XmlElement("hi!", "hi!");
    int i50 = xmlElement49.countObservers();
    boolean b51 = xmlElement45.addElement(xmlElement49);
    XmlElement xmlElement54 = new XmlElement("hi!", "hi!");
    xmlElement54.deleteObservers();
    XmlElement xmlElement58 = new XmlElement("hi!", "hi!");
    int i59 = xmlElement58.countObservers();
    boolean b60 = xmlElement54.addElement(xmlElement58);
    XmlElement xmlElement61 = xmlElement45.addSubElement(xmlElement58);
    XmlElement xmlElement62 = xmlElement36.addSubElement(xmlElement61);
    XmlElement xmlElement63 = xmlElement36.getParent();
    xmlElement32.setParent(xmlElement63);
    XmlElement xmlElement65 = xmlElement29.removeElement(xmlElement63);
    java.util.Enumeration enumeration66 = xmlElement29.getAttributeNames();
    xmlElement28.setParent(xmlElement29);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement69 = xmlElement28.removeElement((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration66);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    XmlElement xmlElement2 = new XmlElement("", "");

  }

}
