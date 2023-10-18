package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it2_livello3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(short)10, (int)(short)100, (int)(short)1, (float)'4');
    
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

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 311);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getSaturation();
    
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    hSLColor0.brighten((float)(short)0);
    
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getGreen();
    
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


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

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(35);
    
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(100);
    
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


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
    hSLColor0.setHue((int)(short)10);
    
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

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getLuminence();
    
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.initHSLbyRGB(311, (int)(short)10, 170);
    
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(35, 35, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    hSLColor0.initHSLbyRGB(127, (int)(short)100, 50);
    
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
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

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    hSLColor0.brighten((float)8);
    
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, (int)'a', (-1), (float)(-1L));
    hSLColor0.brighten((float)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getSaturation();
    
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.initRGBbyHSL((int)'4', (int)'#', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)-1);
    
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


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
    hSLColor0.initHSLbyRGB(0, 32, 21);
    
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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)100, 311, (int)(byte)100, (float)50);
    
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((int)'#', 127, (int)(short)-1, (float)1L);
    
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue((int)(short)10);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


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
    int i11 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)-1, 52, (int)'a');
    
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
    org.junit.Assert.assertTrue(i11 == 127);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


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
    hSLColor0.setSaturation(8);
    
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

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


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
    hSLColor0.brighten((float)35);
    hSLColor0.setSaturation(100);
    
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

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence(170);
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 170);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


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
    hSLColor0.initHSLbyRGB(26, (int)(byte)1, 20);
    
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

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 249);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getSaturation();
    hSLColor0.setHue(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.initRGBbyHSL(156, 8, 0);
    
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


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
    hSLColor0.brighten((float)26);
    
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

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


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
    int i22 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i22 == 126);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    int i9 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


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
    hSLColor0.setSaturation((int)'4');
    
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 16);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)-1, (int)(short)0, (int)'4');
    hSLColor0.initRGBbyHSL(0, 128, 50);
    hSLColor0.blend(5, 240, 26, (float)127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


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
    hSLColor0.blend((int)(short)100, (int)(short)100, 52, (float)(short)100);
    int i24 = hSLColor0.getRed();
    hSLColor0.blend(97, (int)(short)0, 115, (float)35);
    
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
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.brighten(0.0f);
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(35, (int)(short)1, (-1));
    hSLColor0.setLuminence((int)(byte)100);
    
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getGreen();
    
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'4', (int)(short)-1);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setHue(10);
    
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
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


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
    int i19 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i19 == 4);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(128);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 127);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'4', (int)(short)-1);
    hSLColor0.initHSLbyRGB(162, (int)(short)10, 4);
    
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)'a');
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(2, 52, 0);
    hSLColor0.initHSLbyRGB(20, 5, 16);
    
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
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.blend(89, 0, 126, (float)(short)1);
    hSLColor0.initRGBbyHSL((int)'#', 20, 240);
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(10);
    
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.blend((int)'#', 35, 1, (float)1L);
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 240);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


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
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 128);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.brighten((float)21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


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
    hSLColor0.blend(170, 0, 21, (float)35);
    
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

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)-1);
    hSLColor0.setSaturation(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(5, 1, (int)(byte)1);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    int i7 = hSLColor0.getSaturation();
    
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(3, 35, (int)(byte)-1);
    
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.brighten((float)265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.initRGBbyHSL(50, 311, (int)'4');
    hSLColor0.initHSLbyRGB(18, (int)(short)1, 240);
    int i21 = hSLColor0.getSaturation();
    int i22 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 173);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(16, (int)'a', (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.brighten((float)21);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 255);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence(170);
    int i6 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


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
    hSLColor0.initRGBbyHSL((int)(short)1, 5, 170);
    hSLColor0.setSaturation(1);
    
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    hSLColor0.setSaturation(127);
    hSLColor0.initHSLbyRGB(126, 0, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(short)100);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 128);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


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
    hSLColor0.initHSLbyRGB((int)'4', 1, (int)(byte)10);
    hSLColor0.initRGBbyHSL(311, (int)' ', 21);
    hSLColor0.initRGBbyHSL((int)(short)1, (int)(short)1, 18);
    
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
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    int i17 = hSLColor0.getSaturation();
    
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 127);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


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
    hSLColor0.initHSLbyRGB((int)(short)100, 249, (int)' ');
    
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    hSLColor0.setHue(89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(5, 1, (int)(byte)1);
    hSLColor0.setHue(18);
    
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(0, 100, (int)(byte)100);
    hSLColor0.setSaturation(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


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
    int i23 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)1, (int)(byte)1, 23, (float)765);
    
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
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


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
    hSLColor0.setSaturation(3);
    
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.setHue(265);
    hSLColor0.initRGBbyHSL(35, 2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getRed();
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    
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

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence(35);
    
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
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    hSLColor0.setHue(5);
    hSLColor0.brighten((float)(short)10);
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(126);
    hSLColor0.setLuminence(765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(100, 128, (int)'#');
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 17);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


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
    hSLColor0.blend((int)(short)100, (int)(short)100, 52, (float)(short)100);
    int i24 = hSLColor0.getRed();
    hSLColor0.setHue(252);
    
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
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    hSLColor0.initRGBbyHSL(126, 2, 2);
    
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getRed();
    hSLColor0.setSaturation(240);
    
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
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getRed();
    
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(52);
    
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)'a');
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


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
    int i11 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(byte)1);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.brighten((float)2);
    
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


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
    int i18 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i18 == 311);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


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
    hSLColor0.initRGBbyHSL(170, 16, 4);
    
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


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
    int i19 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(1, 17, 16);
    
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
    org.junit.Assert.assertTrue(i19 == 127);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.setSaturation(8);
    hSLColor0.initHSLbyRGB((int)(byte)100, 249, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getHue();
    hSLColor0.setSaturation(0);
    int i9 = hSLColor0.getRed();
    
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

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


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
    int i19 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.setSaturation(0);
    
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    hSLColor0.initHSLbyRGB(89, (int)(byte)0, 0);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


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
    hSLColor0.setHue((int)(byte)100);
    
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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.blend(0, 35, 0, (float)10L);
    
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
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.initRGBbyHSL(50, 311, (int)'4');
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 94);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initRGBbyHSL(311, 20, 311);
    hSLColor0.setHue(2);
    int i16 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i16 == 311);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)2);
    hSLColor0.brighten((float)18);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)(-1L));
    int i14 = hSLColor0.getRed();
    
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.setHue(265);
    hSLColor0.setHue(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(128, 3, 101);
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)252);
    hSLColor0.setHue((int)(byte)10);
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getGreen();
    
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(1, 1, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    hSLColor0.setLuminence(32);
    hSLColor0.initHSLbyRGB(0, (int)(byte)100, 8);
    hSLColor0.setHue(8);
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(23, 0, (int)(short)-1);
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 23);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'4', (int)(short)-1);
    hSLColor0.setLuminence(173);
    
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
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


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
    hSLColor0.setHue(252);
    
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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setSaturation(97);
    hSLColor0.reverseColor();

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    hSLColor0.setLuminence((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


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
    int i23 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(17, 18, 32);
    
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
    org.junit.Assert.assertTrue(i23 == 8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


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
    hSLColor0.brighten(1.0f);
    int i24 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i24 == 5);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


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
    int i22 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB(32, (int)' ', 8);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.blend(0, (int)(byte)-1, (int)' ', (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 172);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    hSLColor0.setHue(311);
    int i18 = hSLColor0.getHue();
    hSLColor0.setLuminence(12);
    hSLColor0.blend(97, 128, 0, (float)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 56);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(50);
    hSLColor0.setLuminence((int)'#');
    
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, (int)'a', (-1), (float)(-1L));
    hSLColor0.brighten((float)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(9, 12, 5);
    
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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


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
    int i28 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i28 == 128);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.initHSLbyRGB(0, 2, 10);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.setHue(265);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    hSLColor0.setHue(101);
    
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, 8, 127, 0.0f);
    hSLColor0.blend(10, 115, 8, (float)2);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)1, 240, 8);
    hSLColor0.initRGBbyHSL(52, 0, 101);
    
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

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)'a');
    
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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.initRGBbyHSL(8, 0, (int)(byte)10);
    hSLColor0.setLuminence(97);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
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
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.initRGBbyHSL(32, 126, 35);
    hSLColor0.setHue(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(128, 100, 0);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 128);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, 252, (int)(short)1);
    hSLColor0.setHue((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((-701), 84, 127);
    
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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.blend(101, 26, (int)(byte)10, (float)249);
    
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
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


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
    int i20 = hSLColor0.getGreen();
    int i21 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 311);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(126);
    hSLColor0.setHue(21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)-1, (int)(short)0, (int)'4');
    hSLColor0.setSaturation(162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    hSLColor0.setHue(311);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


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
    int i17 = hSLColor0.getGreen();
    hSLColor0.setSaturation(97);
    hSLColor0.setLuminence(0);
    int i22 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


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
    hSLColor0.setSaturation(162);
    
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    hSLColor0.setSaturation(170);
    hSLColor0.brighten((float)255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, 101, (int)(short)0);
    
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

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


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
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(170, (int)(byte)1, 32, (float)206);
    
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
    org.junit.Assert.assertTrue(i17 == 83);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)1);
    
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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(255, 170, 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 137);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    
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
    org.junit.Assert.assertTrue(i13 == 26);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(311);
    hSLColor0.brighten((float)173);
    hSLColor0.initHSLbyRGB(50, 20, 52);
    
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
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


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
    hSLColor0.setSaturation(97);
    
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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence(10);
    hSLColor0.setSaturation(170);
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.setHue(265);
    hSLColor0.brighten((float)(-701));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.initHSLbyRGB(311, (int)(short)0, (int)(byte)10);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 398);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(33, 0, 97);
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(128);
    
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.brighten((float)21);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(5, (int)(short)100, 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, 32, 18, (float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(8, (int)(byte)1, (int)(byte)10);
    
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
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getRed();
    
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB(32, (int)' ', 8);
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

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setLuminence((int)(byte)1);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(128);
    hSLColor0.initRGBbyHSL(1, 42, 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(1, 126, 89);
    hSLColor0.setHue(50);
    hSLColor0.setHue(115);
    int i16 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(52);
    
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


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
    int i21 = hSLColor0.getLuminence();
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)-1, 17, 173);
    hSLColor0.initHSLbyRGB(138, (int)(short)10, 52);
    
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
    org.junit.Assert.assertTrue(i21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)-1);
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.blend(137, 170, 2, (float)127);
    hSLColor0.initRGBbyHSL(156, (int)'a', 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(156);
    
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(byte)-1);
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setLuminence(52);
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getBlue();
    
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
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.brighten((float)(-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


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
    hSLColor0.setLuminence((int)(short)0);
    
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(9, 10, 115);
    
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, (int)'a', (-1), (float)(-1L));
    hSLColor0.brighten((float)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    hSLColor0.setSaturation(94);
    int i15 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i15 == 16);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


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
    hSLColor0.setSaturation(0);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(1, 126, 89);
    hSLColor0.initRGBbyHSL((int)'a', 23, 115);
    int i16 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i16 == 125);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initRGBbyHSL(311, 20, 311);
    hSLColor0.setHue(128);
    int i16 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.initRGBbyHSL(94, 0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(173, (int)'#', (int)(byte)0);
    int i15 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(252, 0, 1);
    hSLColor0.initHSLbyRGB((-701), 255, 83);
    hSLColor0.setLuminence(172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)2);
    hSLColor0.brighten((float)10);
    hSLColor0.setSaturation(0);
    
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


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
    int i20 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(5, 16, (int)(byte)-1);
    hSLColor0.blend((int)(short)1, 249, 172, (float)18);
    hSLColor0.initHSLbyRGB(56, 50, 252);
    
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
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


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
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.initRGBbyHSL(50, 311, (int)'4');
    int i17 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(101, (-701), 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 115);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


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
    hSLColor0.initRGBbyHSL(10, 0, 26);
    hSLColor0.setHue(128);
    
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

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    hSLColor0.brighten((float)84);
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
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.blend(0, (int)(byte)0, 5, (float)100L);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation(240);
    
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initRGBbyHSL(311, 20, 311);
    hSLColor0.setHue(128);
    int i16 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 20);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


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
    int i26 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i26 == 50);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


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
    hSLColor0.brighten((float)(-1L));
    
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

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


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
    int i24 = hSLColor0.getHue();
    int i25 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 224);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(156, 17, 252);
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
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 156);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 84);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    hSLColor0.setLuminence(32);
    hSLColor0.initRGBbyHSL((int)(byte)100, 8, (int)(short)-1);
    
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(1, 126, 89);
    hSLColor0.setHue(50);
    hSLColor0.setHue(115);
    hSLColor0.setSaturation(17);
    
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


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
    hSLColor0.initRGBbyHSL((int)(byte)-1, (int)(short)10, (int)(byte)-1);
    
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
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.blend(0, (int)(byte)0, 5, (float)100L);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.brighten((-1.0f));
    int i9 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


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
    int i20 = hSLColor0.getRed();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(206, (int)(byte)10, 115);
    
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

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(21, 32, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(240, 56, 4);
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


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
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getGreen();
    hSLColor0.blend((-10), 10, (int)'a', (float)'#');
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.initRGBbyHSL(35, 0, 137);
    hSLColor0.brighten((float)(short)100);
    int i14 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    hSLColor0.setHue(16);
    hSLColor0.initRGBbyHSL(89, 83, 32);
    
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
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
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
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


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
    hSLColor0.blend((-701), 0, 10, (float)86);
    
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
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


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
    hSLColor0.blend((int)(short)100, (int)(short)100, 52, (float)(short)100);
    int i24 = hSLColor0.getRed();
    hSLColor0.setLuminence(127);
    
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
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)26);
    hSLColor0.initHSLbyRGB(8, 4, 172);
    
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
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i13 == 126);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


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
    hSLColor0.blend((int)(short)10, 97, 240, (float)128);
    int i21 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i21 == 240);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.setHue(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)'a');
    int i9 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL(115, 18, 20);
    hSLColor0.setSaturation(101);
    
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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


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
    hSLColor0.setLuminence(127);
    
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
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.blend((int)(byte)1, 4, 4, (float)(byte)0);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 147);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.blend((int)(byte)1, 4, 4, (float)(byte)0);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getRed();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 147);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


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
    hSLColor0.brighten((float)35);
    int i20 = hSLColor0.getGreen();
    int i21 = hSLColor0.getSaturation();
    int i22 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i20 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 77);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.brighten((float)100L);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.brighten((float)21);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(0, (int)(byte)-1, (int)(byte)1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


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
    hSLColor0.setSaturation(265);
    
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

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(85, (int)' ', 137);
    
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
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    hSLColor0.setHue(311);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


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
    hSLColor0.brighten(0.0f);
    int i19 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i19 == 18);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'4', (int)(short)-1);
    int i12 = hSLColor0.getHue();
    hSLColor0.setSaturation(311);
    
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
    org.junit.Assert.assertTrue(i12 == 23);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i10 == 127);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.setLuminence(52);
    int i9 = hSLColor0.getGreen();
    
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
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, 8, 127, 0.0f);
    hSLColor0.blend((-10), 224, 5, (float)97);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.brighten((float)97);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(byte)0, 8);
    hSLColor0.setLuminence(100);
    
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
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.blend(83, (int)(short)10, (int)(byte)0, (float)33);
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    hSLColor0.setHue((int)(short)100);
    
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
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(17);
    
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
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)100);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


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
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


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
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


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
    hSLColor0.brighten(0.0f);
    int i19 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i19 == 35);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


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
    hSLColor0.reverseColor();
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.initRGBbyHSL(32, 0, 8);
    hSLColor0.brighten((float)56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)-1, 10, (int)(byte)10, 1.0f);
    int i16 = hSLColor0.getLuminence();
    hSLColor0.setHue(21);
    
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    int i17 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getGreen();
    hSLColor0.setSaturation(100);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


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
    hSLColor0.blend((int)(short)10, 97, 240, (float)128);
    hSLColor0.initRGBbyHSL(0, 32, (int)(short)-1);
    
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
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 20, (int)' ', (float)53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 8);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.reverseColor();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


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
    hSLColor0.setSaturation((int)(byte)-1);
    int i30 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(127);
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(100, (int)(byte)-1, (int)(short)1);
    int i6 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB(20, (int)(byte)-1, 127);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 20);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setSaturation(8);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 126);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


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
    int i19 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


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
    hSLColor0.blend(83, (int)' ', 97, 0.0f);
    
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

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)2);
    hSLColor0.brighten((float)10);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB(32, (int)' ', 8);
    hSLColor0.initHSLbyRGB(52, 0, 77);
    
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
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setHue(52);
    int i13 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(17, 252, (int)(byte)1);
    
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    hSLColor0.brighten((float)(short)0);
    hSLColor0.initHSLbyRGB(0, (int)(short)100, 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


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
    hSLColor0.brighten((float)35);
    int i20 = hSLColor0.getGreen();
    int i21 = hSLColor0.getSaturation();
    hSLColor0.setHue(398);
    int i24 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i20 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 175);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.blend((int)(short)-1, (int)(short)10, 101, (float)(byte)-1);
    hSLColor0.setLuminence((-701));
    
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


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
    int i21 = hSLColor0.getLuminence();
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(125);
    
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
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 86);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(86, (int)'#', 1);
    int i10 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.blend(20, 175, (int)(short)10, 0.0f);
    
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)1, (int)(short)1, 311, (float)'4');
    int i15 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'a', 8, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend((int)' ', (int)(byte)-1, (int)(short)1, (float)(byte)-1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)'4', 127);
    
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
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


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
    hSLColor0.setLuminence((int)(byte)0);
    
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

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)252);
    hSLColor0.setLuminence(101);
    int i18 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 206);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


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
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i7 == 127);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    
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
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


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
    hSLColor0.setSaturation((int)(short)1);
    
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(byte)10, (int)(short)0);
    hSLColor0.brighten((float)84);
    hSLColor0.initHSLbyRGB(22, 206, (-10));
    
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


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
    hSLColor0.setSaturation(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)' ');
    hSLColor0.brighten((float)(byte)100);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initHSLbyRGB(35, 175, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


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
    int i11 = hSLColor0.getHue();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


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
    int i21 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(12, (int)(byte)0, (int)(short)1);
    
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
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(100, (int)(byte)1, (int)(short)10, (float)0L);
    hSLColor0.setLuminence(1);
    int i18 = hSLColor0.getBlue();
    hSLColor0.blend(26, 0, 3, (float)17);
    hSLColor0.brighten((float)147);
    int i26 = hSLColor0.getSaturation();
    int i27 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 255);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(18, (int)(short)100, 170, (float)83);
    
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(265, 173, 18);
    hSLColor0.setLuminence((-701));
    
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
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)2);
    hSLColor0.brighten((float)18);
    hSLColor0.reverseColor();
    
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
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(127);
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setSaturation(1);
    
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
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.setLuminence(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    int i6 = hSLColor0.getLuminence();
    
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getLuminence();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


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
    hSLColor0.initHSLbyRGB(33, (-701), 0);
    
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
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(765, 137, 10, (float)(byte)100);
    hSLColor0.blend(2, (int)(short)10, (int)'4', (float)' ');
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 179);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


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
    hSLColor0.setSaturation(100);
    
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
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(23, 0, (int)(short)-1);
    hSLColor0.setSaturation((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 12);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.blend(0, (int)(byte)0, 5, (float)100L);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 170);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


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
    hSLColor0.reverseColor();
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
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


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
    hSLColor0.initRGBbyHSL(0, (int)(short)0, 89);
    
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

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(100, 128, (int)'#');
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(249, 162, 89);
    int i16 = hSLColor0.getGreen();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.reverseColor();
    
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
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)0);
    hSLColor0.initRGBbyHSL((-10), 56, (int)(byte)100);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-10));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getGreen();
    
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
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 12);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


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
    hSLColor0.initRGBbyHSL(311, 4, 179);
    
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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


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
    hSLColor0.blend(23, 52, 26, (float)(byte)10);
    
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
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


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
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(33, 127, 0);
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)1, (int)(short)1, 311, (float)'4');
    int i15 = hSLColor0.getGreen();
    hSLColor0.blend(147, 8, 179, (float)127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


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
    int i24 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i24 == 311);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(170, (int)'a', 5);
    hSLColor0.setHue(0);
    hSLColor0.setSaturation(2);
    
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
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.blend((int)'#', 35, 1, (float)1L);
    int i12 = hSLColor0.getBlue();
    hSLColor0.setLuminence(84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getBlue();
    hSLColor0.setHue(249);
    
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
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'a');
    int i5 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(10, (int)(byte)10, (int)' ');
    int i15 = hSLColor0.getRed();
    int i16 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((-10), 35, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    hSLColor0.brighten((float)84);
    
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
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)-1, 94, 5, (float)(-1L));
    hSLColor0.initRGBbyHSL(18, 44, 249);
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.blend(0, (int)(byte)0, 5, (float)100L);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    
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
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.blend((int)(byte)1, 4, 4, (float)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.brighten((float)21);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 126);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.setLuminence(83);
    hSLColor0.initHSLbyRGB(21, 23, 21);
    
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
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


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
    int i24 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(0, (int)' ', 162);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


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
    hSLColor0.setSaturation(0);
    
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

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


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
    int i24 = hSLColor0.getHue();
    hSLColor0.setHue(252);
    hSLColor0.brighten((float)89);
    
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
    org.junit.Assert.assertTrue(i24 == 8);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.initHSLbyRGB(128, 16, 4);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 66);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


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
    hSLColor0.blend(18, 53, 240, (float)170);
    
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

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setHue((-1));
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(115, 35, 4);
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB((int)(short)0, 89, 175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 115);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


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
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i18 == 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 96);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(100, 128, (int)'#');
    hSLColor0.setSaturation(240);
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


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
    hSLColor0.setSaturation(84);
    
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

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)'a');
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(97);
    
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
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    
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
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.setLuminence(12);
    
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
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    int i11 = hSLColor0.getGreen();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setLuminence(52);
    int i7 = hSLColor0.getLuminence();
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

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    
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

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


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
    int i24 = hSLColor0.getHue();
    int i25 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i24 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 230);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.setLuminence(83);
    int i17 = hSLColor0.getHue();
    int i18 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i17 == 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 89);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


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
    hSLColor0.initRGBbyHSL(9, 115, (int)(byte)-1);
    hSLColor0.initRGBbyHSL((int)'4', (int)(byte)1, (int)(byte)10);
    
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
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)-1);
    hSLColor0.blend(101, 11, 100, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(230, 86, (int)'a', (float)(short)10);
    
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
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(765, 137, 10, (float)(byte)100);
    hSLColor0.blend(2, (int)(short)10, (int)'4', (float)' ');
    hSLColor0.brighten((float)765);
    
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
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i13 == 265);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(311);
    hSLColor0.setSaturation(52);
    hSLColor0.setSaturation(89);
    
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
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(173, (int)'#', (int)(byte)0);
    int i15 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(252, 0, 1);
    hSLColor0.initHSLbyRGB((-701), 255, 83);
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-701));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    hSLColor0.setHue(311);
    int i18 = hSLColor0.getHue();
    hSLColor0.setLuminence(12);
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)18);
    int i12 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    hSLColor0.setLuminence((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setSaturation(97);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 6);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getRed();
    
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
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


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
    int i21 = hSLColor0.getLuminence();
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i21 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 11);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(100, (int)(byte)-1, (int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)0);
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(100, (int)(byte)-1, (int)(short)1);
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 50);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(115, 137, (int)(byte)0);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 137);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


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
    int i16 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
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
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getHue();
    hSLColor0.setHue(20);
    hSLColor0.initHSLbyRGB(33, 0, 10);
    
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
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


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
    hSLColor0.setLuminence(173);
    
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

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(170, (int)'a', 5);
    hSLColor0.setHue(0);
    hSLColor0.setSaturation(18);
    
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
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getRed();
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(2, 5, 4);
    int i14 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    hSLColor0.setHue(5);
    int i4 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)0);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    hSLColor0.setHue(44);
    
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
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    int i12 = hSLColor0.getBlue();
    hSLColor0.setHue(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(5);
    hSLColor0.reverseColor();
    hSLColor0.setHue(115);
    
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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


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
    hSLColor0.setSaturation(170);
    hSLColor0.setLuminence(26);
    
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
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(170, (int)'a', 5);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)1);
    
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
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


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
    int i26 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i26 == 55);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(265, 173, 18);
    hSLColor0.setLuminence(9);
    hSLColor0.setSaturation((int)(short)1);
    
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
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getRed();
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(765, (int)'#', 17);
    hSLColor0.initRGBbyHSL(86, 127, 35);
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getRed();
    hSLColor0.setLuminence(44);
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.setHue(179);
    
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
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.brighten((float)97);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(byte)0, 8);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getSaturation();
    
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
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    hSLColor0.setLuminence(206);
    
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
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue(20);
    hSLColor0.setSaturation(8);
    hSLColor0.blend((int)' ', (int)(byte)-1, 170, (float)84);
    hSLColor0.initHSLbyRGB((-1), 5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    hSLColor0.setHue(5);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.brighten((float)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(short)100);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 80);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten(10.0f);
    hSLColor0.brighten((float)(short)100);
    int i8 = hSLColor0.getSaturation();
    
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
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(12, 50, 8);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setHue(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 8);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'a');
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(byte)100, 240, 56, (float)23);
    
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
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


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
    hSLColor0.setSaturation(0);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(byte)10);
    
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
    org.junit.Assert.assertTrue(i19 == 16);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


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
    hSLColor0.setHue(94);
    int i24 = hSLColor0.getHue();
    int i25 = hSLColor0.getLuminence();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence((int)(short)10);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)50);
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', (int)(byte)100, 35);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)10);
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
    org.junit.Assert.assertTrue(i9 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    hSLColor0.initRGBbyHSL(10, 1, (int)'a');
    int i17 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getBlue();
    int i3 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


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
    int i27 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i27 == 53);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


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
    hSLColor0.initRGBbyHSL((int)(short)1, 5, 170);
    int i25 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i25 == 168);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    hSLColor0.setHue((int)(short)10);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 260);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(byte)-1, (float)100);
    hSLColor0.setHue((int)(short)10);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(5, (int)(short)10, (int)(short)1);
    hSLColor0.initRGBbyHSL(50, 311, (int)'4');
    int i17 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(0, 8, (int)'4');
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 8);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


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
    int i17 = hSLColor0.getGreen();
    hSLColor0.setSaturation(97);
    hSLColor0.setLuminence(0);
    hSLColor0.blend(125, 55, 55, (float)23);
    
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
    org.junit.Assert.assertTrue(i17 == 32);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(765);
    hSLColor0.brighten((float)9);
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


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
    hSLColor0.setHue(50);
    hSLColor0.initRGBbyHSL(265, 260, 0);
    
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
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


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
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(311);
    hSLColor0.setLuminence(12);
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getGreen();
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 9);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    hSLColor0.reverseColor();

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)0);
    hSLColor0.initRGBbyHSL((-10), 56, (int)(byte)100);
    hSLColor0.blend(44, 126, 138, 0.0f);
    
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
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


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
    hSLColor0.initRGBbyHSL(8, 4, 0);
    hSLColor0.blend(32, (-701), 35, (float)230);
    
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

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence(115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)23);
    hSLColor0.initRGBbyHSL(125, 12, 127);
    int i19 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i19 == 125);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


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
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 170);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


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
    int i17 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i17 == 43);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


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
    hSLColor0.blend(137, 32, (int)(byte)100, 0.0f);
    hSLColor0.initHSLbyRGB(18, 101, 170);
    hSLColor0.setSaturation(86);
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
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 97);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


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
    int i29 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i29 == 18);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


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
    int i18 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i18 == 36);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(127);
    hSLColor0.brighten(100.0f);
    hSLColor0.blend(3, 138, 260, (float)147);
    
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
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'a', 128, 0);
    hSLColor0.blend(0, 5, (int)(short)100, 0.0f);
    int i21 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.blend(16, (int)(short)-1, 311, (float)(-1));
    int i11 = hSLColor0.getHue();
    
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

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


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
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(11, 127, 101);
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(1, 126, 89);
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
    org.junit.Assert.assertTrue(i12 == 89);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    hSLColor0.blend((int)(short)10, 137, 56, (float)(short)10);
    hSLColor0.setSaturation(85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.brighten((float)100L);
    hSLColor0.initRGBbyHSL(311, (int)(short)10, 17);
    hSLColor0.setHue(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


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
    int i27 = hSLColor0.getRed();
    
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

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.blend(4, 5, 9, (float)32);
    int i16 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i16 == 5);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'#', (int)(short)100, (float)21);
    int i6 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 51);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(125, 249, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 137);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(127);
    hSLColor0.initHSLbyRGB((int)(short)-1, 36, 55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.brighten((float)97);
    hSLColor0.initRGBbyHSL(1, 249, 100);
    hSLColor0.brighten((float)126);
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'a', 128);
    hSLColor0.setHue(311);
    int i20 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i20 == 56);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, 10, (int)(short)0, (float)(byte)1);
    hSLColor0.brighten((float)170);
    int i17 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


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
    int i22 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(170);
    
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
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


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
    hSLColor0.setHue(26);
    hSLColor0.setHue(84);
    
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
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(765, (int)'#', 17);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i12 == (-701));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 391);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(172);
    
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
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.brighten((float)77);
    
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
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initHSLbyRGB((int)(short)100, 100, (int)(byte)0);
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 42);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    hSLColor0.blend((int)'#', 35, 1, (float)1L);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 240);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)10);
    
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
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


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
    hSLColor0.initHSLbyRGB(3, 44, (int)(short)10);
    int i25 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i25 == 222);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getLuminence();
    
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
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(35, (int)(short)1, (-1));
    hSLColor0.blend((int)(byte)0, (int)(short)10, 18, (float)162);
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
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.brighten((float)35);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'#');
    hSLColor0.setSaturation(55);
    
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

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(-1));
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(-10));
    
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
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    int i10 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.blend(89, 0, 126, (float)(short)1);
    int i19 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 126);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend((-1), (int)'4', 0, (float)(byte)100);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(8);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)1);
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)10, 23, (int)(byte)10);
    int i9 = hSLColor0.getHue();
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
    org.junit.Assert.assertTrue(i9 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(100, 0, 10);
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (-1), (int)(byte)0);
    hSLColor0.brighten((float)(byte)0);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(50);
    hSLColor0.initRGBbyHSL(170, (-10), 398);
    
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
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


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
    hSLColor0.initHSLbyRGB(156, (int)(byte)100, 50);
    hSLColor0.setLuminence(53);
    
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

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)-1, (int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


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
    hSLColor0.reverseColor();
    
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
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue(18);
    hSLColor0.setHue((int)'4');
    hSLColor0.setLuminence(101);
    hSLColor0.setSaturation((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


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
    int i32 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL((int)(short)-1, 100, (int)'#');
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)'4', (int)(byte)10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)100);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)-1);
    int i10 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)-1);
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setLuminence(42);
    
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

}
