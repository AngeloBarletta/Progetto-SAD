package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1_it1_livello2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)'a', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    hSLColor0.blend((int)(short)-1, (int)(short)100, (int)(short)-1, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 11);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(-1));
    hSLColor0.initHSLbyRGB(100, 97, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    int i5 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    hSLColor0.setHue(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.blend(1, (int)(byte)0, (int)(byte)10, (float)'a');
    hSLColor0.setLuminence((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)' ', (-1), (int)(byte)10);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue((int)(short)10);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence(127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)0);
    hSLColor0.blend((int)(short)-1, 126, (int)(byte)100, (float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 254);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)' ', 126, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.blend(0, 100, 32, (float)(byte)0);
    hSLColor0.setLuminence(255);
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    hSLColor0.brighten((float)10L);
    hSLColor0.reverseColor();
    hSLColor0.blend((-1), 100, (-1), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)' ', (-1), (int)(byte)10);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 127);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(0, 97, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)0, (int)(byte)10);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 311);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.brighten((float)(short)10);
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)' ', 254, 97);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 254);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.blend((int)(byte)1, 255, 126, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 252);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.blend(1, (int)(byte)0, (int)(byte)10, (float)'a');
    hSLColor0.brighten((float)11);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 175);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(0, 0, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.reverseColor();
    hSLColor0.blend(11, (int)'a', 271, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)(byte)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 127);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend(126, (int)(byte)1, 0, (float)(-1L));
    hSLColor0.initHSLbyRGB(254, (int)(byte)-1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 33);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.blend(0, 100, 32, (float)(byte)0);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 251);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 16);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.blend(100, 271, (int)' ', (float)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 22);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(11);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    hSLColor0.setSaturation(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.brighten((float)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB(126, (int)(short)0, 100);
    hSLColor0.setSaturation(252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.initRGBbyHSL(9, 16, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    hSLColor0.blend((int)(short)0, (int)(short)-1, 0, (float)251);
    hSLColor0.initRGBbyHSL((int)'4', 97, 100);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    hSLColor0.setSaturation(271);
    hSLColor0.setHue((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(10);
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.blend((int)(short)-1, 271, 16, (float)0);
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)' ', (-1), (int)(byte)10);
    hSLColor0.setHue(127);
    hSLColor0.brighten((float)10);
    int i23 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 255);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(-1));
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend(126, (int)(byte)1, 0, (float)(-1L));
    hSLColor0.brighten((float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)' ', 254, 97);
    hSLColor0.setHue(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(254, 100, (int)(short)100);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 126);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(254, 100, (int)(short)100);
    hSLColor0.setHue((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setHue(254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(97);
    hSLColor0.initHSLbyRGB((int)(byte)100, 9, 32);
    hSLColor0.blend((int)(byte)10, 11, (int)(short)0, (float)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.blend(0, 251, (int)(byte)-1, (float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.blend(100, 173, 1, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)0, (int)(byte)10);
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.initHSLbyRGB((int)(short)1, 10, 126);
    hSLColor0.setHue(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB((int)(short)0, 9, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i18 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(94, 127, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 127);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(175, 0, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 252);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.initHSLbyRGB(22, 33, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(100, (int)'#', 33);
    hSLColor0.initHSLbyRGB(97, 126, 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 251);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(255, 254, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setHue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.setSaturation(251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getRed();
    hSLColor0.setSaturation(0);
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    hSLColor0.blend(127, (int)(byte)10, 0, (float)'#');
    hSLColor0.initHSLbyRGB(1, 1, 271);
    hSLColor0.setHue(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(126, (int)(short)0, 311);
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 126);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(126, 271, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(byte)10, 52, (int)(byte)1);
    hSLColor0.blend((-1), (int)'#', (int)(byte)100, (float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(254, 100, (int)(short)100);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 61);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getBlue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getGreen();
    hSLColor0.setSaturation(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(11);
    hSLColor0.setSaturation((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 254);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initHSLbyRGB((int)(byte)10, 35, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)' ', 254, 97);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 98);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setLuminence(271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.blend(1, (int)(byte)0, (int)(byte)10, (float)'a');
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(32);
    hSLColor0.setLuminence((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(97);
    int i7 = hSLColor0.getBlue();
    hSLColor0.setSaturation(127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setSaturation(11);
    hSLColor0.setSaturation(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 22);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 251);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend(126, (int)(byte)1, 0, (float)(-1L));
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initHSLbyRGB(173, 11, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(175, 10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)100, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)'a', 0, 32, (float)1L);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setLuminence((int)(short)10);
    int i16 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)10, 17, 10, (float)126);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 89);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setLuminence((int)(short)10);
    int i16 = hSLColor0.getHue();
    hSLColor0.blend((int)(short)10, 17, 10, (float)126);
    int i22 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 85);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(126);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten((float)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 16);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(126, (int)(short)0, 311);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    hSLColor0.brighten((float)10L);
    hSLColor0.initRGBbyHSL((int)(byte)1, 126, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    hSLColor0.blend((int)(short)0, (int)(short)-1, 0, (float)251);
    hSLColor0.initHSLbyRGB((int)'#', 0, 1);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    hSLColor0.blend((int)(short)0, (int)(short)-1, 0, (float)251);
    hSLColor0.initRGBbyHSL((int)'4', 97, 100);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)'#', (int)(byte)-1, (int)(byte)100, (float)32);
    hSLColor0.setLuminence((int)(short)10);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 185);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.setHue(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i18 = hSLColor0.getHue();
    hSLColor0.setHue(32);
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(126);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getHue();
    hSLColor0.setLuminence(94);
    
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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend(126, (int)(byte)1, 0, (float)(-1L));
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setLuminence((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 252);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(33, 0, 89);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 33);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    hSLColor0.setSaturation(271);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 255);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(254, 100, (int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)32);
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)'#', (int)(byte)-1, (int)(byte)100, (float)32);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 185);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(33, 0, 89);
    hSLColor0.brighten((float)(byte)0);
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 45);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getBlue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(271, 33, 127);
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.initRGBbyHSL((int)(short)0, 127, 1);
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1);
    hSLColor0.setSaturation(251);
    int i14 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)(byte)100, (-1), 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 251);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(32);
    hSLColor0.initRGBbyHSL((int)(byte)1, (int)(byte)100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    int i18 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(0, 311, (int)(byte)-1);
    hSLColor0.initHSLbyRGB(0, 252, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 252);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    int i18 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(0, 311, (int)(byte)-1);
    hSLColor0.initRGBbyHSL((int)(short)100, 1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 252);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(97, 0, 61);
    hSLColor0.initHSLbyRGB((-255), 32, 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(11);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 16);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.blend((-1), 52, (int)(short)10, (float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((int)(byte)10, 52, (int)(byte)1);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(10);
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    int i18 = hSLColor0.getRed();
    int i19 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)'4', 33, 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(52, 252, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(9);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getBlue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)'#');
    hSLColor0.blend(17, (int)(byte)10, 254, (float)(-1L));
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, (int)'4', (int)'4');
    hSLColor0.setSaturation(32);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 59);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 16);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.blend(0, 100, 32, (float)(byte)0);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)33);
    hSLColor0.setHue(94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(97);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)(short)-1, 0, (int)(byte)0);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(85, 255, (int)(short)10, (float)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-255));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(126);
    int i6 = hSLColor0.getHue();
    hSLColor0.blend(1, (int)'4', (int)(short)1, (float)(byte)-1);
    
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.blend(271, 254, 311, (float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(32);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.initRGBbyHSL(100, (int)'#', 0);
    hSLColor0.setHue(89);
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(173, 11, 52);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.setLuminence(252);
    hSLColor0.initRGBbyHSL(53, (int)(byte)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL(0, (int)(byte)1, 10);
    hSLColor0.initHSLbyRGB(22, 97, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setLuminence((int)(short)10);
    int i16 = hSLColor0.getHue();
    hSLColor0.brighten((float)(-1));
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.setSaturation(97);
    hSLColor0.setSaturation((int)(byte)10);
    int i18 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 271);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.blend((int)'4', 252, 127, (float)(-1));
    hSLColor0.setHue(52);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 127);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, (int)'4', (int)'4');
    hSLColor0.setSaturation(32);
    hSLColor0.initHSLbyRGB(175, 254, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(byte)1, 311, 100);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 156);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'4');
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 173);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(byte)-1);
    int i11 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.brighten((float)(short)10);
    int i6 = hSLColor0.getRed();
    
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(33, 0, 89);
    hSLColor0.brighten((float)(byte)0);
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(0, 127, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 89);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)100);
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(byte)0);
    hSLColor0.brighten((float)271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)100);
    int i5 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 125);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.initRGBbyHSL((int)(short)0, 127, 1);
    hSLColor0.initRGBbyHSL(0, 89, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    hSLColor0.blend(16, 1, (int)(short)100, (float)(byte)100);
    hSLColor0.initRGBbyHSL(126, (int)(byte)10, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(126);
    int i6 = hSLColor0.getGreen();
    
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(97, 254, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(1, (int)(byte)100, (int)'a');
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.setSaturation((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(byte)-1);
    int i11 = hSLColor0.getGreen();
    hSLColor0.brighten((float)53);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)254);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setSaturation(11);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getRed();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 17);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.initHSLbyRGB((int)(short)1, 10, 126);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getBlue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)0);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(33, 33, 126);
    hSLColor0.setLuminence(251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.blend((int)(byte)-1, (int)(byte)0, (int)(byte)10, (float)10);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(byte)1);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(94);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 94);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.setLuminence(127);
    int i6 = hSLColor0.getGreen();
    hSLColor0.blend((int)'4', 252, 127, (float)(-1));
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 127);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    hSLColor0.blend(127, (int)(byte)10, 0, (float)'#');
    hSLColor0.setSaturation((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)(-1));
    hSLColor0.initHSLbyRGB(11, (int)(short)100, 185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)32);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, (int)'4', (int)'4');
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)' ', (-1), (int)(byte)10);
    hSLColor0.setHue(127);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 127);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    hSLColor0.setSaturation(252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(-1));
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setSaturation(185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 126);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initHSLbyRGB(17, 0, 251);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.blend(185, (int)(byte)-1, 311, (float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 126);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(byte)-1);
    int i11 = hSLColor0.getGreen();
    hSLColor0.blend(22, 22, (int)' ', (float)127);
    hSLColor0.brighten((float)59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, (int)(short)1, (int)' ', (float)(-1L));
    hSLColor0.brighten((float)98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setSaturation((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    hSLColor0.setSaturation(97);
    hSLColor0.setHue(127);
    hSLColor0.brighten((float)32);
    hSLColor0.initHSLbyRGB(16, 10, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)' ');
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getBlue();
    hSLColor0.setHue(173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    hSLColor0.setHue((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend((int)(short)100, 127, (int)(short)-1, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.brighten(0.0f);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)1, (int)(byte)-1, (int)' ', (float)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, (int)'4', (int)'4');
    hSLColor0.initHSLbyRGB(32, (int)(short)10, 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence(97);
    hSLColor0.initHSLbyRGB((int)(byte)100, 9, 32);
    hSLColor0.setLuminence(98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(100);
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB(175, 254, 125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB((int)(short)-1, 251, (int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1);
    hSLColor0.setSaturation(251);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 55);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, (int)' ', (int)(short)10);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)-1);
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.blend(89, (int)(byte)-1, 0, (float)22);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 260);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(126);
    hSLColor0.blend(251, (int)(short)-1, (int)(byte)1, (float)0L);
    int i11 = hSLColor0.getBlue();
    
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
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getBlue();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)'#');
    hSLColor0.blend(17, (int)(byte)10, 254, (float)(-1L));
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    int i4 = hSLColor0.getGreen();
    hSLColor0.brighten((-1.0f));
    hSLColor0.initHSLbyRGB(10, (int)'a', 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);
    
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
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setHue((int)(byte)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(11, 271, (int)'#');
    hSLColor0.setLuminence((int)(short)10);
    int i16 = hSLColor0.getHue();
    hSLColor0.brighten((float)(-1));
    int i19 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(85, 59, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(126);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getBlue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(short)-1, (int)(short)-1);
    hSLColor0.initHSLbyRGB(127, 1, (int)(byte)10);
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)32);
    hSLColor0.setSaturation(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 251);

  }

}
