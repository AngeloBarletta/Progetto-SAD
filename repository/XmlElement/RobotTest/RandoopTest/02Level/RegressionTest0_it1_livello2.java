
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

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    XmlElement xmlElement3 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement3.getAttributes();
    boolean b5 = xmlElement3.hasChanged();
    xmlElement3.notifyObservers();
    XmlElement xmlElement7 = xmlElement3.getParent();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.append(xmlElement7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement6 = xmlElement0.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    XmlElement xmlElement6 = xmlElement0.addSubElement("hi!", "");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    boolean b9 = xmlElement7.hasChanged();
    xmlElement7.notifyObservers((java.lang.Object)100);
    boolean b12 = xmlElement0.equals((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    xmlElement4.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement8 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement8.getAttributes();
    boolean b10 = xmlElement8.hasChanged();
    xmlElement8.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement13 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement13.getAttributes();
    boolean b15 = xmlElement13.hasChanged();
    boolean b16 = xmlElement8.addElement(xmlElement13);
    xmlElement4.insertElement(xmlElement13, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.insertElement(xmlElement4, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers();
    XmlElement xmlElement4 = xmlElement0.getParent();
    // The following exception was thrown during execution in test generation
    try {
    xmlElement4.setData("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement13 = xmlElement7.removeElement((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement5 = xmlElement0.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.removeFromParent();
    XmlElement xmlElement4 = xmlElement0.getElement("");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = xmlElement4.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    boolean b15 = xmlElement11.equals((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    xmlElement9.notifyObservers((java.lang.Object)100);
    xmlElement5.append(xmlElement9);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    java.lang.Object obj21 = xmlElement17.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement17, "hi!");
    XmlElement xmlElement24 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = xmlElement24.getAttributes();
    xmlElement24.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement28 = xmlElement17.addSubElement(xmlElement24);
    xmlElement15.append(xmlElement28);
    XmlElement xmlElement30 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement30.getAttributes();
    boolean b32 = xmlElement30.hasChanged();
    xmlElement30.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement35 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = xmlElement35.getAttributes();
    boolean b37 = xmlElement35.hasChanged();
    boolean b38 = xmlElement30.addElement(xmlElement35);
    java.lang.Object obj39 = xmlElement30.clone();
    XmlElement xmlElement40 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str41 = xmlElement40.getAttributes();
    boolean b42 = xmlElement40.hasChanged();
    xmlElement40.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement45 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str46 = xmlElement45.getAttributes();
    boolean b47 = xmlElement45.hasChanged();
    boolean b48 = xmlElement40.addElement(xmlElement45);
    XmlElement xmlElement49 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str50 = xmlElement49.getAttributes();
    boolean b51 = xmlElement49.hasChanged();
    xmlElement49.notifyObservers((java.lang.Object)100);
    xmlElement45.append(xmlElement49);
    xmlElement30.append(xmlElement49);
    XmlElement xmlElement56 = xmlElement28.addSubElement(xmlElement49);
    // The following exception was thrown during execution in test generation
    try {
    xmlElement5.insertElement(xmlElement49, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement56);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    xmlElement9.notifyObservers((java.lang.Object)100);
    xmlElement5.append(xmlElement9);
    java.lang.String str16 = xmlElement5.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers();
    XmlElement xmlElement4 = xmlElement0.getParent();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = xmlElement4.count();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    XmlElement xmlElement2 = new XmlElement("", "");
    xmlElement2.notifyObservers((java.lang.Object)(-1L));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    xmlElement15.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    boolean b23 = xmlElement15.addElement(xmlElement20);
    java.lang.Object obj24 = xmlElement15.clone();
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    xmlElement25.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement30 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement30.getAttributes();
    boolean b32 = xmlElement30.hasChanged();
    boolean b33 = xmlElement25.addElement(xmlElement30);
    XmlElement xmlElement34 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement34.getAttributes();
    boolean b36 = xmlElement34.hasChanged();
    xmlElement34.notifyObservers((java.lang.Object)100);
    xmlElement30.append(xmlElement34);
    xmlElement15.append(xmlElement34);
    XmlElement xmlElement41 = xmlElement13.addSubElement(xmlElement34);
    java.lang.String str43 = xmlElement13.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    java.lang.Object obj16 = xmlElement11.addAttribute("", "");
    java.util.Enumeration enumeration17 = xmlElement11.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.removeFromParent();
    XmlElement xmlElement3 = xmlElement0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    java.lang.String str27 = xmlElement19.getAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement8 = xmlElement0.removeElement((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    XmlElement xmlElement15 = xmlElement11.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    xmlElement15.setName("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.Object obj9 = xmlElement0.clone();
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    xmlElement10.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    boolean b18 = xmlElement10.addElement(xmlElement15);
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    xmlElement19.notifyObservers((java.lang.Object)100);
    xmlElement15.append(xmlElement19);
    xmlElement0.append(xmlElement19);
    int i26 = xmlElement0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.String str10 = xmlElement0.getAttribute("");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    java.lang.Object obj15 = xmlElement11.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement11, "hi!");
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    xmlElement18.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement22 = xmlElement11.addSubElement(xmlElement18);
    XmlElement xmlElement24 = xmlElement22.getElement("");
    xmlElement0.notifyObservers((java.lang.Object)"");
    java.util.List list26 = xmlElement0.getElements();
    xmlElement0.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement3 = xmlElement0.removeElement((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement5 = xmlElement0.getElement("");
    int i6 = xmlElement0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    xmlElement0.setAttributes(hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement0.getElement("");
    XmlElement xmlElement6 = new XmlElement();
    xmlElement6.setName("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement6.getAttributes();
    XmlElement xmlElement10 = new XmlElement("", hashtable_str_str9);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = xmlElement4.equals((java.lang.Object)xmlElement10);
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
    org.junit.Assert.assertNotNull(hashtable_str_str9);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement0.getAttributes();
    java.util.Observer observer5 = null;
    xmlElement0.deleteObserver(observer5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    xmlElement0.setAttributes(hashtable_str_str1);
    XmlElement xmlElement4 = xmlElement0.getElement("");
    int i5 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    XmlElement xmlElement13 = xmlElement11.getElement("");
    boolean b15 = xmlElement11.equals((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement5 = xmlElement0.getElement("hi!");
    java.util.Enumeration enumeration6 = xmlElement0.getAttributeNames();
    boolean b7 = xmlElement0.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    XmlElement xmlElement1 = new XmlElement("hi!");

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    xmlElement0.setAttributes(hashtable_str_str1);
    // The following exception was thrown during execution in test generation
    try {
    XmlElement.printNode(xmlElement0, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.Object obj9 = xmlElement0.clone();
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    xmlElement10.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    boolean b18 = xmlElement10.addElement(xmlElement15);
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    xmlElement19.notifyObservers((java.lang.Object)100);
    xmlElement15.append(xmlElement19);
    xmlElement0.append(xmlElement19);
    XmlElement xmlElement26 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement26.getAttributes();
    xmlElement26.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement31 = xmlElement26.getElement("hi!");
    XmlElement xmlElement32 = xmlElement19.removeElement(xmlElement31);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = xmlElement31.getName();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement5 = xmlElement0.getElement("");
    XmlElement xmlElement6 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str7 = xmlElement6.getAttributes();
    boolean b8 = xmlElement6.hasChanged();
    xmlElement6.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    boolean b13 = xmlElement11.hasChanged();
    boolean b14 = xmlElement6.addElement(xmlElement11);
    java.lang.Object obj15 = xmlElement6.clone();
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    xmlElement16.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement21 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement21.getAttributes();
    boolean b23 = xmlElement21.hasChanged();
    boolean b24 = xmlElement16.addElement(xmlElement21);
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    xmlElement25.notifyObservers((java.lang.Object)100);
    xmlElement21.append(xmlElement25);
    xmlElement6.append(xmlElement25);
    xmlElement6.removeFromParent();
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = xmlElement5.equals((java.lang.Object)xmlElement6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    xmlElement0.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement5 = xmlElement0.getElement("");
    xmlElement0.setData("");
    xmlElement0.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    java.lang.Object obj16 = xmlElement11.addAttribute("", "");
    XmlElement.printNode(xmlElement11, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.util.Observer observer9 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.addObserver(observer9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    xmlElement0.setAttributes(hashtable_str_str1);
    java.util.Observer observer3 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.addObserver(observer3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement5 = xmlElement0.getElement("hi!");
    java.util.Enumeration enumeration6 = xmlElement0.getAttributeNames();
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    java.lang.Object obj11 = xmlElement7.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement7, "hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    xmlElement14.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement18 = xmlElement7.addSubElement(xmlElement14);
    XmlElement xmlElement19 = xmlElement0.addSubElement(xmlElement18);
    java.lang.Object obj20 = xmlElement0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.removeFromParent();
    XmlElement xmlElement4 = xmlElement0.getElement("");
    java.lang.String str5 = xmlElement0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement8 = xmlElement0.getElement("hi!");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement9 = xmlElement8.getParent();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement8);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    int i5 = xmlElement0.count();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement0.getElement(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    java.lang.String str25 = xmlElement24.getData();
    xmlElement24.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.String str10 = xmlElement0.getAttribute("");
    XmlElement xmlElement11 = xmlElement0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement11);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.removeFromParent();
    java.lang.String str5 = xmlElement0.getAttribute("hi!", "");
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement7 = xmlElement0.removeElement((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.Object obj9 = xmlElement0.clone();
    java.lang.Object obj12 = xmlElement0.addAttribute("", "");
    xmlElement0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    XmlElement xmlElement15 = xmlElement11.getElement("hi!");
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    java.lang.String str19 = xmlElement16.getName();
    java.util.List list20 = xmlElement16.getElements();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement21 = xmlElement15.addSubElement(xmlElement16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    boolean b6 = xmlElement4.hasChanged();
    xmlElement4.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    boolean b12 = xmlElement4.addElement(xmlElement9);
    xmlElement0.insertElement(xmlElement9, (int)(byte)0);
    boolean b15 = xmlElement0.hasChanged();
    java.lang.String str16 = xmlElement0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    java.lang.Object obj5 = xmlElement0.clone();
    java.util.Observer observer6 = null;
    xmlElement0.deleteObserver(observer6);
    java.util.Enumeration enumeration8 = xmlElement0.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement5 = xmlElement0.getElement("");
    int i6 = xmlElement0.countObservers();
    int i7 = xmlElement0.count();
    xmlElement0.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    boolean b6 = xmlElement4.hasChanged();
    xmlElement4.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    boolean b12 = xmlElement4.addElement(xmlElement9);
    xmlElement0.insertElement(xmlElement9, (int)(byte)0);
    boolean b15 = xmlElement0.hasChanged();
    int i16 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    XmlElement xmlElement14 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    java.lang.Object obj18 = xmlElement14.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement14, "hi!");
    XmlElement xmlElement21 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement21.getAttributes();
    xmlElement21.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement21);
    XmlElement xmlElement27 = xmlElement25.getElement("");
    xmlElement25.setData("hi!");
    xmlElement11.append(xmlElement25);
    XmlElement xmlElement31 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement31.getAttributes();
    XmlElement xmlElement33 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement33.getAttributes();
    boolean b35 = xmlElement33.hasChanged();
    java.lang.String str36 = xmlElement33.getName();
    boolean b37 = xmlElement31.addElement(xmlElement33);
    boolean b38 = xmlElement11.equals((java.lang.Object)b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.Object obj9 = xmlElement0.clone();
    java.lang.Object obj12 = xmlElement0.addAttribute("", "");
    xmlElement0.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    int i15 = xmlElement0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    XmlElement xmlElement27 = xmlElement19.addSubElement("hi!", "");
    xmlElement19.setData("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    XmlElement xmlElement14 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    java.lang.Object obj18 = xmlElement14.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement14, "hi!");
    XmlElement xmlElement21 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str22 = xmlElement21.getAttributes();
    xmlElement21.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement25 = xmlElement14.addSubElement(xmlElement21);
    XmlElement xmlElement27 = xmlElement25.getElement("");
    xmlElement25.setData("hi!");
    xmlElement11.append(xmlElement25);
    boolean b31 = xmlElement11.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    xmlElement15.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    boolean b23 = xmlElement15.addElement(xmlElement20);
    java.lang.Object obj24 = xmlElement15.clone();
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    xmlElement25.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement30 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement30.getAttributes();
    boolean b32 = xmlElement30.hasChanged();
    boolean b33 = xmlElement25.addElement(xmlElement30);
    XmlElement xmlElement34 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement34.getAttributes();
    boolean b36 = xmlElement34.hasChanged();
    xmlElement34.notifyObservers((java.lang.Object)100);
    xmlElement30.append(xmlElement34);
    xmlElement15.append(xmlElement34);
    XmlElement xmlElement41 = xmlElement13.addSubElement(xmlElement34);
    java.lang.String str43 = xmlElement13.getAttribute("");
    XmlElement xmlElement45 = new XmlElement();
    xmlElement45.setName("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str48 = xmlElement45.getAttributes();
    XmlElement xmlElement49 = new XmlElement("hi!", hashtable_str_str48);
    xmlElement13.setAttributes(hashtable_str_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str48);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.removeAllElements();
    XmlElement xmlElement5 = xmlElement0.getElement("");
    int i6 = xmlElement0.countObservers();
    int i7 = xmlElement0.count();
    java.util.List list8 = xmlElement0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.Object obj9 = xmlElement0.clone();
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    xmlElement10.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    boolean b18 = xmlElement10.addElement(xmlElement15);
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    xmlElement19.notifyObservers((java.lang.Object)100);
    xmlElement15.append(xmlElement19);
    xmlElement0.append(xmlElement19);
    XmlElement xmlElement26 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str27 = xmlElement26.getAttributes();
    xmlElement26.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement31 = xmlElement26.getElement("hi!");
    XmlElement xmlElement32 = xmlElement19.removeElement(xmlElement31);
    int i33 = xmlElement19.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    xmlElement5.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    boolean b13 = xmlElement5.addElement(xmlElement10);
    boolean b14 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    xmlElement15.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    boolean b23 = xmlElement15.addElement(xmlElement20);
    java.lang.Object obj24 = xmlElement15.clone();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str25 = xmlElement15.getAttributes();
    boolean b26 = xmlElement5.equals((java.lang.Object)xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    xmlElement5.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    boolean b13 = xmlElement5.addElement(xmlElement10);
    boolean b14 = xmlElement0.addElement(xmlElement5);
    int i15 = xmlElement0.count();
    java.util.Observer observer16 = null;
    // The following exception was thrown during execution in test generation
    try {
    xmlElement0.addObserver(observer16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    int i25 = xmlElement13.count();
    java.lang.Object obj28 = xmlElement13.addAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = xmlElement0.addSubElement(xmlElement7);
    java.util.Observer observer12 = null;
    xmlElement11.deleteObserver(observer12);
    XmlElement xmlElement15 = xmlElement11.getElement("hi!");
    XmlElement xmlElement18 = xmlElement11.addSubElement("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    boolean b6 = xmlElement4.hasChanged();
    xmlElement4.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    boolean b12 = xmlElement4.addElement(xmlElement9);
    xmlElement0.insertElement(xmlElement9, (int)(byte)0);
    int i15 = xmlElement0.count();
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    xmlElement16.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    xmlElement20.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    boolean b28 = xmlElement20.addElement(xmlElement25);
    xmlElement16.insertElement(xmlElement25, (int)(byte)0);
    xmlElement0.append(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    boolean b4 = xmlElement2.hasChanged();
    java.lang.String str5 = xmlElement2.getName();
    boolean b6 = xmlElement0.addElement(xmlElement2);
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    boolean b13 = xmlElement11.hasChanged();
    xmlElement11.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    boolean b19 = xmlElement11.addElement(xmlElement16);
    xmlElement7.insertElement(xmlElement16, (int)(byte)0);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement16);
    java.lang.String str24 = xmlElement2.getAttribute("");
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    XmlElement xmlElement27 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = xmlElement27.getAttributes();
    java.lang.Object obj31 = xmlElement27.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement27, "hi!");
    XmlElement xmlElement34 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement34.getAttributes();
    xmlElement34.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement38 = xmlElement27.addSubElement(xmlElement34);
    xmlElement25.append(xmlElement38);
    xmlElement38.setData("");
    XmlElement xmlElement42 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str43 = xmlElement42.getAttributes();
    XmlElement xmlElement44 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str45 = xmlElement44.getAttributes();
    boolean b46 = xmlElement44.hasChanged();
    java.lang.String str47 = xmlElement44.getName();
    boolean b48 = xmlElement42.addElement(xmlElement44);
    XmlElement xmlElement49 = xmlElement38.addSubElement(xmlElement44);
    xmlElement2.append(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement49);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    xmlElement5.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    boolean b13 = xmlElement5.addElement(xmlElement10);
    boolean b14 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement17 = xmlElement0.addSubElement("hi!", "hi!");
    XmlElement xmlElement20 = xmlElement17.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    boolean b4 = xmlElement2.hasChanged();
    java.lang.String str5 = xmlElement2.getName();
    boolean b6 = xmlElement0.addElement(xmlElement2);
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    boolean b13 = xmlElement11.hasChanged();
    xmlElement11.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    boolean b19 = xmlElement11.addElement(xmlElement16);
    xmlElement7.insertElement(xmlElement16, (int)(byte)0);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement16);
    XmlElement xmlElement23 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement23.getAttributes();
    boolean b25 = xmlElement23.hasChanged();
    java.lang.String str28 = xmlElement23.getAttribute("", "hi!");
    xmlElement16.append(xmlElement23);
    int i30 = xmlElement23.countObservers();
    XmlElement xmlElement31 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement31.getAttributes();
    boolean b33 = xmlElement31.hasChanged();
    java.lang.String str34 = xmlElement31.getName();
    java.util.List list35 = xmlElement31.getElements();
    java.lang.Object obj38 = xmlElement31.addAttribute("", "hi!");
    xmlElement31.deleteObservers();
    XmlElement xmlElement40 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str41 = xmlElement40.getAttributes();
    boolean b42 = xmlElement40.hasChanged();
    xmlElement40.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement45 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str46 = xmlElement45.getAttributes();
    boolean b47 = xmlElement45.hasChanged();
    boolean b48 = xmlElement40.addElement(xmlElement45);
    java.lang.String str50 = xmlElement40.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str51 = xmlElement40.getAttributes();
    xmlElement31.setAttributes(hashtable_str_str51);
    boolean b53 = xmlElement23.addElement(xmlElement31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    boolean b3 = xmlElement0.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.String str10 = xmlElement0.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement0.getAttributes();
    // The following exception was thrown during execution in test generation
    try {
    XmlElement xmlElement13 = xmlElement0.getElement((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    boolean b6 = xmlElement4.hasChanged();
    xmlElement4.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    boolean b12 = xmlElement4.addElement(xmlElement9);
    xmlElement0.insertElement(xmlElement9, (int)(byte)0);
    boolean b15 = xmlElement0.hasChanged();
    xmlElement0.setName("hi!");
    xmlElement0.deleteObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.Object obj3 = xmlElement0.addAttribute("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    XmlElement xmlElement27 = xmlElement19.addSubElement("hi!", "");
    xmlElement19.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    xmlElement5.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement10 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str11 = xmlElement10.getAttributes();
    boolean b12 = xmlElement10.hasChanged();
    boolean b13 = xmlElement5.addElement(xmlElement10);
    boolean b14 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement17 = xmlElement0.addSubElement("hi!", "hi!");
    XmlElement xmlElement18 = xmlElement0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement18);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    boolean b17 = xmlElement15.hasChanged();
    xmlElement15.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    boolean b23 = xmlElement15.addElement(xmlElement20);
    java.lang.Object obj24 = xmlElement15.clone();
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    xmlElement25.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement30 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement30.getAttributes();
    boolean b32 = xmlElement30.hasChanged();
    boolean b33 = xmlElement25.addElement(xmlElement30);
    XmlElement xmlElement34 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str35 = xmlElement34.getAttributes();
    boolean b36 = xmlElement34.hasChanged();
    xmlElement34.notifyObservers((java.lang.Object)100);
    xmlElement30.append(xmlElement34);
    xmlElement15.append(xmlElement34);
    XmlElement xmlElement41 = xmlElement13.addSubElement(xmlElement34);
    XmlElement xmlElement43 = xmlElement41.addSubElement("hi!");
    int i44 = xmlElement43.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    java.util.List list17 = xmlElement13.getElements();
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    boolean b20 = xmlElement18.hasChanged();
    java.lang.String str21 = xmlElement18.getName();
    java.util.List list22 = xmlElement18.getElements();
    java.lang.Object obj23 = xmlElement18.clone();
    XmlElement xmlElement26 = new XmlElement();
    xmlElement26.setName("hi!");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement26.getAttributes();
    XmlElement xmlElement30 = new XmlElement("", hashtable_str_str29);
    XmlElement xmlElement31 = new XmlElement("", hashtable_str_str29);
    xmlElement18.setAttributes(hashtable_str_str29);
    XmlElement xmlElement33 = xmlElement13.removeElement(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement33);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    XmlElement xmlElement16 = xmlElement0.getElement(0);
    java.lang.Object obj19 = xmlElement16.addAttribute("", "");
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    boolean b22 = xmlElement20.hasChanged();
    java.lang.String str23 = xmlElement20.getName();
    java.util.List list24 = xmlElement20.getElements();
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    boolean b27 = xmlElement25.hasChanged();
    xmlElement25.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement30 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str31 = xmlElement30.getAttributes();
    boolean b32 = xmlElement30.hasChanged();
    boolean b33 = xmlElement25.addElement(xmlElement30);
    boolean b34 = xmlElement20.addElement(xmlElement25);
    XmlElement xmlElement35 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str36 = xmlElement35.getAttributes();
    XmlElement xmlElement37 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str38 = xmlElement37.getAttributes();
    java.lang.Object obj41 = xmlElement37.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement37, "hi!");
    XmlElement xmlElement44 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str45 = xmlElement44.getAttributes();
    xmlElement44.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement48 = xmlElement37.addSubElement(xmlElement44);
    xmlElement35.append(xmlElement48);
    xmlElement48.setData("");
    XmlElement xmlElement52 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str53 = xmlElement52.getAttributes();
    XmlElement xmlElement54 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str55 = xmlElement54.getAttributes();
    boolean b56 = xmlElement54.hasChanged();
    java.lang.String str57 = xmlElement54.getName();
    boolean b58 = xmlElement52.addElement(xmlElement54);
    XmlElement xmlElement59 = xmlElement48.addSubElement(xmlElement54);
    xmlElement25.notifyObservers((java.lang.Object)xmlElement54);
    boolean b61 = xmlElement16.addElement(xmlElement54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    boolean b4 = xmlElement2.hasChanged();
    java.lang.String str5 = xmlElement2.getName();
    boolean b6 = xmlElement0.addElement(xmlElement2);
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    boolean b13 = xmlElement11.hasChanged();
    xmlElement11.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    boolean b19 = xmlElement11.addElement(xmlElement16);
    xmlElement7.insertElement(xmlElement16, (int)(byte)0);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement16);
    XmlElement xmlElement23 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement23.getAttributes();
    boolean b25 = xmlElement23.hasChanged();
    java.lang.String str28 = xmlElement23.getAttribute("", "hi!");
    xmlElement16.append(xmlElement23);
    int i30 = xmlElement23.countObservers();
    xmlElement23.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.lang.Object obj13 = xmlElement9.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement9, "hi!");
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    xmlElement16.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement20 = xmlElement9.addSubElement(xmlElement16);
    xmlElement7.append(xmlElement20);
    XmlElement xmlElement22 = xmlElement0.addSubElement(xmlElement20);
    java.util.Observer observer23 = null;
    xmlElement0.deleteObserver(observer23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    java.lang.Object obj7 = xmlElement0.addAttribute("", "hi!");
    xmlElement0.deleteObservers();
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    xmlElement9.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement14 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    boolean b16 = xmlElement14.hasChanged();
    boolean b17 = xmlElement9.addElement(xmlElement14);
    java.lang.String str19 = xmlElement9.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement9.getAttributes();
    xmlElement0.setAttributes(hashtable_str_str20);
    XmlElement xmlElement24 = xmlElement0.addSubElement("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    XmlElement xmlElement1 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str2 = xmlElement1.getAttributes();
    java.lang.Object obj5 = xmlElement1.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement1, "hi!");
    XmlElement xmlElement8 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str9 = xmlElement8.getAttributes();
    xmlElement8.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement12 = xmlElement1.addSubElement(xmlElement8);
    XmlElement xmlElement13 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = null;
    xmlElement13.setAttributes(hashtable_str_str14);
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    java.lang.Object obj22 = xmlElement18.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement18, "hi!");
    XmlElement xmlElement25 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str26 = xmlElement25.getAttributes();
    xmlElement25.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement29 = xmlElement18.addSubElement(xmlElement25);
    xmlElement16.append(xmlElement29);
    XmlElement xmlElement31 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement31.getAttributes();
    boolean b33 = xmlElement31.hasChanged();
    xmlElement31.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement36 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = xmlElement36.getAttributes();
    boolean b38 = xmlElement36.hasChanged();
    boolean b39 = xmlElement31.addElement(xmlElement36);
    java.lang.Object obj40 = xmlElement31.clone();
    XmlElement xmlElement41 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str42 = xmlElement41.getAttributes();
    boolean b43 = xmlElement41.hasChanged();
    xmlElement41.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement46 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str47 = xmlElement46.getAttributes();
    boolean b48 = xmlElement46.hasChanged();
    boolean b49 = xmlElement41.addElement(xmlElement46);
    XmlElement xmlElement50 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str51 = xmlElement50.getAttributes();
    boolean b52 = xmlElement50.hasChanged();
    xmlElement50.notifyObservers((java.lang.Object)100);
    xmlElement46.append(xmlElement50);
    xmlElement31.append(xmlElement50);
    XmlElement xmlElement57 = xmlElement29.addSubElement(xmlElement50);
    xmlElement13.setParent(xmlElement57);
    XmlElement xmlElement59 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str60 = xmlElement59.getAttributes();
    boolean b61 = xmlElement59.hasChanged();
    xmlElement59.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement64 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str65 = xmlElement64.getAttributes();
    boolean b66 = xmlElement64.hasChanged();
    boolean b67 = xmlElement59.addElement(xmlElement64);
    java.lang.String str69 = xmlElement59.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str70 = xmlElement59.getAttributes();
    xmlElement13.setAttributes(hashtable_str_str70);
    xmlElement12.setAttributes(hashtable_str_str70);
    XmlElement xmlElement73 = new XmlElement("", hashtable_str_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str70);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    xmlElement13.setData("");
    XmlElement xmlElement17 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str18 = xmlElement17.getAttributes();
    XmlElement xmlElement19 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str20 = xmlElement19.getAttributes();
    boolean b21 = xmlElement19.hasChanged();
    java.lang.String str22 = xmlElement19.getName();
    boolean b23 = xmlElement17.addElement(xmlElement19);
    XmlElement xmlElement24 = xmlElement13.addSubElement(xmlElement19);
    XmlElement xmlElement27 = xmlElement19.addSubElement("hi!", "");
    xmlElement19.notifyObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement27);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.removeAllElements();
    XmlElement xmlElement4 = xmlElement0.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement4);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement5 = xmlElement0.getElement("hi!");
    java.util.Enumeration enumeration6 = xmlElement0.getAttributeNames();
    java.lang.Object obj7 = xmlElement0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    XmlElement xmlElement6 = xmlElement0.addSubElement("hi!", "");
    XmlElement xmlElement7 = xmlElement0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement7);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    xmlElement9.notifyObservers((java.lang.Object)100);
    xmlElement5.append(xmlElement9);
    XmlElement xmlElement15 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str16 = xmlElement15.getAttributes();
    xmlElement5.notifyObservers((java.lang.Object)hashtable_str_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str16);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement5 = xmlElement0.getElement("hi!");
    java.util.Enumeration enumeration6 = xmlElement0.getAttributeNames();
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    java.lang.Object obj11 = xmlElement7.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement7, "hi!");
    XmlElement xmlElement14 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str15 = xmlElement14.getAttributes();
    xmlElement14.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement18 = xmlElement7.addSubElement(xmlElement14);
    XmlElement xmlElement19 = xmlElement0.addSubElement(xmlElement18);
    java.util.Observer observer20 = null;
    xmlElement19.deleteObserver(observer20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement19);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    xmlElement0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    xmlElement0.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement4 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str5 = xmlElement4.getAttributes();
    boolean b6 = xmlElement4.hasChanged();
    xmlElement4.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    boolean b11 = xmlElement9.hasChanged();
    boolean b12 = xmlElement4.addElement(xmlElement9);
    xmlElement0.insertElement(xmlElement9, (int)(byte)0);
    java.lang.String str17 = xmlElement9.getAttribute("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.String str10 = xmlElement0.getAttribute("");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    java.lang.Object obj15 = xmlElement11.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement11, "hi!");
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    xmlElement18.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement22 = xmlElement11.addSubElement(xmlElement18);
    XmlElement xmlElement24 = xmlElement22.getElement("");
    xmlElement0.notifyObservers((java.lang.Object)"");
    java.util.List list26 = xmlElement0.getElements();
    int i27 = xmlElement0.countObservers();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    java.lang.Object obj6 = xmlElement2.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement2, "hi!");
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    xmlElement9.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement13 = xmlElement2.addSubElement(xmlElement9);
    xmlElement0.append(xmlElement13);
    XmlElement xmlElement16 = xmlElement0.getElement(0);
    java.lang.Object obj19 = xmlElement16.addAttribute("", "");
    XmlElement xmlElement20 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str21 = xmlElement20.getAttributes();
    XmlElement xmlElement22 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str23 = xmlElement22.getAttributes();
    boolean b24 = xmlElement22.hasChanged();
    java.lang.String str25 = xmlElement22.getName();
    boolean b26 = xmlElement20.addElement(xmlElement22);
    XmlElement xmlElement27 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str28 = xmlElement27.getAttributes();
    xmlElement27.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement31 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str32 = xmlElement31.getAttributes();
    boolean b33 = xmlElement31.hasChanged();
    xmlElement31.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement36 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str37 = xmlElement36.getAttributes();
    boolean b38 = xmlElement36.hasChanged();
    boolean b39 = xmlElement31.addElement(xmlElement36);
    xmlElement27.insertElement(xmlElement36, (int)(byte)0);
    XmlElement xmlElement42 = xmlElement22.addSubElement(xmlElement36);
    XmlElement xmlElement43 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str44 = xmlElement43.getAttributes();
    boolean b45 = xmlElement43.hasChanged();
    java.lang.String str48 = xmlElement43.getAttribute("", "hi!");
    xmlElement36.append(xmlElement43);
    XmlElement xmlElement50 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str51 = xmlElement50.getAttributes();
    xmlElement43.setAttributes(hashtable_str_str51);
    xmlElement16.setAttributes(hashtable_str_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str51);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }


    XmlElement xmlElement0 = new XmlElement();
    java.lang.String str1 = xmlElement0.getData();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    boolean b4 = xmlElement2.hasChanged();
    xmlElement2.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    boolean b9 = xmlElement7.hasChanged();
    boolean b10 = xmlElement2.addElement(xmlElement7);
    java.lang.String str12 = xmlElement2.getAttribute("");
    XmlElement xmlElement13 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str14 = xmlElement13.getAttributes();
    boolean b15 = xmlElement13.hasChanged();
    xmlElement13.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    boolean b20 = xmlElement18.hasChanged();
    boolean b21 = xmlElement13.addElement(xmlElement18);
    XmlElement xmlElement23 = xmlElement18.getElement("hi!");
    XmlElement xmlElement24 = xmlElement2.removeElement(xmlElement23);
    boolean b25 = xmlElement0.equals((java.lang.Object)xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = null;
    xmlElement0.setAttributes(hashtable_str_str1);
    XmlElement xmlElement3 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str4 = xmlElement3.getAttributes();
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    java.lang.Object obj9 = xmlElement5.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement5, "hi!");
    XmlElement xmlElement12 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str13 = xmlElement12.getAttributes();
    xmlElement12.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement16 = xmlElement5.addSubElement(xmlElement12);
    xmlElement3.append(xmlElement16);
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    boolean b20 = xmlElement18.hasChanged();
    xmlElement18.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement23 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str24 = xmlElement23.getAttributes();
    boolean b25 = xmlElement23.hasChanged();
    boolean b26 = xmlElement18.addElement(xmlElement23);
    java.lang.Object obj27 = xmlElement18.clone();
    XmlElement xmlElement28 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str29 = xmlElement28.getAttributes();
    boolean b30 = xmlElement28.hasChanged();
    xmlElement28.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement33 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str34 = xmlElement33.getAttributes();
    boolean b35 = xmlElement33.hasChanged();
    boolean b36 = xmlElement28.addElement(xmlElement33);
    XmlElement xmlElement37 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str38 = xmlElement37.getAttributes();
    boolean b39 = xmlElement37.hasChanged();
    xmlElement37.notifyObservers((java.lang.Object)100);
    xmlElement33.append(xmlElement37);
    xmlElement18.append(xmlElement37);
    XmlElement xmlElement44 = xmlElement16.addSubElement(xmlElement37);
    xmlElement0.setParent(xmlElement44);
    XmlElement xmlElement46 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str47 = xmlElement46.getAttributes();
    boolean b48 = xmlElement46.hasChanged();
    xmlElement46.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement51 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str52 = xmlElement51.getAttributes();
    boolean b53 = xmlElement51.hasChanged();
    boolean b54 = xmlElement46.addElement(xmlElement51);
    java.lang.String str56 = xmlElement46.getAttribute("");
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str57 = xmlElement46.getAttributes();
    xmlElement0.setAttributes(hashtable_str_str57);
    java.lang.String str61 = xmlElement0.getAttribute("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test94"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    java.lang.String str3 = xmlElement0.getName();
    java.util.List list4 = xmlElement0.getElements();
    java.lang.Object obj7 = xmlElement0.addAttribute("", "hi!");
    xmlElement0.deleteObservers();
    XmlElement xmlElement11 = xmlElement0.addSubElement("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement11);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test95"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    boolean b2 = xmlElement0.hasChanged();
    xmlElement0.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement5 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str6 = xmlElement5.getAttributes();
    boolean b7 = xmlElement5.hasChanged();
    boolean b8 = xmlElement0.addElement(xmlElement5);
    java.lang.String str10 = xmlElement0.getAttribute("");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    java.lang.Object obj15 = xmlElement11.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement11, "hi!");
    XmlElement xmlElement18 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str19 = xmlElement18.getAttributes();
    xmlElement18.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement22 = xmlElement11.addSubElement(xmlElement18);
    XmlElement xmlElement24 = xmlElement22.getElement("");
    xmlElement0.notifyObservers((java.lang.Object)"");
    java.util.List list26 = xmlElement0.getElements();
    int i27 = xmlElement0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test96"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    XmlElement xmlElement2 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str3 = xmlElement2.getAttributes();
    boolean b4 = xmlElement2.hasChanged();
    java.lang.String str5 = xmlElement2.getName();
    boolean b6 = xmlElement0.addElement(xmlElement2);
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    xmlElement7.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement11 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str12 = xmlElement11.getAttributes();
    boolean b13 = xmlElement11.hasChanged();
    xmlElement11.notifyObservers((java.lang.Object)100);
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    boolean b18 = xmlElement16.hasChanged();
    boolean b19 = xmlElement11.addElement(xmlElement16);
    xmlElement7.insertElement(xmlElement16, (int)(byte)0);
    XmlElement xmlElement22 = xmlElement2.addSubElement(xmlElement16);
    xmlElement16.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test97"); }


    XmlElement xmlElement0 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str1 = xmlElement0.getAttributes();
    java.lang.Object obj4 = xmlElement0.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement0, "hi!");
    XmlElement xmlElement7 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str8 = xmlElement7.getAttributes();
    XmlElement xmlElement9 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str10 = xmlElement9.getAttributes();
    java.lang.Object obj13 = xmlElement9.addAttribute("", "hi!");
    XmlElement.printNode(xmlElement9, "hi!");
    XmlElement xmlElement16 = new XmlElement();
    java.util.Hashtable<java.lang.String,java.lang.String> hashtable_str_str17 = xmlElement16.getAttributes();
    xmlElement16.notifyObservers((java.lang.Object)"");
    XmlElement xmlElement20 = xmlElement9.addSubElement(xmlElement16);
    xmlElement7.append(xmlElement20);
    XmlElement xmlElement22 = xmlElement0.addSubElement(xmlElement20);
    XmlElement xmlElement24 = xmlElement0.removeElement(0);
    java.util.List list25 = xmlElement0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashtable_str_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xmlElement24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);

  }

}
