
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(249);
    hSLColor0.initHSLbyRGB(92, (int)(byte)10, 84);
    hSLColor0.setSaturation(266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test002"); }


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
    hSLColor0.initHSLbyRGB(50, 78, 71);
    int i29 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 71);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 60);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)'a', 0, (float)50);
    hSLColor0.setHue(216);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 216);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(78);
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    hSLColor0.initRGBbyHSL(97, 86, 193);
    hSLColor0.initHSLbyRGB(84, 127, 107);
    hSLColor0.setHue(169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)'4');
    hSLColor0.brighten((float)183);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(193);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 220);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test010"); }


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
    hSLColor0.setHue((int)(short)-1);
    int i15 = hSLColor0.getLuminence();
    
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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.setHue(68);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(26);
    
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)123);
    hSLColor0.initHSLbyRGB(202, (-5457), 16);
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-5457));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.initHSLbyRGB(311, (int)'a', 101);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getRed();
    hSLColor0.blend(102, 254, 143, (float)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 311);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(260);
    hSLColor0.setHue(48);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
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

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.initRGBbyHSL((int)(short)-1, 50, 52);
    hSLColor0.brighten((float)239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getRed();
    hSLColor0.setLuminence(175);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.blend(244, (int)(short)1, 30, (float)96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getRed();
    hSLColor0.blend(168, 89, 216, (float)(short)0);
    hSLColor0.setHue(262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(23);
    int i13 = hSLColor0.getRed();
    hSLColor0.setLuminence(185);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test023"); }


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
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)0, 92);
    hSLColor0.setSaturation(254);
    hSLColor0.brighten((float)162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(234, 186, 214);
    hSLColor0.blend(71, 244, 137, (float)110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test025"); }


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
    hSLColor0.brighten((float)179);
    
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

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test026"); }


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
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((-11), 257, 166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.initHSLbyRGB(311, (int)'a', 101);
    hSLColor0.brighten((float)192);
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 254);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue(234);
    hSLColor0.brighten((float)141);
    hSLColor0.setLuminence(202);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(35, 16, 67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 127);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test031"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 200, 154, 0.0f);
    hSLColor0.setLuminence((-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(169);
    hSLColor0.setSaturation(240);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 88);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test033"); }


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
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(83, 96, 174);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getRed();
    
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.brighten(0.0f);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 60);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setHue(23);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setHue(235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    hSLColor0.brighten((float)128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)'#');
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(214, 36, 56);
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 56);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.setLuminence(8);
    hSLColor0.setHue(194);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 194);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    hSLColor0.blend(95, 7, (int)(byte)1, (float)149);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getBlue();
    hSLColor0.brighten((float)26);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getLuminence();
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    hSLColor0.setSaturation(117);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getGreen();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 27);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setSaturation(102);
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getBlue();
    hSLColor0.blend(173, 37, 113, (float)49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 49);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(127, 41, 260);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(169, 243, 50);
    hSLColor0.setLuminence(188);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 247);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.setHue(183);
    hSLColor0.setLuminence(23);
    hSLColor0.reverseColor();

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setSaturation(45);
    hSLColor0.blend(260, 262, 162, (float)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test050"); }


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
    org.junit.Assert.assertTrue(i14 == 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(169);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 169);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 182);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test053"); }


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
    hSLColor0.brighten((float)249);
    hSLColor0.brighten((float)68);
    hSLColor0.initRGBbyHSL(85, 98, 259);
    hSLColor0.setSaturation(240);
    
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test054"); }


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
    int i32 = hSLColor0.getHue();
    hSLColor0.setLuminence(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 106);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test055"); }


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
    hSLColor0.setSaturation(260);
    int i29 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 244);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.blend(244, 83, 0, (float)179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setHue((int)(byte)1);
    int i12 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(210, 243, 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.setSaturation((int)' ');
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 128);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(169, 87, 85);
    hSLColor0.setSaturation((int)'4');
    hSLColor0.setSaturation(440);
    hSLColor0.setSaturation(148);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(169, 0, 101, (float)48);
    hSLColor0.initRGBbyHSL((-10), 211, 66);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    hSLColor0.blend(45, 213, 1, (float)(short)-1);
    int i14 = hSLColor0.getHue();
    hSLColor0.setLuminence(87);
    int i17 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)100);
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setHue(165);
    hSLColor0.setSaturation(251);
    hSLColor0.setSaturation(79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test064"); }


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
    int i28 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test065"); }


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
    hSLColor0.setSaturation(260);
    int i29 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 136);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    hSLColor0.setSaturation(200);
    hSLColor0.brighten((float)138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.setHue(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getBlue();
    hSLColor0.setHue(39);
    hSLColor0.setSaturation((int)'#');
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 39);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test070"); }


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
    hSLColor0.setSaturation(214);
    hSLColor0.initRGBbyHSL(15, 17, 186);
    
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    hSLColor0.blend(255, 52, 49, (float)88);
    hSLColor0.setHue(159);
    hSLColor0.blend(251, 88, 449, (float)0L);
    int i24 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(193, 94, 125);
    hSLColor0.initRGBbyHSL(195, (int)'#', 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 49);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.blend(188, 106, 46, (float)156);
    hSLColor0.setHue(40);
    hSLColor0.setLuminence(248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    int i9 = hSLColor0.getRed();
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL(38, 212, 6);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 38);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.setHue(212);
    hSLColor0.blend(70, 60, 74, (float)149);
    hSLColor0.setSaturation(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.setSaturation(105);
    int i5 = hSLColor0.getBlue();
    hSLColor0.setLuminence(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test077"); }


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
    int i23 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(57, 251, 1);
    int i28 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 251);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getBlue();
    int i16 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getBlue();
    int i20 = hSLColor0.getRed();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getLuminence();
    hSLColor0.brighten(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 85);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    int i11 = hSLColor0.getHue();
    hSLColor0.setHue(259);
    hSLColor0.blend(125, 152, 32, (float)311);
    int i19 = hSLColor0.getRed();
    hSLColor0.blend(247, 38, 39, (float)226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 125);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test081"); }


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
    int i17 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(138, 85, (int)(short)0);
    hSLColor0.setHue(239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    hSLColor0.initRGBbyHSL(216, 75, 89);
    hSLColor0.reverseColor();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(60);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 38);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setSaturation((int)(byte)100);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(263, 33, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 68);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test085"); }


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
    int i30 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setSaturation(14);
    hSLColor0.blend(230, 169, 168, (float)263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(239);
    int i11 = hSLColor0.getGreen();
    
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

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)-1, 49);
    hSLColor0.brighten((float)232);
    hSLColor0.setHue(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((-1), 87, 178);
    hSLColor0.blend(255, 232, 0, (float)50);
    int i22 = hSLColor0.getRed();
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 128);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(52);
    hSLColor0.setHue(177);
    int i9 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(177, 92, (-11));
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-11));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)-1, 49);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(94, 113, 131);
    hSLColor0.setLuminence(128);
    hSLColor0.initHSLbyRGB(4, (int)(short)100, 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 49);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    int i7 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 255);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.initHSLbyRGB(57, 61, 93);
    hSLColor0.initRGBbyHSL(74, 37, 127);
    hSLColor0.setLuminence(212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.setLuminence(87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(136, (-10), 82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(116, 227, 137, (float)89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(186, 213, 0);
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 49, 49);
    hSLColor0.blend(260, (int)(short)0, 70, (float)239);
    hSLColor0.initRGBbyHSL(23, 126, 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    hSLColor0.setLuminence(153);
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 186);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setHue(6);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getBlue();
    hSLColor0.blend(92, 203, 32, (float)5);
    
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getGreen();
    hSLColor0.setLuminence(87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 53);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(88, 10, 105);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 109);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setSaturation(172);
    hSLColor0.blend(252, 3, 24, 0.0f);
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.reverseColor();
    hSLColor0.setHue(212);
    hSLColor0.blend(70, 60, 74, (float)149);
    hSLColor0.setLuminence(243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(short)-1, 48, (int)(short)10, (float)100L);
    int i15 = hSLColor0.getRed();
    hSLColor0.setLuminence(145);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setHue(277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.initRGBbyHSL(100, 10, (int)(short)-1);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.setHue(183);
    hSLColor0.blend((-11), 67, 57, (float)2);
    hSLColor0.setLuminence(101);
    hSLColor0.initHSLbyRGB(266, 44, 48);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB((int)(short)1, 177, 57);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 252);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(49, 64, 259);
    hSLColor0.setHue(123);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 154);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test115"); }


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
    hSLColor0.setSaturation((-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test116"); }


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
    hSLColor0.brighten((float)74);
    int i32 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 106);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.brighten((float)(byte)100);
    int i21 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(254, 0, 129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.initRGBbyHSL(84, 0, 126);
    hSLColor0.setLuminence(84);
    hSLColor0.setLuminence(214);
    hSLColor0.setSaturation(85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setHue(0);
    int i10 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.setSaturation(2);
    hSLColor0.initRGBbyHSL(38, 126, (int)(byte)100);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test121"); }


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
    int i27 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    int i10 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(17, 255, 0);
    int i15 = hSLColor0.getRed();
    int i16 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    hSLColor0.blend(45, 213, 1, (float)(short)-1);
    int i14 = hSLColor0.getRed();
    hSLColor0.setSaturation(72);
    
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(169);
    hSLColor0.setLuminence(181);
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(185, 232, 109);
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(15, 238, 102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 230);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 232);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(168);
    hSLColor0.brighten((float)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    hSLColor0.brighten((float)178);
    hSLColor0.brighten((float)184);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test127"); }


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
    int i31 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 192);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    hSLColor0.brighten((float)125);
    hSLColor0.blend(40, 154, (int)(byte)0, (float)73);
    hSLColor0.setLuminence(170);
    hSLColor0.initRGBbyHSL((int)(byte)1, 9, 263);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.blend(96, 35, 214, (float)195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 88);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.setHue(257);
    hSLColor0.blend(88, 5, 2, (float)(short)0);
    int i21 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test133"); }


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
    int i20 = hSLColor0.getGreen();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 169);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test134"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    hSLColor0.setHue(247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getSaturation();
    
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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test136"); }


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
    hSLColor0.blend(84, 89, 59, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)' ');
    hSLColor0.initHSLbyRGB(193, 194, 183);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.setSaturation(257);
    hSLColor0.setHue(227);
    hSLColor0.initRGBbyHSL(56, 24, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)159);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.initRGBbyHSL(10, (-10), 74);
    
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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, 35, 249);
    hSLColor0.setHue(13);
    hSLColor0.blend(0, 53, 188, 1.0f);
    
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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(232, (int)(short)0, 40);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(10, 50, 36);
    hSLColor0.initHSLbyRGB(26, 69, 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 40);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test143"); }


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
    int i17 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setLuminence(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 195);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(259, 148, 90);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 259);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test145"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)1);
    hSLColor0.brighten((float)220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test146"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(15);
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 15);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)169);
    int i5 = hSLColor0.getHue();
    hSLColor0.setHue(212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 127);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)'4', 49, 49);
    hSLColor0.blend(260, (int)(short)0, 70, (float)239);
    hSLColor0.setHue(192);
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 192);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
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
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.blend(255, 178, 240, (float)168);
    hSLColor0.initHSLbyRGB(57, 212, 50);
    int i17 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getBlue();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 210);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 75);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    int i10 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(0, 66, 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(277, 9, 50);
    hSLColor0.blend(204, 100, 28, (float)218);
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 18);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.initRGBbyHSL(440, 1, (int)(short)1);
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getGreen();
    hSLColor0.brighten((float)240);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getBlue();
    hSLColor0.setSaturation(184);
    hSLColor0.initHSLbyRGB(156, 140, 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 51);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.setHue(93);
    hSLColor0.brighten((float)137);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(260);
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB(1, 184, 41);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 93);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(440, 169, 6);
    int i17 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(210, 232, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 169);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getBlue();
    hSLColor0.setHue(39);
    int i23 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(17, 210, 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 5);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setHue(195);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test162"); }


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
    hSLColor0.setLuminence(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 86);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(202);
    hSLColor0.initRGBbyHSL(9, 227, 159);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL((int)'#', 259, (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 159);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.blend(45, 49, (int)(short)10, (float)'4');
    hSLColor0.setHue(449);
    int i22 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(101);
    hSLColor0.blend(71, (int)(short)100, 46, (float)(short)100);
    int i30 = hSLColor0.getGreen();
    hSLColor0.setLuminence(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 100);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    hSLColor0.brighten(0.0f);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(255, 25, 40);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(172);
    hSLColor0.setSaturation(82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 140);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test167"); }


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
    int i24 = hSLColor0.getLuminence();
    hSLColor0.blend(0, (int)(short)1, 127, (float)100L);
    
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
    org.junit.Assert.assertTrue(i24 == 35);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(5, 104, 45);
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initHSLbyRGB(178, (int)(short)10, (int)(byte)0);
    hSLColor0.setLuminence(94);
    hSLColor0.initRGBbyHSL(185, (-1), (-11));
    hSLColor0.brighten((float)90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(short)-1);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.blend(30, 50, 0, (float)168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test172"); }


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
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(234, 186, 214);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(88, 243, (int)'4');
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(57, 57, 33);
    hSLColor0.setHue(0);
    hSLColor0.brighten((float)1L);
    hSLColor0.setSaturation(2);
    int i23 = hSLColor0.getSaturation();
    int i24 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 45);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(38, 26, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 251);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.blend(25, 117, 90, (float)5);
    hSLColor0.setSaturation(46);
    
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test178"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)1, 169);
    hSLColor0.setLuminence((int)(byte)1);
    hSLColor0.brighten((float)148);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.brighten((float)68);
    hSLColor0.setSaturation(0);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 239);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)169);
    hSLColor0.initHSLbyRGB(397, 133, 116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(40);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(255, (int)(byte)1, 70);
    int i13 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(145, 227, 397);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 70);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(5);
    int i14 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(263, 151, 0);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 263);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend(141, 59, 8, (float)73);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 227);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test187"); }


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
    hSLColor0.brighten((float)170);
    int i23 = hSLColor0.getHue();
    hSLColor0.blend(71, 231, 136, (float)272);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 71);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(2, 244, 133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(48);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getRed();
    hSLColor0.brighten((float)6);
    hSLColor0.setHue(218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-10));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getRed();
    hSLColor0.blend(75, 68, 248, (float)162);
    
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
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setHue(87);
    hSLColor0.setHue(69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test192"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test193"); }


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
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.initHSLbyRGB(181, 101, 14);
    hSLColor0.setHue(135);
    
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(short)100);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(40, 257, 113);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    hSLColor0.brighten((float)177);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    hSLColor0.brighten((float)260);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    hSLColor0.setLuminence(109);
    
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test199"); }


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
    int i13 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(56, 33, 0);
    hSLColor0.brighten((float)243);
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    int i12 = hSLColor0.getBlue();
    hSLColor0.setHue(259);
    hSLColor0.brighten((float)128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.blend((int)'#', 249, 32, (float)104);
    hSLColor0.brighten((float)0);
    hSLColor0.blend(168, (int)'a', 311, (float)'#');
    hSLColor0.setSaturation(154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.setLuminence(66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)'#', (int)(short)1, (int)(byte)0);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getBlue();
    hSLColor0.setSaturation(184);
    
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(36, 14, 5);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 13);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.initRGBbyHSL(440, 1, (int)(short)1);
    hSLColor0.setSaturation(0);
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 64);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setSaturation(45);
    
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test208"); }


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
    hSLColor0.setHue(184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(193);
    int i11 = hSLColor0.getBlue();
    hSLColor0.setHue(108);
    
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

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 178);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    hSLColor0.setLuminence(73);
    hSLColor0.setLuminence(0);
    hSLColor0.setHue((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.setHue((int)'#');
    hSLColor0.initRGBbyHSL(168, (int)'4', 93);
    int i21 = hSLColor0.getHue();
    hSLColor0.setSaturation(56);
    hSLColor0.setSaturation(30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 168);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(88, 10, 105);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(48, 169, 60);
    hSLColor0.setLuminence(38);
    hSLColor0.blend(257, (int)(byte)-1, 212, 100.0f);
    
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test218"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)165);
    hSLColor0.initHSLbyRGB(74, 255, 267);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.blend(92, 177, 240, 100.0f);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)235);
    hSLColor0.initHSLbyRGB(127, 10, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 128);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.setSaturation(32);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getRed();
    
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    hSLColor0.setLuminence(73);
    hSLColor0.setSaturation(266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setSaturation(17);
    hSLColor0.initRGBbyHSL(48, 40, (int)' ');
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.blend((int)'#', 249, 32, (float)104);
    hSLColor0.brighten((float)0);
    hSLColor0.blend(168, (int)'a', 311, (float)'#');
    hSLColor0.setSaturation(214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

}
