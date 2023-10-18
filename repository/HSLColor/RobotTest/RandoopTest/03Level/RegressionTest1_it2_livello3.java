package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1_it2_livello3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(10, 0, (int)(byte)0);
    hSLColor0.initRGBbyHSL(2, 127, (int)(byte)100);
    hSLColor0.brighten((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.brighten((float)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 8);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    hSLColor0.setSaturation(94);
    hSLColor0.setSaturation(100);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(249);
    hSLColor0.setHue(84);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.initRGBbyHSL(8, 0, (int)(byte)10);
    hSLColor0.setLuminence(97);
    hSLColor0.initHSLbyRGB(230, 398, 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.blend(0, 50, (int)'a', (float)18);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.initHSLbyRGB(126, (-701), 94);
    hSLColor0.setHue((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.blend(1, 100, (int)'#', (float)10);
    int i28 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    hSLColor0.setHue((int)(short)10);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    hSLColor0.setHue(172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(5);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(128, 84, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(173, (int)'#', (int)(byte)0);
    int i15 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'#', 391, 224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(2, 126, 0);
    hSLColor0.blend((int)(byte)0, 172, 53, 0.0f);
    hSLColor0.initRGBbyHSL(1, (int)(byte)-1, 9);
    int i31 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.blend(52, 100, 115, (float)162);
    int i18 = hSLColor0.getLuminence();
    hSLColor0.setHue(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(2, (int)(short)-1, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)' ', 42, 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)' ');
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)' ');
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    int i8 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    hSLColor0.initHSLbyRGB(398, 170, 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    int i14 = hSLColor0.getHue();
    hSLColor0.blend(125, 249, 53, (float)265);
    hSLColor0.reverseColor();
    hSLColor0.brighten(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.setLuminence((int)(byte)1);
    int i23 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(20, 23, (int)(short)-1);
    hSLColor0.initHSLbyRGB((int)(byte)1, 20, 21);
    int i32 = hSLColor0.getSaturation();
    int i33 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 20);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(77);
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    hSLColor0.initRGBbyHSL(156, 0, (int)(byte)-1);
    hSLColor0.setHue(85);
    hSLColor0.initRGBbyHSL(83, 4, 77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(126);
    hSLColor0.setSaturation(9);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 126);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(2, 126, 0);
    hSLColor0.blend((int)(byte)0, 172, 53, 0.0f);
    int i27 = hSLColor0.getLuminence();
    int i28 = hSLColor0.getGreen();
    int i29 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(8, 265, 240);
    hSLColor0.setHue(0);
    hSLColor0.blend(97, 10, 23, 10.0f);
    hSLColor0.initHSLbyRGB(50, 173, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.initRGBbyHSL(126, 18, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getGreen();
    hSLColor0.setLuminence(18);
    hSLColor0.blend(0, 18, 231, (float)0L);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 22);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.blend((-1), (-1), (int)'4', (float)2);
    int i23 = hSLColor0.getLuminence();
    int i24 = hSLColor0.getHue();
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 170);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getGreen();
    hSLColor0.setLuminence(18);
    int i24 = hSLColor0.getBlue();
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 18);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.initHSLbyRGB(126, (-701), 94);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-701));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    hSLColor0.blend(21, 50, 3, (float)311);
    int i16 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 226);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(18);
    hSLColor0.setSaturation((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(35, 35, (int)(byte)0);
    hSLColor0.setLuminence(2);
    hSLColor0.setHue(115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(8);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(12, 224, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    int i6 = hSLColor0.getGreen();
    hSLColor0.setSaturation(170);
    hSLColor0.initRGBbyHSL(226, 35, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.initRGBbyHSL(35, 0, 137);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 137);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, (int)'a', (-1), (float)(-1L));
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(162, 20, 126);
    hSLColor0.setHue(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    int i12 = hSLColor0.getHue();
    hSLColor0.setSaturation(252);
    hSLColor0.setHue(120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)1, 128, 8);
    hSLColor0.initHSLbyRGB(0, 32, (-1));
    hSLColor0.setSaturation(100);
    hSLColor0.blend(240, (-701), (int)(byte)100, (float)10L);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-520));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(17, 12, 12, (float)50);
    hSLColor0.setLuminence(5);
    hSLColor0.brighten((float)26);
    hSLColor0.setSaturation(16);
    int i23 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(128, 162, 26);
    hSLColor0.blend((int)'#', 260, 249, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.setSaturation(8);
    hSLColor0.blend((int)' ', (int)(byte)-1, 170, (float)84);
    hSLColor0.setSaturation(0);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(255, 138, 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(77);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(249);
    hSLColor0.setHue(84);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(249);
    hSLColor0.blend((-701), 173, 20, (float)138);
    int i19 = hSLColor0.getHue();
    hSLColor0.setHue(254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 120);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(5, 1, (int)(byte)1);
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getRed();
    hSLColor0.setLuminence(231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(255);
    hSLColor0.initHSLbyRGB(179, 20, 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.blend((-1), (int)'#', (int)(short)1, (float)2);
    hSLColor0.blend(0, 127, (int)(byte)-1, (float)9);
    hSLColor0.setHue(86);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(765, 137, 10, (float)(byte)100);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(35, (int)(short)1, (-1));
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 270);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(0, (int)'a', 17);
    hSLColor0.initHSLbyRGB(311, (int)(short)0, 16);
    int i28 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 398);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getLuminence();
    int i19 = hSLColor0.getBlue();
    hSLColor0.setHue(18);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.blend(175, 94, (int)(byte)10, (float)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(17, 12, 12, (float)50);
    hSLColor0.initHSLbyRGB((-10), 128, 17);
    hSLColor0.initRGBbyHSL(11, 0, 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence(1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(1, 162, 21);
    hSLColor0.setLuminence(249);
    hSLColor0.setHue(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.brighten((float)0);
    hSLColor0.initRGBbyHSL((int)(byte)100, 137, 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.blend(52, 100, 115, (float)162);
    hSLColor0.setLuminence(86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    hSLColor0.initRGBbyHSL(100, 100, (int)(short)0);
    int i22 = hSLColor0.getSaturation();
    hSLColor0.setHue(10);
    hSLColor0.initHSLbyRGB(20, (int)(short)10, 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(5);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(172, 77, 17);
    hSLColor0.initRGBbyHSL(43, 96, 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(265);
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)249);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)-1, (int)(short)0, (int)'4');
    hSLColor0.setHue(80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)1, 128, 8);
    hSLColor0.initHSLbyRGB(0, 32, (-1));
    hSLColor0.setSaturation(100);
    hSLColor0.blend(240, (-701), (int)(byte)100, (float)10L);
    int i24 = hSLColor0.getBlue();
    int i25 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 240);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.blend((int)'#', 35, 1, (float)1L);
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, (int)(byte)-1, 128);
    hSLColor0.setHue((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 240);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(26);
    hSLColor0.setLuminence(173);
    int i18 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    hSLColor0.setSaturation(94);
    hSLColor0.setSaturation(100);
    hSLColor0.setSaturation(89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.brighten((float)21);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 255);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend((-1), 252, 172, (float)172);
    int i18 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 114);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(126);
    hSLColor0.setHue(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    hSLColor0.brighten((float)4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(765);
    hSLColor0.brighten((float)9);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(138, 42, 86);
    hSLColor0.setSaturation(230);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setHue(173);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(206, (int)(byte)10, 0);
    int i26 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.setSaturation(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setLuminence(32);
    int i21 = hSLColor0.getHue();
    hSLColor0.setSaturation(0);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setHue((int)'a');
    hSLColor0.initHSLbyRGB(230, 125, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 89);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.setHue(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getRed();
    hSLColor0.blend(265, 26, (int)'a', (float)156);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 26);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getGreen();
    hSLColor0.setSaturation((-701));
    hSLColor0.blend(12, 206, 101, (float)83);
    int i26 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 226);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)1, 128, 8);
    hSLColor0.setHue(5);
    hSLColor0.initRGBbyHSL((int)(byte)0, 226, 137);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 242);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(10, 0, (int)(byte)0);
    hSLColor0.initRGBbyHSL(2, 127, (int)(byte)100);
    hSLColor0.blend(0, 255, 21, 0.0f);
    hSLColor0.brighten((float)18);
    hSLColor0.setSaturation(252);
    hSLColor0.initRGBbyHSL(240, 147, 240);
    hSLColor0.initHSLbyRGB(35, 230, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(8);
    hSLColor0.reverseColor();
    hSLColor0.blend(127, 126, 128, (float)100);
    int i20 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 126);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(5);
    hSLColor0.initHSLbyRGB(126, 0, (int)(byte)10);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 63);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(17, 12, 12, (float)50);
    hSLColor0.setLuminence(5);
    hSLColor0.brighten((float)26);
    hSLColor0.setSaturation(16);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    hSLColor0.setHue(5);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(18);
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 18);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.setLuminence(96);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getLuminence();
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getHue();
    int i21 = hSLColor0.getHue();
    int i22 = hSLColor0.getBlue();
    hSLColor0.setLuminence(162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 249, 18);
    int i22 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.setLuminence(52);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(51);
    hSLColor0.setHue(147);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(5);
    hSLColor0.brighten((float)100);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.initRGBbyHSL(265, (int)(short)0, 52);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(53, 0, 0);
    int i27 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    hSLColor0.setHue(5);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(18);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(128);
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 128);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    int i12 = hSLColor0.getHue();
    hSLColor0.setLuminence(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.blend(12, 255, 32, 100.0f);
    int i18 = hSLColor0.getGreen();
    hSLColor0.setHue(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.initRGBbyHSL(50, 311, (int)'4');
    hSLColor0.setLuminence(0);
    int i19 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)(short)100, 3, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 50);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence(55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)' ');
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    hSLColor0.blend((int)(byte)0, (int)(short)100, 311, (float)(byte)10);
    hSLColor0.initHSLbyRGB(4, 128, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(765, 137, 10, (float)(byte)100);
    hSLColor0.blend(4, (-701), 8, (float)249);
    int i18 = hSLColor0.getRed();
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-346));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getHue();
    hSLColor0.brighten((float)175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'#');
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.initHSLbyRGB(173, 5, 156);
    hSLColor0.initHSLbyRGB(66, 83, (int)(short)10);
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 83);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence(43);
    hSLColor0.blend(398, 85, 33, (float)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)1);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(97);
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(32, 80, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)1, (int)(short)1, 311, (float)'4');
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 156);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)(-1L));
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getHue();
    hSLColor0.setLuminence(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.initRGBbyHSL(32, 0, 8);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(162);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)1);
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.blend(100, 249, (int)(byte)-1, (float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(52, (int)'4', 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.setLuminence(52);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(51);
    hSLColor0.initRGBbyHSL(240, 138, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(94);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 94);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    hSLColor0.initHSLbyRGB((-1), (-1), (int)(short)-1);
    hSLColor0.setLuminence(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)0);
    int i4 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(156, 255, 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    int i6 = hSLColor0.getGreen();
    hSLColor0.setSaturation(170);
    hSLColor0.blend((int)(short)-1, 26, (int)'4', (float)26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 128);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    int i6 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    hSLColor0.blend(21, 240, 89, 0.0f);
    hSLColor0.blend(0, 12, (int)'a', (float)100);
    hSLColor0.setLuminence(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(35, (int)(short)1, (-1));
    hSLColor0.blend((int)(byte)0, (int)(short)10, 18, (float)162);
    int i17 = hSLColor0.getBlue();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 146);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setLuminence(52);
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(765, 89, (int)'#');
    hSLColor0.brighten((float)170);
    hSLColor0.initRGBbyHSL(89, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initHSLbyRGB((int)(short)1, 138, 265);
    hSLColor0.initHSLbyRGB(249, 127, 89);
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 249);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getHue();
    hSLColor0.setLuminence(77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(2, (int)(short)-1, (int)(byte)-1, (float)100);
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getHue();
    hSLColor0.blend(6, 0, 137, (float)127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(5);
    hSLColor0.brighten((float)100);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.initRGBbyHSL(265, (int)(short)0, 52);
    hSLColor0.setLuminence(137);
    int i24 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 137);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setLuminence(0);
    hSLColor0.initHSLbyRGB(53, 128, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)2);
    hSLColor0.setHue(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.brighten((-1.0f));
    hSLColor0.brighten((float)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.setHue((int)' ');
    int i13 = hSLColor0.getHue();
    hSLColor0.blend(100, 162, 56, 0.0f);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(311, 249, 0);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 156);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(100, (int)(byte)-1, (int)(short)1);
    hSLColor0.brighten((float)66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(26);
    hSLColor0.initRGBbyHSL((int)(short)1, 18, 240);
    hSLColor0.setLuminence(85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.setLuminence(52);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(51);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(2, (int)(short)-1, (int)(byte)-1, (float)100);
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getLuminence();
    int i19 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(156, 84, 311);
    hSLColor0.initRGBbyHSL(162, 254, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)(byte)0, 1);
    int i8 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(255);
    hSLColor0.setHue(127);
    hSLColor0.setLuminence(249);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)-1, (int)(short)0, (int)'4');
    hSLColor0.setHue(52);
    hSLColor0.brighten((float)50);
    hSLColor0.initHSLbyRGB(53, 42, 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)'a');
    hSLColor0.initRGBbyHSL((int)'4', (int)(byte)100, 77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(240);
    hSLColor0.setHue(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend((-1), 252, 172, (float)172);
    hSLColor0.blend(1, 252, 5, (float)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(2, (int)(short)-1, (int)(byte)-1, (float)100);
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(170, 1, 56);
    int i25 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 56);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend(162, 84, 97, (float)206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.setLuminence(83);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 127);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(249);
    hSLColor0.blend((-701), 173, 20, (float)138);
    hSLColor0.blend(12, 44, 179, (float)127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)' ');
    int i9 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(17, 12, 12, (float)50);
    hSLColor0.setLuminence(5);
    hSLColor0.brighten((float)252);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i8 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)-1);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(77);
    hSLColor0.brighten((float)270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(16, 96, (int)(byte)10);
    hSLColor0.blend(260, 231, 179, (float)138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)0);
    hSLColor0.initRGBbyHSL((-10), 56, (int)(byte)100);
    hSLColor0.setLuminence((-10));
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(2, 126, 0);
    hSLColor0.blend((int)(byte)0, 172, 53, 0.0f);
    int i27 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(156);
    int i30 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 107);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)1);
    hSLColor0.setLuminence((int)(short)100);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(311, (int)(short)0, 18);
    hSLColor0.initHSLbyRGB(12, 52, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 22);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(270, 0, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(5);
    hSLColor0.brighten((float)100);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.initRGBbyHSL(265, (int)(short)0, 52);
    hSLColor0.reverseColor();
    hSLColor0.blend(1, (-10), 86, 0.0f);
    int i28 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(20, 311, 52);
    int i16 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-10));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(short)10, (int)' ', 126, (float)(byte)1);
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 162);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.blend((-1), (int)'#', (int)(short)1, (float)2);
    hSLColor0.blend(0, 127, (int)(byte)-1, (float)9);
    hSLColor0.initRGBbyHSL(156, 4, (int)(short)-1);
    hSLColor0.blend(84, 168, 206, (float)260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setHue(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setHue(156);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(0, 8, 170);
    int i23 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(265, 126, 170);
    int i28 = hSLColor0.getLuminence();
    int i29 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 126);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    int i20 = hSLColor0.getGreen();
    hSLColor0.setHue(85);
    hSLColor0.setHue(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(765, (int)'#', 17);
    hSLColor0.initHSLbyRGB(249, 8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(5, 1, (int)(byte)1);
    int i14 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)(byte)1, 173, 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(6, (int)(byte)100, 206);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(100, 128, (int)'#');
    int i11 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(42, 83, 137);
    hSLColor0.initRGBbyHSL(16, 255, 3);
    hSLColor0.blend(84, (-10), 5, (float)51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 53);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 44);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.blend((int)'#', 35, 1, (float)1L);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 18);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setLuminence(52);
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(230, 172, 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    hSLColor0.initRGBbyHSL(156, 0, (int)(byte)-1);
    hSLColor0.setSaturation(162);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 156);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.initHSLbyRGB(16, 4, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(765, (int)'#', 17);
    hSLColor0.initRGBbyHSL(86, 127, 35);
    hSLColor0.initRGBbyHSL(100, 53, 252);
    hSLColor0.setHue(85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.brighten((float)97);
    hSLColor0.initRGBbyHSL(1, 249, 100);
    hSLColor0.brighten((float)126);
    hSLColor0.blend(0, 9, 179, (float)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.blend((-1), (int)'#', (int)(short)1, (float)2);
    hSLColor0.blend(0, 127, (int)(byte)-1, (float)9);
    int i33 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(12, 50, 8);
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(23);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 50);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

}
