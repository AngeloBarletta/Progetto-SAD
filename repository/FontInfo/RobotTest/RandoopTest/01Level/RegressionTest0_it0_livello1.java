package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_BOLD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isBold"+ "'", str0.equals("isBold"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.String str0 = FontInfo.IPropertyNames.IS_ITALIC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "isItalic"+ "'", str0.equals("isItalic"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str0 = FontInfo.IPropertyNames.FAMILY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "family"+ "'", str0.equals("family"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.lang.String str0 = FontInfo.IPropertyNames.SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "size"+ "'", str0.equals("size"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.awt.Font font0 = null;
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo1 = new FontInfo(font0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    FontInfo fontInfo3 = new FontInfo();
    int i4 = fontInfo3.generateStyle();
    java.awt.Font font5 = fontInfo3.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fontInfo0.doesFontMatch(font5);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError");
    } catch (java.lang.UnsatisfiedLinkError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.UnsatisfiedLinkError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setFamily("Monospaced");
    FontInfo fontInfo7 = new FontInfo();
    int i8 = fontInfo7.generateStyle();
    java.awt.Font font9 = fontInfo7.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo3 = new FontInfo(font2);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    int i8 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo3 = new FontInfo(font2);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    int i8 = fontInfo0.generateStyle();
    FontInfo fontInfo9 = new FontInfo();
    java.lang.String str10 = fontInfo9.getFamily();
    java.awt.Font font11 = fontInfo9.createFont();
    java.awt.Font font12 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = fontInfo0.createFont();
    FontInfo fontInfo4 = new FontInfo();
    java.lang.String str5 = fontInfo4.getFamily();
    java.awt.Font font6 = fontInfo4.createFont();
    java.awt.Font font7 = fontInfo4.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fontInfo0.doesFontMatch(font7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo4 = new FontInfo(font3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsBold(true);
    FontInfo fontInfo9 = new FontInfo();
    int i10 = fontInfo9.generateStyle();
    java.awt.Font font11 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fontInfo0.doesFontMatch(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.Object obj7 = fontInfo0.clone();
    boolean b8 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo8 = new FontInfo();
    java.lang.String str9 = fontInfo8.getFamily();
    java.awt.Font font10 = fontInfo8.createFont();
    java.awt.Font font11 = fontInfo8.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setFamily("isBold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setSize((int)'#');
    java.awt.Font font13 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font13);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.Object obj5 = null;
    boolean b6 = fontInfo0.equals(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    boolean b3 = fontInfo0.isItalic();
    java.lang.Object obj4 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsBold(true);
    int i9 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setSize(32);
    java.lang.Object obj7 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    boolean b10 = fontInfo0.equals((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    FontInfo fontInfo3 = new FontInfo();
    int i4 = fontInfo3.generateStyle();
    java.awt.Font font5 = fontInfo3.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fontInfo0.doesFontMatch(font5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.String str8 = fontInfo0.getFamily();
    FontInfo fontInfo9 = new FontInfo();
    int i10 = fontInfo9.generateStyle();
    java.awt.Font font11 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fontInfo0.doesFontMatch(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    java.awt.Font font3 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo4 = new FontInfo(font3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    int i3 = fontInfo0.getSize();
    java.lang.String str4 = fontInfo0.getFamily();
    int i5 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    FontInfo fontInfo4 = new FontInfo();
    int i5 = fontInfo4.generateStyle();
    java.awt.Font font6 = fontInfo4.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setFamily("Monospaced");
    java.lang.Object obj7 = fontInfo0.clone();
    boolean b8 = fontInfo0.isBold();
    fontInfo0.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    boolean b3 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b7 = fontInfo0.isBold();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo0.doesFontMatch(font8);
    boolean b10 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    java.lang.String str5 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 12"+ "'", str5.equals("Monospaced, 12"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    FontInfo fontInfo2 = new FontInfo();
    int i3 = fontInfo2.generateStyle();
    java.awt.Font font4 = fontInfo2.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = fontInfo0.doesFontMatch(font4);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 12, bold");
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setSize((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 12, bold, 12, bold"+ "'", str12.equals("Monospaced, 12, bold, 12, bold"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    java.lang.Object obj5 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    FontInfo fontInfo8 = new FontInfo();
    fontInfo8.setSize((int)'#');
    java.awt.Font font11 = fontInfo8.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    fontInfo0.setFamily("isItalic");
    int i4 = fontInfo0.generateStyle();
    boolean b5 = fontInfo0.isBold();
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b7 = fontInfo0.isBold();
    java.lang.String str8 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    int i3 = fontInfo0.getSize();
    java.lang.String str4 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    java.awt.Font font8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    FontInfo fontInfo9 = new FontInfo();
    int i10 = fontInfo9.generateStyle();
    java.awt.Font font11 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    fontInfo0.setFamily("isItalic");
    FontInfo fontInfo4 = new FontInfo();
    fontInfo4.setSize((int)'#');
    java.awt.Font font7 = fontInfo4.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = fontInfo0.doesFontMatch(font7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsBold(true);
    FontInfo fontInfo9 = new FontInfo();
    fontInfo9.setIsBold(true);
    java.lang.Object obj12 = fontInfo9.clone();
    int i13 = fontInfo9.generateStyle();
    fontInfo9.setFamily("Monospaced");
    java.lang.Object obj16 = fontInfo9.clone();
    boolean b17 = fontInfo9.isBold();
    java.awt.Font font18 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fontInfo0.doesFontMatch(font18);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo11 = new FontInfo();
    java.lang.String str12 = fontInfo11.getFamily();
    java.awt.Font font13 = fontInfo11.createFont();
    java.awt.Font font14 = fontInfo11.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font14);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    int i9 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    java.lang.String str5 = fontInfo0.getFamily();
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj10 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    fontInfo0.setSize(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setSize((int)(short)10);
    fontInfo0.setIsBold(false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b8 = fontInfo0.equals((java.lang.Object)'4');
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.String str7 = fontInfo0.getFamily();
    int i8 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 12, bold");
    java.lang.String str12 = fontInfo0.toString();
    boolean b14 = fontInfo0.equals((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 12, bold, 12, bold"+ "'", str12.equals("Monospaced, 12, bold, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("Monospaced, 10, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    FontInfo fontInfo3 = new FontInfo();
    fontInfo3.setIsBold(true);
    fontInfo3.setIsBold(false);
    fontInfo3.setSize((int)' ');
    int i10 = fontInfo3.getSize();
    boolean b11 = fontInfo3.isItalic();
    boolean b12 = fontInfo0.equals((java.lang.Object)b11);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    java.lang.String str9 = fontInfo0.toString();
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setIsBold(true);
    fontInfo10.setIsBold(false);
    fontInfo10.setSize((int)' ');
    int i17 = fontInfo10.getSize();
    boolean b18 = fontInfo10.isItalic();
    boolean b19 = fontInfo0.equals((java.lang.Object)b18);
    fontInfo0.setFamily("Monospaced, 12, bold, 12, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    FontInfo fontInfo3 = new FontInfo();
    fontInfo3.setIsBold(true);
    java.lang.Object obj6 = fontInfo3.clone();
    int i7 = fontInfo3.generateStyle();
    fontInfo3.setFamily("Monospaced");
    java.lang.Object obj10 = fontInfo3.clone();
    boolean b11 = fontInfo3.isBold();
    boolean b12 = fontInfo0.equals((java.lang.Object)fontInfo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setSize((int)(short)10);
    java.lang.String str5 = fontInfo0.toString();
    java.lang.Object obj6 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 10, bold"+ "'", str5.equals("Monospaced, 10, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 32"+ "'", str9.equals("Monospaced, 32"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    int i3 = fontInfo0.getSize();
    java.lang.String str4 = fontInfo0.getFamily();
    FontInfo fontInfo5 = new FontInfo();
    int i6 = fontInfo5.generateStyle();
    java.awt.Font font7 = fontInfo5.createFont();
    fontInfo5.setIsItalic(true);
    fontInfo5.setIsBold(true);
    java.awt.Font font12 = fontInfo5.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = fontInfo0.doesFontMatch(font12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 12, bold");
    java.lang.Object obj12 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.Object obj9 = fontInfo0.clone();
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setSize((int)(byte)-1);
    java.lang.String str13 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced, -1"+ "'", str13.equals("Monospaced, -1"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo8 = new FontInfo();
    int i9 = fontInfo8.generateStyle();
    java.awt.Font font10 = fontInfo8.createFont();
    fontInfo8.setIsItalic(true);
    fontInfo8.setIsBold(true);
    java.awt.Font font15 = fontInfo8.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = fontInfo0.doesFontMatch(font15);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.String str3 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setFamily("Monospaced");
    java.lang.Object obj7 = fontInfo0.clone();
    boolean b8 = fontInfo0.isBold();
    java.awt.Font font9 = fontInfo0.createFont();
    FontInfo fontInfo10 = new FontInfo();
    int i11 = fontInfo10.generateStyle();
    java.awt.Font font12 = fontInfo10.createFont();
    fontInfo10.setIsItalic(true);
    fontInfo10.setIsBold(true);
    java.awt.Font font17 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font17);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize((int)'#');
    boolean b9 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(true);
    fontInfo0.setSize((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    java.lang.String str10 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 32"+ "'", str10.equals("Monospaced, 32"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    FontInfo fontInfo5 = new FontInfo();
    java.lang.String str6 = fontInfo5.getFamily();
    int i7 = fontInfo5.getSize();
    java.lang.Object obj8 = null;
    boolean b9 = fontInfo5.equals(obj8);
    boolean b10 = fontInfo0.equals((java.lang.Object)fontInfo5);
    boolean b11 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    FontInfo fontInfo7 = new FontInfo();
    java.lang.String str8 = fontInfo7.getFamily();
    java.awt.Font font9 = fontInfo7.createFont();
    java.awt.Font font10 = fontInfo7.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    boolean b3 = fontInfo0.isItalic();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.String str5 = fontInfo0.toString();
    java.lang.String str6 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "isItalic, 12"+ "'", str5.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "isItalic, 12"+ "'", str6.equals("isItalic, 12"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    int i4 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b8 = fontInfo0.equals((java.lang.Object)'4');
    java.awt.Font font9 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo10 = new FontInfo(font9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    boolean b7 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    java.lang.String str5 = fontInfo0.getFamily();
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.awt.Font font10 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    java.lang.String str3 = fontInfo0.getFamily();
    java.lang.Object obj4 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Monospaced"+ "'", str3.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    fontInfo0.setIsItalic(false);
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    int i6 = fontInfo0.getSize();
    boolean b7 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsBold(true);
    fontInfo0.setFamily("Monospaced");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    java.lang.String str9 = fontInfo0.toString();
    java.lang.String str10 = fontInfo0.toString();
    java.lang.String str11 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 12, bold"+ "'", str10.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    FontInfo fontInfo3 = new FontInfo();
    fontInfo3.setIsBold(true);
    fontInfo3.setIsBold(false);
    fontInfo3.setSize((int)' ');
    int i10 = fontInfo3.getSize();
    boolean b11 = fontInfo3.isItalic();
    boolean b12 = fontInfo0.equals((java.lang.Object)b11);
    fontInfo0.setSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("isBold");
    java.lang.String str12 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "isBold, 12"+ "'", str12.equals("isBold, 12"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    fontInfo0.setFamily("isItalic");
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b7 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(true);
    int i10 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isBold();
    FontInfo fontInfo9 = new FontInfo();
    java.lang.String str10 = fontInfo9.getFamily();
    java.awt.Font font11 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fontInfo0.doesFontMatch(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setSize((int)(short)10);
    java.lang.String str5 = fontInfo0.toString();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 10, bold"+ "'", str5.equals("Monospaced, 10, bold"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    FontInfo fontInfo5 = new FontInfo();
    java.lang.String str6 = fontInfo5.getFamily();
    int i7 = fontInfo5.getSize();
    java.lang.Object obj8 = null;
    boolean b9 = fontInfo5.equals(obj8);
    boolean b10 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str11 = fontInfo0.toString();
    fontInfo0.setSize((-1));
    FontInfo fontInfo14 = new FontInfo();
    fontInfo14.setIsBold(true);
    fontInfo14.setIsBold(false);
    java.lang.Object obj19 = fontInfo14.clone();
    boolean b20 = fontInfo14.isItalic();
    boolean b21 = fontInfo14.isBold();
    boolean b22 = fontInfo14.isBold();
    boolean b23 = fontInfo0.equals((java.lang.Object)b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "isItalic, 12"+ "'", str11.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.Object obj7 = fontInfo0.clone();
    fontInfo0.setSize((int)(short)0);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setIsBold(true);
    fontInfo10.setIsBold(false);
    java.lang.Object obj15 = fontInfo10.clone();
    boolean b16 = fontInfo10.isItalic();
    boolean b18 = fontInfo10.equals((java.lang.Object)'4');
    java.awt.Font font19 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font19);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.String str8 = fontInfo0.getFamily();
    boolean b9 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo6 = new FontInfo();
    fontInfo6.setIsBold(true);
    fontInfo6.setIsBold(false);
    java.lang.Object obj11 = fontInfo6.clone();
    boolean b12 = fontInfo6.isItalic();
    boolean b14 = fontInfo6.equals((java.lang.Object)'4');
    java.awt.Font font15 = fontInfo6.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font15);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("isBold");
    fontInfo0.setIsItalic(true);
    FontInfo fontInfo14 = new FontInfo();
    fontInfo14.setIsBold(true);
    fontInfo14.setIsBold(false);
    java.lang.Object obj19 = fontInfo14.clone();
    boolean b20 = fontInfo14.isItalic();
    boolean b22 = fontInfo14.equals((java.lang.Object)'4');
    java.awt.Font font23 = fontInfo14.createFont();
    fontInfo14.setSize((int)' ');
    boolean b26 = fontInfo0.equals((java.lang.Object)fontInfo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.Object obj9 = fontInfo0.clone();
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setSize((int)(byte)-1);
    fontInfo0.setFamily("Monospaced, 10, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(true);
    java.lang.String str7 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12, italic"+ "'", str7.equals("Monospaced, 12, italic"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = null;
    boolean b5 = fontInfo0.equals(obj4);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setSize((int)(short)10);
    java.lang.String str5 = fontInfo0.toString();
    int i6 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 10, bold"+ "'", str5.equals("Monospaced, 10, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    int i10 = fontInfo0.generateStyle();
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.awt.Font font5 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    java.lang.String str4 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    FontInfo fontInfo7 = new FontInfo();
    java.lang.String str8 = fontInfo7.getFamily();
    java.awt.Font font9 = fontInfo7.createFont();
    java.awt.Font font10 = fontInfo7.createFont();
    boolean b11 = fontInfo0.equals((java.lang.Object)font10);
    boolean b12 = fontInfo0.isItalic();
    FontInfo fontInfo13 = new FontInfo();
    java.lang.String str14 = fontInfo13.getFamily();
    java.awt.Font font15 = fontInfo13.createFont();
    java.awt.Font font16 = fontInfo13.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = fontInfo0.doesFontMatch(font16);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setSize(1);
    FontInfo fontInfo5 = new FontInfo();
    fontInfo5.setIsBold(true);
    java.lang.Object obj8 = fontInfo5.clone();
    int i9 = fontInfo5.generateStyle();
    fontInfo5.setFamily("Monospaced");
    java.lang.Object obj12 = fontInfo5.clone();
    boolean b13 = fontInfo5.isBold();
    java.awt.Font font14 = fontInfo5.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = fontInfo0.doesFontMatch(font14);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize(12);
    fontInfo0.setSize(0);
    java.awt.Font font9 = fontInfo0.createFont();
    fontInfo0.setSize(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    java.lang.Object obj3 = fontInfo0.clone();
    java.lang.Object obj4 = fontInfo0.clone();
    boolean b5 = fontInfo0.isBold();
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)(short)0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    FontInfo fontInfo4 = new FontInfo();
    int i5 = fontInfo4.generateStyle();
    java.awt.Font font6 = fontInfo4.createFont();
    fontInfo4.setIsItalic(true);
    fontInfo4.setIsBold(true);
    java.awt.Font font11 = fontInfo4.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize(12);
    fontInfo0.setSize(0);
    FontInfo fontInfo9 = new FontInfo();
    fontInfo9.setIsBold(true);
    fontInfo9.setIsBold(false);
    fontInfo9.setSize((int)' ');
    int i16 = fontInfo9.getSize();
    boolean b17 = fontInfo9.isItalic();
    boolean b18 = fontInfo0.equals((java.lang.Object)b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    int i5 = fontInfo0.getSize();
    boolean b7 = fontInfo0.equals((java.lang.Object)1.0f);
    java.lang.Object obj8 = fontInfo0.clone();
    java.lang.String str9 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.lang.Object obj13 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("isBold");
    fontInfo0.setSize((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    int i7 = fontInfo0.getSize();
    int i8 = fontInfo0.generateStyle();
    java.lang.String str9 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    FontInfo fontInfo7 = new FontInfo();
    java.lang.String str8 = fontInfo7.getFamily();
    java.awt.Font font9 = fontInfo7.createFont();
    java.awt.Font font10 = fontInfo7.createFont();
    boolean b11 = fontInfo0.equals((java.lang.Object)font10);
    int i12 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    java.awt.Font font3 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    fontInfo0.setFamily("isBold");
    java.awt.Font font8 = fontInfo0.createFont();
    FontInfo fontInfo9 = new FontInfo();
    fontInfo9.setIsBold(true);
    fontInfo9.setIsBold(false);
    fontInfo9.setSize(12);
    fontInfo9.setSize(0);
    java.awt.Font font18 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = fontInfo0.doesFontMatch(font18);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.Object obj7 = fontInfo0.clone();
    fontInfo0.setSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b8 = fontInfo0.equals((java.lang.Object)'4');
    java.awt.Font font9 = fontInfo0.createFont();
    java.lang.String str10 = fontInfo0.getFamily();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    java.lang.Object obj4 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b7 = fontInfo0.isBold();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo0.doesFontMatch(font8);
    java.lang.Object obj10 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.Object obj9 = fontInfo0.clone();
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setSize((int)(byte)-1);
    int i13 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    boolean b10 = fontInfo0.isItalic();
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setSize(32);
    fontInfo0.setIsBold(false);
    java.lang.String str9 = fontInfo0.toString();
    int i10 = fontInfo0.getSize();
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 32"+ "'", str9.equals("Monospaced, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 12, bold");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.String str7 = fontInfo0.getFamily();
    java.awt.Font font8 = fontInfo0.createFont();
    int i9 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    java.lang.String str5 = fontInfo0.getFamily();
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.Object obj8 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsBold(false);
    FontInfo fontInfo7 = new FontInfo();
    java.lang.String str8 = fontInfo7.getFamily();
    int i9 = fontInfo7.getSize();
    java.lang.Object obj10 = null;
    boolean b11 = fontInfo7.equals(obj10);
    java.lang.String str12 = fontInfo7.getFamily();
    int i13 = fontInfo7.generateStyle();
    java.lang.String str14 = fontInfo7.getFamily();
    boolean b15 = fontInfo0.equals((java.lang.Object)fontInfo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(true);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setIsBold(true);
    fontInfo10.setIsBold(false);
    java.lang.Object obj15 = fontInfo10.clone();
    boolean b16 = fontInfo10.isItalic();
    boolean b18 = fontInfo10.equals((java.lang.Object)'4');
    java.awt.Font font19 = fontInfo10.createFont();
    boolean b20 = fontInfo0.equals((java.lang.Object)font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    boolean b10 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    boolean b8 = fontInfo0.equals((java.lang.Object)'4');
    FontInfo fontInfo9 = new FontInfo();
    java.lang.String str10 = fontInfo9.getFamily();
    java.awt.Font font11 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = fontInfo0.doesFontMatch(font11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    FontInfo fontInfo5 = new FontInfo();
    fontInfo5.setIsBold(true);
    fontInfo5.setIsBold(false);
    java.lang.Object obj10 = fontInfo5.clone();
    boolean b11 = fontInfo5.isItalic();
    boolean b13 = fontInfo5.equals((java.lang.Object)'4');
    java.awt.Font font14 = fontInfo5.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font14);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)'#');
    int i3 = fontInfo0.getSize();
    java.lang.String str4 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str7 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 35"+ "'", str7.equals("Monospaced, 35"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    FontInfo fontInfo3 = new FontInfo();
    java.lang.String str4 = fontInfo3.getFamily();
    java.awt.Font font5 = fontInfo3.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = fontInfo0.doesFontMatch(font5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced"+ "'", str4.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setIsItalic(true);
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setIsItalic(true);
    int i5 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.Object obj8 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsItalic(true);
    java.lang.String str5 = fontInfo0.toString();
    fontInfo0.setIsBold(true);
    fontInfo0.setFamily("isItalic, 12");
    int i10 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 12, bold, italic"+ "'", str5.equals("Monospaced, 12, bold, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    FontInfo fontInfo0 = new FontInfo();
    int i1 = fontInfo0.generateStyle();
    java.awt.Font font2 = fontInfo0.createFont();
    int i3 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = null;
    boolean b4 = fontInfo0.equals(obj3);
    java.lang.String str5 = fontInfo0.getFamily();
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str10 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj5 = fontInfo0.clone();
    boolean b6 = fontInfo0.isItalic();
    java.lang.String str7 = fontInfo0.getFamily();
    int i8 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setIsBold(true);
    fontInfo10.setIsBold(false);
    java.lang.Object obj15 = fontInfo10.clone();
    boolean b16 = fontInfo10.isItalic();
    boolean b18 = fontInfo10.equals((java.lang.Object)'4');
    java.awt.Font font19 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font19);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    int i10 = fontInfo0.generateStyle();
    FontInfo fontInfo11 = new FontInfo();
    fontInfo11.setIsBold(true);
    fontInfo11.setIsBold(false);
    java.lang.Object obj16 = fontInfo11.clone();
    boolean b17 = fontInfo11.isItalic();
    boolean b19 = fontInfo11.equals((java.lang.Object)'4');
    java.awt.Font font20 = fontInfo11.createFont();
    java.awt.Font font21 = fontInfo11.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font21);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    fontInfo0.setSize(100);
    boolean b12 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.awt.Font font10 = null;
    boolean b11 = fontInfo0.doesFontMatch(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    int i5 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    fontInfo0.setIsItalic(false);
    java.lang.Object obj9 = fontInfo0.clone();
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo13 = new FontInfo();
    fontInfo13.setIsBold(true);
    fontInfo13.setIsBold(false);
    fontInfo13.setSize(12);
    fontInfo13.setSize(0);
    java.awt.Font font22 = fontInfo13.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font22);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    FontInfo fontInfo0 = new FontInfo();
    java.lang.String str1 = fontInfo0.getFamily();
    java.awt.Font font2 = fontInfo0.createFont();
    java.lang.Object obj3 = fontInfo0.clone();
    java.lang.Object obj4 = fontInfo0.clone();
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.Object obj6 = fontInfo0.clone();
    java.lang.Object obj7 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Monospaced"+ "'", str1.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

}
