
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.initRGBbyHSL(68, 53, 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    hSLColor0.setLuminence(72);
    hSLColor0.initRGBbyHSL(26, 251, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 70);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(39, 240, 0, (float)137);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.brighten((float)178);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setHue(195);
    int i12 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(48, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    hSLColor0.blend(255, 52, 49, (float)88);
    hSLColor0.initRGBbyHSL(200, (int)(byte)1, 113);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.setLuminence(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL(46, 5, 64);
    hSLColor0.initHSLbyRGB(28, (int)'4', 259);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.setHue(102);
    hSLColor0.setLuminence(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setSaturation((int)'a');
    hSLColor0.initRGBbyHSL(46, 45, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    int i12 = hSLColor0.getBlue();
    hSLColor0.blend(0, 260, 88, (float)239);
    hSLColor0.setSaturation(449);
    hSLColor0.initHSLbyRGB(68, 33, (int)'a');
    int i24 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB((int)(short)1, 177, 57);
    hSLColor0.blend(200, (-10), 151, (float)151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend(14, 51, (int)(short)10, (float)254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getGreen();
    hSLColor0.brighten(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 53);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.brighten((-1.0f));
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)1);
    int i30 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    hSLColor0.setHue((int)(short)0);
    hSLColor0.setLuminence(227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getGreen();
    
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten((float)178);
    hSLColor0.initRGBbyHSL((int)'a', 93, (int)(short)1);
    hSLColor0.reverseColor();
    int i23 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 93);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.initRGBbyHSL((int)'a', 113, (int)(short)100);
    hSLColor0.setHue(151);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setLuminence(169);
    hSLColor0.setLuminence(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(1, 10, 88);
    hSLColor0.brighten(0.0f);
    int i25 = hSLColor0.getGreen();
    hSLColor0.setLuminence(243);
    int i28 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 234);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getBlue();
    
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
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getHue();
    hSLColor0.blend(13, 140, 127, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 213);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, (int)'#', 234);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 117);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    int i22 = hSLColor0.getGreen();
    hSLColor0.brighten((float)33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(249, 214, 87);
    hSLColor0.initRGBbyHSL(159, 17, 35);
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 88);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setHue(0);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(143);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 143);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 148);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)51);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    hSLColor0.blend(257, 97, 87, (float)10L);
    hSLColor0.initRGBbyHSL(45, 169, 214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i26 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((-11));
    hSLColor0.initHSLbyRGB(148, 17, 46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.brighten((float)213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(243);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(35);
    hSLColor0.initHSLbyRGB(260, (int)(short)100, (int)(short)10);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getRed();
    hSLColor0.setLuminence(251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 260);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)239);
    hSLColor0.setHue(87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setSaturation(232);
    hSLColor0.setLuminence(137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.setHue(195);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 255);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(259);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 45);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.setHue(257);
    hSLColor0.initRGBbyHSL(109, 192, 165);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(440);
    hSLColor0.reverseColor();
    
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 59);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.blend(0, (int)(short)10, 14, (float)(byte)1);
    hSLColor0.setHue(135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(short)10);
    int i15 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(123, 35, 192);
    hSLColor0.blend(0, 169, 39, (float)56);
    hSLColor0.setHue((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 104);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getHue();
    int i26 = hSLColor0.getSaturation();
    int i27 = hSLColor0.getRed();
    int i28 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 440);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 240);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(24, 97, 90);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 61);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i13 = hSLColor0.getLuminence();
    hSLColor0.blend(35, 89, 135, (float)214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 17);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    int i10 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 232);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(0, (int)(short)0, 249, (float)259);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(127, 172, 258);
    int i25 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 127);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    hSLColor0.initHSLbyRGB(60, 178, (int)(byte)1);
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.brighten((float)90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.initRGBbyHSL(88, (int)(byte)100, 93);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(211);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.initHSLbyRGB(60, 93, 113);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(131, 94, (int)(short)10);
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    hSLColor0.setSaturation(165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(88, 10, 105);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setLuminence(137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 102);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.blend(35, (int)(byte)10, 33, (float)449);
    hSLColor0.initRGBbyHSL(84, 0, (int)(byte)1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.blend(38, 104, 23, (float)41);
    hSLColor0.setSaturation(33);
    hSLColor0.brighten((float)178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 105);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(2);
    hSLColor0.blend(255, 125, 248, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    hSLColor0.initRGBbyHSL(127, 0, 151);
    hSLColor0.setSaturation(0);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 151);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setSaturation(172);
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(211);
    hSLColor0.blend(148, (int)(short)1, 113, (float)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    hSLColor0.setHue(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten((float)178);
    hSLColor0.initHSLbyRGB(92, 151, 0);
    hSLColor0.initHSLbyRGB(0, 85, 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(168, 100, 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(131, (int)(short)10, 35);
    int i22 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 36);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.blend(45, 193, 39, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'a', 449, 213);
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 139);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)72);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(32);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(57, 57, 33);
    hSLColor0.brighten((float)102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(128);
    hSLColor0.initHSLbyRGB(16, 168, 73);
    
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(78, 101, 125);
    hSLColor0.setHue(213);
    hSLColor0.setSaturation(168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 213);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 183);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    int i14 = hSLColor0.getGreen();
    hSLColor0.setLuminence(137);
    int i17 = hSLColor0.getHue();
    int i18 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 166);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    hSLColor0.blend(53, 25, 186, (float)85);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(214, 107, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 106);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    hSLColor0.blend(257, 97, 87, (float)10L);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    hSLColor0.blend(181, 0, 251, (float)(short)1);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(260, 107, 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(106, 6, 0);
    hSLColor0.blend(240, (int)(short)1, 126, (float)143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL((-11), 10, 449);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    hSLColor0.blend(59, 141, 185, (float)143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setSaturation(40);
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(105);
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 260);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(169, 87, 85);
    hSLColor0.setSaturation((int)'4');
    hSLColor0.setSaturation(440);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 127);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setHue(0);
    
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(17);
    hSLColor0.reverseColor();
    
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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setHue((int)(byte)-1);
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setHue(27);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(byte)1, 265, 60, (float)192);
    hSLColor0.blend((int)(short)0, 60, 14, (float)93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.blend((int)'#', 113, 113, (float)213);
    int i14 = hSLColor0.getBlue();
    hSLColor0.brighten((float)260);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend((int)'#', 17, 50, (float)'a');
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(33, 255, 188, (float)168);
    hSLColor0.brighten((float)193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 193);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(45);
    hSLColor0.blend(35, 0, 32, (float)40);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 212);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(104);
    hSLColor0.blend(56, 248, 213, (float)73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    hSLColor0.setHue(68);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 68);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.initHSLbyRGB(311, (int)'a', 101);
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend(0, 4, 140, (float)45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.blend(4, 50, 28, (float)449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.setHue(213);
    hSLColor0.blend((int)(byte)0, 39, 0, (float)70);
    hSLColor0.initRGBbyHSL(24, 28, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(85, 0, (int)' ');
    hSLColor0.reverseColor();
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.brighten((float)449);
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    hSLColor0.blend(255, (int)(short)10, 85, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.setSaturation(88);
    hSLColor0.initRGBbyHSL(117, 10, 185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    hSLColor0.setSaturation(87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(23);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 23);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    hSLColor0.brighten((float)260);
    int i10 = hSLColor0.getRed();
    hSLColor0.brighten((float)48);
    hSLColor0.setSaturation(35);
    
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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.setLuminence(169);
    hSLColor0.blend(48, 87, (int)(byte)0, (float)(byte)1);
    hSLColor0.initRGBbyHSL(131, 33, (int)(byte)10);
    int i29 = hSLColor0.getRed();
    hSLColor0.brighten((float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(128);
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    hSLColor0.blend(127, 265, 60, (float)249);
    hSLColor0.setSaturation(40);
    hSLColor0.setLuminence(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.blend(92, 177, 240, 100.0f);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB((-1), 188, 137);
    hSLColor0.blend(16, 193, 78, (float)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(104, 32, 5);
    hSLColor0.initRGBbyHSL((int)' ', 70, 172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    hSLColor0.blend((int)'4', 70, 85, (float)(short)-1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.brighten((float)68);
    int i11 = hSLColor0.getBlue();
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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(243);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation(211);
    hSLColor0.initHSLbyRGB(102, (int)(short)100, 154);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.blend((int)(short)-1, 148, (-1), (float)169);
    hSLColor0.setLuminence(251);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(70, 200, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(2);
    hSLColor0.setHue(73);
    hSLColor0.setHue(260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getSaturation();
    hSLColor0.blend(440, (int)'a', 0, (float)88);
    hSLColor0.brighten((float)48);
    hSLColor0.setLuminence(57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setHue(61);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(45);
    hSLColor0.blend(35, 0, 32, (float)40);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    hSLColor0.blend(90, (int)(byte)1, 259, (float)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getBlue();
    int i23 = hSLColor0.getLuminence();
    hSLColor0.blend(86, 52, 0, (float)0);
    hSLColor0.reverseColor();
    int i30 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 254);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    int i6 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(234, 186, 214);
    hSLColor0.initRGBbyHSL((int)(byte)100, (int)(short)10, 214);
    hSLColor0.initHSLbyRGB(32, 23, 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 49, 49);
    hSLColor0.blend(260, (int)(short)0, 70, (float)239);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 260);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.setLuminence(87);
    int i18 = hSLColor0.getRed();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getGreen();
    hSLColor0.brighten((float)151);
    int i27 = hSLColor0.getLuminence();
    int i28 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 255);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.setHue(93);
    hSLColor0.setSaturation((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB(85, (int)(byte)-1, 101);
    hSLColor0.setHue((int)(byte)-1);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(48);
    hSLColor0.blend(42, 71, 148, (float)131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getLuminence();
    int i26 = hSLColor0.getLuminence();
    int i27 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(169, 181, 92);
    hSLColor0.blend(0, 535, 193, (float)143);
    int i37 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-5457));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(0);
    hSLColor0.blend(104, 85, 6, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getHue();
    int i26 = hSLColor0.getSaturation();
    int i27 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(181, 24, 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 440);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(227, 137, 94);
    hSLColor0.blend(71, 227, 24, (float)105);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 24);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.blend(36, 12, (int)'4', (float)93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(32);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setSaturation(232);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(177, 170, 53);
    hSLColor0.brighten((float)183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(100, 240, 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 186);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getHue();
    hSLColor0.brighten((float)172);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)(byte)0);
    int i9 = hSLColor0.getGreen();
    
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(short)-1, 48, (int)(short)10, (float)100L);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(185, 0, 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 24);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(51, 107, 88);
    hSLColor0.initHSLbyRGB(57, 159, 40);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(104, 32, 5);
    hSLColor0.blend(102, 249, 72, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(186);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.brighten((-1.0f));
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getGreen();
    int i28 = hSLColor0.getHue();
    int i29 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(33, 106, 172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.brighten((float)178);
    hSLColor0.brighten((float)184);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i26 = hSLColor0.getSaturation();
    int i27 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.initRGBbyHSL(33, 25, 137);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 137);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(181, 169, 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(255);
    hSLColor0.initRGBbyHSL(61, 92, 68);
    int i19 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(93, 226, 192);
    hSLColor0.setHue(131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 92);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1L);
    hSLColor0.setHue(178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.setSaturation(153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(186, 213, 0);
    hSLColor0.blend(0, 56, 177, (float)102);
    int i25 = hSLColor0.getLuminence();
    int i26 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 177);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 260);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)10);
    
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
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setSaturation((int)'a');

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    hSLColor0.blend(53, 25, 186, (float)85);
    hSLColor0.blend(53, (int)' ', 210, (float)49);
    hSLColor0.brighten((float)17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setHue(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(byte)100, 35, (int)'4', (float)213);
    int i27 = hSLColor0.getLuminence();
    int i28 = hSLColor0.getRed();
    hSLColor0.setSaturation(259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 100);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(170, 71, 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 101);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence(113);
    hSLColor0.reverseColor();
    
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(97, 239, 0);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 67);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(49, 25, (int)(byte)0);
    hSLColor0.initHSLbyRGB((-1), (int)(short)10, 159);
    hSLColor0.blend(85, 212, 440, (float)165);
    int i27 = hSLColor0.getHue();
    int i28 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 263);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.blend(88, (int)'4', 48, (float)239);
    hSLColor0.setSaturation(107);
    hSLColor0.initHSLbyRGB(0, (int)(byte)0, 214);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getGreen();
    int i26 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    hSLColor0.setSaturation(449);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.initHSLbyRGB(128, 97, 166);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((int)(byte)-1, 265, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence(259);
    
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 24);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(45, 102, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.initHSLbyRGB(14, 84, 117);
    hSLColor0.blend(34, 2, 0, (float)97);
    int i39 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 17);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    hSLColor0.blend(171, 60, 85, (float)(-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(102);
    hSLColor0.setHue(48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    hSLColor0.blend(178, 113, 32, (float)35);
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 24);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(193);
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)72);
    int i12 = hSLColor0.getGreen();
    hSLColor0.blend(216, 1, (-11), (float)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.brighten(1.0f);
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setLuminence(35);
    int i13 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(56, 265, 57);
    hSLColor0.initRGBbyHSL(117, 9, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 104);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(68, 50, 56);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 148);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.setLuminence(100);
    hSLColor0.reverseColor();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(1, 10, 88);
    hSLColor0.brighten(0.0f);
    hSLColor0.setLuminence(239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    hSLColor0.blend(169, 94, (int)(short)100, (float)0L);
    int i24 = hSLColor0.getRed();
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 56);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    hSLColor0.blend(45, 213, 1, (float)(short)-1);
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 128);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    hSLColor0.initRGBbyHSL(153, 0, 259);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
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
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getGreen();
    hSLColor0.setHue(42);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 440);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(449);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.initHSLbyRGB(188, 70, 70);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getBlue();
    hSLColor0.setSaturation(188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)159);
    hSLColor0.initRGBbyHSL(239, 88, 64);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 239);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    hSLColor0.initRGBbyHSL(97, 86, 193);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 86);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)-1);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setLuminence(45);
    hSLColor0.initHSLbyRGB(0, (int)(byte)100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 254);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getBlue();
    hSLColor0.setSaturation(0);
    int i6 = hSLColor0.getBlue();
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    int i16 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(0, 42, 73);
    hSLColor0.brighten((float)135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setHue(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(97, 239, 0);
    hSLColor0.blend(234, 239, (int)(short)100, (float)40);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 239);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 255);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(92, (int)(byte)-1, (int)'a', (float)(byte)1);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 183);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(249, 214, 87);
    hSLColor0.initRGBbyHSL(159, 17, 35);
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.reverseColor();
    int i24 = hSLColor0.getRed();
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 127);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.blend((int)'#', 113, 113, (float)213);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(73);
    int i17 = hSLColor0.getGreen();
    hSLColor0.blend(227, 254, 67, (float)153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 113);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(0.0f);
    hSLColor0.setLuminence(216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)105);
    hSLColor0.blend(83, 214, 88, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setLuminence(97);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 192);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.initRGBbyHSL((-5457), 14, 125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(-1L));
    hSLColor0.initRGBbyHSL(104, 0, (int)(short)1);
    hSLColor0.initHSLbyRGB(25, 52, 106);
    hSLColor0.setHue((-5457));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)100, 40);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(128, 49, 105);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 105);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.blend(33, 195, 0, (float)17);
    hSLColor0.initHSLbyRGB(35, 172, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.setHue(102);
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 12);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.setLuminence(100);
    hSLColor0.setLuminence((int)(short)0);
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    hSLColor0.blend(11, 113, 94, (float)23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setSaturation(172);
    hSLColor0.setLuminence(101);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(137);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 26);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.brighten((float)125);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    hSLColor0.initRGBbyHSL(165, 35, 51);
    hSLColor0.initRGBbyHSL(0, 0, 10);
    hSLColor0.setSaturation(169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.blend(131, 40, 93, (float)260);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 135);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    hSLColor0.initHSLbyRGB(232, 0, (int)(short)-1);
    int i17 = hSLColor0.getGreen();
    hSLColor0.setHue(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getBlue();
    hSLColor0.setSaturation(255);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 131);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getBlue();
    hSLColor0.setSaturation(255);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(249, 214, 87);
    hSLColor0.setHue(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setLuminence(210);
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setHue(195);
    hSLColor0.initRGBbyHSL((int)(short)0, 36, 30);
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 26);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(50, 178, (int)(short)0);
    hSLColor0.brighten((float)14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    hSLColor0.setLuminence(86);
    
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    hSLColor0.setLuminence(104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setHue(195);
    hSLColor0.brighten((float)135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(214, 41, 181);
    hSLColor0.initRGBbyHSL(40, 211, 165);
    hSLColor0.brighten((float)188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    hSLColor0.blend(255, (int)(short)10, 85, (float)(-1));
    hSLColor0.initRGBbyHSL(105, (int)(short)100, (int)(short)10);
    hSLColor0.initHSLbyRGB(86, 30, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    hSLColor0.blend(53, 25, 186, (float)85);
    hSLColor0.blend(109, (int)(short)0, 52, (float)(-10));
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 194);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(104, 213, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getBlue();
    hSLColor0.brighten((float)104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 92);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.setHue(257);
    hSLColor0.blend(177, 36, 200, (float)183);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setSaturation(45);
    hSLColor0.blend(194, 113, 168, (float)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getBlue();
    int i23 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(148);
    hSLColor0.initHSLbyRGB(232, 5, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(127);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.brighten((float)113);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(0);
    hSLColor0.initHSLbyRGB(184, 64, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 240);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.setLuminence(169);
    hSLColor0.blend(48, 87, (int)(byte)0, (float)(byte)1);
    hSLColor0.initRGBbyHSL(131, 33, (int)(byte)10);
    int i29 = hSLColor0.getRed();
    int i30 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 131);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(232, 53, 249);
    int i21 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 249);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    hSLColor0.setSaturation(213);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 90);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.setSaturation(210);
    int i32 = hSLColor0.getGreen();
    hSLColor0.setSaturation(78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getSaturation();
    int i22 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(184, (int)(short)0, 50);
    int i27 = hSLColor0.getLuminence();
    int i28 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 50);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    int i14 = hSLColor0.getGreen();
    hSLColor0.setHue(33);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getHue();
    
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 17);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setLuminence(257);
    hSLColor0.setSaturation((-5457));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 4);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(88, 10, 105);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(48, 169, 60);
    hSLColor0.brighten((float)239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 102);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 137);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    hSLColor0.blend(45, 213, 1, (float)(short)-1);
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initRGBbyHSL(178, 105, 123);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 128);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getLuminence();
    hSLColor0.setHue(94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.blend(17, 0, 89, (float)37);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.initHSLbyRGB(14, 84, 117);
    hSLColor0.setHue((-10));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend(240, 151, 260, (float)193);
    hSLColor0.blend((int)(byte)100, 52, 11, (float)48);
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 204);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(70, 12, 184, (float)89);
    int i26 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(193, 97, 129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 185);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(2);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getBlue();
    hSLColor0.setLuminence(232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getRed();
    hSLColor0.setSaturation(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(255);
    int i15 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL((-1), 0, 188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.initRGBbyHSL(0, 70, 100);
    hSLColor0.brighten((float)137);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setLuminence(85);
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(243, 172, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.setLuminence((int)' ');
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(short)0, 45, 88);
    hSLColor0.brighten((float)100L);
    int i20 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 265, 49);
    hSLColor0.blend(117, 53, 87, (float)12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, 35, 311, (float)'4');
    hSLColor0.reverseColor();
    int i26 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 37);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(0, 1, 113);
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(46);
    int i16 = hSLColor0.getHue();
    hSLColor0.setHue(74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(171, 0, 193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.initRGBbyHSL(257, 127, (int)(short)100);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    int i15 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.setSaturation(177);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)1);
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)5);
    hSLColor0.setHue(213);
    hSLColor0.initRGBbyHSL(9, 4, 0);
    hSLColor0.setHue(137);
    hSLColor0.blend(255, 243, 68, (float)165);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setLuminence(97);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(128, 49, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 192);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getBlue();
    int i23 = hSLColor0.getLuminence();
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)216);
    hSLColor0.blend((int)(short)-1, 56, (int)(short)100, (float)42);
    hSLColor0.setLuminence(35);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)0);
    hSLColor0.setLuminence(0);
    hSLColor0.initRGBbyHSL(23, 101, 71);
    int i27 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 99);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(128, 49, 105);
    hSLColor0.setLuminence(128);
    hSLColor0.setSaturation((int)'a');
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 149);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(186, 213, 0);
    hSLColor0.blend(0, 56, 177, (float)102);
    hSLColor0.initRGBbyHSL(113, 0, 53);
    hSLColor0.setHue(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.brighten((-1.0f));
    hSLColor0.setHue(248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)1L);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 53);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 249);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(57);
    hSLColor0.setSaturation(255);
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)(byte)1, 105, 123, (float)149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.initHSLbyRGB((-5457), 113, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    hSLColor0.setHue(60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    int i30 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i32 = hSLColor0.getBlue();
    hSLColor0.brighten((float)148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.initRGBbyHSL(440, 1, (int)(short)1);
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 440);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getRed();
    hSLColor0.blend(224, 311, 33, (float)214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.setHue((int)(short)10);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getGreen();
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(113);
    hSLColor0.initHSLbyRGB(41, 149, 87);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    int i14 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(42, 0, 131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    hSLColor0.initRGBbyHSL(104, 1, 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)72);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)100, 32);
    hSLColor0.setLuminence(5);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 5);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation(60);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(30, 53, 11);
    
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
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 60, 35);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    hSLColor0.blend((int)'a', 127, 129, (float)440);
    hSLColor0.setHue(104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)148);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    hSLColor0.setLuminence(92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setSaturation(148);
    
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
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(short)-1, 0, 92, (float)57);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 46);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    hSLColor0.setSaturation(449);
    int i18 = hSLColor0.getSaturation();
    hSLColor0.blend(216, 137, 0, (float)17);
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getRed();
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(35);
    hSLColor0.brighten((float)172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(101);
    hSLColor0.initRGBbyHSL(12, 251, 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setHue(23);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(137, 159, 260);
    hSLColor0.brighten((float)154);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 277);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(165, 70, 178);
    hSLColor0.setLuminence(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    
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
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.setSaturation(210);
    int i32 = hSLColor0.getBlue();
    hSLColor0.setHue(113);
    int i35 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 113);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(232, 249, 10);
    hSLColor0.setLuminence(249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 49);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.blend(90, 183, 153, (float)183);
    hSLColor0.blend(40, 52, 45, (float)70);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    hSLColor0.setHue(213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getBlue();
    hSLColor0.blend(243, 99, 64, (float)87);
    int i20 = hSLColor0.getSaturation();
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 224);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    int i14 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(46, 87, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    int i20 = hSLColor0.getSaturation();
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    int i2 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getBlue();
    hSLColor0.brighten((float)165);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 9, 49);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 260);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(113);
    hSLColor0.setSaturation(128);
    int i9 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)-1, 49);
    hSLColor0.initHSLbyRGB(100, (int)(byte)100, (int)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)0, 70, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setLuminence(210);
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setHue(195);
    hSLColor0.setSaturation(2);
    hSLColor0.brighten((float)38);
    hSLColor0.initRGBbyHSL(5, 177, 100);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getHue();
    int i26 = hSLColor0.getSaturation();
    int i27 = hSLColor0.getRed();
    int i28 = hSLColor0.getSaturation();
    int i29 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getHue();
    
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
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)100, 32);
    hSLColor0.setLuminence(5);
    hSLColor0.initRGBbyHSL(93, 53, 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue(42);
    
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
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(35, 257, 1);
    hSLColor0.brighten((float)127);
    hSLColor0.brighten((float)(-5457));
    hSLColor0.initRGBbyHSL(0, 94, 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(85, 9, 137);
    hSLColor0.setSaturation(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    hSLColor0.blend(255, 52, 49, (float)88);
    hSLColor0.setHue(159);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(100, 0, 23);
    hSLColor0.initRGBbyHSL(88, 277, 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    int i22 = hSLColor0.getGreen();
    hSLColor0.setLuminence(32);
    hSLColor0.setHue(8);
    int i27 = hSLColor0.getGreen();
    hSLColor0.setLuminence(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 49, 49);
    hSLColor0.blend(260, (int)(short)0, 70, (float)239);
    int i19 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(123, (int)'a', (int)(byte)10);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    int i11 = hSLColor0.getBlue();
    hSLColor0.brighten((float)252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 104);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    hSLColor0.setHue(74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(40, 257, 113);
    hSLColor0.initHSLbyRGB(26, 192, 449);
    
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
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(449);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 5);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    int i11 = hSLColor0.getBlue();
    hSLColor0.blend(449, 194, 143, (float)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    int i12 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 5, 85, (float)243);
    hSLColor0.initHSLbyRGB(49, 70, 41);
    int i22 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 56);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    hSLColor0.brighten((float)241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(87, (int)'4', (int)(short)-1, (float)186);
    hSLColor0.setSaturation(86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getGreen();
    
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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(48);
    hSLColor0.setHue(84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    hSLColor0.brighten((float)210);
    hSLColor0.setHue(113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setSaturation(40);
    hSLColor0.setHue(151);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.blend(210, 0, (int)'4', (float)101);
    hSLColor0.setSaturation(68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setSaturation(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)100, 32);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence(139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.blend(105, 11, 4, (float)10L);
    
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
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 60, 35);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(26, 101, 232);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 101);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 94);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setSaturation(14);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)100, 32);
    int i16 = hSLColor0.getBlue();
    hSLColor0.blend(168, 34, 213, (float)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(85, 9, 137);
    int i19 = hSLColor0.getHue();
    hSLColor0.setHue(138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 85);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.setSaturation(204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.brighten((float)45);
    hSLColor0.setLuminence(123);
    hSLColor0.initHSLbyRGB(193, 25, 113);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 25);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(48);
    int i16 = hSLColor0.getHue();
    hSLColor0.setSaturation(10);
    hSLColor0.initRGBbyHSL(56, 84, 88);
    int i23 = hSLColor0.getRed();
    hSLColor0.brighten((float)259);
    hSLColor0.initHSLbyRGB(84, 177, 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 99);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.blend(10, (int)(short)1, 440, (float)23);
    hSLColor0.blend(97, 41, 78, (float)137);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(255);
    hSLColor0.setHue(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(71, 125, 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(35, 12, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(short)1, 169, 88);
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(129);
    hSLColor0.setSaturation(277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 105);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getHue();
    hSLColor0.setSaturation(60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 85);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(183, (int)'a', (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 251);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getBlue();
    int i23 = hSLColor0.getSaturation();
    int i24 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(143, 64, 192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(short)-1);
    hSLColor0.blend(257, 126, 123, (float)260);
    hSLColor0.setLuminence(0);
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 262);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(255, 25, 40);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(51);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 211);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.blend(10, (int)(short)1, 440, (float)23);
    hSLColor0.blend(97, 41, 78, (float)137);
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 103);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(137);
    hSLColor0.setLuminence(216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getGreen();
    hSLColor0.blend(138, 34, 0, (float)(-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 24);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)260);
    
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
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.blend(0, (int)(short)10, 14, (float)(byte)1);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 7);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend((int)'#', 17, 50, (float)'a');
    hSLColor0.brighten((float)53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(186);
    int i16 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.blend(105, 16, 5, (float)37);
    int i23 = hSLColor0.getHue();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 5);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(106);
    int i22 = hSLColor0.getGreen();
    hSLColor0.setHue(27);
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 255);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.initRGBbyHSL(32, 1, 0);
    hSLColor0.setHue(45);
    hSLColor0.brighten((float)148);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)165);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(40);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 57);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 104);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    int i30 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i32 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    hSLColor0.setSaturation(449);
    int i18 = hSLColor0.getSaturation();
    hSLColor0.blend(216, 137, 0, (float)17);
    int i24 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 27);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(216, 1, 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getLuminence();
    int i26 = hSLColor0.getLuminence();
    int i27 = hSLColor0.getRed();
    hSLColor0.setSaturation(232);
    int i30 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.brighten((float)178);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)1, 248, 125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(195, 6, 87);
    hSLColor0.setLuminence(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(128);
    hSLColor0.initHSLbyRGB((int)'#', 128, 49);
    int i15 = hSLColor0.getRed();
    hSLColor0.setLuminence(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setHue(260);
    hSLColor0.setHue(212);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    hSLColor0.setLuminence(73);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getBlue();
    int i20 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 8);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.blend((int)'#', 113, 113, (float)213);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(73);
    int i17 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 113);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(184, 138, (-5457));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue((-5457));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 182);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend(240, 151, 260, (float)193);
    hSLColor0.setLuminence(260);
    hSLColor0.blend(205, 25, (int)(short)10, (float)113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.brighten((float)70);
    hSLColor0.reverseColor();

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i22 = hSLColor0.getGreen();
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(25, 46, 9);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(5, 104, 45);
    int i13 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)(byte)0, 0);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.setSaturation(137);
    int i32 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 192);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)123);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initHSLbyRGB(153, (-10), 0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(104, 213, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    hSLColor0.setSaturation(27);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 56);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, 192, 27);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 192);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
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
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(131);
    hSLColor0.brighten((float)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)165);
    hSLColor0.setHue(170);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(56);
    hSLColor0.setSaturation(73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    hSLColor0.blend((int)'4', 70, 85, (float)(short)-1);
    hSLColor0.blend(97, 60, 6, (float)93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.brighten((float)(byte)-1);
    int i18 = hSLColor0.getGreen();
    hSLColor0.brighten((float)188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.blend(92, 177, 240, 100.0f);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 240);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(216, 24, 251);
    hSLColor0.initHSLbyRGB(92, (int)(short)0, 106);
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 92);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(93);
    hSLColor0.setSaturation(1);
    hSLColor0.setHue(239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    hSLColor0.brighten(0.0f);
    hSLColor0.initHSLbyRGB(7, (int)(byte)0, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.brighten(0.0f);
    hSLColor0.initRGBbyHSL((int)' ', (int)(byte)1, 189);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.setHue((int)'#');
    hSLColor0.initRGBbyHSL(168, (int)'4', 93);
    int i21 = hSLColor0.getHue();
    int i22 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(220, 212, 224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 93);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(169);
    hSLColor0.setHue(192);
    hSLColor0.setSaturation(210);
    int i32 = hSLColor0.getBlue();
    hSLColor0.setHue(113);
    hSLColor0.brighten((float)204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.brighten((float)87);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    int i23 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 440);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(87, (int)'4', (int)(short)-1, (float)186);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 260);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.blend(90, 183, 153, (float)183);
    hSLColor0.blend(90, 177, 169, (float)143);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(0, 183, 260, (float)449);
    hSLColor0.initHSLbyRGB(1, 192, 224);
    hSLColor0.setLuminence(171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.setHue(213);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

}
