
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getRed();
    
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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(byte)1, 1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    int i13 = hSLColor0.getBlue();
    
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
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)0, 93, 40);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.setHue((int)' ');
    int i19 = hSLColor0.getHue();
    hSLColor0.setLuminence((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setSaturation(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(449, 169, 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.blend(85, 70, 311, (float)(short)1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(byte)-1, (int)' ', 45, (float)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend((int)(byte)10, 104, 260, (float)178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(70);
    
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

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(232, (int)(short)0, 40);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(104);
    
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(70, 87, (int)(byte)0, (float)214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'#');
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setHue((int)(byte)1);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getSaturation();
    
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


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
    int i22 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(short)1, 169, 88);
    int i8 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.brighten((float)232);
    hSLColor0.setLuminence(93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.initHSLbyRGB(178, 52, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(0.0f);
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


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
    hSLColor0.brighten((float)97);
    
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.initRGBbyHSL(88, (int)(byte)100, 93);
    hSLColor0.setLuminence(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.blend(449, 186, 87, (float)50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setLuminence(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(short)0, 60, 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 151);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.blend(0, 35, 311, (float)'4');
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 165);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(165, 234, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(35);
    hSLColor0.initHSLbyRGB(260, (int)(short)100, (int)(short)10);
    hSLColor0.setLuminence(127);
    hSLColor0.brighten((float)70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(260, 113, (int)(short)0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(5, 104, 45);
    hSLColor0.initHSLbyRGB(70, 50, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    int i16 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(byte)100);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 48);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.blend((int)'4', (int)(short)0, (int)'#', 0.0f);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 50);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)-1);
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend(178, 243, 0, (float)87);
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setLuminence(239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


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
    hSLColor0.reverseColor();
    
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 113);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


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
    hSLColor0.setHue(255);
    
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(186);
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getHue();
    hSLColor0.blend(0, 249, 0, (float)2);
    
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    hSLColor0.initRGBbyHSL((int)(byte)0, 214, 48);
    
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    hSLColor0.blend(104, 52, (int)'4', (float)(byte)10);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)'a', 0, (float)50);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(232, 5, 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


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
    int i28 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 440);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setHue(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


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
    hSLColor0.setLuminence(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.initHSLbyRGB(52, 93, 159);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(243, 88, 97);
    hSLColor0.initRGBbyHSL(0, 25, 87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(23, 72, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.initRGBbyHSL(0, (int)' ', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(32);
    
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setHue(48);
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 93);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


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
    int i24 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initRGBbyHSL(50, 100, 33);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((int)' ', 70, 93);
    hSLColor0.initRGBbyHSL(151, 85, 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(260, 0, 60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


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
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 0);
    
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(104);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setHue(127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 104);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(213);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.initHSLbyRGB(5, 68, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    hSLColor0.setLuminence(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(10, 192, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    hSLColor0.brighten((float)45);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.blend(35, 51, 101, (float)1);
    hSLColor0.blend(84, 60, (int)(short)10, 0.0f);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(short)-1, 48, (int)(short)10, (float)100L);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 265);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getSaturation();
    
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(213);
    hSLColor0.brighten((float)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 39);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


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
    int i18 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i18 == 78);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)32);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 449);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 177);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)(byte)0);
    hSLColor0.setLuminence(33);
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setHue(10);
    
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
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.initRGBbyHSL(32, 1, 0);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.blend(104, 105, 234, (float)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i3 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(42, 239, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(32);
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.blend(104, 97, 0, (float)49);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    hSLColor0.brighten((float)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getHue();
    int i2 = hSLColor0.getLuminence();
    int i3 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)128);
    int i12 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(5, 104, 45);
    hSLColor0.setLuminence(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(2, 40, 52);
    hSLColor0.initHSLbyRGB(257, 72, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getRed();
    hSLColor0.blend(178, 70, 234, (float)100L);
    
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    hSLColor0.blend(70, 311, 449, (float)151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.brighten((-1.0f));
    hSLColor0.initRGBbyHSL(127, 101, 17);
    
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


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
    int i15 = hSLColor0.getLuminence();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 50);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    hSLColor0.brighten(0.0f);
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten((float)(-1L));
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 186);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    int i8 = hSLColor0.getBlue();
    hSLColor0.brighten((float)1);
    
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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(137, 23, 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 311);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


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
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


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
    int i23 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(213, 45, 128, (float)169);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)-1);
    hSLColor0.setSaturation(17);
    hSLColor0.setLuminence(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 165, (int)' ');
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
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(50, 255, (int)(short)1);
    hSLColor0.setHue(181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    hSLColor0.setHue(41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(17);
    int i23 = hSLColor0.getHue();
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 46);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(10, 234, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    int i16 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(257, 57, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


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
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


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
    int i19 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.setHue(249);
    hSLColor0.initHSLbyRGB(181, 78, 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 50);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getHue();
    hSLColor0.brighten((float)213);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.initRGBbyHSL(232, 49, 234);
    hSLColor0.setHue(46);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setSaturation(232);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 255);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


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
    int i17 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 234);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(151);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(159, (int)(short)0, 39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)1);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initRGBbyHSL(213, 0, (int)(short)1);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation(60);
    hSLColor0.initRGBbyHSL(151, 87, 88);
    hSLColor0.setHue(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.brighten((float)169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(255, 10, 101);
    hSLColor0.brighten((float)60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


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
    hSLColor0.setLuminence(240);
    
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
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(97, (int)' ', (int)(short)100);
    hSLColor0.setHue(33);
    hSLColor0.brighten((float)113);
    int i16 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(short)10);
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(177, 70, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(57, 0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    hSLColor0.setSaturation((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1));
    
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 260);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    hSLColor0.setLuminence(70);
    int i8 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 70);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


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
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


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
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 27);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getBlue();
    
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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getRed();
    hSLColor0.blend(39, (int)(byte)100, 41, 10.0f);
    
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


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
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setHue(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 125);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


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
    hSLColor0.blend(240, 0, 192, (float)78);
    
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.setHue(102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.brighten((float)(byte)-1);
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(33);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)-1);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 49);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.setHue(178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(5, 1, (int)' ');
    hSLColor0.blend(78, 35, 214, 0.0f);
    hSLColor0.initRGBbyHSL(70, 257, 14);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)-1);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)159);
    hSLColor0.reverseColor();
    hSLColor0.setHue(0);
    hSLColor0.initHSLbyRGB(25, 213, 125);
    
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
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)181);
    
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

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(14, 234, 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 14);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setSaturation(45);
    hSLColor0.initRGBbyHSL((int)(byte)10, 0, 257);
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 257);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)128);
    hSLColor0.initRGBbyHSL(101, (int)(byte)100, 151);
    
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

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.initHSLbyRGB(17, (int)(byte)100, 249);
    hSLColor0.brighten((float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(85);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)1L);
    hSLColor0.initRGBbyHSL((int)(short)100, (int)' ', 239);
    hSLColor0.brighten((float)212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.blend(78, 255, 186, (float)(short)0);
    int i13 = hSLColor0.getBlue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(5, 1, (int)' ');
    int i18 = hSLColor0.getRed();
    hSLColor0.setSaturation(255);
    int i21 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    hSLColor0.brighten((float)17);
    hSLColor0.setLuminence(137);
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(17);
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-11));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(0, (-1), 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence(49);
    hSLColor0.initRGBbyHSL(33, 210, 159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.brighten(0.0f);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(449);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)1);
    hSLColor0.blend(243, 227, 184, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 186);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(45);
    hSLColor0.blend(35, 0, 32, (float)40);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setHue(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    int i21 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 45);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.setSaturation(39);
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.initRGBbyHSL((int)'a', 113, (int)(short)100);
    hSLColor0.initRGBbyHSL(53, 265, 113);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.initRGBbyHSL(32, 1, 0);
    hSLColor0.initRGBbyHSL(192, 254, 87);
    hSLColor0.blend(17, 168, (int)(short)10, (float)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)1, 169);
    hSLColor0.setLuminence((int)(byte)1);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 249);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


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
    hSLColor0.initHSLbyRGB(94, 169, 239);
    hSLColor0.setSaturation(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)1L);
    hSLColor0.initRGBbyHSL((int)(short)100, (int)' ', 239);
    hSLColor0.initRGBbyHSL(0, 192, 17);
    int i22 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 17);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


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
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 188);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i13 == 50);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(short)0, 45, 88);
    int i18 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 148);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.blend(56, 193, 243, (float)243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


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
    hSLColor0.initRGBbyHSL(46, (-1), 52);
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
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(97, 239, 0);
    hSLColor0.blend(234, 239, (int)(short)100, (float)40);
    hSLColor0.setHue(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 311);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.blend((int)'a', 216, 148, (float)184);
    
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

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setHue((int)(byte)1);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(50, 0, 70);
    hSLColor0.setLuminence(210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)100);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.setHue(60);
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue(216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getHue();
    hSLColor0.blend((-1), 193, 33, (float)17);
    hSLColor0.setHue(41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


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
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 42);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.setLuminence((int)(short)0);
    int i15 = hSLColor0.getHue();
    hSLColor0.blend(1, 104, 195, (float)88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 85);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i7 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)' ', 169, 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    hSLColor0.blend(249, 32, 128, 0.0f);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 48);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.setSaturation((int)' ');
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(45);
    int i12 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 90);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


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
    hSLColor0.setHue(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(2, 40, 52);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 45);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setLuminence(165);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 73);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.blend(165, 0, 39, (float)'a');
    hSLColor0.brighten((float)105);
    hSLColor0.brighten((float)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(255, (int)(byte)1, 70);
    hSLColor0.blend(168, 178, 0, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(88, 93, 249);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(186);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(40, 257, 113);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 257);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getBlue();
    hSLColor0.brighten((float)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(249, 251, 131);
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 131);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    hSLColor0.setSaturation(213);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.blend((int)'#', 32, 154, (float)154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 165, (int)' ');
    hSLColor0.setLuminence(117);
    
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setSaturation(17);
    hSLColor0.initRGBbyHSL(48, 40, (int)' ');
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 48);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getBlue();
    int i25 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 178);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


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
    hSLColor0.setLuminence(100);
    int i31 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 59);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(101);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)159);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)51);
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
    org.junit.Assert.assertTrue(i10 == 127);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


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
    hSLColor0.setLuminence(216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getRed();
    int i8 = hSLColor0.getRed();
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.brighten((float)113);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.blend(449, 254, 32, (float)105);
    hSLColor0.initRGBbyHSL(41, 184, 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


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
    int i16 = hSLColor0.getBlue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.blend(45, 49, (int)(short)10, (float)'4');
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


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
    hSLColor0.initHSLbyRGB(106, 193, 212);
    
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 70);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getHue();
    
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
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.setSaturation(40);
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


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
    hSLColor0.setLuminence(214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.brighten((float)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


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
    int i23 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i23 == 33);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    hSLColor0.brighten((float)23);
    hSLColor0.setHue(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


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
    hSLColor0.setSaturation((int)(byte)100);
    
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
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(byte)100, 100);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setHue(153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.blend(255, (int)(short)-1, 97, (float)(byte)1);
    hSLColor0.setHue(186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(short)-1, 49);
    hSLColor0.initHSLbyRGB(100, (int)(byte)100, (int)(byte)0);
    hSLColor0.setSaturation((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setHue(84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 211);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


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
    hSLColor0.initHSLbyRGB(148, 151, 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


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
    hSLColor0.setHue(181);
    hSLColor0.brighten((float)100);
    
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
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.blend(93, 39, 192, (float)186);
    hSLColor0.setHue((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(57, 100, 6);
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 226);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(0.0f);
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getBlue();
    
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
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.setHue(42);
    hSLColor0.initHSLbyRGB(234, 52, 92);
    int i29 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 92);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


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
    int i34 = hSLColor0.getHue();
    int i35 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 141);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 200);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


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
    hSLColor0.brighten((float)193);
    hSLColor0.brighten(0.0f);
    
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)10, 104);
    hSLColor0.initRGBbyHSL(127, 0, 151);
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 151);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'a', 449, 213);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 213);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


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
    hSLColor0.setLuminence(25);
    hSLColor0.setSaturation(249);
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 49);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(104);
    int i19 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 127);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(243);
    
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

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    hSLColor0.initHSLbyRGB(232, 0, (int)(short)-1);
    hSLColor0.setHue(192);
    hSLColor0.blend(93, 117, 148, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)159);
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation(113);
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 28);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(78, (int)(byte)10, 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    hSLColor0.setLuminence(0);
    int i25 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(311, 168, 227);
    hSLColor0.brighten((float)257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'a', 449, 213);
    int i8 = hSLColor0.getGreen();
    hSLColor0.setSaturation(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 255);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL((int)(short)1, 169, 88);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(249, (int)'4', 73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 88);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


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
    hSLColor0.setHue((int)'#');
    
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
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(32);
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    hSLColor0.blend(28, 154, (int)' ', (float)24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.setSaturation(105);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


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
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.initHSLbyRGB(85, 151, 9);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(2);
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    hSLColor0.setHue(87);
    int i15 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 86);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence(192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)123);
    hSLColor0.initHSLbyRGB(5, 93, 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


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
    int i27 = hSLColor0.getBlue();
    int i28 = hSLColor0.getSaturation();
    hSLColor0.setHue(49);
    hSLColor0.setHue(126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(227, 131, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.blend(100, 0, 239, (float)'a');
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(byte)10);
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    hSLColor0.blend(45, 49, (int)(short)10, (float)'4');
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 168);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


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
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 249);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(213);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    hSLColor0.brighten((float)178);
    hSLColor0.setHue(137);
    int i20 = hSLColor0.getGreen();
    hSLColor0.setLuminence(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


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
    int i23 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 172);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getBlue();
    hSLColor0.setLuminence(105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getHue();
    hSLColor0.blend(257, 100, 45, (float)214);
    hSLColor0.setHue((int)(short)10);
    int i18 = hSLColor0.getBlue();
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 259);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.blend(181, 94, 100, (float)102);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 252);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


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
    hSLColor0.setLuminence((int)(short)100);
    
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
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 178);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    int i11 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 60);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initRGBbyHSL((int)'#', (int)'a', 52);
    hSLColor0.setSaturation(210);
    hSLColor0.setLuminence(14);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 26);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


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
    int i28 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 234);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB((int)(byte)-1, (int)(byte)0, 39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 49);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


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
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setHue(165);
    hSLColor0.setSaturation(251);
    hSLColor0.setLuminence(113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


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
    hSLColor0.blend(14, 90, 210, (float)60);
    
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
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(102, 214, 216);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 216);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    hSLColor0.brighten((float)60);
    int i16 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.initHSLbyRGB(46, (int)(byte)0, 535);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(1, 260, 1, (float)(byte)10);
    int i23 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 260);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


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
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 249);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.initRGBbyHSL((int)(short)10, (int)(byte)100, 100);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setHue(52);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setLuminence(210);
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setHue(195);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 195);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.initHSLbyRGB(52, 93, 159);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 153);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 129);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getGreen();
    hSLColor0.blend(0, 137, 11, (float)243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.blend(35, (int)(byte)10, 33, (float)449);
    hSLColor0.initRGBbyHSL(10, 153, 214);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getRed();
    
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
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 260);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


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
    int i28 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setSaturation(102);
    hSLColor0.setSaturation(128);
    hSLColor0.blend(94, 449, 86, (float)169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)165);
    hSLColor0.initRGBbyHSL(90, 0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setLuminence(48);
    int i16 = hSLColor0.getHue();
    hSLColor0.setHue(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.setSaturation(216);
    hSLColor0.setLuminence(210);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(255, 12, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 48);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


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
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(85);
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
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(260, 93, 105);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(127, 84, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 93);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


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
    hSLColor0.blend(23, 24, 311, (float)17);
    
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
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getRed();
    int i23 = hSLColor0.getRed();
    hSLColor0.blend(0, 265, 159, (float)94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 88);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


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
    hSLColor0.setSaturation(5);
    
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
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(259, 23, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    int i15 = hSLColor0.getBlue();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 213);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setSaturation(17);
    hSLColor0.setLuminence((int)'#');
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 37);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL(213, 440, (int)(short)-1);
    hSLColor0.blend((int)(short)0, (int)(short)0, 213, (float)260);
    int i22 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 107);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.initHSLbyRGB(17, (int)(byte)100, 249);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)165);
    hSLColor0.reverseColor();
    hSLColor0.blend(1, 24, 248, (float)216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.blend(100, 0, 239, (float)'a');
    hSLColor0.setSaturation(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    int i10 = hSLColor0.getBlue();
    hSLColor0.setHue(42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(byte)0, 45, (int)'a');
    hSLColor0.initHSLbyRGB(71, (-11), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(40, 311, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.initRGBbyHSL(172, 84, 39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.initHSLbyRGB(17, (int)(byte)100, 249);
    int i13 = hSLColor0.getGreen();
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue(226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 154);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(short)-1);
    hSLColor0.setSaturation(17);
    hSLColor0.setHue(126);
    hSLColor0.blend(85, 57, 92, (float)87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setLuminence(45);
    hSLColor0.initRGBbyHSL(172, 0, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 127);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    hSLColor0.blend(181, 0, 251, (float)(short)1);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 70);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(9, 101, 232);
    
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
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initHSLbyRGB(178, (int)(short)10, (int)(byte)0);
    hSLColor0.setLuminence(94);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(8, 94, 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(131);
    
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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


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
    int i17 = hSLColor0.getGreen();
    hSLColor0.setLuminence(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 42);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


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
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 5);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL((int)(byte)100, 10, (int)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)10, 117, 30);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getRed();
    
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
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


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
    int i17 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 125);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initHSLbyRGB(178, (int)(short)10, (int)(byte)0);
    hSLColor0.brighten((float)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


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
    hSLColor0.brighten((-1.0f));
    int i16 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getBlue();
    
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
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(137, 68, 0);
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 68);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    hSLColor0.initHSLbyRGB(169, (int)(short)100, (int)(short)1);
    int i9 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 85);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setHue((int)(byte)1);
    int i15 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(257);
    int i11 = hSLColor0.getRed();
    
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
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i22 = hSLColor0.getGreen();
    hSLColor0.brighten((float)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


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
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setSaturation(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.brighten(1.0f);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.initHSLbyRGB((int)(byte)10, 32, 178);
    hSLColor0.setSaturation(216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(186);
    int i16 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 9);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    hSLColor0.blend(169, 94, (int)(short)100, (float)0L);
    hSLColor0.setHue(39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    hSLColor0.setSaturation(10);
    hSLColor0.setLuminence(104);
    hSLColor0.setHue(243);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setHue((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.blend(26, 153, (int)(byte)-1, (float)57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


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
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(214);
    hSLColor0.initRGBbyHSL((int)(short)1, 213, 257);
    hSLColor0.initHSLbyRGB(8, 105, 102);
    
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
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.brighten((float)126);
    hSLColor0.blend(24, 38, 240, (float)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 126);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(5, 50, 178);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(73, 25, 257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 159);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    int i9 = hSLColor0.getLuminence();
    
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
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(239, 126, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(104);
    hSLColor0.brighten((float)39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    hSLColor0.brighten((float)(short)10);
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(154, 88, 252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 251);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(60, 0, 102);
    hSLColor0.initHSLbyRGB(28, 33, 42);
    hSLColor0.blend(104, 32, 78, (float)61);
    
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
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL((int)(byte)1, 0, 10);
    hSLColor0.setLuminence(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    hSLColor0.setHue(101);
    hSLColor0.setSaturation(258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    hSLColor0.brighten((float)17);
    hSLColor0.setLuminence(137);
    hSLColor0.setSaturation(0);
    int i21 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 137);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getSaturation();
    
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
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    hSLColor0.initHSLbyRGB((int)'4', 169, 311);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 449);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    hSLColor0.setSaturation(27);
    hSLColor0.reverseColor();

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)(short)1, 178, 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.blend((int)(byte)100, 50, (int)(byte)100, (float)1);
    int i14 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(24, 5, 265);
    
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
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
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
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(78, 101, 125);
    hSLColor0.setHue(213);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getHue();
    hSLColor0.blend((-1), 193, 33, (float)17);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 257);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(52);
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getBlue();
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.setHue(195);
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 50);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.blend(97, 0, 85, (float)(short)0);
    hSLColor0.initHSLbyRGB(60, 178, (int)(byte)1);
    hSLColor0.setHue(169);
    hSLColor0.brighten((float)78);
    hSLColor0.initRGBbyHSL(159, 260, 46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 105);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(169, 243, 50);
    hSLColor0.initRGBbyHSL(45, (int)(byte)100, 184);
    hSLColor0.setHue((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getGreen();
    hSLColor0.blend(49, 8, 42, (float)185);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


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
    int i25 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 42);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    hSLColor0.blend(168, 85, 535, (float)249);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(107, 14, 183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)'#');
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue(234);
    hSLColor0.blend(14, (int)'4', 14, (float)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation(60);
    hSLColor0.initRGBbyHSL(151, 87, 88);
    hSLColor0.blend(181, 61, (-10), (float)172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    hSLColor0.blend(72, 239, (int)(byte)1, (float)51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getHue();
    hSLColor0.setLuminence((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 311);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getHue();
    hSLColor0.setHue(213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 105);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setLuminence(165);
    int i14 = hSLColor0.getRed();
    hSLColor0.brighten((float)109);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(89, (int)(byte)10, 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(131, 5, 72);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 73);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.initHSLbyRGB(311, (int)'a', 101);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setLuminence(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


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
    hSLColor0.initRGBbyHSL(212, 45, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(78, 27, 131);
    hSLColor0.setLuminence((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.brighten((float)193);
    hSLColor0.setSaturation(2);
    int i22 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getLuminence();
    hSLColor0.setHue(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 49);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(16, 260, 148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.blend(70, 12, 184, (float)89);
    hSLColor0.initRGBbyHSL(169, 135, 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.setLuminence(87);
    int i18 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(86, 72, 46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


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
    int i26 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(88, (int)'#', 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 255);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


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
    hSLColor0.blend(251, 211, 24, (float)128);
    
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
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.setSaturation(32);
    int i14 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB(85, (int)(byte)-1, 101);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(97, (int)' ', (int)(short)100);
    hSLColor0.setHue(33);
    hSLColor0.brighten((float)113);
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getBlue();
    
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
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.blend(10, (int)(short)1, 440, (float)23);
    hSLColor0.blend(88, 148, (-1), (float)177);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)40);
    hSLColor0.setSaturation(113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB(6, 449, (int)(byte)10);
    hSLColor0.initHSLbyRGB(61, 27, 73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(45, 178, 35);
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 59);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(193);
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getLuminence();
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
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(byte)-1);
    
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

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setLuminence(169);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getBlue();
    
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
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue(59);
    hSLColor0.initRGBbyHSL(0, 234, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)1);
    
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
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.blend(169, 259, 106, (float)257);
    
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
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)227);
    hSLColor0.initHSLbyRGB(87, 88, 97);
    int i22 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 13);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(11);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.setHue(257);
    hSLColor0.blend(88, 5, 2, (float)(short)0);
    hSLColor0.blend(184, (int)(short)100, 257, (float)104);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    hSLColor0.brighten((float)6);
    hSLColor0.blend(72, 192, 25, (float)143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

}
