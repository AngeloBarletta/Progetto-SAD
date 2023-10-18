package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it1_livello2_it2_livello3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(byte)0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.setSaturation(32);
    hSLColor0.blend((-1), 31, (int)(byte)0, 0.0f);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    hSLColor0.initHSLbyRGB(137, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    int i2 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(36, 265, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(short)10, 35);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 104, 10);
    hSLColor0.brighten(10.0f);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(byte)0);
    int i6 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 241);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    hSLColor0.setSaturation((-1));
    hSLColor0.blend(104, 30, (int)' ', (float)0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(1);
    hSLColor0.setLuminence(30);
    hSLColor0.reverseColor();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.setLuminence(31);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 24);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    hSLColor0.blend(100, 30, (int)(short)1, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.blend(100, 100, 96, (float)'4');
    hSLColor0.initRGBbyHSL((int)(short)-1, (int)(short)1, 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 104, 10);
    hSLColor0.setHue(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setSaturation(265);
    hSLColor0.setLuminence((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    hSLColor0.setSaturation(100);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(254, 96, 35);
    hSLColor0.setLuminence(127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 137);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.initHSLbyRGB(265, 16, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.setSaturation(249);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)' ', 32, (int)(short)100);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(59, 170, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 170);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 209);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.setLuminence(31);
    hSLColor0.initRGBbyHSL(16, 50, 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)' ');
    hSLColor0.brighten(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setLuminence(52);
    hSLColor0.brighten((float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(265, 24, 24);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 24);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)-1, 32, 32, 100.0f);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 271);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.setSaturation((int)(short)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 171);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 96);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.setLuminence((int)(byte)-1);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getGreen();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    hSLColor0.blend(16, 30, 137, (float)96);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 77);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)' ', 32, (int)(short)100);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(short)10, 0, 127);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 127);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(59);
    hSLColor0.initHSLbyRGB(265, (int)(short)0, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 54);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 59, 24);
    hSLColor0.brighten((float)'a');
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 59);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 59, 24);
    hSLColor0.brighten((float)'a');
    hSLColor0.setHue(201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 98);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.setLuminence(104);
    hSLColor0.setSaturation(31);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.initRGBbyHSL(241, 0, 77);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(254, 96, 35);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.initRGBbyHSL(245, 96, 249);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 249);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend(209, (int)(byte)-1, 50, (float)241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(235, 30, 24);
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.setHue(127);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.brighten((float)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)(short)10, 265);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 96);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(77, 45, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 36);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(54);
    hSLColor0.setLuminence(16);
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 13);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(265, 24, 24);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 23);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    int i9 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setHue(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getBlue();
    hSLColor0.setHue((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 96);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)0);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setLuminence(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 34);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.brighten((float)209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.setSaturation(32);
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 36);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    hSLColor0.blend(2, 50, 50, (float)(byte)1);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 127);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initRGBbyHSL(96, 0, 104);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 104);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 68);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.brighten((float)(byte)10);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)'#');

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.initRGBbyHSL(10, (int)' ', 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(2, (int)(short)1, 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 16);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)(byte)10);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 104);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.setHue(16);
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 16);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(24, 24, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    hSLColor0.initHSLbyRGB(0, (int)(short)100, (int)'a');
    hSLColor0.setHue((-1));
    int i16 = hSLColor0.getBlue();
    hSLColor0.brighten((float)54);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(251, (int)(short)0, 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 42);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i16 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(254, 0, (int)' ');
    hSLColor0.setSaturation(100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(251, 48, (int)(byte)-1);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.setLuminence((int)(short)1);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 127);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.setLuminence((int)(short)1);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initHSLbyRGB(54, 16, 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initHSLbyRGB(104, (int)(byte)0, 0);
    int i15 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(0, 0, 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    hSLColor0.setHue(68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence(32);
    hSLColor0.setHue(0);
    hSLColor0.setLuminence(245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setLuminence(24);
    hSLColor0.setSaturation(255);
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)' ', 241, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 98);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.setHue(127);
    hSLColor0.reverseColor();

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.initRGBbyHSL(252, 104, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setLuminence((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 16);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.brighten((float)10L);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 104, 10);
    int i6 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 14);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    hSLColor0.setLuminence(127);
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 36);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    int i7 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getRed();
    hSLColor0.setHue((int)'4');
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 2, 0);
    int i16 = hSLColor0.getHue();
    hSLColor0.brighten((float)53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 127);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(24, 49, 42, (float)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(104, 0, (int)(short)0, 0.0f);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 70);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(22, 0, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getHue();
    hSLColor0.setHue((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 224);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.setLuminence((-1));
    int i7 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 96);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setLuminence(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    int i14 = hSLColor0.getRed();
    hSLColor0.brighten((float)(byte)10);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getRed();
    hSLColor0.brighten((float)201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (int)(short)1, (int)(short)0);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.blend(100, 100, 96, (float)'4');
    hSLColor0.brighten((float)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.setHue(127);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.setHue((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)' ');
    hSLColor0.setHue(59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten((float)59);
    hSLColor0.initHSLbyRGB(54, 24, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.initRGBbyHSL(54, 0, 1);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.setHue((int)(byte)-1);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(116, 49, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.setSaturation((int)(short)10);
    int i8 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 254, 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.blend(35, 127, 35, (float)235);
    hSLColor0.initHSLbyRGB(22, 36, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.setSaturation((int)(byte)0);
    hSLColor0.setSaturation((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initRGBbyHSL((int)(short)-1, 209, 48);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.blend(10, 0, 32, 1.0f);
    hSLColor0.initHSLbyRGB((int)(byte)0, (int)' ', (int)(short)10);
    hSLColor0.setHue(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)' ', 32, (int)(short)100);
    int i9 = hSLColor0.getHue();
    hSLColor0.blend(49, 101, 241, (float)(short)-1);
    hSLColor0.setSaturation(54);
    hSLColor0.initHSLbyRGB(241, 252, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 170);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.initHSLbyRGB(10, 171, 96);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.setLuminence(31);
    hSLColor0.brighten((float)251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(54, 209, (int)(byte)-1);
    hSLColor0.setSaturation(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.blend(96, 59, 171, 0.0f);
    hSLColor0.initHSLbyRGB((int)(byte)-1, 23, (int)(short)100);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 160);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)-1, 32, 32, 100.0f);
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 127);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getHue();
    hSLColor0.brighten((float)16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.brighten((float)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    hSLColor0.setSaturation((-1));
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(104, 0, (int)(short)0, 0.0f);
    int i17 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 50);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 45);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.initRGBbyHSL(54, 0, 1);
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(52, 101, 32, (float)252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    int i9 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.setLuminence((-1));
    hSLColor0.setSaturation((int)'a');

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    hSLColor0.setHue((int)(short)-1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)100);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(254, 98, 10);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(36, 10, (-1));
    hSLColor0.brighten((float)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 252);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getGreen();
    hSLColor0.setHue(127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 27);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(1);
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    hSLColor0.setSaturation((int)(byte)10);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 15);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(10);
    hSLColor0.setSaturation(252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.initHSLbyRGB((int)' ', 127, (int)(short)1);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(50, 35, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 251);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(35);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setHue(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.setLuminence(96);
    hSLColor0.brighten((float)1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(249);
    hSLColor0.setSaturation(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    hSLColor0.blend(201, 0, (int)(byte)10, (float)(byte)100);
    hSLColor0.blend(100, 0, 101, (float)32);
    hSLColor0.brighten((float)2);
    hSLColor0.setSaturation(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    hSLColor0.setSaturation(16);
    hSLColor0.setSaturation((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    hSLColor0.setSaturation(35);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 59);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.blend(10, 0, 32, 1.0f);
    hSLColor0.initHSLbyRGB((int)(byte)0, (int)' ', (int)(short)10);
    hSLColor0.blend(50, (int)(short)1, 68, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(271);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.blend(53, 104, (int)(short)0, (float)22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    hSLColor0.setHue((int)(short)100);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)10, (int)(byte)-1);
    int i16 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation(13);
    int i6 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 13);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(104, 0, (int)(short)0, 0.0f);
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 184);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    hSLColor0.blend(201, 0, (int)(byte)10, (float)(byte)100);
    hSLColor0.setHue(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 45);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(98, (int)(short)1, 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.setHue(50);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, 30, 42);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)-1, 32, 32, 100.0f);
    hSLColor0.reverseColor();
    hSLColor0.blend(31, (int)(short)10, 101, (float)54);
    hSLColor0.brighten((float)42);
    hSLColor0.brighten((float)137);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)(byte)10);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.initHSLbyRGB((int)(byte)-1, 0, (int)(byte)0);
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 254);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getBlue();
    hSLColor0.setLuminence(249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    
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
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.setHue((-1));
    hSLColor0.initHSLbyRGB(224, (int)'a', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 241);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)' ');
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(5, (int)(byte)0, (int)(short)10);
    hSLColor0.blend(241, 101, 59, (float)98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(254, 0, (int)' ');
    hSLColor0.setHue(49);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.initRGBbyHSL(54, 0, 1);
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setLuminence(52);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)0, 137, 100);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL((int)'#', 23, 224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 69);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.setSaturation((int)(byte)0);
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)' ');
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 26);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(77, (int)(short)1, 35);
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 59, 24);
    int i16 = hSLColor0.getRed();
    hSLColor0.setHue(104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 30);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 172);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 172);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.blend(184, 23, 160, (float)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL((int)(short)100, 241, 32);
    hSLColor0.setLuminence(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(23);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.setHue(77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(265, 24, 24);
    int i16 = hSLColor0.getHue();
    hSLColor0.setSaturation(271);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(96, 54, 24);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 24);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)0, 137, 100);
    int i14 = hSLColor0.getHue();
    hSLColor0.setLuminence(171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 116);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 1, 201);
    int i14 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 127, (int)(byte)100);
    hSLColor0.initHSLbyRGB(252, 271, (int)(byte)-1);
    hSLColor0.blend(16, 137, 135, (float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)-1, 42, 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 254);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(127);
    hSLColor0.setHue(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    int i14 = hSLColor0.getRed();
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.initRGBbyHSL(48, 48, 13);
    hSLColor0.setLuminence(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(59);
    hSLColor0.reverseColor();
    hSLColor0.blend(160, 16, (int)(byte)0, (float)224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 54);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 1, 201);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 201);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 104, 10);
    hSLColor0.brighten(10.0f);
    int i8 = hSLColor0.getHue();
    hSLColor0.setLuminence(252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(98, 201, 254, (float)142);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence(68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.setSaturation(137);
    hSLColor0.setHue(48);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 48);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.setLuminence(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)' ', 32, (int)(short)100);
    int i9 = hSLColor0.getHue();
    hSLColor0.blend(49, 101, 241, (float)(short)-1);
    hSLColor0.setSaturation(54);
    int i17 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(98, 252, 249);
    hSLColor0.setLuminence(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.brighten((float)170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    int i18 = hSLColor0.getRed();
    hSLColor0.setHue((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 96);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)(short)0, 68, 172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(54);
    hSLColor0.initHSLbyRGB(16, (int)(short)100, 31);
    hSLColor0.brighten((float)171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(32, 96, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setHue(172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(235, (int)(byte)0, (int)(byte)-1, (float)171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.blend(245, 209, 42, (float)(short)1);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 232);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.blend(31, (int)(byte)1, 135, (float)15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence(32);
    hSLColor0.initHSLbyRGB(30, 2, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getGreen();
    hSLColor0.setHue(0);
    hSLColor0.setHue(225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 45);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getBlue();
    hSLColor0.blend(11, 170, 255, (float)137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 36);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    hSLColor0.setHue((int)(short)100);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(35);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.setSaturation((int)(byte)10);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setSaturation(241);
    hSLColor0.initHSLbyRGB(265, 32, (int)(byte)1);
    int i16 = hSLColor0.getBlue();
    hSLColor0.setHue(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation(10);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(127);
    int i16 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)10);
    hSLColor0.blend(35, 32, 42, (float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 254);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 21);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.blend(171, 171, (int)' ', (float)14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)265);
    hSLColor0.initRGBbyHSL(265, 13, 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(104, 0, (int)(short)0, 0.0f);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 30);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)' ', 32, (int)(short)100);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setHue(116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(232, (-1), 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    hSLColor0.initRGBbyHSL((int)(short)10, 255, 48);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 75);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 254);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(201, 0, 52);
    hSLColor0.setSaturation(271);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.initHSLbyRGB((int)' ', 127, (int)(short)1);
    hSLColor0.brighten((float)'4');

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue(201);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(30, 251, 0);
    hSLColor0.initHSLbyRGB(42, 142, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setSaturation(104);
    hSLColor0.brighten((float)36);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)104);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initRGBbyHSL(96, 0, 104);
    int i16 = hSLColor0.getHue();
    hSLColor0.brighten((float)98);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setSaturation(96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 96);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setLuminence(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(265, 69, 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence(32);
    hSLColor0.setLuminence(100);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getGreen();
    hSLColor0.setHue(0);
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation(70);
    int i13 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)'a', 32, 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 127);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.brighten((float)(short)0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(59);
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 245);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)' ');
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(54, (int)(byte)100, 137);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 137);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.blend(10, 0, 32, 1.0f);
    hSLColor0.initHSLbyRGB((int)(byte)0, (int)' ', (int)(short)10);
    hSLColor0.brighten((float)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.blend(15, 15, 1, (float)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setLuminence(52);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 102);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(245, (int)(short)0, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 30);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence(1);
    hSLColor0.setLuminence(45);
    hSLColor0.reverseColor();

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 59);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initHSLbyRGB(104, (int)(byte)0, 0);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(59, 1, 70);
    int i21 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 70);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)-1);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setLuminence(0);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    int i14 = hSLColor0.getRed();
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.initRGBbyHSL(48, 48, 13);
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 15);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getHue();
    hSLColor0.brighten((float)10L);
    hSLColor0.setHue(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 241);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(36, 32, 53);
    hSLColor0.initRGBbyHSL((int)(short)10, 245, 0);
    hSLColor0.setHue((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.initHSLbyRGB((-1), 34, 127);
    hSLColor0.setHue((int)(short)0);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(50, 0, (int)'#');
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 225);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getGreen();
    hSLColor0.setHue(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 53);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    hSLColor0.setLuminence(265);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(22, 77, 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 127);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.blend(30, (int)'4', 36, (float)235);
    hSLColor0.setLuminence(36);
    hSLColor0.brighten((float)22);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 68);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    int i5 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(49, 50, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.blend(101, 235, 49, (float)1L);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 142);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.setHue(127);
    hSLColor0.setSaturation(254);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue(170);
    hSLColor0.setLuminence((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    hSLColor0.initRGBbyHSL(96, 0, 258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.blend(98, 265, 48, (float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.setLuminence(31);
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 62);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    hSLColor0.blend(201, 0, (int)(byte)10, (float)(byte)100);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend(24, 70, 249, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 254);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    hSLColor0.blend(2, 50, 50, (float)(byte)1);
    int i15 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 50);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 96);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(254, 96, 35);
    hSLColor0.setLuminence(2);
    hSLColor0.brighten((float)(short)0);
    hSLColor0.initHSLbyRGB(97, 11, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    hSLColor0.initRGBbyHSL(70, 102, 69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (int)(short)1, (int)(short)0);
    hSLColor0.initRGBbyHSL((int)(short)-1, 137, (int)' ');
    hSLColor0.initRGBbyHSL(249, 1, 258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(10);
    hSLColor0.setLuminence(255);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(127);
    int i16 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(170, (int)(byte)-1, 170);
    hSLColor0.initRGBbyHSL(50, 126, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 254);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.blend(96, 59, 171, 0.0f);
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 241);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(59);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 120);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'a', (int)(short)0, 104);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 104);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initRGBbyHSL(96, 0, 104);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 104);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)265);
    hSLColor0.setSaturation(251);
    hSLColor0.initHSLbyRGB(184, (int)(byte)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(50, 0, (int)'#');
    hSLColor0.setHue(135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initHSLbyRGB(104, (int)(byte)0, 0);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    hSLColor0.blend(127, (int)' ', (int)' ', 1.0f);
    hSLColor0.setHue((int)(short)1);
    hSLColor0.initHSLbyRGB(0, (-1), 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    hSLColor0.setSaturation(35);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 68);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)-1);
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)'a');
    int i14 = hSLColor0.getRed();
    hSLColor0.setHue(59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getRed();
    hSLColor0.brighten((float)255);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    hSLColor0.initHSLbyRGB(0, (int)(short)100, (int)'a');
    hSLColor0.initHSLbyRGB((int)'a', (int)'#', 30);
    hSLColor0.initHSLbyRGB(26, 225, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(50, 0, (int)'#');
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 225);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence(77);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 77);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)' ');
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    hSLColor0.setHue(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(127, 2, 0);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initHSLbyRGB(104, (int)(byte)0, 0);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getRed();
    hSLColor0.brighten((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence(77);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)209);
    hSLColor0.setHue((int)(byte)100);
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setHue(225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)'4');
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setHue((int)'4');
    hSLColor0.blend(142, 16, 137, (float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(254, 98, 10);
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setHue(135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initHSLbyRGB(104, (int)(byte)0, 0);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(59, 1, 70);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 206);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.setHue(232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)13);
    hSLColor0.setHue(160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(42, 100, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 126);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    hSLColor0.setLuminence(265);
    hSLColor0.initRGBbyHSL(271, (int)(short)0, (-1));
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)0);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 245);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(45, 135, 59, (float)23);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getGreen();
    hSLColor0.setHue(0);
    hSLColor0.setSaturation(201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 45);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.blend(100, 100, 96, (float)'4');
    hSLColor0.setHue(34);
    hSLColor0.setLuminence(235);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 34);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)(short)-1, 0, 36);
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL((int)(short)100, 241, 32);
    hSLColor0.setSaturation(137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getLuminence();
    hSLColor0.blend(45, 171, (int)(short)100, (float)245);
    hSLColor0.setLuminence(120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 16);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(36, 201, (int)(short)100);
    hSLColor0.setLuminence(127);
    hSLColor0.initHSLbyRGB(251, (int)(byte)-1, 53);
    hSLColor0.setLuminence((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 127);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setHue(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 254);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(201, 0, 52);
    hSLColor0.setHue((int)(short)0);
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.setLuminence(48);
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence(32);
    hSLColor0.setLuminence(100);
    hSLColor0.setLuminence(32);
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 184);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(21, 14, (int)(byte)1);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(50, 0, (int)'#');
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 225);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)-1, 137, (int)(byte)-1, (float)104);
    hSLColor0.setHue(32);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setSaturation(241);
    hSLColor0.initHSLbyRGB(265, 32, (int)(byte)1);
    int i16 = hSLColor0.getBlue();
    hSLColor0.blend(23, 206, 104, (float)16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(254, 96, 35);
    hSLColor0.setLuminence(2);
    hSLColor0.brighten((float)(short)0);
    hSLColor0.brighten(0.0f);
    hSLColor0.initHSLbyRGB(101, (int)(short)0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.brighten((float)(short)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(42);
    hSLColor0.setLuminence(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    int i4 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    hSLColor0.setHue(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(23, 101, (int)(byte)0);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)'4');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)36);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.brighten((float)(byte)10);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(0);
    hSLColor0.blend((int)(short)1, 142, 104, (float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.initHSLbyRGB(50, (int)(short)0, 245);
    hSLColor0.blend(0, 127, 50, (float)22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 36);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setSaturation(241);
    hSLColor0.initHSLbyRGB(265, 32, (int)(byte)1);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getBlue();
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 275);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)(short)10, 265);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getHue();
    hSLColor0.setHue(209);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 209);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.blend(160, 50, 252, (float)258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    hSLColor0.blend(10, 0, (int)(byte)10, (float)251);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 213);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.blend((int)(byte)-1, 32, 36, (float)(byte)1);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.setLuminence(0);
    hSLColor0.blend(45, 48, 34, 0.0f);
    hSLColor0.initHSLbyRGB(11, 184, 75);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)'#', 0);
    hSLColor0.initHSLbyRGB((-1), 34, 127);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(30, 54, 96);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    hSLColor0.setSaturation(16);
    int i20 = hSLColor0.getHue();
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 47);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(68);
    hSLColor0.setHue(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((int)(byte)10, (int)(byte)100, 0);
    hSLColor0.setLuminence(127);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    hSLColor0.setHue((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initHSLbyRGB((int)(short)-1, 0, 36);
    hSLColor0.reverseColor();

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(96);
    hSLColor0.initHSLbyRGB((int)' ', 127, (int)(short)1);
    hSLColor0.brighten((float)(short)-1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(54, 101, 48);
    hSLColor0.brighten((float)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setSaturation(104);
    hSLColor0.brighten((float)36);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((int)(byte)0, 26, 77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 30);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.setHue(59);
    hSLColor0.setHue((int)(byte)10);
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(1);
    hSLColor0.setLuminence(30);
    hSLColor0.brighten((float)160);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setLuminence(23);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 23);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((-1), 24, 11);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 277);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    hSLColor0.setHue((int)(short)100);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(45, 260, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten((float)59);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.setSaturation(70);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 65);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)-1);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(127);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getBlue();
    hSLColor0.brighten((float)96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 127);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)35);
    hSLColor0.setLuminence(265);
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(54);
    hSLColor0.blend(59, 32, 96, (float)21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(13, 70, 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(24, 100, 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 254);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (int)(short)1, (int)(short)0);
    int i15 = hSLColor0.getBlue();
    hSLColor0.setSaturation(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initRGBbyHSL(0, (int)(byte)100, 35);
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setHue((int)'4');
    hSLColor0.initRGBbyHSL((int)(byte)10, 170, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.setSaturation(137);
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB((int)'a', 52, 170);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(36, 32, 53);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    hSLColor0.setLuminence(98);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 98);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    hSLColor0.brighten((float)(-1L));
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((int)(short)1);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 1, 201);
    int i14 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', 127, (int)(byte)100);
    hSLColor0.initHSLbyRGB(252, 271, (int)(byte)-1);
    int i23 = hSLColor0.getLuminence();
    hSLColor0.setHue(258);
    int i26 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 135);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(24, 28, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.brighten((float)(short)0);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(42);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 58);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)1, 0, 100);
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.brighten((float)209);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(23, 101, (int)(byte)0);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getRed();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 23);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(31, 232, 209);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 70);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(16, 42, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(30, 251, 0);
    hSLColor0.initRGBbyHSL(258, (int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getHue();
    hSLColor0.blend(265, 2, 245, (float)(short)1);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'a', (int)(short)0, 104);
    hSLColor0.brighten(0.0f);
    hSLColor0.blend(35, 102, (int)(byte)1, (float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.setSaturation(137);
    hSLColor0.brighten((float)59);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.setSaturation(35);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(45, 254, 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)'#');
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(52);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(short)-1, 0, 50, (-1.0f));
    hSLColor0.brighten((float)52);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)' ');
    hSLColor0.initRGBbyHSL((int)(short)0, (-1), 0);
    hSLColor0.setSaturation((-1));
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getLuminence();
    hSLColor0.setHue(54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence(77);
    hSLColor0.setHue(53);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setSaturation(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(252, (int)(short)1, 245);
    int i18 = hSLColor0.getRed();
    int i19 = hSLColor0.getBlue();
    hSLColor0.setLuminence(0);
    int i22 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    int i14 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'#', 31, 47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 249);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)' ');
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

}
