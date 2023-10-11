
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)72);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getHue();
    hSLColor0.blend(192, 177, 26, (float)84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 186);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(51);
    hSLColor0.initRGBbyHSL(57, 0, 141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 5);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.initRGBbyHSL(257, 239, 17);
    hSLColor0.setHue(440);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', (int)(short)1, (int)(byte)0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)83);
    
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
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(234, 154, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(32, 72, 34);
    int i26 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 34);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(104, 213, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


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
    hSLColor0.blend(126, (int)(short)100, (int)' ', 0.0f);
    hSLColor0.setSaturation(255);
    hSLColor0.blend(88, 129, 127, (float)16);
    hSLColor0.setSaturation(52);
    int i41 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 52);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


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
    hSLColor0.blend((int)(byte)-1, 92, 35, (float)6);
    
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(88, 93, 249);
    hSLColor0.initRGBbyHSL((-1), 36, 4);
    
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(71, 154, (int)' ');
    hSLColor0.setLuminence(200);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 167);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(67, 205, 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)10);
    hSLColor0.setSaturation(123);
    hSLColor0.reverseColor();
    int i18 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i18 == 123);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    hSLColor0.blend(61, 153, 159, (float)10);
    hSLColor0.setLuminence(56);
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 130);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 240);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)-1);
    hSLColor0.setLuminence(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


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
    hSLColor0.setLuminence(216);
    
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

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


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
    hSLColor0.setSaturation(104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, 192, 27);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 27);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 178);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


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
    hSLColor0.setLuminence(220);
    hSLColor0.setLuminence(105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.brighten((float)41);
    hSLColor0.setSaturation(131);
    hSLColor0.setSaturation(49);
    int i22 = hSLColor0.getBlue();
    hSLColor0.setHue(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.initHSLbyRGB(17, (int)(byte)100, 249);
    hSLColor0.setLuminence(92);
    hSLColor0.initHSLbyRGB(37, (int)'4', (int)'4');
    hSLColor0.setHue(0);
    hSLColor0.setHue(224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


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
    int i39 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 34);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setLuminence(23);
    hSLColor0.brighten((float)188);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


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
    int i30 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.setHue(42);
    int i25 = hSLColor0.getSaturation();
    int i26 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 42);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    hSLColor0.initRGBbyHSL(184, 216, 232);
    hSLColor0.brighten((float)2);
    hSLColor0.initRGBbyHSL(9, 397, 126);
    hSLColor0.brighten((float)152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getHue();
    hSLColor0.brighten((float)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 212);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.setSaturation(105);
    hSLColor0.setSaturation(17);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue(6);
    hSLColor0.initRGBbyHSL(225, 45, 24);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(243, 260, 234);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 213);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    hSLColor0.setSaturation(251);
    hSLColor0.setSaturation(1);
    int i17 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.brighten((float)49);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)51);
    hSLColor0.blend(78, 25, 41, (float)141);
    hSLColor0.setSaturation(166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.blend(159, 84, 210, (float)192);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 159);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL(213, 440, (int)(short)-1);
    hSLColor0.blend((int)(short)0, (int)(short)0, 213, (float)260);
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getHue();
    int i24 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 213);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    hSLColor0.reverseColor();
    hSLColor0.blend(70, 16, 148, (float)167);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.initHSLbyRGB((int)'4', 105, 153);
    hSLColor0.initHSLbyRGB(3, (int)(short)0, (int)'a');

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.setLuminence(0);
    hSLColor0.setSaturation(100);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(97, (int)' ', (int)(short)100);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.setSaturation(105);
    hSLColor0.setHue(37);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL(46, 5, 64);
    hSLColor0.reverseColor();
    hSLColor0.blend(104, 14, 33, (float)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.brighten((float)25);
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence(49);
    hSLColor0.blend((int)'a', 311, 127, (float)84);
    int i17 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(99, 117, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(127, 41, 260);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(short)-1, 53, 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 41);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.setSaturation(217);
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getHue();
    hSLColor0.blend(182, 232, 137, (float)24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(255, 25, 40);
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 140);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.initRGBbyHSL(100, 10, (int)(short)-1);
    int i14 = hSLColor0.getSaturation();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getLuminence();
    int i25 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 45);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    hSLColor0.setLuminence(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)-1);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getRed();
    hSLColor0.blend(195, 68, 42, (float)85);
    hSLColor0.initHSLbyRGB(78, 88, 184);
    int i25 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 78);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.setSaturation(165);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 8);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 169);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(128, 105, (int)(short)-1);
    int i10 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten(0.0f);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(67, 153, 202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i25 = hSLColor0.getLuminence();
    int i26 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, (int)'#', 238);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 45);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


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
    hSLColor0.setSaturation(117);
    int i19 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i19 == 168);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initRGBbyHSL(23, 41, 42);
    hSLColor0.setLuminence(17);
    hSLColor0.initRGBbyHSL(47, 32, 243);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setSaturation(154);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 67);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.brighten((float)449);
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue(171);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.initRGBbyHSL(192, 169, 240);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 250);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


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
    hSLColor0.setSaturation((int)(byte)100);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


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
    hSLColor0.initRGBbyHSL(165, 234, 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setHue(311);
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.initHSLbyRGB(153, 171, 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


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
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getRed();
    hSLColor0.setLuminence(440);
    hSLColor0.setHue(202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(97, 239, 0);
    hSLColor0.blend(234, 239, (int)(short)100, (float)40);
    hSLColor0.brighten((float)73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 311);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.blend(70, 260, (int)(byte)0, 0.0f);
    hSLColor0.setLuminence(109);
    int i18 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 239);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(0, 1, 113);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(10);
    int i17 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 49, 49);
    hSLColor0.blend(260, (int)(short)0, 70, (float)239);
    int i19 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(123, (int)'a', (int)(byte)10);
    hSLColor0.setLuminence(194);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 243);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(102);
    hSLColor0.initHSLbyRGB((int)(byte)1, 225, 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    int i15 = hSLColor0.getBlue();
    hSLColor0.setSaturation(95);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 95);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getHue();
    int i23 = hSLColor0.getSaturation();
    hSLColor0.setHue(6);
    hSLColor0.setHue(169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


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
    hSLColor0.brighten((float)200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


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
    hSLColor0.initHSLbyRGB(255, (int)(short)-1, 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(93, 211, 137);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    int i18 = hSLColor0.getGreen();
    hSLColor0.blend(117, 212, 13, (float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setHue(23);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(137, 159, 260);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 137);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.blend(226, 243, 139, (float)83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    int i15 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(0, 226, 535);
    hSLColor0.initHSLbyRGB((int)' ', 0, 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    hSLColor0.initHSLbyRGB(60, 178, (int)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)169);
    int i22 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 198);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    int i15 = hSLColor0.getGreen();
    hSLColor0.setHue(106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation(60);
    hSLColor0.initRGBbyHSL(52, 25, 232);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 234);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)1);
    int i7 = hSLColor0.getLuminence();
    hSLColor0.blend(2, 152, 0, (float)262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setHue(153);
    hSLColor0.brighten((float)125);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 153);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation(129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(234, 234, 50);
    hSLColor0.setLuminence(254);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)216);
    hSLColor0.initHSLbyRGB(200, 61, 102);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(short)100, 17, 8);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getLuminence();
    int i26 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


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
    int i13 = hSLColor0.getGreen();
    hSLColor0.setSaturation(0);
    int i16 = hSLColor0.getGreen();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, (int)'#', 234);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(259);
    hSLColor0.setLuminence(252);
    hSLColor0.setSaturation((int)(byte)1);
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 252);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    hSLColor0.initHSLbyRGB(232, 0, (int)(short)-1);
    int i17 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(172, 52, 163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 232);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(5, 1, (int)' ');
    int i18 = hSLColor0.getRed();
    hSLColor0.setSaturation(255);
    hSLColor0.initRGBbyHSL(200, 48, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


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
    int i28 = hSLColor0.getBlue();
    int i29 = hSLColor0.getBlue();
    hSLColor0.setSaturation(251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    hSLColor0.setLuminence(10);
    hSLColor0.blend(151, 100, 203, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.brighten((float)45);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(263);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 127);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    hSLColor0.setLuminence(165);
    hSLColor0.setLuminence(200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


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
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i17 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 87);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(9);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 26);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(186, 213, 0);
    hSLColor0.initRGBbyHSL(262, 210, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.blend(33, 195, 0, (float)17);
    hSLColor0.setLuminence(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(250, 170, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, 192, 27);
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)10, 185, 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 47);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(277, 258, 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(243, 260, 234);
    hSLColor0.brighten((float)141);
    hSLColor0.brighten(0.0f);
    hSLColor0.initHSLbyRGB(179, 184, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getRed();
    
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

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue(9);
    
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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setHue(110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    hSLColor0.setSaturation(251);
    int i15 = hSLColor0.getRed();
    hSLColor0.setSaturation(151);
    hSLColor0.brighten((float)193);
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    hSLColor0.brighten((float)260);
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (-10), 90);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 30);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(101);
    hSLColor0.blend(311, 137, 125, (float)535);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


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
    int i19 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.brighten((float)41);
    hSLColor0.blend(239, 105, 125, (float)27);
    int i23 = hSLColor0.getGreen();
    int i24 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(193, (int)'#', 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 205);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(0, 30, 232);
    hSLColor0.initHSLbyRGB((int)'#', 3, 170);
    hSLColor0.setSaturation(194);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    hSLColor0.setSaturation(251);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation(72);
    
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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.reverseColor();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setSaturation(232);
    int i17 = hSLColor0.getHue();
    hSLColor0.setSaturation(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 214);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    hSLColor0.setLuminence(73);
    hSLColor0.blend(4, 87, 224, (float)48);
    int i23 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    int i8 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


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
    hSLColor0.brighten((float)178);
    
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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    hSLColor0.setSaturation(213);
    hSLColor0.blend(105, (int)(byte)100, 260, (float)24);
    hSLColor0.initHSLbyRGB(249, 25, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)72);
    hSLColor0.setSaturation(42);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(186);
    hSLColor0.initRGBbyHSL(251, 169, 311);
    hSLColor0.setHue(535);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(449);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)-1);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.blend(169, 169, 104, (float)8);
    hSLColor0.setLuminence(166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation(127);
    hSLColor0.brighten((float)449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 70);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)52);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(41, 198, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(179, 83, 73);
    
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

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    int i5 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getSaturation();
    int i21 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend((int)'#', 17, 50, (float)'a');
    int i16 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.setLuminence(0);
    hSLColor0.setSaturation(93);
    hSLColor0.blend(48, 181, 34, (float)53);
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 174);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setHue(165);
    hSLColor0.setLuminence(170);
    hSLColor0.initHSLbyRGB(34, 213, 54);
    
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
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.brighten((float)41);
    int i18 = hSLColor0.getRed();
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


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
    hSLColor0.initRGBbyHSL(254, 179, 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    hSLColor0.blend(131, 213, 32, 100.0f);
    hSLColor0.reverseColor();
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getGreen();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 189);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 123);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setHue(2);
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setHue(449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


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
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getHue();
    hSLColor0.setHue(182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 71);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((-5457));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


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
    hSLColor0.blend((int)(byte)1, (int)(short)0, (-1), (float)101);
    hSLColor0.initHSLbyRGB(113, 41, (int)(byte)10);
    hSLColor0.setLuminence(89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 94);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.blend((int)'#', 113, 113, (float)213);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setLuminence(73);
    int i17 = hSLColor0.getGreen();
    hSLColor0.blend(239, 188, 101, (float)'#');
    int i23 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 239);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getBlue();
    hSLColor0.setHue(128);
    hSLColor0.initHSLbyRGB(126, 0, 14);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 64);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.brighten((float)68);
    hSLColor0.brighten((float)186);
    hSLColor0.blend(14, (int)(short)-1, 240, (float)239);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 257);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getGreen();
    hSLColor0.blend(83, 0, 127, (float)252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setHue(2);
    hSLColor0.brighten((float)(byte)0);
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 200, 154, 0.0f);
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 311);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 231);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }


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
    int i18 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 173);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.setLuminence((int)(short)0);
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 311);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }


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
    hSLColor0.blend(153, 41, 214, (float)57);
    hSLColor0.setHue(249);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(193, 0, 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getGreen();
    hSLColor0.blend(6, 440, 249, (float)(-1));
    hSLColor0.initHSLbyRGB(249, 67, 135);
    hSLColor0.initRGBbyHSL(250, 0, 26);
    
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
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.blend(34, 0, (-5457), (float)184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(186);
    hSLColor0.setLuminence(92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 200, 154, 0.0f);
    int i20 = hSLColor0.getRed();
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setHue(89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((-11), 106, (int)' ');

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'a', 193, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(short)0, 45, 88);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(2);
    hSLColor0.setHue(123);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(48);
    int i16 = hSLColor0.getHue();
    hSLColor0.setSaturation(10);
    hSLColor0.initRGBbyHSL(56, 84, 88);
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation(97);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 31);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }


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
    hSLColor0.brighten((float)117);
    hSLColor0.reverseColor();
    
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
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    hSLColor0.initHSLbyRGB((int)'4', 169, 311);
    hSLColor0.setHue(251);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(0, 83, 95);
    
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.initRGBbyHSL(8, 173, 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    hSLColor0.setSaturation(59);
    hSLColor0.setHue(210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }


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
    hSLColor0.brighten((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 449);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getHue();
    hSLColor0.setLuminence(1);
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, (int)'#', 234);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setHue(128);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 117);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.blend(92, 177, 240, 100.0f);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 212);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setHue(449);
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 5);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.setLuminence(0);
    hSLColor0.setSaturation(93);
    int i14 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(0, 0, 258);
    hSLColor0.initRGBbyHSL(103, (-10), 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.blend(104, 52, (int)'4', (float)(byte)10);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 78);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(60, (int)' ', (int)(byte)0);
    hSLColor0.setHue(23);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getHue();
    hSLColor0.setSaturation(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 213);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setHue(33);
    hSLColor0.initRGBbyHSL(42, 41, 311);
    hSLColor0.initRGBbyHSL(248, 90, 0);
    int i26 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 90);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    hSLColor0.setLuminence(73);
    int i18 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 79);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    hSLColor0.initHSLbyRGB(232, 0, (int)(short)-1);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 116);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)52);
    hSLColor0.setHue(78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(33);
    hSLColor0.setLuminence(227);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)41);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)189);
    
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(113);
    hSLColor0.setSaturation(128);
    hSLColor0.blend(95, 265, 177, (float)172);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.setHue(60);
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)100);
    hSLColor0.setSaturation(149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 60);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.setHue(183);
    hSLColor0.blend((-11), 67, 57, (float)2);
    hSLColor0.setSaturation(186);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(93, 211, 137);
    hSLColor0.setSaturation(125);
    
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
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(78, 27, 131);
    hSLColor0.brighten((float)165);
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }


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
    int i23 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(10, (int)(short)100, 127);
    hSLColor0.setSaturation((int)(byte)0);
    hSLColor0.setHue(44);
    hSLColor0.setHue(200);
    
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    hSLColor0.setLuminence(165);
    hSLColor0.initRGBbyHSL(185, 40, 128);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 108);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 169);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 178);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }


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
    int i28 = hSLColor0.getLuminence();
    hSLColor0.setHue(108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 5);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }


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
    hSLColor0.initHSLbyRGB(449, 200, 178);
    int i35 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 178);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(277, 198, 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend((int)'#', 17, 50, (float)'a');
    hSLColor0.setLuminence((int)(byte)-1);
    int i18 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(226);
    int i22 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 226);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setSaturation(172);
    hSLColor0.setLuminence((int)(byte)0);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(260);
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB(1, 184, 41);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 41);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(104);
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)173);
    
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getHue();
    hSLColor0.setLuminence(195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 169);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(27, 185, 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.blend((int)(short)0, 13, (int)' ', (float)243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    hSLColor0.brighten((float)17);
    hSLColor0.blend(90, 186, 449, (float)193);
    hSLColor0.initHSLbyRGB(0, (int)(byte)-1, 194);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(250, 200, 16);
    
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
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)72);
    int i10 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(277, 73, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(127, 41, 260);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getRed();
    hSLColor0.setHue((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(169, 87, 85);
    hSLColor0.blend(174, 167, 4, (float)46);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL((int)'4', 72, 32);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(5, 104, 45);
    int i13 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)(byte)0, 0);
    hSLColor0.blend(8, 108, 149, (float)254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    hSLColor0.blend(249, 32, 128, 0.0f);
    hSLColor0.initRGBbyHSL(169, (int)' ', 243);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    hSLColor0.blend(131, 213, 32, 100.0f);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }


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
    int i20 = hSLColor0.getLuminence();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 68);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setLuminence(48);
    hSLColor0.setSaturation(255);
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setHue(23);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(137, 159, 260);
    hSLColor0.brighten((float)154);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)' ', 23, 151);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 23);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.blend(45, 49, (int)(short)10, (float)'4');
    hSLColor0.setHue(449);
    hSLColor0.blend(172, 168, 92, (float)123);
    hSLColor0.initHSLbyRGB(194, 220, 177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(33);
    hSLColor0.initRGBbyHSL(27, 171, 277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.brighten((float)165);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue(184);
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)1);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    int i16 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 88);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)227);
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten((float)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 126);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.initRGBbyHSL(257, 239, 17);
    hSLColor0.setLuminence(184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(39);
    hSLColor0.initHSLbyRGB(105, 16, 311);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)100L);
    hSLColor0.setSaturation(50);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 165, (int)' ');
    hSLColor0.setSaturation(104);
    hSLColor0.initHSLbyRGB(17, 17, (int)' ');
    int i18 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i18 == 17);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.blend((int)'#', 17, 50, (float)'a');
    hSLColor0.initHSLbyRGB((int)(short)10, 265, 0);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 133);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(1, 260, 1, (float)(byte)10);
    hSLColor0.setHue(240);
    hSLColor0.setSaturation(239);
    hSLColor0.setLuminence(83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation((int)'a');
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    hSLColor0.setHue(11);
    hSLColor0.setSaturation(159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(0, (int)'#', 234);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(259);
    hSLColor0.setSaturation(12);
    hSLColor0.initRGBbyHSL(0, 92, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 117);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.blend(86, 177, 183, (float)156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.setHue(68);
    int i22 = hSLColor0.getHue();
    hSLColor0.brighten((float)440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 68);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)277);
    hSLColor0.blend(83, 181, (int)(short)-1, (float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    hSLColor0.blend(255, 52, 49, (float)88);
    hSLColor0.setHue(159);
    hSLColor0.blend(251, 88, 449, (float)0L);
    hSLColor0.initHSLbyRGB(85, 0, (int)'4');

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setLuminence(78);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 78);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.blend(49, 2, (int)(byte)1, (float)192);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.blend((int)'4', (int)(short)0, (int)'#', 0.0f);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setLuminence(186);
    hSLColor0.setSaturation(61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }


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
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i27 == 148);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(169, 78, 173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 30);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setLuminence(205);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)126);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)97);
    int i18 = hSLColor0.getHue();
    hSLColor0.setLuminence(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 40);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.initHSLbyRGB(113, 0, 60);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(0);
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setHue(33);
    hSLColor0.setLuminence(265);
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 249);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(0, 263, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }


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
    int i30 = hSLColor0.getGreen();
    hSLColor0.blend((int)(byte)100, 170, 60, (float)16);
    hSLColor0.setSaturation(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }


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
    hSLColor0.initRGBbyHSL(257, 232, 241);
    
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)10);
    int i15 = hSLColor0.getRed();
    hSLColor0.setHue(189);
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.blend(33, 195, 0, (float)17);
    hSLColor0.initHSLbyRGB(126, 125, 168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(204, 33, 17);
    hSLColor0.setHue(178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }


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
    int i23 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 66);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }


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
    hSLColor0.blend(11, 220, 50, (float)61);
    
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
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }


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
    hSLColor0.setHue(90);
    
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
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(217, 100, (-10));
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(101, 153, 73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 5);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setHue(11);
    hSLColor0.blend(252, 0, 90, (float)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(34, 311, 188);
    hSLColor0.blend(449, 0, 40, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getGreen();
    hSLColor0.setHue(179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 45);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.initRGBbyHSL(535, 186, 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(106, 6, 0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }


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
    int i28 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 244);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.brighten((float)227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getRed();
    hSLColor0.brighten((float)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 251);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setSaturation(14);
    int i7 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setSaturation(17);
    hSLColor0.initRGBbyHSL(48, 40, (int)' ');
    hSLColor0.setHue(165);
    hSLColor0.initHSLbyRGB(48, 126, 89);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 114);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }


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
    hSLColor0.blend(241, 8, 14, (float)49);
    
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

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(165, 70, 178);
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 178);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    hSLColor0.setLuminence(10);
    hSLColor0.reverseColor();
    hSLColor0.blend(46, 49, 254, (float)(short)0);
    hSLColor0.brighten((float)224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }


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
    hSLColor0.setSaturation(311);
    hSLColor0.initRGBbyHSL(28, 125, 251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.setHue(183);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(178, (int)(short)10, 49);
    int i20 = hSLColor0.getBlue();
    hSLColor0.setSaturation(211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 49);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }


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
    hSLColor0.blend((int)(byte)0, 0, 0, (float)32);
    hSLColor0.initRGBbyHSL(30, 194, 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(short)1, 169, 88);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    hSLColor0.setSaturation(255);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setSaturation(45);
    hSLColor0.initRGBbyHSL((int)(byte)10, 0, 257);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setHue(73);
    
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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }


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
    hSLColor0.initRGBbyHSL(440, 40, 72);
    int i31 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(73, 45, 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 61);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.blend(17, 46, 53, (float)67);
    hSLColor0.initHSLbyRGB(4, (-1), 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(5, 1, (int)' ');
    hSLColor0.initRGBbyHSL(248, 71, 173);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL(213, 440, (int)(short)-1);
    hSLColor0.blend((int)(short)0, (int)(short)0, 213, (float)260);
    hSLColor0.initHSLbyRGB((int)'4', 193, 128);
    hSLColor0.initRGBbyHSL(186, 141, (int)(byte)-1);
    hSLColor0.brighten((float)171);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.initRGBbyHSL((-1), (int)(byte)-1, 104);
    hSLColor0.brighten((float)113);
    hSLColor0.setSaturation(102);
    int i18 = hSLColor0.getRed();
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    hSLColor0.initRGBbyHSL(210, 92, 178);
    int i26 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(byte)100, 259, 127, (float)42);
    hSLColor0.brighten((float)159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 92);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(257);
    int i11 = hSLColor0.getHue();
    hSLColor0.setSaturation(249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setHue(165);
    hSLColor0.initRGBbyHSL(141, 192, 188);
    
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
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue((int)(byte)0);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence(49);
    hSLColor0.blend((int)'a', 311, 127, (float)84);
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(109);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 220);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(104);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 104);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getGreen();
    hSLColor0.setSaturation(168);
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.initRGBbyHSL(32, 1, 0);
    hSLColor0.setHue(45);
    hSLColor0.blend(32, 535, 251, (float)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(113);
    hSLColor0.brighten((float)239);
    hSLColor0.initHSLbyRGB(227, 198, 137);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.initRGBbyHSL(24, 42, 23);
    hSLColor0.reverseColor();

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getBlue();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.initRGBbyHSL(262, 140, 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((int)' ', 70, 93);
    hSLColor0.setLuminence(168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(127, 41, 260);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setHue(137);
    int i18 = hSLColor0.getHue();
    hSLColor0.setHue(211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 137);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getRed();
    hSLColor0.brighten((float)56);
    hSLColor0.initHSLbyRGB(238, 214, 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(259, 148, 90);
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 90);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }


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
    int i27 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 255);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(141, 106, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.setHue(6);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 5);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    hSLColor0.setHue(239);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.initRGBbyHSL((int)'a', 113, (int)(short)100);
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.blend((int)(short)-1, 148, (-1), (float)169);
    int i28 = hSLColor0.getHue();
    int i29 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(86, 249, (-10));
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }


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
    hSLColor0.blend(153, 41, 214, (float)57);
    hSLColor0.setHue(249);
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getBlue();
    hSLColor0.blend(56, 25, 195, (float)67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 189);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test355"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'#', 216, 85);
    int i11 = hSLColor0.getBlue();
    hSLColor0.setHue(38);
    
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
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test356"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(241, 220, 51);
    
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
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test357"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.brighten((float)87);
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(151, (int)'#', 234);
    int i18 = hSLColor0.getSaturation();
    hSLColor0.blend(105, 46, (int)(byte)10, (float)231);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 210);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(83);
    hSLColor0.initRGBbyHSL(41, 138, 0);
    hSLColor0.initHSLbyRGB(216, 263, 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test359"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test360"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    hSLColor0.blend(213, 0, 17, (float)61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)'a', 0, (float)50);
    hSLColor0.setHue(216);
    hSLColor0.setSaturation(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test362"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    hSLColor0.blend((int)'4', 70, 85, (float)(short)-1);
    hSLColor0.setHue(311);
    hSLColor0.initHSLbyRGB(277, 4, 257);
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)1);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test364"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test365"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(103, 30, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(0, 40, 131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 255);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test367"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setHue(2);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(23);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-4));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test369"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(260);
    hSLColor0.brighten((float)59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test370"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setHue(102);
    hSLColor0.setLuminence(192);
    hSLColor0.setSaturation(185);
    hSLColor0.initRGBbyHSL(0, 251, 248);
    hSLColor0.setSaturation(143);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(397, 123, 159);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setHue(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 123);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((-1), 87, 178);
    hSLColor0.blend(255, 232, 0, (float)50);
    int i22 = hSLColor0.getHue();
    hSLColor0.setLuminence(93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 39);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.setSaturation(1);
    int i22 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test374"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    hSLColor0.blend(178, 113, 32, (float)35);
    hSLColor0.blend(193, 449, 0, (float)397);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test375"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test376"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(93);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test377"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(102);
    hSLColor0.initRGBbyHSL(185, (int)(byte)-1, 67);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 67);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(131, (int)(short)10, 35);
    hSLColor0.blend(68, 40, (int)'4', (float)255);
    hSLColor0.setSaturation(96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 72);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test379"); }


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
    hSLColor0.setLuminence(53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    hSLColor0.initHSLbyRGB(232, 0, (int)(short)-1);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getRed();
    hSLColor0.blend(202, 440, 17, (float)139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 232);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test381"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test382"); }


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
    int i28 = hSLColor0.getBlue();
    int i29 = hSLColor0.getBlue();
    hSLColor0.blend((int)'#', 168, (int)(byte)10, (float)186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    hSLColor0.setLuminence(195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test384"); }


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
    hSLColor0.blend(153, 41, 214, (float)57);
    hSLColor0.setHue(249);
    hSLColor0.reverseColor();
    int i27 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 42);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)1);
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test386"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.initRGBbyHSL(32, 1, 0);
    int i15 = hSLColor0.getHue();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test387"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    hSLColor0.setHue(249);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test388"); }


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
    int i28 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test389"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 260);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test390"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getRed();
    hSLColor0.setHue(173);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 56);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    hSLColor0.blend(169, 94, (int)(short)100, (float)0L);
    hSLColor0.setHue(214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)1, 169);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 169);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(212);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 135);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test395"); }


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
    int i23 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(10, (int)(short)100, 127);
    int i28 = hSLColor0.getGreen();
    int i29 = hSLColor0.getRed();
    int i30 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 69);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test396"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB((int)(short)1, 177, 57);
    hSLColor0.brighten((float)241);
    
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
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test397"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(88, 93, 249);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.blend(106, (int)(byte)1, 133, (float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 249);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test399"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 49);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(213);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.initRGBbyHSL((int)(short)100, 60, 100);
    hSLColor0.initHSLbyRGB(0, 139, 203);
    hSLColor0.setLuminence(140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test403"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.setHue(188);
    hSLColor0.setLuminence(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test404"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(51, 107, 88);
    hSLColor0.setHue(254);
    hSLColor0.setSaturation(30);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 98);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test405"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(100, (int)(byte)-1, 140);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(255);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test407"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(-1L));
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)10);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test408"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    hSLColor0.brighten((float)85);
    hSLColor0.setHue(83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(169, 243, 50);
    hSLColor0.setLuminence(188);
    int i17 = hSLColor0.getRed();
    hSLColor0.blend(231, 189, 169, (float)138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 202);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test410"); }


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
    hSLColor0.initRGBbyHSL(213, 117, (int)(short)10);
    
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
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test411"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setSaturation((int)'a');
    hSLColor0.blend(0, 42, 4, (float)154);
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(0, 1, 113);
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(46);
    hSLColor0.brighten((float)195);
    hSLColor0.setSaturation(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 113);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test413"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test414"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    hSLColor0.setLuminence(88);
    hSLColor0.brighten((float)171);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test415"); }


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
    hSLColor0.setSaturation(110);
    hSLColor0.blend(57, 148, 240, (float)4);
    hSLColor0.brighten((float)79);
    
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
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.brighten((float)87);
    hSLColor0.brighten((float)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setLuminence(59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test418"); }


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
    hSLColor0.setLuminence(36);
    int i23 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 31);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setHue(33);
    hSLColor0.blend(243, 104, 100, (float)49);
    hSLColor0.setLuminence(78);
    hSLColor0.reverseColor();
    hSLColor0.blend(25, 11, 57, (float)234);
    hSLColor0.reverseColor();
    int i32 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 172);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    hSLColor0.brighten((float)' ');
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test421"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(37);
    hSLColor0.reverseColor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test422"); }


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
    hSLColor0.setHue(204);
    int i33 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 204);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
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
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)159);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(143, 183, 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.brighten((float)178);
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test426"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.brighten((float)202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    hSLColor0.setHue(140);
    int i12 = hSLColor0.getHue();
    hSLColor0.setLuminence(36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 140);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test429"); }


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
    int i28 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 52);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend(0, 165, 30, (float)88);
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
    org.junit.Assert.assertTrue(i13 == 165);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test431"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL(213, 440, (int)(short)-1);
    hSLColor0.blend((int)(short)0, (int)(short)0, 213, (float)260);
    hSLColor0.setSaturation(0);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test432"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(46, 8, 0);
    hSLColor0.brighten((float)83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.brighten((float)204);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getRed();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test435"); }


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
    int i26 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 255);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test436"); }


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
    hSLColor0.blend(0, 104, 48, (float)84);
    hSLColor0.brighten((float)105);
    int i22 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i22 == 255);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test437"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 165, (int)' ');
    hSLColor0.setSaturation(104);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test438"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 226);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test440"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.initHSLbyRGB((int)'4', 105, 153);
    hSLColor0.setHue(52);
    hSLColor0.setSaturation(163);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test441"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(49, 64, 259);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 154);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test442"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(56, 232, 141);
    int i17 = hSLColor0.getBlue();
    hSLColor0.setLuminence(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 37);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)-1, 4, 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    int i16 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test445"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setLuminence(113);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 111);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test446"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.blend(260, 185, 210, (float)85);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 260);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test447"); }


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
    int i19 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(116, 8, 41);
    
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
    org.junit.Assert.assertTrue(i19 == 214);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test448"); }


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
    hSLColor0.initHSLbyRGB(188, 255, 126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    hSLColor0.blend(255, 52, 49, (float)88);
    int i17 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 152);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(byte)100);
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(34, 73, 0);
    hSLColor0.brighten((float)125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 24);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test451"); }


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
    hSLColor0.initRGBbyHSL(84, 148, 48);
    
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
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test452"); }


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
    int i17 = hSLColor0.getRed();
    hSLColor0.brighten((float)252);
    
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
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.blend((int)(short)-1, 148, (-1), (float)169);
    int i28 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(217);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 258);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test454"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.blend(50, 0, 181, (float)259);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(9, 89, 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test455"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.blend(45, 49, (int)(short)10, (float)'4');
    int i20 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 49);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test456"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(2);
    hSLColor0.initRGBbyHSL(40, 169, 2);
    hSLColor0.blend(25, 181, 449, 0.0f);
    hSLColor0.initRGBbyHSL(47, 249, 50);
    
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
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test457"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getRed();
    int i21 = hSLColor0.getGreen();
    hSLColor0.setSaturation(126);
    int i24 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 239);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test458"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    int i11 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)-1);
    hSLColor0.blend((int)(byte)100, 60, 85, 0.0f);
    hSLColor0.initHSLbyRGB(72, 113, 100);
    int i23 = hSLColor0.getLuminence();
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 72);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test460"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(227);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test462"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)10);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)1, 169);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(262, (int)'#', 133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.initRGBbyHSL(257, 127, (int)(short)100);
    hSLColor0.initRGBbyHSL(11, 129, 170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)10);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(440);
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test466"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getRed();
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(-1L));
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getHue();
    hSLColor0.setSaturation(214);
    hSLColor0.blend(95, 12, 56, (float)61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test468"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(243, 260, 234);
    hSLColor0.brighten((float)141);
    hSLColor0.blend(212, 53, (int)'a', 0.0f);
    hSLColor0.setLuminence(151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL(46, 5, 64);
    hSLColor0.initHSLbyRGB(28, (int)'4', 259);
    hSLColor0.initHSLbyRGB(74, 227, 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getRed();
    hSLColor0.blend(49, 53, 7, (float)16);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test471"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(235);
    
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
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test472"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence(113);
    hSLColor0.initHSLbyRGB(71, 51, 0);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test473"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)151);
    hSLColor0.setLuminence((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test474"); }


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
    int i23 = hSLColor0.getGreen();
    hSLColor0.setHue(165);
    int i26 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 255);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test475"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getHue();
    hSLColor0.setLuminence(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    hSLColor0.setHue(257);
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)227);
    hSLColor0.initHSLbyRGB(87, 88, 97);
    hSLColor0.setHue(72);
    hSLColor0.blend(182, 195, 111, (float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test478"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)1);
    int i20 = hSLColor0.getGreen();
    int i21 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test479"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(2, 40, 52);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 60);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test480"); }


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
    hSLColor0.setSaturation(117);
    hSLColor0.initHSLbyRGB(165, 232, 168);
    
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
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test481"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(24, 138, 244);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 127);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test482"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test483"); }


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
    int i25 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(122, 239, (int)(byte)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 127);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)0, 128, 53);
    hSLColor0.setLuminence(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test485"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(127);
    int i12 = hSLColor0.getHue();
    hSLColor0.blend(0, 166, 244, (float)182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.brighten((float)87);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(203, 0, 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(68);
    
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
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(35);
    hSLColor0.initHSLbyRGB(260, (int)(short)100, (int)(short)10);
    int i15 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getGreen();
    hSLColor0.brighten((float)88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 171);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 5);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test491"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(97, 239, 0);
    int i14 = hSLColor0.getHue();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 67);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.setLuminence(0);
    hSLColor0.setSaturation(93);
    int i14 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(0, 0, 258);
    hSLColor0.setHue(52);
    hSLColor0.blend(0, 151, 202, (float)39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test493"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getBlue();
    hSLColor0.brighten((float)71);
    hSLColor0.blend(251, 97, 192, (float)126);
    hSLColor0.setLuminence(102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    int i5 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 128);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test495"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(60, (int)' ', (int)(byte)0);
    hSLColor0.brighten((float)52);
    
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
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(53, 68, 44);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test497"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)0, 45, (int)'a');
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getBlue();
    hSLColor0.setLuminence(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 97);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getRed();
    hSLColor0.setLuminence(41);
    int i13 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 41);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.initHSLbyRGB(37, 99, 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test500"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

}
