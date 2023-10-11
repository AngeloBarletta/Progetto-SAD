
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.toString();
    java.lang.String str8 = fontInfo0.getFamily();
    boolean b9 = fontInfo0.isItalic();
    int i10 = fontInfo0.generateStyle();
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    int i15 = fontInfo12.getSize();
    fontInfo12.setIsBold(false);
    boolean b18 = fontInfo12.isBold();
    int i19 = fontInfo12.generateStyle();
    java.lang.Object obj20 = null;
    boolean b21 = fontInfo12.equals(obj20);
    int i22 = fontInfo12.generateStyle();
    boolean b23 = fontInfo0.equals((java.lang.Object)i22);
    java.lang.String str24 = fontInfo0.toString();
    fontInfo0.setSize((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced, 12"+ "'", str24.equals("Monospaced, 12"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    int i10 = fontInfo0.generateStyle();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    java.lang.Object obj14 = fontInfo11.clone();
    fontInfo11.setFamily("isItalic");
    java.awt.Font font17 = fontInfo11.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = fontInfo0.doesFontMatch(font17);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    boolean b6 = fontInfo0.isBold();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    boolean b10 = fontInfo7.isBold();
    int i11 = fontInfo7.getSize();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("family");
    java.lang.Object obj17 = fontInfo12.clone();
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isBold();
    boolean b21 = fontInfo18.equals((java.lang.Object)100);
    boolean b22 = fontInfo12.equals((java.lang.Object)b21);
    boolean b23 = fontInfo12.isItalic();
    boolean b24 = fontInfo7.equals((java.lang.Object)fontInfo12);
    fontInfo12.setIsItalic(true);
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isBold();
    int i29 = fontInfo27.getSize();
    boolean b30 = fontInfo27.isBold();
    fontInfo27.setSize((int)(byte)1);
    fontInfo27.setSize((int)' ');
    int i35 = fontInfo27.getSize();
    fontInfo27.setFamily("family, 12");
    java.lang.String str38 = fontInfo27.toString();
    boolean b39 = fontInfo12.equals((java.lang.Object)fontInfo27);
    java.awt.Font font40 = fontInfo27.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = fontInfo0.doesFontMatch(font40);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "family, 12, 32"+ "'", str38.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font40);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str18 = fontInfo0.toString();
    int i19 = fontInfo0.generateStyle();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    boolean b23 = fontInfo20.equals((java.lang.Object)100);
    fontInfo20.setIsBold(true);
    int i26 = fontInfo20.getSize();
    boolean b27 = fontInfo0.equals((java.lang.Object)i26);
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isBold();
    java.lang.String str30 = fontInfo28.getFamily();
    fontInfo28.setFamily("Monospaced");
    boolean b34 = fontInfo28.equals((java.lang.Object)(-1));
    fontInfo28.setIsBold(false);
    fontInfo28.setIsBold(true);
    java.awt.Font font39 = fontInfo28.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = fontInfo0.doesFontMatch(font39);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Monospaced"+ "'", str30.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font39);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    int i10 = fontInfo0.generateStyle();
    fontInfo0.setIsItalic(true);
    java.lang.String str13 = fontInfo0.getFamily();
    boolean b14 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    int i10 = fontInfo8.getSize();
    java.lang.Object obj11 = fontInfo8.clone();
    fontInfo8.setFamily("isItalic");
    java.awt.Font font14 = fontInfo8.createFont();
    boolean b15 = fontInfo0.equals((java.lang.Object)fontInfo8);
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    boolean b19 = fontInfo16.isBold();
    java.awt.Font font20 = fontInfo16.createFont();
    java.awt.Font font21 = fontInfo16.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    int i8 = fontInfo6.getSize();
    java.awt.Font font9 = null;
    boolean b10 = fontInfo6.doesFontMatch(font9);
    int i11 = fontInfo6.generateStyle();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    int i15 = fontInfo12.getSize();
    fontInfo12.setIsBold(false);
    int i18 = fontInfo12.getSize();
    fontInfo12.setSize(12);
    boolean b21 = fontInfo6.equals((java.lang.Object)12);
    boolean b22 = fontInfo0.equals((java.lang.Object)12);
    java.lang.String str23 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Monospaced, 12, bold"+ "'", str23.equals("Monospaced, 12, bold"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setFamily("family, 2");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    fontInfo0.setFamily("family, 12");
    int i23 = fontInfo0.generateStyle();
    FontInfo fontInfo24 = new FontInfo();
    boolean b25 = fontInfo24.isBold();
    java.lang.String str26 = fontInfo24.getFamily();
    fontInfo24.setFamily("family");
    java.lang.String str29 = fontInfo24.getFamily();
    java.awt.Font font30 = fontInfo24.createFont();
    int i31 = fontInfo24.getSize();
    java.lang.Object obj32 = fontInfo24.clone();
    java.awt.Font font33 = fontInfo24.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = fontInfo0.doesFontMatch(font33);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Monospaced"+ "'", str26.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "family"+ "'", str29.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.lang.String str13 = fontInfo0.toString();
    boolean b14 = fontInfo0.isBold();
    java.lang.String str15 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family, 12, italic"+ "'", str13.equals("family, 12, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "family, 12, italic"+ "'", str15.equals("family, 12, italic"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    java.lang.Object obj6 = fontInfo0.clone();
    int i7 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.lang.Object obj6 = null;
    boolean b7 = fontInfo0.equals(obj6);
    fontInfo0.setIsBold(false);
    boolean b10 = fontInfo0.isBold();
    fontInfo0.setFamily("family, 12, 12");
    fontInfo0.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    fontInfo8.setFamily("family");
    java.awt.Font font13 = fontInfo8.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    java.lang.Object obj10 = fontInfo0.clone();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "isItalic, 12"+ "'", str9.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    boolean b7 = fontInfo0.isItalic();
    fontInfo0.setSize((-1));
    fontInfo0.setSize((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    int i8 = fontInfo0.getSize();
    fontInfo0.setFamily("family, 12");
    java.lang.String str11 = fontInfo0.toString();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("family");
    java.lang.Object obj17 = fontInfo12.clone();
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isBold();
    boolean b21 = fontInfo18.equals((java.lang.Object)100);
    boolean b22 = fontInfo12.equals((java.lang.Object)b21);
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isBold();
    java.lang.String str25 = fontInfo23.getFamily();
    fontInfo23.setFamily("Monospaced");
    int i28 = fontInfo23.getSize();
    fontInfo23.setFamily("isItalic");
    java.lang.String str31 = fontInfo23.toString();
    boolean b32 = fontInfo12.equals((java.lang.Object)fontInfo23);
    fontInfo23.setFamily("Monospaced, 12");
    int i35 = fontInfo23.generateStyle();
    boolean b36 = fontInfo23.isItalic();
    boolean b37 = fontInfo0.equals((java.lang.Object)fontInfo23);
    java.lang.String str38 = fontInfo0.toString();
    java.lang.Object obj39 = fontInfo0.clone();
    fontInfo0.setSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family, 12, 32"+ "'", str11.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Monospaced"+ "'", str25.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "isItalic, 12"+ "'", str31.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "family, 12, 32"+ "'", str38.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    java.lang.Object obj10 = fontInfo0.clone();
    int i11 = fontInfo0.getSize();
    int i12 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "isItalic, 12"+ "'", str9.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.String str19 = fontInfo0.toString();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setIsBold(false);
    fontInfo20.setIsItalic(false);
    java.awt.Font font27 = fontInfo20.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = fontInfo0.doesFontMatch(font27);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "family, 12"+ "'", str19.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font27);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.getFamily();
    java.awt.Font font13 = fontInfo0.createFont();
    fontInfo0.setFamily("Monospaced, 1, 12, bold, italic, 100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.Object obj12 = null;
    boolean b13 = fontInfo0.equals(obj12);
    int i14 = fontInfo0.generateStyle();
    fontInfo0.setFamily("size");
    java.lang.Object obj17 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic, 12");
    java.lang.String str24 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "isItalic, 12"+ "'", str24.equals("isItalic, 12"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    boolean b7 = fontInfo0.isItalic();
    fontInfo0.setSize((-1));
    java.awt.Font font10 = null;
    boolean b11 = fontInfo0.doesFontMatch(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    int i11 = fontInfo0.generateStyle();
    int i12 = fontInfo0.generateStyle();
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    int i8 = fontInfo0.getSize();
    fontInfo0.setFamily("family, 12");
    java.lang.String str11 = fontInfo0.toString();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("family");
    java.lang.Object obj17 = fontInfo12.clone();
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isBold();
    boolean b21 = fontInfo18.equals((java.lang.Object)100);
    boolean b22 = fontInfo12.equals((java.lang.Object)b21);
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isBold();
    java.lang.String str25 = fontInfo23.getFamily();
    fontInfo23.setFamily("Monospaced");
    int i28 = fontInfo23.getSize();
    fontInfo23.setFamily("isItalic");
    java.lang.String str31 = fontInfo23.toString();
    boolean b32 = fontInfo12.equals((java.lang.Object)fontInfo23);
    fontInfo23.setFamily("Monospaced, 12");
    int i35 = fontInfo23.generateStyle();
    boolean b36 = fontInfo23.isItalic();
    boolean b37 = fontInfo0.equals((java.lang.Object)fontInfo23);
    int i38 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family, 12, 32"+ "'", str11.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Monospaced"+ "'", str25.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "isItalic, 12"+ "'", str31.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.getSize();
    java.lang.Object obj8 = fontInfo0.clone();
    java.awt.Font font9 = fontInfo0.createFont();
    fontInfo0.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i12 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setSize((int)(short)-1);
    boolean b13 = fontInfo10.isBold();
    fontInfo10.setSize(10);
    fontInfo10.setSize((int)(byte)1);
    java.lang.Object obj18 = fontInfo10.clone();
    boolean b19 = fontInfo0.equals(obj18);
    java.lang.String str20 = fontInfo0.getFamily();
    java.lang.String str21 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Monospaced"+ "'", str20.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced, 12"+ "'", str21.equals("Monospaced, 12"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    int i10 = fontInfo0.getSize();
    int i11 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.toString();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    fontInfo7.setIsBold(false);
    java.lang.String str12 = fontInfo7.getFamily();
    java.awt.Font font13 = fontInfo7.createFont();
    boolean b14 = fontInfo7.isItalic();
    boolean b16 = fontInfo7.equals((java.lang.Object)(-1));
    java.awt.Font font17 = fontInfo7.createFont();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo7);
    java.awt.Font font19 = fontInfo7.createFont();
    int i20 = fontInfo7.generateStyle();
    fontInfo7.setFamily("family, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    boolean b10 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "family"+ "'", str9.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    boolean b10 = fontInfo0.isBold();
    boolean b12 = fontInfo0.equals((java.lang.Object)' ');
    fontInfo0.setSize((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.awt.Font font5 = fontInfo0.createFont();
    int i6 = fontInfo0.getSize();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setIsBold(true);
    java.lang.String str6 = fontInfo0.getFamily();
    fontInfo0.setSize(0);
    fontInfo0.setFamily("family");
    fontInfo0.setSize((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    fontInfo11.setFamily("Monospaced, 12");
    int i23 = fontInfo11.generateStyle();
    boolean b24 = fontInfo11.isItalic();
    java.awt.Font font25 = fontInfo11.createFont();
    fontInfo11.setFamily("isItalic, 12");
    fontInfo11.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo10 = new FontInfo();
    fontInfo10.setSize((int)(short)-1);
    boolean b13 = fontInfo10.isBold();
    fontInfo10.setSize(10);
    fontInfo10.setSize((int)(byte)1);
    java.lang.Object obj18 = fontInfo10.clone();
    boolean b19 = fontInfo0.equals(obj18);
    java.lang.String str20 = fontInfo0.getFamily();
    boolean b21 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Monospaced"+ "'", str20.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    java.lang.String str7 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    java.lang.String str8 = fontInfo0.toString();
    int i9 = fontInfo0.getSize();
    int i10 = fontInfo0.getSize();
    boolean b11 = fontInfo0.isBold();
    int i12 = fontInfo0.generateStyle();
    boolean b13 = fontInfo0.isBold();
    boolean b14 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.awt.Font font18 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo19 = new FontInfo(font18);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    int i10 = fontInfo0.getSize();
    java.lang.String str11 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "isItalic, 12"+ "'", str9.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "isItalic"+ "'", str11.equals("isItalic"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.generateStyle();
    boolean b8 = fontInfo0.isBold();
    int i9 = fontInfo0.getSize();
    java.lang.String str10 = fontInfo0.toString();
    java.lang.String str11 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family, 12"+ "'", str6.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family"+ "'", str11.equals("family"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    java.lang.Object obj20 = fontInfo0.clone();
    java.lang.String str21 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "family, 12"+ "'", str21.equals("family, 12"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    boolean b7 = fontInfo0.isItalic();
    boolean b8 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.lang.String str13 = fontInfo0.toString();
    boolean b14 = fontInfo0.isBold();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family, 12, italic"+ "'", str13.equals("family, 12, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.awt.Font font18 = fontInfo0.createFont();
    java.lang.String str19 = fontInfo0.getFamily();
    fontInfo0.setFamily("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b8 = fontInfo0.equals((java.lang.Object)100.0d);
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isItalic();
    java.lang.Object obj11 = fontInfo0.clone();
    java.lang.String str12 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 12"+ "'", str12.equals("Monospaced, 12"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsBold(true);
    java.lang.Object obj15 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.generateStyle();
    boolean b8 = fontInfo0.isBold();
    int i9 = fontInfo0.getSize();
    java.lang.Object obj10 = fontInfo0.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    boolean b14 = fontInfo11.isItalic();
    java.lang.String str15 = fontInfo11.toString();
    int i16 = fontInfo11.generateStyle();
    int i17 = fontInfo11.getSize();
    java.awt.Font font18 = fontInfo11.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family, 12"+ "'", str6.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced, 12"+ "'", str15.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("hi!");
    boolean b25 = fontInfo0.isBold();
    int i26 = fontInfo0.generateStyle();
    fontInfo0.setFamily("family, 12, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.lang.Object obj6 = null;
    boolean b7 = fontInfo0.equals(obj6);
    java.lang.String str8 = fontInfo0.getFamily();
    java.awt.Font font9 = fontInfo0.createFont();
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "family"+ "'", str8.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family"+ "'", str10.equals("family"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    int i21 = fontInfo11.getSize();
    java.lang.String str22 = fontInfo11.getFamily();
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isBold();
    java.lang.String str25 = fontInfo23.getFamily();
    boolean b26 = fontInfo23.isBold();
    int i27 = fontInfo23.getSize();
    fontInfo23.setIsBold(true);
    fontInfo23.setSize((int)(byte)1);
    FontInfo fontInfo32 = new FontInfo();
    boolean b33 = fontInfo32.isBold();
    java.lang.String str34 = fontInfo32.getFamily();
    int i35 = fontInfo32.getSize();
    fontInfo32.setIsBold(false);
    int i38 = fontInfo32.getSize();
    fontInfo32.setSize(12);
    boolean b41 = fontInfo32.isBold();
    boolean b42 = fontInfo23.equals((java.lang.Object)b41);
    boolean b43 = fontInfo11.equals((java.lang.Object)b41);
    FontInfo fontInfo44 = new FontInfo();
    boolean b45 = fontInfo44.isBold();
    int i46 = fontInfo44.getSize();
    boolean b47 = fontInfo44.isItalic();
    fontInfo44.setIsBold(false);
    boolean b50 = fontInfo44.isBold();
    boolean b51 = fontInfo44.isBold();
    fontInfo44.setSize((int)(short)1);
    fontInfo44.setIsItalic(false);
    java.awt.Font font56 = fontInfo44.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = fontInfo11.doesFontMatch(font56);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "isItalic"+ "'", str22.equals("isItalic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Monospaced"+ "'", str25.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Monospaced"+ "'", str34.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font56);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.String str9 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(true);
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12, bold"+ "'", str8.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.getSize();
    java.awt.Font font8 = fontInfo0.createFont();
    boolean b10 = fontInfo0.equals((java.lang.Object)1.0d);
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    boolean b11 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    int i14 = fontInfo12.getSize();
    java.lang.Object obj15 = fontInfo12.clone();
    fontInfo12.setFamily("isItalic");
    boolean b18 = fontInfo12.isItalic();
    int i19 = fontInfo12.getSize();
    boolean b20 = fontInfo12.isItalic();
    boolean b21 = fontInfo12.isItalic();
    java.awt.Font font22 = fontInfo12.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = fontInfo0.doesFontMatch(font22);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("family, 0");
    fontInfo0.setIsItalic(true);
    java.lang.Object obj16 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    int i11 = fontInfo0.generateStyle();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    int i14 = fontInfo12.getSize();
    boolean b15 = fontInfo12.isItalic();
    fontInfo12.setIsBold(false);
    boolean b18 = fontInfo12.isBold();
    boolean b19 = fontInfo12.isBold();
    fontInfo12.setSize((int)(short)1);
    fontInfo12.setIsItalic(false);
    java.awt.Font font24 = fontInfo12.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font24);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    boolean b21 = fontInfo0.isItalic();
    java.awt.Font font22 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.isItalic();
    fontInfo0.setSize(2);
    fontInfo0.setFamily("family, 12, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    boolean b8 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)10);
    fontInfo0.setFamily("Monospaced, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.awt.Font font3 = null;
    boolean b4 = fontInfo0.doesFontMatch(font3);
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setSize(12);
    int i8 = fontInfo0.getSize();
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    fontInfo0.setSize((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    java.awt.Font font8 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    java.lang.String str11 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family"+ "'", str11.equals("family"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    java.awt.Font font6 = fontInfo0.createFont();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    fontInfo7.setFamily("family");
    boolean b12 = fontInfo7.isBold();
    fontInfo7.setFamily("family");
    fontInfo7.setIsItalic(true);
    fontInfo7.setFamily("size");
    boolean b19 = fontInfo0.equals((java.lang.Object)fontInfo7);
    boolean b21 = fontInfo0.equals((java.lang.Object)100.0d);
    java.lang.Object obj22 = fontInfo0.clone();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    java.awt.Font font8 = fontInfo0.createFont();
    fontInfo0.setSize(1);
    fontInfo0.setFamily("size");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    java.awt.Font font12 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    java.lang.String str9 = fontInfo0.getFamily();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setFamily("family");
    java.lang.Object obj15 = fontInfo10.clone();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    boolean b19 = fontInfo16.equals((java.lang.Object)100);
    boolean b20 = fontInfo10.equals((java.lang.Object)b19);
    boolean b21 = fontInfo10.isItalic();
    java.lang.String str22 = fontInfo10.toString();
    fontInfo10.setIsItalic(false);
    boolean b25 = fontInfo10.isItalic();
    FontInfo fontInfo26 = new FontInfo();
    boolean b27 = fontInfo26.isBold();
    java.lang.String str28 = fontInfo26.getFamily();
    fontInfo26.setFamily("family");
    java.lang.Object obj31 = fontInfo26.clone();
    FontInfo fontInfo32 = new FontInfo();
    boolean b33 = fontInfo32.isBold();
    boolean b35 = fontInfo32.equals((java.lang.Object)100);
    boolean b36 = fontInfo26.equals((java.lang.Object)b35);
    FontInfo fontInfo37 = new FontInfo();
    boolean b38 = fontInfo37.isBold();
    java.lang.String str39 = fontInfo37.getFamily();
    fontInfo37.setFamily("Monospaced");
    int i42 = fontInfo37.getSize();
    fontInfo37.setFamily("isItalic");
    java.lang.String str45 = fontInfo37.toString();
    boolean b46 = fontInfo26.equals((java.lang.Object)fontInfo37);
    boolean b47 = fontInfo10.equals((java.lang.Object)fontInfo37);
    boolean b48 = fontInfo0.equals((java.lang.Object)fontInfo37);
    fontInfo0.setSize((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "family, 12"+ "'", str22.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Monospaced"+ "'", str28.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Monospaced"+ "'", str39.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "isItalic, 12"+ "'", str45.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setFamily("family, 12");
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced, 32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    int i7 = fontInfo5.getSize();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo5.doesFontMatch(font8);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    java.lang.Object obj11 = fontInfo0.clone();
    boolean b12 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    int i8 = fontInfo0.generateStyle();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    int i11 = fontInfo9.getSize();
    boolean b12 = fontInfo9.isItalic();
    fontInfo9.setIsBold(false);
    int i15 = fontInfo9.generateStyle();
    fontInfo9.setIsBold(true);
    boolean b18 = fontInfo9.isBold();
    fontInfo9.setSize((int)'#');
    java.awt.Font font21 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = fontInfo0.doesFontMatch(font21);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    boolean b12 = fontInfo0.isItalic();
    fontInfo0.setSize(12);
    int i15 = fontInfo0.getSize();
    boolean b16 = fontInfo0.isBold();
    java.awt.Font font17 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo18 = new FontInfo(font17);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    int i6 = fontInfo0.getSize();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    fontInfo7.setFamily("family");
    java.lang.String str12 = fontInfo7.getFamily();
    java.lang.Object obj13 = null;
    boolean b14 = fontInfo7.equals(obj13);
    fontInfo7.setIsBold(false);
    boolean b17 = fontInfo0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.toString();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    fontInfo7.setIsBold(false);
    java.lang.String str12 = fontInfo7.getFamily();
    java.awt.Font font13 = fontInfo7.createFont();
    boolean b14 = fontInfo7.isItalic();
    boolean b16 = fontInfo7.equals((java.lang.Object)(-1));
    java.awt.Font font17 = fontInfo7.createFont();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo7);
    java.lang.Object obj19 = fontInfo7.clone();
    java.lang.String str20 = fontInfo7.toString();
    java.lang.Object obj21 = fontInfo7.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Monospaced, 12"+ "'", str20.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    java.lang.String str7 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str18 = fontInfo0.toString();
    int i19 = fontInfo0.getSize();
    java.lang.String str20 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Monospaced, 12"+ "'", str20.equals("Monospaced, 12"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    boolean b10 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    boolean b4 = fontInfo0.isItalic();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setIsBold(false);
    java.lang.String str10 = fontInfo5.getFamily();
    boolean b11 = fontInfo5.isItalic();
    int i12 = fontInfo5.getSize();
    fontInfo5.setIsItalic(false);
    java.lang.String str15 = fontInfo5.getFamily();
    java.awt.Font font16 = fontInfo5.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font16);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    java.awt.Font font11 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b11 = fontInfo0.equals((java.lang.Object)100.0d);
    int i12 = fontInfo0.getSize();
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    int i18 = fontInfo16.getSize();
    fontInfo16.setFamily("isBold");
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo16);
    fontInfo16.setIsBold(false);
    java.lang.String str24 = fontInfo16.getFamily();
    java.lang.Object obj25 = fontInfo16.clone();
    boolean b26 = fontInfo16.isBold();
    boolean b28 = fontInfo16.equals((java.lang.Object)false);
    java.lang.Object obj29 = fontInfo16.clone();
    java.lang.String str30 = fontInfo16.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "isBold"+ "'", str24.equals("isBold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "isBold"+ "'", str30.equals("isBold"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    boolean b21 = fontInfo0.isBold();
    boolean b22 = fontInfo0.isItalic();
    fontInfo0.setSize((int)(byte)-1);
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isBold();
    int i27 = fontInfo25.getSize();
    boolean b28 = fontInfo25.isItalic();
    fontInfo25.setIsBold(false);
    int i31 = fontInfo25.generateStyle();
    fontInfo25.setIsBold(true);
    boolean b34 = fontInfo0.equals((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    fontInfo0.setSize((int)'#');
    java.awt.Font font24 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    int i18 = fontInfo16.getSize();
    fontInfo16.setFamily("isBold");
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo16);
    fontInfo16.setIsBold(false);
    java.lang.String str24 = fontInfo16.getFamily();
    java.lang.Object obj25 = fontInfo16.clone();
    boolean b26 = fontInfo16.isBold();
    int i27 = fontInfo16.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "isBold"+ "'", str24.equals("isBold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    FontInfo fontInfo4 = new FontInfo();
    boolean b5 = fontInfo4.isBold();
    int i6 = fontInfo4.getSize();
    boolean b7 = fontInfo4.isBold();
    fontInfo4.setSize((int)(byte)1);
    fontInfo4.setSize((int)' ');
    boolean b12 = fontInfo4.isItalic();
    fontInfo4.setSize((int)' ');
    java.lang.String str15 = fontInfo4.getFamily();
    boolean b16 = fontInfo0.equals((java.lang.Object)fontInfo4);
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isBold();
    java.lang.String str19 = fontInfo17.getFamily();
    boolean b20 = fontInfo17.isBold();
    int i21 = fontInfo17.getSize();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    java.lang.String str24 = fontInfo22.getFamily();
    fontInfo22.setFamily("family");
    java.lang.Object obj27 = fontInfo22.clone();
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isBold();
    boolean b31 = fontInfo28.equals((java.lang.Object)100);
    boolean b32 = fontInfo22.equals((java.lang.Object)b31);
    boolean b33 = fontInfo22.isItalic();
    boolean b34 = fontInfo17.equals((java.lang.Object)fontInfo22);
    java.awt.Font font35 = fontInfo17.createFont();
    java.awt.Font font36 = fontInfo17.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font36);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font36);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setFamily("");
    int i9 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    java.lang.String str8 = fontInfo0.toString();
    int i9 = fontInfo0.getSize();
    java.awt.Font font10 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo11 = new FontInfo(font10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "isItalic, 12"+ "'", str8.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    fontInfo11.setFamily("Monospaced, 12");
    fontInfo11.setFamily("family, 12");
    boolean b25 = fontInfo11.isBold();
    java.awt.Font font26 = fontInfo11.createFont();
    java.lang.Object obj27 = fontInfo11.clone();
    int i28 = fontInfo11.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    fontInfo5.setIsItalic(true);
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    int i22 = fontInfo20.getSize();
    boolean b23 = fontInfo20.isBold();
    fontInfo20.setSize((int)(byte)1);
    fontInfo20.setSize((int)' ');
    int i28 = fontInfo20.getSize();
    fontInfo20.setFamily("family, 12");
    java.lang.String str31 = fontInfo20.toString();
    boolean b32 = fontInfo5.equals((java.lang.Object)fontInfo20);
    fontInfo5.setFamily("Monospaced, 1, 12, bold, italic");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "family, 12, 32"+ "'", str31.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.awt.Font font13 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.generateStyle();
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isBold();
    java.lang.Object obj11 = fontInfo0.clone();
    java.lang.String str12 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 1"+ "'", str12.equals("Monospaced, 1"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    java.lang.String str8 = fontInfo0.toString();
    int i9 = fontInfo0.getSize();
    int i10 = fontInfo0.getSize();
    boolean b11 = fontInfo0.isBold();
    int i12 = fontInfo0.generateStyle();
    int i13 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    fontInfo0.setSize((int)(short)1);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    java.lang.Object obj14 = fontInfo11.clone();
    java.awt.Font font15 = fontInfo11.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    fontInfo0.setSize((int)' ');
    boolean b9 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str18 = fontInfo0.toString();
    int i19 = fontInfo0.generateStyle();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setFamily("Monospaced");
    int i25 = fontInfo20.getSize();
    fontInfo20.setIsBold(false);
    java.awt.Font font28 = fontInfo20.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = fontInfo0.doesFontMatch(font28);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.lang.Object obj6 = null;
    boolean b7 = fontInfo0.equals(obj6);
    java.lang.String str8 = fontInfo0.getFamily();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "family"+ "'", str8.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    java.lang.String str11 = fontInfo0.toString();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setIsBold(false);
    java.lang.String str17 = fontInfo12.getFamily();
    java.awt.Font font18 = fontInfo12.createFont();
    boolean b19 = fontInfo12.isItalic();
    boolean b21 = fontInfo12.equals((java.lang.Object)(-1));
    boolean b22 = fontInfo0.equals((java.lang.Object)b21);
    int i23 = fontInfo0.generateStyle();
    java.lang.Object obj24 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced"+ "'", str17.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    int i5 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    boolean b12 = fontInfo0.isItalic();
    fontInfo0.setSize(12);
    int i15 = fontInfo0.getSize();
    java.awt.Font font16 = fontInfo0.createFont();
    java.lang.Object obj17 = null;
    boolean b18 = fontInfo0.equals(obj17);
    fontInfo0.setSize(32);
    boolean b21 = fontInfo0.isBold();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    int i24 = fontInfo22.getSize();
    java.awt.Font font25 = null;
    boolean b26 = fontInfo22.doesFontMatch(font25);
    int i27 = fontInfo22.generateStyle();
    fontInfo22.setSize(12);
    int i30 = fontInfo22.getSize();
    java.awt.Font font31 = fontInfo22.createFont();
    java.lang.Object obj32 = fontInfo22.clone();
    java.awt.Font font33 = fontInfo22.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = fontInfo0.doesFontMatch(font33);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    int i6 = fontInfo0.getSize();
    java.awt.Font font7 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo8 = new FontInfo(font7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    java.lang.Object obj10 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isBold");
    fontInfo0.setIsBold(true);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    boolean b12 = fontInfo9.isBold();
    java.awt.Font font13 = fontInfo9.createFont();
    fontInfo9.setIsBold(true);
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    boolean b19 = fontInfo16.isBold();
    java.awt.Font font20 = fontInfo16.createFont();
    java.awt.Font font21 = fontInfo16.createFont();
    boolean b22 = fontInfo9.equals((java.lang.Object)font21);
    boolean b23 = fontInfo0.equals((java.lang.Object)fontInfo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isItalic();
    int i12 = fontInfo0.getSize();
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.String str8 = fontInfo0.getFamily();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 1, italic");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    fontInfo0.setFamily("family, 12");
    int i23 = fontInfo0.generateStyle();
    java.awt.Font font24 = fontInfo0.createFont();
    java.lang.String str25 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "family, 12, 12"+ "'", str25.equals("family, 12, 12"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)-1);
    fontInfo0.setIsBold(false);
    FontInfo fontInfo14 = new FontInfo();
    boolean b15 = fontInfo14.isBold();
    java.lang.String str16 = fontInfo14.getFamily();
    boolean b17 = fontInfo14.isBold();
    java.awt.Font font18 = fontInfo14.createFont();
    java.awt.Font font19 = fontInfo14.createFont();
    fontInfo14.setIsBold(true);
    boolean b22 = fontInfo14.isBold();
    java.lang.String str23 = fontInfo14.toString();
    int i24 = fontInfo14.generateStyle();
    fontInfo14.setIsItalic(true);
    java.lang.String str27 = fontInfo14.getFamily();
    java.lang.String str28 = fontInfo14.toString();
    java.awt.Font font29 = fontInfo14.createFont();
    boolean b30 = fontInfo0.equals((java.lang.Object)fontInfo14);
    java.awt.Font font31 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Monospaced, 12, bold"+ "'", str23.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Monospaced"+ "'", str27.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Monospaced, 12, bold, italic"+ "'", str28.equals("Monospaced, 12, bold, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    java.lang.String str6 = fontInfo0.getFamily();
    fontInfo0.setSize((int)'4');
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    fontInfo9.setFamily("family");
    java.lang.Object obj14 = fontInfo9.clone();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    boolean b18 = fontInfo15.equals((java.lang.Object)100);
    boolean b19 = fontInfo9.equals((java.lang.Object)b18);
    boolean b20 = fontInfo9.isItalic();
    java.lang.String str21 = fontInfo9.toString();
    fontInfo9.setIsItalic(false);
    boolean b24 = fontInfo9.isItalic();
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isBold();
    int i27 = fontInfo25.getSize();
    fontInfo25.setFamily("isBold");
    boolean b30 = fontInfo9.equals((java.lang.Object)fontInfo25);
    fontInfo25.setIsBold(false);
    boolean b33 = fontInfo25.isItalic();
    java.awt.Font font34 = fontInfo25.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font34);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "family, 12"+ "'", str21.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font34);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    int i7 = fontInfo5.getSize();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo5.doesFontMatch(font8);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("family");
    java.lang.Object obj16 = fontInfo11.clone();
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isBold();
    boolean b20 = fontInfo17.equals((java.lang.Object)100);
    boolean b21 = fontInfo11.equals((java.lang.Object)b20);
    boolean b22 = fontInfo11.isItalic();
    FontInfo fontInfo23 = new FontInfo();
    fontInfo23.setSize((int)(short)-1);
    boolean b26 = fontInfo23.isBold();
    fontInfo23.setSize(10);
    boolean b29 = fontInfo11.equals((java.lang.Object)10);
    java.lang.Object obj30 = fontInfo11.clone();
    boolean b31 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.String str32 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Monospaced"+ "'", str32.equals("Monospaced"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    java.lang.String str9 = fontInfo0.getFamily();
    int i10 = fontInfo0.generateStyle();
    int i11 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    boolean b5 = fontInfo0.equals((java.lang.Object)100.0f);
    boolean b6 = fontInfo0.isItalic();
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    fontInfo0.setFamily("family");
    fontInfo0.setFamily("Monospaced, 1, italic");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    fontInfo0.setSize((int)(short)1);
    boolean b9 = fontInfo0.isItalic();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setFamily("Monospaced");
    boolean b16 = fontInfo10.equals((java.lang.Object)(-1));
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isBold();
    int i19 = fontInfo17.getSize();
    java.awt.Font font20 = null;
    boolean b21 = fontInfo17.doesFontMatch(font20);
    fontInfo17.setIsBold(false);
    boolean b24 = fontInfo10.equals((java.lang.Object)false);
    int i25 = fontInfo10.generateStyle();
    java.awt.Font font26 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font26);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    boolean b6 = fontInfo0.isBold();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    int i9 = fontInfo7.getSize();
    boolean b10 = fontInfo7.isBold();
    fontInfo7.setSize((int)(byte)1);
    fontInfo7.setSize((int)' ');
    boolean b15 = fontInfo7.isItalic();
    fontInfo7.setSize((int)' ');
    boolean b18 = fontInfo7.isBold();
    fontInfo7.setIsBold(true);
    java.awt.Font font21 = fontInfo7.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = fontInfo0.doesFontMatch(font21);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    fontInfo5.setIsItalic(true);
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    int i22 = fontInfo20.getSize();
    boolean b23 = fontInfo20.isBold();
    fontInfo20.setSize((int)(byte)1);
    fontInfo20.setSize((int)' ');
    int i28 = fontInfo20.getSize();
    fontInfo20.setFamily("family, 12");
    java.lang.String str31 = fontInfo20.toString();
    boolean b32 = fontInfo5.equals((java.lang.Object)fontInfo20);
    boolean b33 = fontInfo5.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "family, 12, 32"+ "'", str31.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    boolean b6 = fontInfo0.equals((java.lang.Object)(-1));
    fontInfo0.setIsBold(false);
    java.lang.String str9 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isBold();
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    boolean b11 = fontInfo8.isBold();
    int i12 = fontInfo8.getSize();
    boolean b13 = fontInfo8.isBold();
    boolean b14 = fontInfo0.equals((java.lang.Object)b13);
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    boolean b18 = fontInfo15.equals((java.lang.Object)100);
    fontInfo15.setIsBold(true);
    java.lang.String str21 = fontInfo15.getFamily();
    fontInfo15.setSize(0);
    fontInfo15.setFamily("family");
    boolean b26 = fontInfo15.isItalic();
    int i27 = fontInfo15.getSize();
    boolean b28 = fontInfo0.equals((java.lang.Object)fontInfo15);
    java.lang.Object obj29 = fontInfo15.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "family"+ "'", str7.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.lang.Object obj6 = null;
    boolean b7 = fontInfo0.equals(obj6);
    fontInfo0.setIsBold(false);
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    boolean b15 = fontInfo12.equals((java.lang.Object)100);
    fontInfo12.setIsBold(true);
    java.lang.String str18 = fontInfo12.getFamily();
    fontInfo12.setSize(0);
    fontInfo12.setFamily("family");
    boolean b23 = fontInfo12.isItalic();
    int i24 = fontInfo12.getSize();
    java.awt.Font font25 = fontInfo12.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = fontInfo0.doesFontMatch(font25);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family, 12"+ "'", str11.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.getFamily();
    fontInfo0.setSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    boolean b11 = fontInfo0.isBold();
    int i12 = fontInfo0.getSize();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isBold();
    java.lang.String str15 = fontInfo13.getFamily();
    fontInfo13.setFamily("family");
    java.lang.String str18 = fontInfo13.getFamily();
    java.awt.Font font19 = fontInfo13.createFont();
    int i20 = fontInfo13.getSize();
    java.lang.String str21 = fontInfo13.getFamily();
    java.awt.Font font22 = fontInfo13.createFont();
    boolean b23 = fontInfo0.equals((java.lang.Object)font22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "family"+ "'", str18.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "family"+ "'", str21.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.getFamily();
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    fontInfo7.setIsBold(false);
    java.lang.String str12 = fontInfo7.getFamily();
    java.awt.Font font13 = fontInfo7.createFont();
    boolean b14 = fontInfo7.isItalic();
    boolean b16 = fontInfo7.equals((java.lang.Object)(-1));
    java.awt.Font font17 = fontInfo7.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.getSize();
    java.lang.Object obj8 = null;
    boolean b9 = fontInfo0.equals(obj8);
    fontInfo0.setSize((int)(short)0);
    int i12 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    java.lang.String str7 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    fontInfo0.setIsItalic(true);
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isBold();
    int i15 = fontInfo13.getSize();
    boolean b16 = fontInfo13.isItalic();
    fontInfo13.setIsBold(false);
    boolean b19 = fontInfo0.equals((java.lang.Object)fontInfo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    fontInfo6.setSize((int)(byte)0);
    fontInfo6.setSize(1);
    fontInfo6.setFamily("family, 12, italic");
    boolean b24 = fontInfo6.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    fontInfo0.setSize((int)'#');
    boolean b25 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setFamily("Monospaced, 1, 12, bold, italic, 100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    fontInfo11.setFamily("Monospaced, 12");
    fontInfo11.setFamily("family, 12");
    java.lang.String str25 = fontInfo11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "family, 12, 12"+ "'", str25.equals("family, 12, 12"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.awt.Font font3 = null;
    boolean b4 = fontInfo0.doesFontMatch(font3);
    int i5 = fontInfo0.getSize();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.getSize();
    int i8 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12"+ "'", str6.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    java.lang.String str11 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    java.lang.String str14 = fontInfo0.getFamily();
    java.lang.String str15 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 1"+ "'", str11.equals("Monospaced, 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced, 1"+ "'", str15.equals("Monospaced, 1"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    boolean b5 = fontInfo0.equals((java.lang.Object)100.0f);
    boolean b6 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)(byte)10);
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    boolean b11 = fontInfo8.isBold();
    int i12 = fontInfo8.getSize();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isBold();
    java.lang.String str15 = fontInfo13.getFamily();
    fontInfo13.setFamily("family");
    java.lang.Object obj18 = fontInfo13.clone();
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isBold();
    boolean b22 = fontInfo19.equals((java.lang.Object)100);
    boolean b23 = fontInfo13.equals((java.lang.Object)b22);
    boolean b24 = fontInfo13.isItalic();
    boolean b25 = fontInfo8.equals((java.lang.Object)fontInfo13);
    java.awt.Font font26 = fontInfo8.createFont();
    boolean b27 = fontInfo0.equals((java.lang.Object)font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.getSize();
    boolean b5 = fontInfo0.isBold();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    int i8 = fontInfo6.getSize();
    boolean b9 = fontInfo6.isBold();
    fontInfo6.setSize((int)(byte)1);
    fontInfo6.setSize((int)' ');
    boolean b14 = fontInfo6.isItalic();
    fontInfo6.setSize((int)' ');
    java.lang.Object obj17 = fontInfo6.clone();
    boolean b18 = fontInfo0.equals(obj17);
    java.awt.Font font19 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    java.awt.Font font12 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo13 = new FontInfo(font12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.lang.String str5 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced, 12"+ "'", str5.equals("Monospaced, 12"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    java.awt.Font font6 = fontInfo0.createFont();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.Object obj8 = fontInfo0.clone();
    boolean b9 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setSize((int)(byte)100);
    fontInfo0.setFamily("Monospaced, 1, 12, bold, italic");
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 1, 12, bold, italic, 100"+ "'", str9.equals("Monospaced, 1, 12, bold, italic, 100"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.awt.Font font18 = fontInfo0.createFont();
    boolean b19 = fontInfo0.isItalic();
    fontInfo0.setSize((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    fontInfo0.setSize((int)'#');
    boolean b24 = fontInfo0.isItalic();
    fontInfo0.setFamily("isItalic, 35, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.getSize();
    boolean b5 = fontInfo0.isBold();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    int i8 = fontInfo6.getSize();
    boolean b9 = fontInfo6.isBold();
    fontInfo6.setSize((int)(byte)1);
    fontInfo6.setSize((int)' ');
    boolean b14 = fontInfo6.isItalic();
    fontInfo6.setSize((int)' ');
    java.lang.Object obj17 = fontInfo6.clone();
    boolean b18 = fontInfo0.equals(obj17);
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isBold();
    java.lang.String str21 = fontInfo19.getFamily();
    fontInfo19.setFamily("family");
    java.lang.Object obj24 = fontInfo19.clone();
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isBold();
    boolean b28 = fontInfo25.equals((java.lang.Object)100);
    boolean b29 = fontInfo19.equals((java.lang.Object)b28);
    boolean b30 = fontInfo19.isItalic();
    java.lang.String str31 = fontInfo19.toString();
    fontInfo19.setIsItalic(false);
    boolean b34 = fontInfo19.isItalic();
    FontInfo fontInfo35 = new FontInfo();
    boolean b36 = fontInfo35.isBold();
    int i37 = fontInfo35.getSize();
    fontInfo35.setFamily("isBold");
    boolean b40 = fontInfo19.equals((java.lang.Object)fontInfo35);
    fontInfo19.setFamily("isItalic, 12");
    boolean b43 = fontInfo0.equals((java.lang.Object)"isItalic, 12");
    boolean b44 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "family, 12"+ "'", str31.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    boolean b18 = fontInfo0.isBold();
    boolean b19 = fontInfo0.isItalic();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    int i22 = fontInfo20.getSize();
    java.lang.Object obj23 = fontInfo20.clone();
    fontInfo20.setFamily("isItalic");
    boolean b26 = fontInfo20.isItalic();
    int i27 = fontInfo20.getSize();
    boolean b28 = fontInfo20.isItalic();
    fontInfo20.setIsBold(true);
    int i31 = fontInfo20.generateStyle();
    boolean b32 = fontInfo0.equals((java.lang.Object)i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.equals((java.lang.Object)(-1));
    java.awt.Font font10 = fontInfo0.createFont();
    java.lang.String str11 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    java.lang.Object obj11 = fontInfo0.clone();
    fontInfo0.setIsBold(false);
    int i14 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    java.awt.Font font10 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "family"+ "'", str9.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setSize((int)(short)100);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("family");
    java.lang.Object obj16 = fontInfo11.clone();
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isBold();
    boolean b20 = fontInfo17.equals((java.lang.Object)100);
    boolean b21 = fontInfo11.equals((java.lang.Object)b20);
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    java.lang.String str24 = fontInfo22.getFamily();
    fontInfo22.setFamily("Monospaced");
    int i27 = fontInfo22.getSize();
    fontInfo22.setFamily("isItalic");
    java.lang.String str30 = fontInfo22.toString();
    boolean b31 = fontInfo11.equals((java.lang.Object)fontInfo22);
    java.lang.Object obj32 = fontInfo11.clone();
    boolean b33 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.String str34 = fontInfo0.toString();
    fontInfo0.setSize(2);
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 32"+ "'", str8.equals("Monospaced, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "isItalic, 12"+ "'", str30.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Monospaced, 100"+ "'", str34.equals("Monospaced, 100"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    boolean b8 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    boolean b12 = fontInfo0.equals((java.lang.Object)(byte)0);
    java.awt.Font font13 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo14 = new FontInfo(font13);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.isItalic();
    fontInfo0.setSize(2);
    int i12 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.Object obj8 = fontInfo0.clone();
    java.awt.Font font9 = fontInfo0.createFont();
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "isItalic"+ "'", str10.equals("isItalic"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    int i10 = fontInfo0.getSize();
    java.lang.String str11 = fontInfo0.toString();
    boolean b13 = fontInfo0.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isItalic();
    int i12 = fontInfo0.getSize();
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.getSize();
    java.lang.Object obj8 = fontInfo0.clone();
    java.awt.Font font9 = fontInfo0.createFont();
    fontInfo0.setSize((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    java.lang.String str4 = fontInfo0.toString();
    java.lang.String str5 = fontInfo0.getFamily();
    int i6 = fontInfo0.getSize();
    java.lang.Object obj7 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str18 = fontInfo0.toString();
    int i19 = fontInfo0.generateStyle();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    boolean b23 = fontInfo20.equals((java.lang.Object)100);
    fontInfo20.setIsBold(true);
    int i26 = fontInfo20.getSize();
    boolean b27 = fontInfo0.equals((java.lang.Object)i26);
    java.lang.Object obj28 = fontInfo0.clone();
    int i29 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 12);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    fontInfo0.setIsItalic(true);
    java.lang.String str12 = fontInfo0.getFamily();
    boolean b13 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isBold();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("Monospaced");
    fontInfo12.setIsItalic(false);
    java.lang.String str19 = fontInfo12.getFamily();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setFamily("family");
    java.lang.String str25 = fontInfo20.getFamily();
    boolean b26 = fontInfo20.isBold();
    fontInfo20.setSize(0);
    boolean b29 = fontInfo12.equals((java.lang.Object)fontInfo20);
    boolean b30 = fontInfo0.equals((java.lang.Object)fontInfo20);
    fontInfo20.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "family"+ "'", str25.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    fontInfo8.setSize((int)(short)-1);
    boolean b11 = fontInfo8.isBold();
    fontInfo8.setSize(10);
    fontInfo8.setSize((int)(byte)1);
    java.awt.Font font16 = fontInfo8.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font16);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    fontInfo0.setSize(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    java.awt.Font font8 = fontInfo0.createFont();
    fontInfo0.setSize(1);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    boolean b14 = fontInfo11.isItalic();
    fontInfo11.setIsBold(false);
    int i17 = fontInfo11.generateStyle();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo11);
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isBold();
    java.lang.String str21 = fontInfo19.getFamily();
    int i22 = fontInfo19.getSize();
    fontInfo19.setIsBold(false);
    int i25 = fontInfo19.getSize();
    fontInfo19.setSize(12);
    boolean b28 = fontInfo19.isBold();
    int i29 = fontInfo19.getSize();
    java.lang.String str30 = fontInfo19.toString();
    fontInfo19.setFamily("size");
    fontInfo19.setFamily("isItalic, 12");
    boolean b35 = fontInfo11.equals((java.lang.Object)fontInfo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Monospaced, 12"+ "'", str30.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.lang.String str18 = fontInfo0.toString();
    int i19 = fontInfo0.generateStyle();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    boolean b23 = fontInfo20.equals((java.lang.Object)100);
    fontInfo20.setIsBold(true);
    int i26 = fontInfo20.getSize();
    boolean b27 = fontInfo0.equals((java.lang.Object)i26);
    java.lang.Object obj28 = fontInfo0.clone();
    FontInfo fontInfo29 = new FontInfo();
    boolean b30 = fontInfo29.isBold();
    int i31 = fontInfo29.getSize();
    java.lang.Object obj32 = fontInfo29.clone();
    fontInfo29.setFamily("isItalic");
    boolean b35 = fontInfo29.isItalic();
    int i36 = fontInfo29.getSize();
    java.lang.String str37 = fontInfo29.toString();
    int i38 = fontInfo29.getSize();
    int i39 = fontInfo29.generateStyle();
    java.awt.Font font40 = fontInfo29.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = fontInfo0.doesFontMatch(font40);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "isItalic, 12"+ "'", str37.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font40);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setIsItalic(true);
    boolean b9 = fontInfo0.equals((java.lang.Object)"");
    boolean b10 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b8 = fontInfo0.isBold();
    java.lang.String str9 = fontInfo0.toString();
    boolean b10 = fontInfo0.isItalic();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 12, bold"+ "'", str9.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    int i21 = fontInfo11.getSize();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    java.lang.String str24 = fontInfo22.getFamily();
    boolean b25 = fontInfo22.isBold();
    int i26 = fontInfo22.getSize();
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isBold();
    java.lang.String str29 = fontInfo27.getFamily();
    fontInfo27.setFamily("family");
    java.lang.Object obj32 = fontInfo27.clone();
    FontInfo fontInfo33 = new FontInfo();
    boolean b34 = fontInfo33.isBold();
    boolean b36 = fontInfo33.equals((java.lang.Object)100);
    boolean b37 = fontInfo27.equals((java.lang.Object)b36);
    boolean b38 = fontInfo27.isItalic();
    boolean b39 = fontInfo22.equals((java.lang.Object)fontInfo27);
    fontInfo27.setIsItalic(true);
    FontInfo fontInfo42 = new FontInfo();
    boolean b43 = fontInfo42.isBold();
    int i44 = fontInfo42.getSize();
    boolean b45 = fontInfo42.isBold();
    fontInfo42.setSize((int)(byte)1);
    fontInfo42.setSize((int)' ');
    int i50 = fontInfo42.getSize();
    fontInfo42.setFamily("family, 12");
    java.lang.String str53 = fontInfo42.toString();
    boolean b54 = fontInfo27.equals((java.lang.Object)fontInfo42);
    java.awt.Font font55 = fontInfo42.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo11.setFont(font55);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Monospaced"+ "'", str29.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "family, 12, 32"+ "'", str53.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font55);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.getSize();
    java.lang.Object obj8 = null;
    boolean b9 = fontInfo0.equals(obj8);
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setFamily("Monospaced");
    fontInfo10.setIsItalic(false);
    int i17 = fontInfo10.generateStyle();
    int i18 = fontInfo10.getSize();
    java.lang.Object obj19 = fontInfo10.clone();
    boolean b20 = fontInfo10.isBold();
    java.lang.String str21 = fontInfo10.toString();
    java.lang.String str22 = fontInfo10.toString();
    java.awt.Font font23 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font23);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced, 12"+ "'", str21.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced, 12"+ "'", str22.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    java.lang.String str9 = fontInfo0.getFamily();
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "family"+ "'", str9.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family"+ "'", str10.equals("family"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    boolean b14 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.getSize();
    fontInfo0.setFamily("family, 12, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.equals((java.lang.Object)(-1));
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isBold();
    int i7 = fontInfo0.generateStyle();
    java.lang.String str8 = fontInfo0.toString();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    fontInfo9.setFamily("family");
    java.lang.String str14 = fontInfo9.getFamily();
    java.awt.Font font15 = fontInfo9.createFont();
    fontInfo9.setIsItalic(false);
    int i18 = fontInfo9.generateStyle();
    boolean b19 = fontInfo0.equals((java.lang.Object)i18);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "family"+ "'", str14.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isBold();
    fontInfo0.setSize(0);
    int i9 = fontInfo0.getSize();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setIsBold(false);
    java.lang.String str15 = fontInfo10.getFamily();
    java.awt.Font font16 = fontInfo10.createFont();
    java.lang.Object obj17 = fontInfo10.clone();
    boolean b18 = fontInfo0.equals((java.lang.Object)fontInfo10);
    fontInfo0.setSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    int i7 = fontInfo5.getSize();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo5.doesFontMatch(font8);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("family");
    java.lang.Object obj16 = fontInfo11.clone();
    FontInfo fontInfo17 = new FontInfo();
    boolean b18 = fontInfo17.isBold();
    boolean b20 = fontInfo17.equals((java.lang.Object)100);
    boolean b21 = fontInfo11.equals((java.lang.Object)b20);
    boolean b22 = fontInfo11.isItalic();
    FontInfo fontInfo23 = new FontInfo();
    fontInfo23.setSize((int)(short)-1);
    boolean b26 = fontInfo23.isBold();
    fontInfo23.setSize(10);
    boolean b29 = fontInfo11.equals((java.lang.Object)10);
    java.lang.Object obj30 = fontInfo11.clone();
    boolean b31 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj32 = fontInfo11.clone();
    FontInfo fontInfo33 = new FontInfo();
    boolean b34 = fontInfo33.isBold();
    java.lang.String str35 = fontInfo33.getFamily();
    fontInfo33.setIsBold(false);
    java.lang.String str38 = fontInfo33.getFamily();
    java.awt.Font font39 = fontInfo33.createFont();
    boolean b41 = fontInfo33.equals((java.lang.Object)100.0d);
    java.awt.Font font42 = fontInfo33.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = fontInfo11.doesFontMatch(font42);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Monospaced"+ "'", str35.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Monospaced"+ "'", str38.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font42);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.awt.Font font3 = null;
    boolean b4 = fontInfo0.doesFontMatch(font3);
    int i5 = fontInfo0.generateStyle();
    java.lang.String str6 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    java.lang.String str11 = fontInfo0.getFamily();
    fontInfo0.setSize(32);
    boolean b14 = fontInfo0.isItalic();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    java.lang.String str17 = fontInfo15.getFamily();
    fontInfo15.setFamily("Monospaced");
    fontInfo15.setIsItalic(false);
    int i22 = fontInfo15.generateStyle();
    int i23 = fontInfo15.getSize();
    java.lang.Object obj24 = fontInfo15.clone();
    boolean b25 = fontInfo15.isBold();
    java.lang.String str26 = fontInfo15.toString();
    java.lang.String str27 = fontInfo15.toString();
    java.awt.Font font28 = fontInfo15.createFont();
    FontInfo fontInfo29 = new FontInfo();
    boolean b30 = fontInfo29.isBold();
    int i31 = fontInfo29.getSize();
    boolean b32 = fontInfo29.isBold();
    fontInfo29.setSize((int)(byte)1);
    fontInfo29.setSize((int)(byte)10);
    int i37 = fontInfo29.generateStyle();
    boolean b38 = fontInfo15.equals((java.lang.Object)i37);
    boolean b39 = fontInfo0.equals((java.lang.Object)i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced"+ "'", str17.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Monospaced, 12"+ "'", str26.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Monospaced, 12"+ "'", str27.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    int i8 = fontInfo0.getSize();
    FontInfo fontInfo9 = new FontInfo();
    fontInfo9.setSize((int)(short)-1);
    boolean b12 = fontInfo9.isBold();
    fontInfo9.setSize(10);
    fontInfo9.setSize((int)(byte)1);
    java.awt.Font font17 = fontInfo9.createFont();
    fontInfo9.setSize(12);
    java.awt.Font font20 = fontInfo9.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = fontInfo0.doesFontMatch(font20);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    fontInfo11.setFamily("Monospaced, 12");
    int i23 = fontInfo11.generateStyle();
    boolean b24 = fontInfo11.isItalic();
    java.awt.Font font25 = fontInfo11.createFont();
    java.awt.Font font26 = null;
    boolean b27 = fontInfo11.doesFontMatch(font26);
    boolean b28 = fontInfo11.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setSize((int)(short)100);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    java.lang.Object obj14 = fontInfo11.clone();
    fontInfo11.setFamily("isItalic");
    boolean b17 = fontInfo11.isItalic();
    int i18 = fontInfo11.getSize();
    java.lang.String str19 = fontInfo11.toString();
    int i20 = fontInfo11.getSize();
    java.awt.Font font21 = fontInfo11.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = fontInfo0.doesFontMatch(font21);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 32"+ "'", str8.equals("Monospaced, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font21);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("family, 0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    fontInfo0.setFamily("family, 12, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    fontInfo0.setIsItalic(true);
    java.lang.String str12 = fontInfo0.getFamily();
    fontInfo0.setFamily("family, 2");
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    java.lang.String str17 = fontInfo15.getFamily();
    fontInfo15.setFamily("family");
    java.lang.String str20 = fontInfo15.getFamily();
    boolean b21 = fontInfo15.isBold();
    boolean b22 = fontInfo15.isBold();
    boolean b23 = fontInfo0.equals((java.lang.Object)fontInfo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced"+ "'", str17.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "family"+ "'", str20.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.awt.Font font13 = fontInfo0.createFont();
    java.lang.Object obj14 = fontInfo0.clone();
    int i15 = fontInfo0.getSize();
    int i16 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    java.awt.Font font4 = fontInfo0.createFont();
    int i5 = fontInfo0.generateStyle();
    int i6 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setSize((-1));
    boolean b7 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.equals((java.lang.Object)(-1));
    java.awt.Font font10 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    boolean b13 = fontInfo0.isBold();
    fontInfo0.setFamily("Monospaced");
    int i16 = fontInfo0.generateStyle();
    java.awt.Font font17 = fontInfo0.createFont();
    java.lang.String str18 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    int i6 = fontInfo0.getSize();
    java.awt.Font font7 = fontInfo0.createFont();
    java.lang.String str8 = fontInfo0.toString();
    int i9 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.getFamily();
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setFamily("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setFamily("Monospaced, 12, bold");
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    java.awt.Font font12 = fontInfo0.createFont();
    java.awt.Font font13 = fontInfo0.createFont();
    boolean b14 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    java.awt.Font font10 = fontInfo0.createFont();
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    boolean b10 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "isItalic, 12"+ "'", str9.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.lang.String str13 = fontInfo0.toString();
    boolean b14 = fontInfo0.isBold();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    int i17 = fontInfo15.getSize();
    java.awt.Font font18 = null;
    boolean b19 = fontInfo15.doesFontMatch(font18);
    int i20 = fontInfo15.generateStyle();
    fontInfo15.setSize(12);
    int i23 = fontInfo15.getSize();
    java.awt.Font font24 = fontInfo15.createFont();
    java.lang.Object obj25 = fontInfo15.clone();
    java.awt.Font font26 = fontInfo15.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font26);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family, 12, italic"+ "'", str13.equals("family, 12, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.awt.Font font3 = null;
    boolean b4 = fontInfo0.doesFontMatch(font3);
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setSize(12);
    int i8 = fontInfo0.getSize();
    java.awt.Font font9 = fontInfo0.createFont();
    java.lang.Object obj10 = fontInfo0.clone();
    java.awt.Font font11 = fontInfo0.createFont();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    int i14 = fontInfo12.getSize();
    boolean b15 = fontInfo12.isItalic();
    java.awt.Font font16 = fontInfo12.createFont();
    java.awt.Font font17 = fontInfo12.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font17);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    java.lang.String str9 = fontInfo0.getFamily();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setIsBold(false);
    java.lang.String str15 = fontInfo10.getFamily();
    java.awt.Font font16 = fontInfo10.createFont();
    boolean b17 = fontInfo10.isItalic();
    java.lang.String str18 = fontInfo10.toString();
    int i19 = fontInfo10.getSize();
    int i20 = fontInfo10.getSize();
    boolean b21 = fontInfo10.isBold();
    int i22 = fontInfo10.getSize();
    boolean b23 = fontInfo10.isBold();
    boolean b24 = fontInfo0.equals((java.lang.Object)b23);
    boolean b25 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced, 12"+ "'", str18.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    java.lang.Object obj8 = fontInfo0.clone();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    boolean b12 = fontInfo9.isBold();
    int i13 = fontInfo9.getSize();
    FontInfo fontInfo14 = new FontInfo();
    boolean b15 = fontInfo14.isBold();
    java.lang.String str16 = fontInfo14.getFamily();
    fontInfo14.setFamily("family");
    java.lang.Object obj19 = fontInfo14.clone();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    boolean b23 = fontInfo20.equals((java.lang.Object)100);
    boolean b24 = fontInfo14.equals((java.lang.Object)b23);
    boolean b25 = fontInfo14.isItalic();
    boolean b26 = fontInfo9.equals((java.lang.Object)fontInfo14);
    java.awt.Font font27 = fontInfo9.createFont();
    java.awt.Font font28 = fontInfo9.createFont();
    boolean b29 = fontInfo0.equals((java.lang.Object)fontInfo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isBold();
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    boolean b11 = fontInfo8.isBold();
    int i12 = fontInfo8.getSize();
    boolean b13 = fontInfo8.isBold();
    boolean b14 = fontInfo0.equals((java.lang.Object)b13);
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    boolean b18 = fontInfo15.equals((java.lang.Object)100);
    fontInfo15.setIsBold(true);
    java.lang.String str21 = fontInfo15.getFamily();
    fontInfo15.setSize(0);
    fontInfo15.setFamily("family");
    boolean b26 = fontInfo15.isItalic();
    int i27 = fontInfo15.getSize();
    boolean b28 = fontInfo0.equals((java.lang.Object)fontInfo15);
    java.lang.String str29 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "family"+ "'", str7.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "family"+ "'", str29.equals("family"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    fontInfo0.setFamily("Monospaced, 1");
    fontInfo0.setIsItalic(true);
    java.lang.String str13 = fontInfo0.toString();
    java.lang.String str14 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced, 1, 12, bold, italic"+ "'", str13.equals("Monospaced, 1, 12, bold, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 1, 12, bold, italic"+ "'", str14.equals("Monospaced, 1, 12, bold, italic"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    java.lang.Object obj7 = fontInfo0.clone();
    boolean b8 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("size");
    boolean b9 = fontInfo0.isBold();
    java.lang.String str10 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "size"+ "'", str10.equals("size"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.lang.String str13 = fontInfo0.toString();
    java.lang.String str14 = fontInfo0.toString();
    boolean b15 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family, 12, italic"+ "'", str13.equals("family, 12, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "family, 12, italic"+ "'", str14.equals("family, 12, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b8 = fontInfo0.equals((java.lang.Object)100.0d);
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isItalic();
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setFamily("");
    boolean b6 = fontInfo0.isBold();
    boolean b7 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.generateStyle();
    boolean b8 = fontInfo0.isBold();
    int i9 = fontInfo0.getSize();
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family, 12"+ "'", str6.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family"+ "'", str10.equals("family"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    int i18 = fontInfo6.generateStyle();
    fontInfo6.setIsItalic(true);
    fontInfo6.setIsItalic(true);
    fontInfo6.setIsBold(false);
    FontInfo fontInfo25 = new FontInfo();
    boolean b26 = fontInfo25.isBold();
    java.lang.String str27 = fontInfo25.getFamily();
    int i28 = fontInfo25.getSize();
    fontInfo25.setIsBold(true);
    fontInfo25.setIsBold(true);
    FontInfo fontInfo33 = new FontInfo();
    boolean b34 = fontInfo33.isBold();
    java.lang.String str35 = fontInfo33.getFamily();
    fontInfo33.setFamily("Monospaced");
    fontInfo33.setIsItalic(false);
    java.lang.String str40 = fontInfo33.getFamily();
    FontInfo fontInfo41 = new FontInfo();
    boolean b42 = fontInfo41.isBold();
    int i43 = fontInfo41.getSize();
    java.lang.Object obj44 = fontInfo41.clone();
    fontInfo41.setFamily("isItalic");
    java.awt.Font font47 = fontInfo41.createFont();
    boolean b48 = fontInfo33.equals((java.lang.Object)fontInfo41);
    boolean b49 = fontInfo25.equals((java.lang.Object)fontInfo41);
    boolean b50 = fontInfo6.equals((java.lang.Object)fontInfo41);
    fontInfo6.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Monospaced"+ "'", str27.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Monospaced"+ "'", str35.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Monospaced"+ "'", str40.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b11 = fontInfo0.equals((java.lang.Object)100.0d);
    int i12 = fontInfo0.getSize();
    int i13 = fontInfo0.getSize();
    boolean b14 = fontInfo0.isBold();
    FontInfo fontInfo15 = new FontInfo();
    boolean b16 = fontInfo15.isBold();
    int i17 = fontInfo15.getSize();
    boolean b18 = fontInfo15.isItalic();
    fontInfo15.setIsBold(false);
    int i21 = fontInfo15.generateStyle();
    fontInfo15.setIsItalic(false);
    java.awt.Font font24 = fontInfo15.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = fontInfo0.doesFontMatch(font24);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    java.lang.String str9 = fontInfo0.toString();
    int i10 = fontInfo0.getSize();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    boolean b14 = fontInfo11.isBold();
    int i15 = fontInfo11.getSize();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    fontInfo16.setFamily("family");
    java.lang.Object obj21 = fontInfo16.clone();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    boolean b25 = fontInfo22.equals((java.lang.Object)100);
    boolean b26 = fontInfo16.equals((java.lang.Object)b25);
    boolean b27 = fontInfo16.isItalic();
    boolean b28 = fontInfo11.equals((java.lang.Object)fontInfo16);
    fontInfo16.setIsItalic(true);
    FontInfo fontInfo31 = new FontInfo();
    boolean b32 = fontInfo31.isBold();
    int i33 = fontInfo31.getSize();
    boolean b34 = fontInfo31.isBold();
    fontInfo31.setSize((int)(byte)1);
    fontInfo31.setSize((int)' ');
    int i39 = fontInfo31.getSize();
    fontInfo31.setFamily("family, 12");
    java.lang.String str42 = fontInfo31.toString();
    boolean b43 = fontInfo16.equals((java.lang.Object)fontInfo31);
    java.awt.Font font44 = fontInfo31.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font44);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "isItalic, 12"+ "'", str9.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "family, 12, 32"+ "'", str42.equals("family, 12, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font44);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    boolean b25 = fontInfo0.isBold();
    java.lang.String str26 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "family, 12, italic"+ "'", str26.equals("family, 12, italic"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    FontInfo fontInfo3 = new FontInfo();
    boolean b4 = fontInfo3.isBold();
    int i5 = fontInfo3.getSize();
    boolean b6 = fontInfo3.isBold();
    fontInfo3.setSize((int)(byte)1);
    java.lang.Object obj9 = fontInfo3.clone();
    java.awt.Font font10 = fontInfo3.createFont();
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    boolean b6 = fontInfo0.equals((java.lang.Object)(-1));
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)(byte)-1);
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.generateStyle();
    java.lang.Object obj8 = fontInfo0.clone();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    boolean b12 = fontInfo9.isBold();
    java.awt.Font font13 = fontInfo9.createFont();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    fontInfo0.setIsBold(false);
    boolean b11 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setFamily("Monospaced");
    fontInfo20.setIsItalic(false);
    java.lang.String str27 = fontInfo20.getFamily();
    FontInfo fontInfo28 = new FontInfo();
    boolean b29 = fontInfo28.isBold();
    java.lang.String str30 = fontInfo28.getFamily();
    fontInfo28.setFamily("family");
    java.lang.String str33 = fontInfo28.getFamily();
    boolean b34 = fontInfo28.isBold();
    fontInfo28.setSize(0);
    boolean b37 = fontInfo20.equals((java.lang.Object)fontInfo28);
    boolean b38 = fontInfo0.equals((java.lang.Object)fontInfo20);
    fontInfo0.setIsBold(true);
    java.awt.Font font41 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Monospaced"+ "'", str27.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Monospaced"+ "'", str30.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "family"+ "'", str33.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font41);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setIsBold(false);
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    fontInfo9.setFamily("family");
    java.lang.Object obj14 = fontInfo9.clone();
    fontInfo9.setSize(2);
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo9);
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setIsBold(false);
    java.lang.String str25 = fontInfo20.getFamily();
    java.awt.Font font26 = fontInfo20.createFont();
    boolean b27 = fontInfo20.isItalic();
    boolean b29 = fontInfo20.equals((java.lang.Object)(-1));
    java.awt.Font font30 = fontInfo20.createFont();
    java.lang.Object obj31 = fontInfo20.clone();
    java.awt.Font font32 = fontInfo20.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font32);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Monospaced"+ "'", str25.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font32);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    int i18 = fontInfo16.getSize();
    fontInfo16.setFamily("isBold");
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo16);
    fontInfo16.setSize((-1));
    java.lang.String str24 = fontInfo16.getFamily();
    int i25 = fontInfo16.generateStyle();
    FontInfo fontInfo26 = new FontInfo();
    boolean b27 = fontInfo26.isBold();
    int i28 = fontInfo26.getSize();
    boolean b29 = fontInfo26.isItalic();
    fontInfo26.setIsBold(false);
    int i32 = fontInfo26.generateStyle();
    fontInfo26.setIsItalic(false);
    java.awt.Font font35 = fontInfo26.createFont();
    java.awt.Font font36 = fontInfo26.createFont();
    boolean b37 = fontInfo16.equals((java.lang.Object)font36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "isBold"+ "'", str24.equals("isBold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    boolean b7 = fontInfo0.isItalic();
    fontInfo0.setFamily("family, 12, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.awt.Font font5 = fontInfo0.createFont();
    int i6 = fontInfo0.getSize();
    boolean b7 = fontInfo0.isItalic();
    int i8 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.String str19 = fontInfo0.toString();
    boolean b20 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "family, 12"+ "'", str19.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    java.lang.String str10 = fontInfo0.toString();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 1"+ "'", str10.equals("Monospaced, 1"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    boolean b7 = fontInfo0.equals((java.lang.Object)10);
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    fontInfo8.setFamily("family");
    boolean b13 = fontInfo8.isBold();
    fontInfo8.setFamily("family");
    java.awt.Font font16 = fontInfo8.createFont();
    boolean b17 = fontInfo0.equals((java.lang.Object)font16);
    boolean b18 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    java.awt.Font font8 = fontInfo0.createFont();
    boolean b9 = fontInfo0.isBold();
    int i10 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    int i18 = fontInfo6.generateStyle();
    int i19 = fontInfo6.getSize();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    boolean b23 = fontInfo20.isBold();
    java.awt.Font font24 = fontInfo20.createFont();
    fontInfo20.setIsBold(true);
    int i27 = fontInfo20.getSize();
    java.awt.Font font28 = fontInfo20.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo6.setFont(font28);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    boolean b12 = fontInfo0.isItalic();
    fontInfo0.setSize(12);
    int i15 = fontInfo0.getSize();
    java.awt.Font font16 = fontInfo0.createFont();
    java.lang.Object obj17 = null;
    boolean b18 = fontInfo0.equals(obj17);
    fontInfo0.setSize(32);
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.Object obj8 = fontInfo0.clone();
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    fontInfo16.setFamily("family");
    java.lang.Object obj21 = fontInfo16.clone();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    boolean b25 = fontInfo22.equals((java.lang.Object)100);
    boolean b26 = fontInfo16.equals((java.lang.Object)b25);
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isBold();
    java.lang.String str29 = fontInfo27.getFamily();
    fontInfo27.setFamily("Monospaced");
    int i32 = fontInfo27.getSize();
    fontInfo27.setFamily("isItalic");
    java.lang.String str35 = fontInfo27.toString();
    boolean b36 = fontInfo16.equals((java.lang.Object)fontInfo27);
    boolean b37 = fontInfo0.equals((java.lang.Object)fontInfo27);
    FontInfo fontInfo38 = new FontInfo();
    boolean b39 = fontInfo38.isBold();
    int i40 = fontInfo38.getSize();
    java.lang.Object obj41 = fontInfo38.clone();
    fontInfo38.setFamily("isItalic");
    boolean b44 = fontInfo38.isItalic();
    int i45 = fontInfo38.getSize();
    java.lang.String str46 = fontInfo38.toString();
    int i47 = fontInfo38.getSize();
    boolean b48 = fontInfo27.equals((java.lang.Object)i47);
    fontInfo27.setIsItalic(false);
    fontInfo27.setSize(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Monospaced"+ "'", str29.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "isItalic, 12"+ "'", str35.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "isItalic, 12"+ "'", str46.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.getSize();
    java.lang.String str8 = fontInfo0.getFamily();
    java.awt.Font font9 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    java.awt.Font font12 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "family"+ "'", str8.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    boolean b21 = fontInfo11.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.generateStyle();
    boolean b8 = fontInfo0.isBold();
    int i9 = fontInfo0.getSize();
    java.lang.String str10 = fontInfo0.toString();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    int i13 = fontInfo11.getSize();
    boolean b14 = fontInfo11.isBold();
    fontInfo11.setSize((int)(byte)1);
    boolean b18 = fontInfo11.equals((java.lang.Object)10);
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isBold();
    java.lang.String str21 = fontInfo19.getFamily();
    fontInfo19.setFamily("family");
    boolean b24 = fontInfo19.isBold();
    fontInfo19.setFamily("family");
    java.awt.Font font27 = fontInfo19.createFont();
    boolean b28 = fontInfo11.equals((java.lang.Object)font27);
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font27);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family, 12"+ "'", str6.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b11 = fontInfo0.equals((java.lang.Object)100.0d);
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)(short)10);
    java.awt.Font font16 = fontInfo0.createFont();
    java.lang.String str17 = fontInfo0.getFamily();
    boolean b18 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Monospaced"+ "'", str17.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    int i6 = fontInfo0.generateStyle();
    boolean b7 = fontInfo0.isItalic();
    FontInfo fontInfo8 = new FontInfo();
    fontInfo8.setSize((int)(short)-1);
    boolean b11 = fontInfo8.isBold();
    fontInfo8.setSize(10);
    fontInfo8.setSize((int)(byte)1);
    int i16 = fontInfo8.getSize();
    boolean b17 = fontInfo8.isItalic();
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isBold();
    int i20 = fontInfo18.getSize();
    boolean b21 = fontInfo18.isItalic();
    fontInfo18.setIsBold(false);
    int i24 = fontInfo18.generateStyle();
    fontInfo18.setIsBold(true);
    boolean b27 = fontInfo8.equals((java.lang.Object)fontInfo18);
    boolean b28 = fontInfo0.equals((java.lang.Object)fontInfo8);
    boolean b29 = fontInfo8.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    java.lang.String str6 = fontInfo0.toString();
    int i7 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family, 12"+ "'", str6.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    boolean b7 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setSize((-1));
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.toString();
    java.lang.String str8 = fontInfo0.getFamily();
    boolean b9 = fontInfo0.isItalic();
    int i10 = fontInfo0.generateStyle();
    fontInfo0.setFamily("family, 12, 12");
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    java.lang.String str10 = fontInfo0.getFamily();
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 12"+ "'", str11.equals("Monospaced, 12"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("Monospaced, 32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    fontInfo0.setSize((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("size");
    java.awt.Font font12 = fontInfo0.createFont();
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    fontInfo16.setFamily("family");
    java.lang.Object obj21 = fontInfo16.clone();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    boolean b25 = fontInfo22.equals((java.lang.Object)100);
    boolean b26 = fontInfo16.equals((java.lang.Object)b25);
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isBold();
    java.lang.String str29 = fontInfo27.getFamily();
    fontInfo27.setFamily("Monospaced");
    int i32 = fontInfo27.getSize();
    fontInfo27.setFamily("isItalic");
    java.lang.String str35 = fontInfo27.toString();
    boolean b36 = fontInfo16.equals((java.lang.Object)fontInfo27);
    boolean b37 = fontInfo0.equals((java.lang.Object)fontInfo27);
    FontInfo fontInfo38 = new FontInfo();
    boolean b39 = fontInfo38.isBold();
    int i40 = fontInfo38.getSize();
    java.lang.Object obj41 = fontInfo38.clone();
    fontInfo38.setFamily("isItalic");
    boolean b44 = fontInfo38.isItalic();
    int i45 = fontInfo38.getSize();
    java.lang.String str46 = fontInfo38.toString();
    int i47 = fontInfo38.getSize();
    boolean b48 = fontInfo27.equals((java.lang.Object)i47);
    fontInfo27.setIsItalic(false);
    java.lang.String str51 = fontInfo27.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Monospaced"+ "'", str29.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "isItalic, 12"+ "'", str35.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "isItalic, 12"+ "'", str46.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "isItalic"+ "'", str51.equals("isItalic"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("size");
    java.awt.Font font12 = fontInfo0.createFont();
    java.lang.Object obj13 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    java.awt.Font font8 = fontInfo0.createFont();
    fontInfo0.setFamily("size");
    int i11 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "isItalic, 12"+ "'", str8.equals("isItalic, 12"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    boolean b12 = fontInfo0.isBold();
    int i13 = fontInfo0.generateStyle();
    java.lang.String str14 = fontInfo0.toString();
    java.awt.Font font15 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 12, bold"+ "'", str14.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    java.lang.Object obj4 = fontInfo0.clone();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    int i7 = fontInfo5.getSize();
    java.awt.Font font8 = null;
    boolean b9 = fontInfo5.doesFontMatch(font8);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    int i11 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isBold");
    fontInfo0.setIsBold(true);
    fontInfo0.setIsItalic(false);
    fontInfo0.setIsItalic(true);
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b8 = fontInfo0.equals((java.lang.Object)100.0d);
    boolean b10 = fontInfo0.equals((java.lang.Object)1L);
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    boolean b11 = fontInfo0.isBold();
    boolean b12 = fontInfo0.isBold();
    boolean b13 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    java.lang.String str8 = fontInfo0.toString();
    int i9 = fontInfo0.getSize();
    int i10 = fontInfo0.getSize();
    boolean b11 = fontInfo0.isBold();
    int i12 = fontInfo0.generateStyle();
    java.awt.Font font13 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12"+ "'", str8.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    int i18 = fontInfo16.getSize();
    fontInfo16.setFamily("isBold");
    boolean b21 = fontInfo0.equals((java.lang.Object)fontInfo16);
    fontInfo16.setIsBold(true);
    java.lang.String str24 = fontInfo16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "isBold, 12, bold"+ "'", str24.equals("isBold, 12, bold"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    fontInfo0.setFamily("");
    fontInfo0.setIsBold(false);
    java.lang.Object obj9 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    int i10 = fontInfo8.getSize();
    java.lang.Object obj11 = fontInfo8.clone();
    fontInfo8.setFamily("isItalic");
    java.awt.Font font14 = fontInfo8.createFont();
    boolean b15 = fontInfo0.equals((java.lang.Object)fontInfo8);
    fontInfo8.setSize((int)(short)10);
    fontInfo8.setFamily("isBold, 12, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.getSize();
    java.lang.String str8 = fontInfo0.getFamily();
    java.awt.Font font9 = fontInfo0.createFont();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    int i12 = fontInfo10.getSize();
    java.awt.Font font13 = null;
    boolean b14 = fontInfo10.doesFontMatch(font13);
    int i15 = fontInfo10.generateStyle();
    fontInfo10.setSize(12);
    int i18 = fontInfo10.getSize();
    java.awt.Font font19 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = fontInfo0.doesFontMatch(font19);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "family"+ "'", str8.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    int i7 = fontInfo0.getSize();
    java.lang.String str8 = fontInfo0.getFamily();
    java.awt.Font font9 = fontInfo0.createFont();
    java.lang.String str10 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "family"+ "'", str8.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.toString();
    java.lang.String str6 = fontInfo0.getFamily();
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family, 12"+ "'", str5.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "family"+ "'", str6.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "family"+ "'", str7.equals("family"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    boolean b13 = fontInfo0.isBold();
    java.lang.Object obj14 = fontInfo0.clone();
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("isItalic, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    java.awt.Font font12 = fontInfo0.createFont();
    java.awt.Font font13 = fontInfo0.createFont();
    boolean b14 = fontInfo0.isBold();
    java.awt.Font font15 = fontInfo0.createFont();
    fontInfo0.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    java.lang.String str10 = fontInfo0.toString();
    int i11 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 1"+ "'", str10.equals("Monospaced, 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isBold();
    boolean b12 = fontInfo0.isBold();
    java.lang.String str13 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    boolean b6 = fontInfo0.equals((java.lang.Object)(-1));
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(true);
    int i11 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b11 = fontInfo0.equals((java.lang.Object)100.0d);
    int i12 = fontInfo0.getSize();
    int i13 = fontInfo0.getSize();
    java.lang.String str14 = fontInfo0.toString();
    java.lang.String str15 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 32"+ "'", str14.equals("Monospaced, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced"+ "'", str15.equals("Monospaced"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    java.awt.Font font12 = fontInfo0.createFont();
    java.awt.Font font13 = fontInfo0.createFont();
    boolean b14 = fontInfo0.isBold();
    java.awt.Font font15 = fontInfo0.createFont();
    int i16 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    fontInfo5.setFamily("family");
    java.lang.Object obj10 = fontInfo5.clone();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    boolean b14 = fontInfo11.equals((java.lang.Object)100);
    boolean b15 = fontInfo5.equals((java.lang.Object)b14);
    boolean b16 = fontInfo5.isItalic();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo5);
    java.awt.Font font18 = fontInfo0.createFont();
    java.lang.String str19 = fontInfo0.getFamily();
    java.lang.String str20 = fontInfo0.toString();
    java.lang.String str21 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Monospaced, 12"+ "'", str20.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(true);
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    int i13 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12, bold"+ "'", str8.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setFamily("family, 12");
    java.lang.String str10 = fontInfo0.getFamily();
    fontInfo0.setSize(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "family, 12"+ "'", str10.equals("family, 12"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    fontInfo8.setFamily("family");
    java.lang.String str13 = fontInfo8.getFamily();
    boolean b14 = fontInfo8.isBold();
    fontInfo8.setSize(0);
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo8);
    boolean b18 = fontInfo8.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family"+ "'", str13.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("Monospaced");
    fontInfo12.setIsItalic(false);
    int i19 = fontInfo12.generateStyle();
    fontInfo12.setIsBold(false);
    fontInfo12.setIsItalic(false);
    java.awt.Font font24 = fontInfo12.createFont();
    boolean b25 = fontInfo0.equals((java.lang.Object)fontInfo12);
    java.lang.String str26 = fontInfo12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Monospaced, 12"+ "'", str26.equals("Monospaced, 12"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.lang.Object obj6 = null;
    boolean b7 = fontInfo0.equals(obj6);
    fontInfo0.setIsBold(false);
    boolean b10 = fontInfo0.isBold();
    java.lang.String str11 = fontInfo0.toString();
    boolean b12 = fontInfo0.isItalic();
    java.lang.String str13 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "family, 12"+ "'", str11.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family"+ "'", str13.equals("family"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.getSize();
    java.lang.Object obj8 = null;
    boolean b9 = fontInfo0.equals(obj8);
    fontInfo0.setFamily("Monospaced, 1");
    java.awt.Font font12 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    fontInfo0.setSize((int)' ');
    java.lang.String str9 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.generateStyle();
    java.lang.Object obj9 = null;
    boolean b10 = fontInfo0.equals(obj9);
    java.lang.Object obj11 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isBold");
    java.lang.Object obj5 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setIsBold(true);
    boolean b11 = fontInfo0.isItalic();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setFamily("family, 12");
    boolean b10 = fontInfo0.isItalic();
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    fontInfo11.setIsItalic(false);
    java.lang.String str18 = fontInfo11.getFamily();
    FontInfo fontInfo19 = new FontInfo();
    boolean b20 = fontInfo19.isBold();
    java.lang.String str21 = fontInfo19.getFamily();
    fontInfo19.setFamily("family");
    java.lang.String str24 = fontInfo19.getFamily();
    boolean b25 = fontInfo19.isBold();
    fontInfo19.setSize(0);
    boolean b28 = fontInfo11.equals((java.lang.Object)fontInfo19);
    boolean b29 = fontInfo19.isBold();
    boolean b30 = fontInfo19.isBold();
    boolean b31 = fontInfo19.isBold();
    java.lang.Object obj32 = fontInfo19.clone();
    boolean b33 = fontInfo0.equals((java.lang.Object)fontInfo19);
    FontInfo fontInfo34 = new FontInfo();
    boolean b35 = fontInfo34.isBold();
    java.lang.String str36 = fontInfo34.getFamily();
    int i37 = fontInfo34.getSize();
    fontInfo34.setIsBold(false);
    boolean b40 = fontInfo0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Monospaced"+ "'", str21.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "family"+ "'", str24.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Monospaced"+ "'", str36.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    java.lang.String str7 = fontInfo0.getFamily();
    java.awt.Font font8 = fontInfo0.createFont();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    boolean b12 = fontInfo9.isBold();
    int i13 = fontInfo9.getSize();
    FontInfo fontInfo14 = new FontInfo();
    boolean b15 = fontInfo14.isBold();
    java.lang.String str16 = fontInfo14.getFamily();
    fontInfo14.setFamily("family");
    java.lang.Object obj19 = fontInfo14.clone();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    boolean b23 = fontInfo20.equals((java.lang.Object)100);
    boolean b24 = fontInfo14.equals((java.lang.Object)b23);
    boolean b25 = fontInfo14.isItalic();
    boolean b26 = fontInfo9.equals((java.lang.Object)fontInfo14);
    boolean b27 = fontInfo14.isItalic();
    java.lang.String str28 = fontInfo14.getFamily();
    boolean b29 = fontInfo0.equals((java.lang.Object)fontInfo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "family"+ "'", str28.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isBold();
    fontInfo0.setFamily("isItalic, 35, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    fontInfo0.setIsItalic(true);
    fontInfo0.setFamily("");
    boolean b15 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    boolean b11 = fontInfo0.isBold();
    int i12 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    boolean b7 = fontInfo0.equals((java.lang.Object)10);
    FontInfo fontInfo8 = new FontInfo();
    boolean b9 = fontInfo8.isBold();
    java.lang.String str10 = fontInfo8.getFamily();
    fontInfo8.setFamily("family");
    boolean b13 = fontInfo8.isBold();
    fontInfo8.setFamily("family");
    java.awt.Font font16 = fontInfo8.createFont();
    boolean b17 = fontInfo0.equals((java.lang.Object)font16);
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo18 = new FontInfo(font16);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced"+ "'", str10.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setSize((-1));
    int i7 = fontInfo0.generateStyle();
    java.lang.Object obj8 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    int i3 = fontInfo0.getSize();
    FontInfo fontInfo4 = new FontInfo();
    boolean b5 = fontInfo4.isBold();
    int i6 = fontInfo4.getSize();
    boolean b7 = fontInfo4.isItalic();
    fontInfo4.setIsBold(false);
    int i10 = fontInfo4.generateStyle();
    fontInfo4.setIsBold(true);
    boolean b13 = fontInfo4.isBold();
    java.awt.Font font14 = fontInfo4.createFont();
    boolean b15 = fontInfo0.equals((java.lang.Object)fontInfo4);
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    int i18 = fontInfo16.getSize();
    boolean b19 = fontInfo16.isItalic();
    fontInfo16.setIsBold(false);
    int i22 = fontInfo16.generateStyle();
    fontInfo16.setIsItalic(false);
    java.awt.Font font25 = fontInfo16.createFont();
    java.awt.Font font26 = fontInfo16.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = fontInfo0.doesFontMatch(font26);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.toString();
    java.lang.String str8 = fontInfo0.getFamily();
    boolean b9 = fontInfo0.isItalic();
    int i10 = fontInfo0.generateStyle();
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("family");
    java.lang.Object obj17 = fontInfo12.clone();
    FontInfo fontInfo18 = new FontInfo();
    boolean b19 = fontInfo18.isBold();
    boolean b21 = fontInfo18.equals((java.lang.Object)100);
    boolean b22 = fontInfo12.equals((java.lang.Object)b21);
    FontInfo fontInfo23 = new FontInfo();
    boolean b24 = fontInfo23.isBold();
    java.lang.String str25 = fontInfo23.getFamily();
    fontInfo23.setFamily("Monospaced");
    int i28 = fontInfo23.getSize();
    fontInfo23.setFamily("isItalic");
    java.lang.String str31 = fontInfo23.toString();
    boolean b32 = fontInfo12.equals((java.lang.Object)fontInfo23);
    java.lang.Object obj33 = fontInfo12.clone();
    fontInfo12.setSize((int)'#');
    boolean b36 = fontInfo0.equals((java.lang.Object)fontInfo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Monospaced"+ "'", str25.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "isItalic, 12"+ "'", str31.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    int i5 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    FontInfo fontInfo7 = new FontInfo();
    boolean b8 = fontInfo7.isBold();
    java.lang.String str9 = fontInfo7.getFamily();
    boolean b10 = fontInfo7.isBold();
    java.awt.Font font11 = fontInfo7.createFont();
    java.awt.Font font12 = fontInfo7.createFont();
    boolean b13 = fontInfo0.equals((java.lang.Object)font12);
    fontInfo0.setIsItalic(false);
    fontInfo0.setFamily("Monospaced, 1, 12, bold, italic");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    fontInfo0.setIsItalic(true);
    java.lang.String str13 = fontInfo0.getFamily();
    fontInfo0.setSize(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "family"+ "'", str13.equals("family"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsItalic(true);
    int i12 = fontInfo0.getSize();
    java.awt.Font font13 = fontInfo0.createFont();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.String str8 = fontInfo0.getFamily();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    int i11 = fontInfo9.getSize();
    java.lang.Object obj12 = fontInfo9.clone();
    fontInfo9.setFamily("isItalic");
    boolean b15 = fontInfo9.isItalic();
    int i16 = fontInfo9.getSize();
    boolean b17 = fontInfo9.isItalic();
    boolean b18 = fontInfo9.isItalic();
    java.awt.Font font19 = fontInfo9.createFont();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo9);
    java.lang.Object obj21 = fontInfo9.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.getFamily();
    int i7 = fontInfo0.generateStyle();
    java.awt.Font font8 = fontInfo0.createFont();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.equals((java.lang.Object)(-1));
    java.awt.Font font10 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    boolean b13 = fontInfo0.isBold();
    boolean b14 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    boolean b17 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    java.lang.String str8 = fontInfo0.toString();
    java.lang.String str9 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 32"+ "'", str8.equals("Monospaced, 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced, 32"+ "'", str9.equals("Monospaced, 32"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    int i15 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    int i10 = fontInfo0.getSize();
    FontInfo fontInfo11 = new FontInfo();
    fontInfo11.setSize((int)(short)-1);
    boolean b14 = fontInfo11.isBold();
    fontInfo11.setSize(10);
    fontInfo11.setSize((int)(byte)1);
    int i19 = fontInfo11.getSize();
    int i20 = fontInfo11.getSize();
    boolean b21 = fontInfo11.isBold();
    boolean b22 = fontInfo0.equals((java.lang.Object)b21);
    boolean b23 = fontInfo0.isBold();
    fontInfo0.setIsItalic(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isBold();
    boolean b7 = fontInfo0.isBold();
    fontInfo0.setSize((int)(short)1);
    fontInfo0.setIsItalic(true);
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced, 1, italic"+ "'", str12.equals("Monospaced, 1, italic"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    boolean b6 = fontInfo0.isItalic();
    fontInfo0.setSize(32);
    fontInfo0.setIsBold(false);
    java.lang.String str11 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 32"+ "'", str11.equals("Monospaced, 32"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    java.awt.Font font8 = fontInfo0.createFont();
    fontInfo0.setSize(1);
    boolean b11 = fontInfo0.isBold();
    fontInfo0.setSize(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    java.awt.Font font4 = fontInfo0.createFont();
    java.awt.Font font5 = fontInfo0.createFont();
    java.lang.String str6 = fontInfo0.getFamily();
    java.lang.String str7 = fontInfo0.toString();
    boolean b8 = fontInfo0.isBold();
    boolean b9 = fontInfo0.isItalic();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    int i12 = fontInfo10.getSize();
    boolean b13 = fontInfo10.isItalic();
    java.lang.String str14 = fontInfo10.toString();
    int i15 = fontInfo10.generateStyle();
    int i16 = fontInfo10.generateStyle();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced"+ "'", str6.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 12"+ "'", str14.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    fontInfo0.setFamily("size");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    int i8 = fontInfo0.generateStyle();
    java.lang.String str9 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    boolean b6 = fontInfo0.isBold();
    java.lang.String str7 = fontInfo0.getFamily();
    int i8 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "family"+ "'", str7.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    int i21 = fontInfo11.getSize();
    fontInfo11.setSize(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    int i8 = fontInfo0.getSize();
    fontInfo0.setFamily("family, 12");
    int i11 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    java.lang.String str12 = fontInfo10.getFamily();
    fontInfo10.setFamily("family");
    boolean b15 = fontInfo10.isBold();
    fontInfo10.setFamily("family");
    fontInfo10.setIsItalic(true);
    fontInfo10.setIsBold(false);
    java.lang.Object obj22 = fontInfo10.clone();
    java.awt.Font font23 = fontInfo10.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font23);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Monospaced"+ "'", str12.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font23);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    fontInfo0.setIsBold(true);
    java.lang.String str8 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced, 12, bold"+ "'", str8.equals("Monospaced, 12, bold"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setIsBold(true);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.getFamily();
    java.lang.String str8 = fontInfo0.getFamily();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    int i11 = fontInfo9.getSize();
    java.lang.Object obj12 = fontInfo9.clone();
    fontInfo9.setFamily("isItalic");
    boolean b15 = fontInfo9.isItalic();
    int i16 = fontInfo9.getSize();
    boolean b17 = fontInfo9.isItalic();
    boolean b18 = fontInfo9.isItalic();
    java.awt.Font font19 = fontInfo9.createFont();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo9);
    fontInfo0.setIsItalic(false);
    boolean b23 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    int i18 = fontInfo6.generateStyle();
    boolean b19 = fontInfo6.isItalic();
    boolean b20 = fontInfo6.isItalic();
    FontInfo fontInfo21 = new FontInfo();
    boolean b22 = fontInfo21.isBold();
    int i23 = fontInfo21.getSize();
    java.lang.Object obj24 = fontInfo21.clone();
    fontInfo21.setFamily("isItalic");
    boolean b27 = fontInfo21.isItalic();
    int i28 = fontInfo21.getSize();
    boolean b29 = fontInfo21.isItalic();
    boolean b30 = fontInfo21.isItalic();
    java.awt.Font font31 = fontInfo21.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = fontInfo6.doesFontMatch(font31);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font31);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setIsItalic(false);
    java.awt.Font font12 = fontInfo0.createFont();
    java.awt.Font font13 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.String str9 = fontInfo0.getFamily();
    java.lang.Object obj10 = null;
    boolean b11 = fontInfo0.equals(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsBold(false);
    java.lang.String str12 = fontInfo0.getFamily();
    java.awt.Font font13 = fontInfo0.createFont();
    java.lang.String str14 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family"+ "'", str12.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "family"+ "'", str14.equals("family"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    java.lang.String str7 = fontInfo0.toString();
    java.lang.String str8 = fontInfo0.getFamily();
    boolean b9 = fontInfo0.isItalic();
    java.lang.Object obj10 = fontInfo0.clone();
    int i11 = fontInfo0.getSize();
    fontInfo0.setSize(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced, 12"+ "'", str7.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    int i12 = fontInfo0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    boolean b8 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    boolean b11 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(true);
    boolean b9 = fontInfo0.isBold();
    fontInfo0.setSize((int)'#');
    java.awt.Font font12 = fontInfo0.createFont();
    fontInfo0.setFamily("Monospaced");
    java.lang.Object obj15 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    java.lang.String str12 = fontInfo0.toString();
    fontInfo0.setIsItalic(false);
    boolean b15 = fontInfo0.isItalic();
    FontInfo fontInfo16 = new FontInfo();
    boolean b17 = fontInfo16.isBold();
    java.lang.String str18 = fontInfo16.getFamily();
    fontInfo16.setFamily("family");
    java.lang.Object obj21 = fontInfo16.clone();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    boolean b25 = fontInfo22.equals((java.lang.Object)100);
    boolean b26 = fontInfo16.equals((java.lang.Object)b25);
    FontInfo fontInfo27 = new FontInfo();
    boolean b28 = fontInfo27.isBold();
    java.lang.String str29 = fontInfo27.getFamily();
    fontInfo27.setFamily("Monospaced");
    int i32 = fontInfo27.getSize();
    fontInfo27.setFamily("isItalic");
    java.lang.String str35 = fontInfo27.toString();
    boolean b36 = fontInfo16.equals((java.lang.Object)fontInfo27);
    boolean b37 = fontInfo0.equals((java.lang.Object)fontInfo27);
    fontInfo0.setSize((-1));
    java.lang.Object obj40 = null;
    boolean b41 = fontInfo0.equals(obj40);
    int i42 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "family, 12"+ "'", str12.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Monospaced"+ "'", str29.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "isItalic, 12"+ "'", str35.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    fontInfo0.setIsItalic(false);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.getSize();
    java.lang.Object obj9 = fontInfo0.clone();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isBold();
    FontInfo fontInfo12 = new FontInfo();
    boolean b13 = fontInfo12.isBold();
    java.lang.String str14 = fontInfo12.getFamily();
    fontInfo12.setFamily("Monospaced");
    fontInfo12.setIsItalic(false);
    java.lang.String str19 = fontInfo12.getFamily();
    FontInfo fontInfo20 = new FontInfo();
    boolean b21 = fontInfo20.isBold();
    java.lang.String str22 = fontInfo20.getFamily();
    fontInfo20.setFamily("family");
    java.lang.String str25 = fontInfo20.getFamily();
    boolean b26 = fontInfo20.isBold();
    fontInfo20.setSize(0);
    boolean b29 = fontInfo12.equals((java.lang.Object)fontInfo20);
    boolean b30 = fontInfo0.equals((java.lang.Object)fontInfo20);
    FontInfo fontInfo31 = new FontInfo();
    fontInfo31.setSize((int)(short)-1);
    boolean b34 = fontInfo31.isBold();
    fontInfo31.setSize(10);
    fontInfo31.setSize((int)(byte)1);
    int i39 = fontInfo31.getSize();
    boolean b40 = fontInfo31.isItalic();
    int i41 = fontInfo31.generateStyle();
    boolean b42 = fontInfo31.isItalic();
    java.awt.Font font43 = fontInfo31.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = fontInfo0.doesFontMatch(font43);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced"+ "'", str14.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Monospaced"+ "'", str22.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "family"+ "'", str25.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font43);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    boolean b9 = fontInfo0.isItalic();
    java.awt.Font font10 = fontInfo0.createFont();
    java.lang.String str11 = fontInfo0.toString();
    fontInfo0.setIsBold(false);
    boolean b14 = fontInfo0.isBold();
    int i15 = fontInfo0.generateStyle();
    int i16 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced, 1"+ "'", str11.equals("Monospaced, 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setFamily("family");
    java.awt.Font font6 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo7 = new FontInfo(font6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.generateStyle();
    fontInfo0.setSize((-1));
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setIsItalic(false);
    fontInfo0.setSize((int)(byte)1);
    boolean b10 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo7 = new FontInfo(font6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "family"+ "'", str5.equals("family"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsItalic(false);
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    java.lang.String str8 = fontInfo6.getFamily();
    fontInfo6.setFamily("Monospaced");
    fontInfo6.setIsItalic(false);
    int i13 = fontInfo6.generateStyle();
    int i14 = fontInfo6.getSize();
    java.lang.Object obj15 = fontInfo6.clone();
    boolean b16 = fontInfo6.isBold();
    boolean b17 = fontInfo0.equals((java.lang.Object)fontInfo6);
    boolean b18 = fontInfo0.isBold();
    java.lang.String str19 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    int i24 = fontInfo22.getSize();
    boolean b25 = fontInfo22.isBold();
    fontInfo22.setSize((int)(byte)1);
    fontInfo22.setSize((int)' ');
    boolean b30 = fontInfo22.isItalic();
    fontInfo22.setSize((int)' ');
    boolean b33 = fontInfo22.isBold();
    fontInfo22.setIsBold(true);
    java.awt.Font font36 = fontInfo22.createFont();
    // The following exception was thrown during execution in test generation
    try {
    fontInfo0.setFont(font36);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Monospaced"+ "'", str8.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced"+ "'", str19.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font36);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    boolean b5 = fontInfo0.isBold();
    fontInfo0.setFamily("family");
    fontInfo0.setIsItalic(true);
    fontInfo0.setIsItalic(true);
    boolean b12 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    java.lang.String str5 = fontInfo0.getFamily();
    java.awt.Font font6 = fontInfo0.createFont();
    boolean b7 = fontInfo0.isItalic();
    boolean b9 = fontInfo0.equals((java.lang.Object)(-1));
    java.awt.Font font10 = fontInfo0.createFont();
    fontInfo0.setIsItalic(false);
    java.lang.Object obj13 = fontInfo0.clone();
    FontInfo fontInfo14 = new FontInfo();
    boolean b15 = fontInfo14.isBold();
    java.lang.String str16 = fontInfo14.getFamily();
    boolean b17 = fontInfo14.isBold();
    java.awt.Font font18 = fontInfo14.createFont();
    fontInfo14.setIsBold(true);
    int i21 = fontInfo14.getSize();
    boolean b22 = fontInfo0.equals((java.lang.Object)i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Monospaced"+ "'", str5.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    boolean b3 = fontInfo0.isBold();
    int i4 = fontInfo0.getSize();
    fontInfo0.setSize((int)(byte)0);
    fontInfo0.setIsBold(false);
    java.awt.Font font9 = fontInfo0.createFont();
    boolean b10 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    boolean b3 = fontInfo0.equals((java.lang.Object)100);
    fontInfo0.setFamily("family, 2");
    boolean b6 = fontInfo0.isBold();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    fontInfo0.setSize((int)(byte)100);
    java.lang.String str13 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setFamily("isItalic");
    java.lang.Object obj8 = fontInfo0.clone();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(true);
    java.lang.String str6 = fontInfo0.toString();
    fontInfo0.setSize(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Monospaced, 12, bold"+ "'", str6.equals("Monospaced, 12, bold"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize((int)(byte)1);
    fontInfo0.setSize((int)' ');
    boolean b8 = fontInfo0.isItalic();
    fontInfo0.setSize((int)' ');
    boolean b11 = fontInfo0.isBold();
    boolean b12 = fontInfo0.isBold();
    FontInfo fontInfo13 = new FontInfo();
    boolean b14 = fontInfo13.isBold();
    int i15 = fontInfo13.getSize();
    boolean b16 = fontInfo13.isItalic();
    fontInfo13.setIsBold(false);
    int i19 = fontInfo13.generateStyle();
    fontInfo13.setIsBold(true);
    boolean b22 = fontInfo13.isBold();
    fontInfo13.setIsItalic(false);
    java.awt.Font font25 = fontInfo13.createFont();
    java.awt.Font font26 = fontInfo13.createFont();
    boolean b27 = fontInfo13.isBold();
    java.awt.Font font28 = fontInfo13.createFont();
    boolean b29 = fontInfo0.equals((java.lang.Object)font28);
    // The following exception was thrown during execution in test generation
    try {
    FontInfo fontInfo30 = new FontInfo(font28);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    int i3 = fontInfo0.getSize();
    fontInfo0.setIsBold(false);
    int i6 = fontInfo0.getSize();
    fontInfo0.setSize(12);
    boolean b9 = fontInfo0.isBold();
    FontInfo fontInfo10 = new FontInfo();
    boolean b11 = fontInfo10.isBold();
    int i12 = fontInfo10.getSize();
    boolean b13 = fontInfo10.isItalic();
    java.lang.String str14 = fontInfo10.toString();
    java.lang.String str15 = fontInfo10.toString();
    java.lang.String str16 = fontInfo10.getFamily();
    boolean b17 = fontInfo0.equals((java.lang.Object)str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 12"+ "'", str14.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Monospaced, 12"+ "'", str15.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Monospaced"+ "'", str16.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    int i4 = fontInfo0.getSize();
    boolean b5 = fontInfo0.isBold();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    int i8 = fontInfo6.getSize();
    boolean b9 = fontInfo6.isBold();
    fontInfo6.setSize((int)(byte)1);
    fontInfo6.setSize((int)' ');
    boolean b14 = fontInfo6.isItalic();
    fontInfo6.setSize((int)' ');
    java.lang.Object obj17 = fontInfo6.clone();
    boolean b18 = fontInfo0.equals(obj17);
    fontInfo0.setSize((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    java.lang.String str22 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "family"+ "'", str22.equals("family"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic");
    boolean b6 = fontInfo0.isItalic();
    int i7 = fontInfo0.getSize();
    java.lang.String str8 = fontInfo0.toString();
    FontInfo fontInfo9 = new FontInfo();
    boolean b10 = fontInfo9.isBold();
    java.lang.String str11 = fontInfo9.getFamily();
    boolean b12 = fontInfo9.isBold();
    java.awt.Font font13 = fontInfo9.createFont();
    fontInfo9.setIsBold(true);
    int i16 = fontInfo9.getSize();
    java.lang.Object obj17 = null;
    boolean b18 = fontInfo9.equals(obj17);
    fontInfo9.setSize((int)(short)0);
    boolean b21 = fontInfo0.equals((java.lang.Object)(short)0);
    fontInfo0.setSize(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "isItalic, 12"+ "'", str8.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Monospaced"+ "'", str11.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    java.awt.Font font6 = fontInfo0.createFont();
    fontInfo0.setIsBold(true);
    java.lang.String str9 = fontInfo0.getFamily();
    java.lang.String str10 = fontInfo0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Monospaced"+ "'", str9.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Monospaced, 10, bold"+ "'", str10.equals("Monospaced, 10, bold"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setIsBold(false);
    fontInfo0.setIsItalic(false);
    java.awt.Font font7 = fontInfo0.createFont();
    fontInfo0.setFamily("Monospaced, 12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font7);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    fontInfo0.setSize(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("Monospaced");
    int i5 = fontInfo0.getSize();
    fontInfo0.setIsItalic(true);
    boolean b8 = fontInfo0.isItalic();
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
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setIsItalic(true);
    java.lang.String str7 = fontInfo0.getFamily();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    fontInfo0.setFamily("isBold");
    fontInfo0.setIsBold(true);
    fontInfo0.setIsItalic(false);
    int i9 = fontInfo0.generateStyle();
    boolean b10 = fontInfo0.isBold();
    boolean b11 = fontInfo0.isItalic();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.awt.Font font3 = null;
    boolean b4 = fontInfo0.doesFontMatch(font3);
    int i5 = fontInfo0.generateStyle();
    fontInfo0.setIsBold(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    java.lang.String str4 = fontInfo0.toString();
    FontInfo fontInfo5 = new FontInfo();
    boolean b6 = fontInfo5.isBold();
    java.lang.String str7 = fontInfo5.getFamily();
    boolean b8 = fontInfo5.isBold();
    java.awt.Font font9 = fontInfo5.createFont();
    java.awt.Font font10 = fontInfo5.createFont();
    fontInfo5.setIsBold(true);
    boolean b13 = fontInfo5.isBold();
    java.lang.String str14 = fontInfo5.toString();
    int i15 = fontInfo5.generateStyle();
    fontInfo5.setIsItalic(true);
    java.lang.String str18 = fontInfo5.getFamily();
    java.lang.String str19 = fontInfo5.toString();
    java.awt.Font font20 = fontInfo5.createFont();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = fontInfo0.doesFontMatch(font20);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NoClassDefFoundError")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Monospaced"+ "'", str7.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Monospaced, 12, bold"+ "'", str14.equals("Monospaced, 12, bold"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Monospaced"+ "'", str18.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Monospaced, 12, bold, italic"+ "'", str19.equals("Monospaced, 12, bold, italic"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font20);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    boolean b11 = fontInfo0.isItalic();
    FontInfo fontInfo12 = new FontInfo();
    fontInfo12.setSize((int)(short)-1);
    boolean b15 = fontInfo12.isBold();
    fontInfo12.setSize(10);
    boolean b18 = fontInfo0.equals((java.lang.Object)10);
    java.lang.Object obj19 = fontInfo0.clone();
    boolean b20 = fontInfo0.isBold();
    java.lang.String str21 = fontInfo0.toString();
    FontInfo fontInfo22 = new FontInfo();
    boolean b23 = fontInfo22.isBold();
    java.lang.String str24 = fontInfo22.getFamily();
    int i25 = fontInfo22.getSize();
    fontInfo22.setIsBold(false);
    int i28 = fontInfo22.getSize();
    java.lang.String str29 = fontInfo22.toString();
    java.lang.String str30 = fontInfo22.getFamily();
    java.lang.Object obj31 = fontInfo22.clone();
    int i32 = fontInfo22.getSize();
    boolean b33 = fontInfo0.equals((java.lang.Object)fontInfo22);
    fontInfo0.setIsItalic(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "family, 12"+ "'", str21.equals("family, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Monospaced"+ "'", str24.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Monospaced, 12"+ "'", str29.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Monospaced"+ "'", str30.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    FontInfo fontInfo0 = new FontInfo();
    fontInfo0.setSize((int)(short)-1);
    boolean b3 = fontInfo0.isBold();
    fontInfo0.setSize(10);
    fontInfo0.setSize((int)(byte)1);
    int i8 = fontInfo0.getSize();
    int i9 = fontInfo0.getSize();
    fontInfo0.setSize((int)(short)-1);
    fontInfo0.setFamily("family, 12, italic");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    boolean b3 = fontInfo0.isItalic();
    java.lang.String str4 = fontInfo0.toString();
    fontInfo0.setIsBold(true);
    int i7 = fontInfo0.generateStyle();
    int i8 = fontInfo0.generateStyle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Monospaced, 12"+ "'", str4.equals("Monospaced, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    int i2 = fontInfo0.getSize();
    java.lang.Object obj3 = fontInfo0.clone();
    java.awt.Font font4 = fontInfo0.createFont();
    fontInfo0.setSize((int)'4');
    fontInfo0.setIsBold(false);
    java.lang.Object obj9 = fontInfo0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    FontInfo fontInfo0 = new FontInfo();
    boolean b1 = fontInfo0.isBold();
    java.lang.String str2 = fontInfo0.getFamily();
    fontInfo0.setFamily("family");
    java.lang.Object obj5 = fontInfo0.clone();
    FontInfo fontInfo6 = new FontInfo();
    boolean b7 = fontInfo6.isBold();
    boolean b9 = fontInfo6.equals((java.lang.Object)100);
    boolean b10 = fontInfo0.equals((java.lang.Object)b9);
    FontInfo fontInfo11 = new FontInfo();
    boolean b12 = fontInfo11.isBold();
    java.lang.String str13 = fontInfo11.getFamily();
    fontInfo11.setFamily("Monospaced");
    int i16 = fontInfo11.getSize();
    fontInfo11.setFamily("isItalic");
    java.lang.String str19 = fontInfo11.toString();
    boolean b20 = fontInfo0.equals((java.lang.Object)fontInfo11);
    java.lang.Object obj21 = fontInfo0.clone();
    fontInfo0.setFamily("isItalic, 12");
    fontInfo0.setFamily("Monospaced, 12, bold");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Monospaced"+ "'", str2.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Monospaced"+ "'", str13.equals("Monospaced"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "isItalic, 12"+ "'", str19.equals("isItalic, 12"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

}
