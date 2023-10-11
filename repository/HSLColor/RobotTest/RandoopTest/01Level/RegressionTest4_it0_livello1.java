
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(104, 213, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getBlue();
    hSLColor0.setHue(32);
    hSLColor0.setLuminence(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 92);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(234, 186, 214);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 234);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)'a', 0, (float)50);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(140);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 86);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getBlue();
    
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    hSLColor0.initRGBbyHSL(97, 86, 193);
    hSLColor0.initHSLbyRGB(84, 127, 107);
    hSLColor0.initRGBbyHSL(0, 0, 140);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.initHSLbyRGB(70, 23, 143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


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
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    hSLColor0.brighten((float)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(88, 10, 105);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getBlue();
    hSLColor0.setHue(35);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(45, 97, 153);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(174, 71, 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.setSaturation(172);
    hSLColor0.blend(252, 3, 24, 0.0f);
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 172);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.initRGBbyHSL(440, 1, (int)(short)1);
    hSLColor0.setSaturation(0);
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setHue(104);
    hSLColor0.blend((int)(short)-1, 148, (-1), (float)169);
    int i28 = hSLColor0.getHue();
    int i29 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 258);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.reverseColor();
    int i14 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(258, 13, 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getBlue();
    hSLColor0.setHue(21);
    hSLColor0.setHue(240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    hSLColor0.initRGBbyHSL(165, 35, 51);
    hSLColor0.setHue(123);
    hSLColor0.setHue(227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


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
    hSLColor0.setLuminence(232);
    int i22 = hSLColor0.getBlue();
    
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
    org.junit.Assert.assertTrue(i22 == 224);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


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
    int i19 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i19 == 218);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


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
    int i16 = hSLColor0.getGreen();
    hSLColor0.setHue((-1));
    
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    int i13 = hSLColor0.getHue();
    hSLColor0.setLuminence(259);
    int i16 = hSLColor0.getRed();
    hSLColor0.brighten((float)26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getBlue();
    
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getGreen();
    int i10 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


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
    hSLColor0.brighten((float)128);
    
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

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 88);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


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
    hSLColor0.initHSLbyRGB((int)(byte)1, 94, 0);
    
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(311, 85, 85);
    int i18 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 85);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)239);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.setHue(40);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.setHue(94);
    hSLColor0.setSaturation(224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


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
    int i19 = hSLColor0.getRed();
    hSLColor0.setLuminence(86);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 25);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


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
    int i30 = hSLColor0.getGreen();
    hSLColor0.setSaturation(44);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    hSLColor0.setHue(32);
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getLuminence();
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


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
    hSLColor0.setLuminence((-1));
    hSLColor0.brighten((float)227);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


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
    hSLColor0.blend(0, 254, 86, (float)224);
    hSLColor0.brighten((float)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 127);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.brighten((float)(byte)-1);
    int i18 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)5);
    int i15 = hSLColor0.getBlue();
    hSLColor0.setSaturation(95);
    hSLColor0.brighten(0.0f);
    int i20 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(byte)100);
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setHue(27);
    int i13 = hSLColor0.getGreen();
    hSLColor0.setHue(21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 54);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getGreen();
    hSLColor0.blend((int)(byte)10, (int)'#', 37, (float)185);
    hSLColor0.setSaturation(138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)1, 48, 48, (float)0L);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.blend(116, (int)(byte)-1, 109, (float)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    int i21 = hSLColor0.getGreen();
    hSLColor0.setHue(213);
    hSLColor0.initRGBbyHSL(192, 204, 46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 45);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)159);
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.initRGBbyHSL(46, 5, 64);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 173);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 61);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(39);
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getSaturation();
    
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)10);
    int i6 = hSLColor0.getSaturation();
    
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


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
    hSLColor0.initRGBbyHSL(191, 250, 397);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 191);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence((int)(byte)100);
    hSLColor0.initHSLbyRGB(6, 449, (int)(byte)10);
    hSLColor0.blend(122, 254, 9, (float)213);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


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
    hSLColor0.setHue(162);
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence(137);
    int i6 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


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
    hSLColor0.setHue(172);
    
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
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(short)10);
    hSLColor0.initHSLbyRGB(194, 440, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


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
    int i12 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)84);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.initRGBbyHSL(52, 0, (int)(byte)10);
    hSLColor0.initRGBbyHSL(213, 440, (int)(short)-1);
    hSLColor0.blend((int)(short)0, (int)(short)0, 213, (float)260);
    int i22 = hSLColor0.getLuminence();
    int i23 = hSLColor0.getBlue();
    hSLColor0.setHue(148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 213);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


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
    hSLColor0.setHue(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'a');
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getRed();
    
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    hSLColor0.setLuminence(85);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 260);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.setHue((int)'#');
    int i17 = hSLColor0.getHue();
    int i18 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setHue(93);
    hSLColor0.setSaturation(1);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(123, 152, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getHue();
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getHue();
    hSLColor0.setLuminence(30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 213);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(61, 33, 84);
    hSLColor0.brighten((float)117);
    hSLColor0.initHSLbyRGB(64, 250, 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)-1);
    int i20 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(59, 195, 224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


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
    int i32 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(220, 113, 214);
    hSLColor0.setSaturation(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 48);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.setLuminence(169);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    hSLColor0.setSaturation(2);
    hSLColor0.reverseColor();
    
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


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
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getHue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getBlue();
    hSLColor0.brighten((float)71);
    hSLColor0.blend(251, 97, 192, (float)126);
    int i22 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 242);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    hSLColor0.setHue(177);
    hSLColor0.initRGBbyHSL(163, 241, 79);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.setHue(48);
    hSLColor0.blend(249, 32, 128, 0.0f);
    hSLColor0.setLuminence(87);
    hSLColor0.brighten(0.0f);
    hSLColor0.initRGBbyHSL(92, 0, 48);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.initRGBbyHSL(84, 0, 126);
    int i24 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


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
    hSLColor0.initRGBbyHSL((int)(byte)-1, 68, 213);
    int i24 = hSLColor0.getLuminence();
    int i25 = hSLColor0.getRed();
    hSLColor0.brighten(0.0f);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 224);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.setHue(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(178, 260, (int)(byte)1);
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 178);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


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
    hSLColor0.brighten((float)57);
    hSLColor0.reverseColor();
    
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


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
    hSLColor0.initHSLbyRGB(51, 25, 0);
    
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(248, 166, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    hSLColor0.initHSLbyRGB((int)(short)-1, (int)(byte)1, 169);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getHue();
    int i20 = hSLColor0.getLuminence();
    hSLColor0.setHue(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getGreen();
    hSLColor0.blend(165, (int)'4', (int)(byte)1, (float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.setHue(35);
    hSLColor0.brighten((float)198);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.blend((int)' ', (int)(short)100, (int)(short)1, (float)'4');
    hSLColor0.setLuminence(116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getRed();
    hSLColor0.setHue(210);
    int i13 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 210);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.blend(70, 260, (int)(byte)0, 0.0f);
    hSLColor0.setSaturation((int)(short)0);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


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
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 220);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i12 = hSLColor0.getBlue();
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(33);
    hSLColor0.setLuminence(99);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 99);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    hSLColor0.setLuminence(50);
    int i10 = hSLColor0.getGreen();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i14 == 232);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.initRGBbyHSL(84, 0, 126);
    int i24 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 84);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((-1), 87, 178);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(101, (int)(short)1, 72);
    hSLColor0.reverseColor();
    int i23 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 97);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setHue(6);
    hSLColor0.initRGBbyHSL(230, 111, 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(39);
    int i17 = hSLColor0.getGreen();
    hSLColor0.setHue(89);
    hSLColor0.setLuminence((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getSaturation();
    int i11 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(78, 101, 125);
    hSLColor0.setHue(213);
    hSLColor0.brighten((float)105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 260);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setLuminence((int)(byte)100);
    int i12 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)'a', 105, 51);
    hSLColor0.setLuminence(162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 84);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(5, 50, 178);
    hSLColor0.setSaturation(214);
    hSLColor0.setLuminence(11);
    int i15 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 20);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(39);
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(102);
    hSLColor0.setLuminence(17);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    hSLColor0.setLuminence(105);
    hSLColor0.initRGBbyHSL(23, 93, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


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
    int i28 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 255);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(127);
    int i12 = hSLColor0.getHue();
    hSLColor0.setSaturation(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 183);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 135);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 49);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(71, 154, (int)' ');
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 71);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


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
    hSLColor0.initHSLbyRGB(227, 257, 234);
    hSLColor0.setHue(141);
    hSLColor0.blend(41, 0, 240, (float)162);
    
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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


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
    hSLColor0.initRGBbyHSL(0, 107, 159);
    hSLColor0.setLuminence(179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(76, 162, 167, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.brighten((float)70);
    hSLColor0.setSaturation(10);
    hSLColor0.brighten(0.0f);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


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
    hSLColor0.blend(1, 42, 106, (float)(short)100);
    hSLColor0.blend(78, 1, 17, (float)11);
    
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(48, 265, 53);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 108);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.setLuminence((-1));
    hSLColor0.setSaturation(449);
    hSLColor0.blend(61, 85, 257, (float)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 50);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence(113);
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 113);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.initRGBbyHSL(126, 64, 224);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 126);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


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
    hSLColor0.setHue(44);
    int i16 = hSLColor0.getBlue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    int i10 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


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
    hSLColor0.initHSLbyRGB(232, 139, 265);
    hSLColor0.setLuminence(220);
    
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
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(178, 104, 93);
    int i16 = hSLColor0.getRed();
    hSLColor0.blend(225, 39, (-5457), (float)154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 178);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.brighten(100.0f);
    hSLColor0.setSaturation((int)' ');
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    
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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(60, (int)' ', (int)(byte)0);
    hSLColor0.setHue(23);
    hSLColor0.initRGBbyHSL(37, 255, 41);
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(48, 0, 240);
    hSLColor0.brighten((float)25);
    hSLColor0.setLuminence(234);
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 48);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(202);
    hSLColor0.setSaturation(248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


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
    hSLColor0.setLuminence(97);
    
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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    int i18 = hSLColor0.getHue();
    int i19 = hSLColor0.getBlue();
    hSLColor0.setHue(128);
    int i22 = hSLColor0.getGreen();
    hSLColor0.setHue(92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 64);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(241, 36, 49);
    int i19 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 241);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.setSaturation(165);
    hSLColor0.setLuminence(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


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
    hSLColor0.blend(249, 249, 101, (float)100);
    hSLColor0.initRGBbyHSL(0, 200, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    hSLColor0.brighten((float)87);
    hSLColor0.blend(202, 179, (int)(short)1, (float)66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(141, (int)'4', 39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


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
    hSLColor0.brighten((float)28);
    
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
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((int)'a', 449, 213);
    hSLColor0.initRGBbyHSL(230, 218, 116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(86, 159, 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


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
    hSLColor0.blend((int)' ', 32, (int)(byte)-1, (float)137);
    hSLColor0.setSaturation(239);
    
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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


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
    hSLColor0.setHue((-1));
    
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
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getHue();
    hSLColor0.setLuminence(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 38);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


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
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getBlue();
    hSLColor0.blend(101, (-5457), 231, (float)0L);
    
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
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


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
    hSLColor0.brighten((float)93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


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
    hSLColor0.brighten((float)213);
    
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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setLuminence(186);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 186);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


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
    hSLColor0.setHue(109);
    hSLColor0.initHSLbyRGB(3, (int)'4', 449);
    
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
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.brighten((float)41);
    hSLColor0.blend(239, 105, 125, (float)27);
    int i23 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 239);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


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
    int i33 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue((-1));
    hSLColor0.initRGBbyHSL(100, 12, 218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.setLuminence(165);
    hSLColor0.setLuminence(163);
    int i19 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.brighten((float)87);
    int i13 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(151, (int)'#', 234);
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getRed();
    hSLColor0.setLuminence(259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 151);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    int i5 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    hSLColor0.initRGBbyHSL((int)(byte)10, 104, 93);
    hSLColor0.blend(104, (int)(byte)0, 210, (float)311);
    int i30 = hSLColor0.getHue();
    hSLColor0.setSaturation(159);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 191);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getGreen();
    hSLColor0.setLuminence(184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setHue(35);
    hSLColor0.initHSLbyRGB(260, (int)(short)100, (int)(short)10);
    int i15 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(166, 234, 85);
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 166);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }


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
    int i32 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.blend(131, 260, 191, (float)131);
    hSLColor0.brighten((float)250);
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(260, 113, (int)(short)0);
    hSLColor0.brighten((float)88);
    hSLColor0.initRGBbyHSL(16, 3, 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    hSLColor0.initHSLbyRGB(169, (int)(short)100, (int)(short)1);
    int i9 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(168, 260, 94);
    int i14 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 260);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)'4');
    hSLColor0.setLuminence(210);
    hSLColor0.setHue((int)(byte)-1);
    hSLColor0.setHue(195);
    hSLColor0.initRGBbyHSL((int)(short)0, 36, 30);
    hSLColor0.blend(92, 3, 87, (float)48);
    hSLColor0.brighten((float)79);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(104);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 104);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)127);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    hSLColor0.initRGBbyHSL(184, 216, 232);
    hSLColor0.brighten((float)2);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }


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
    int i34 = hSLColor0.getLuminence();
    int i35 = hSLColor0.getLuminence();
    int i36 = hSLColor0.getBlue();
    hSLColor0.blend(103, 163, 1, (float)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getHue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 72);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(byte)1);
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(40, 130, 244);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }


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
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 83);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)70);
    hSLColor0.reverseColor();
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    hSLColor0.blend(449, (int)(byte)-1, 213, (float)449);
    hSLColor0.initRGBbyHSL(169, 35, 56);
    hSLColor0.setSaturation(27);
    int i20 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    int i22 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 50);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(23);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 23);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(212, 257, 188);
    int i22 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 70);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getRed();
    hSLColor0.blend(38, 104, 23, (float)41);
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 104);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getHue();
    hSLColor0.setLuminence((-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 169);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue(87);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB((int)(short)0, 45, 88);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(2);
    hSLColor0.initRGBbyHSL(28, 20, 156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 200, 154, 0.0f);
    int i20 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(168, 109, 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL((int)(byte)10, 165, 52);
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 86);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }


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
    hSLColor0.initRGBbyHSL(138, 13, 186);
    int i26 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 13);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(1, 192, 186);
    int i15 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }


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
    hSLColor0.brighten((float)226);
    
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.blend((int)(byte)10, 260, (int)(byte)100, (float)88);
    int i11 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(10, 232, 192);
    int i16 = hSLColor0.getGreen();
    hSLColor0.setHue(179);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 232);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    hSLColor0.initHSLbyRGB((int)'4', 169, 311);
    hSLColor0.initHSLbyRGB(177, 242, 262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation((int)'a');
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }


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
    hSLColor0.setSaturation(265);
    
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(33);
    hSLColor0.setLuminence(227);
    hSLColor0.initRGBbyHSL(116, 68, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)-1);
    int i16 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(11);
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(113);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 5);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }


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
    int i24 = hSLColor0.getLuminence();
    int i25 = hSLColor0.getBlue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(5, 50, 178);
    hSLColor0.setSaturation(214);
    int i13 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 15);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setHue(27);
    int i13 = hSLColor0.getLuminence();
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
    org.junit.Assert.assertTrue(i13 == 42);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setLuminence(5);
    hSLColor0.setLuminence(226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    hSLColor0.setHue((int)(short)1);
    int i5 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }


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
    hSLColor0.initHSLbyRGB(257, 193, 254);
    int i21 = hSLColor0.getLuminence();
    int i22 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 272);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.brighten((float)25);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }


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
    int i29 = hSLColor0.getBlue();
    int i30 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 106);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getBlue();
    hSLColor0.blend(0, 139, 78, (float)90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.blend((int)'#', 249, 32, (float)104);
    hSLColor0.brighten((float)0);
    hSLColor0.setSaturation(17);
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 141);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(45, 32, 50);
    hSLColor0.setHue((int)(short)0);
    hSLColor0.brighten((float)159);
    hSLColor0.brighten((float)202);
    hSLColor0.setSaturation(535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(53);
    hSLColor0.brighten((float)85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getHue();
    hSLColor0.brighten((float)17);
    hSLColor0.setLuminence(137);
    hSLColor0.setHue(3);
    hSLColor0.setSaturation(79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    hSLColor0.setLuminence(106);
    hSLColor0.blend(94, 188, 57, (float)83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(byte)-1, 1, 85);
    hSLColor0.setHue(153);
    hSLColor0.initRGBbyHSL(200, 149, 54);
    
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(10, (int)(short)10, 449);
    hSLColor0.setSaturation(211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(243, 260, 234);
    hSLColor0.setHue(262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    hSLColor0.setHue(184);
    hSLColor0.blend(76, 114, 49, (float)11);
    
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }


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
    int i17 = hSLColor0.getLuminence();
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 123);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 188);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }


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
    hSLColor0.setHue(182);
    
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
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    int i9 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(263, 89, 172);
    hSLColor0.initRGBbyHSL(252, 7, 0);
    hSLColor0.initRGBbyHSL(37, 169, 100);
    hSLColor0.initRGBbyHSL(100, (-1), 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 255);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    hSLColor0.setSaturation(154);
    hSLColor0.initHSLbyRGB(23, (-1), 128);
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 23);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setLuminence(85);
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(231, 40, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    hSLColor0.initHSLbyRGB(60, 93, 113);
    hSLColor0.brighten((float)87);
    hSLColor0.blend(14, (int)(byte)1, 0, (float)9);
    int i21 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 255);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }


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
    int i17 = hSLColor0.getRed();
    
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
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(251, 188, 440);
    int i7 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 181);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }


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
    hSLColor0.initHSLbyRGB(535, 89, 27);
    
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initHSLbyRGB(178, (int)(short)10, (int)(byte)0);
    hSLColor0.setLuminence(94);
    int i13 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 255);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(45, 178, 35);
    hSLColor0.setHue(203);
    hSLColor0.brighten((float)235);
    
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
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.reverseColor();
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getBlue();
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend((int)(short)-1, (int)'a', 0, (float)50);
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(51, 1, 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(0);
    hSLColor0.blend(258, 69, 57, (float)123);
    
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
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(92, (int)(byte)-1, (int)'a', (float)(byte)1);
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 82);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(249, 251, 131);
    hSLColor0.setSaturation(61);
    hSLColor0.setHue(82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }


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
    hSLColor0.setLuminence(128);
    int i15 = hSLColor0.getGreen();
    
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
    org.junit.Assert.assertTrue(i15 == 128);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(101);
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 101);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(72);
    hSLColor0.setHue(78);
    hSLColor0.blend(241, 25, 79, (float)71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(255);
    int i12 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL((-4), 183, 202);
    hSLColor0.setSaturation(131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 178);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setHue(102);
    hSLColor0.setLuminence(192);
    hSLColor0.brighten((float)4);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    int i8 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 88);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(46);
    hSLColor0.initRGBbyHSL(0, 39, 135);
    hSLColor0.initRGBbyHSL(249, 105, 200);
    hSLColor0.setSaturation(153);
    hSLColor0.reverseColor();
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    int i21 = hSLColor0.getLuminence();
    hSLColor0.setHue(195);
    hSLColor0.initRGBbyHSL((int)(short)-1, 240, 85);
    int i28 = hSLColor0.getRed();
    hSLColor0.blend(90, 104, 53, (float)129);
    hSLColor0.setLuminence(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 165);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(397, 123, 159);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 123);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 397);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setLuminence(85);
    hSLColor0.initRGBbyHSL(100, 449, 257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.setHue(41);
    hSLColor0.setLuminence(143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(104, 213, (int)(short)100);
    int i12 = hSLColor0.getGreen();
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    hSLColor0.blend((int)(short)100, 167, 239, (float)60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.setHue(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getGreen();
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getRed();
    hSLColor0.blend(168, 89, 216, (float)(short)0);
    int i23 = hSLColor0.getRed();
    int i24 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }


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
    hSLColor0.setLuminence(232);
    hSLColor0.initHSLbyRGB(162, 234, 111);
    
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getBlue();
    hSLColor0.setHue(239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.blend(178, 101, 70, (float)449);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getGreen();
    hSLColor0.brighten((float)61);
    
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
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(40);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setHue(48);
    hSLColor0.initHSLbyRGB(213, 203, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    int i15 = hSLColor0.getBlue();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(36, 14, 5);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(232);
    int i5 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 232);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(244, 111, 200);
    
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
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.setHue(311);
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.blend((-5457), 220, 0, (float)97);
    hSLColor0.initHSLbyRGB((int)(byte)100, 122, 114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }


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
    hSLColor0.setHue(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.initRGBbyHSL(100, 10, (int)(short)-1);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }


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
    int i16 = hSLColor0.getHue();
    hSLColor0.setHue(168);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getLuminence();
    hSLColor0.setHue(78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)202);
    
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    hSLColor0.setHue((int)(short)10);
    hSLColor0.setLuminence((int)'4');
    int i12 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 267);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(2, 40, 52);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 45);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(49);
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }


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
    int i28 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 8);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getRed();
    int i13 = hSLColor0.getLuminence();
    int i14 = hSLColor0.getSaturation();
    
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
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }


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
    int i29 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 106);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(397, 123, 159);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setHue(212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 123);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(23);
    int i13 = hSLColor0.getRed();
    hSLColor0.setLuminence(165);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(163);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setLuminence(33);
    int i7 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }


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
    hSLColor0.blend((int)'#', 12, 100, (float)67);
    
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setLuminence(23);
    int i11 = hSLColor0.getLuminence();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }


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
    hSLColor0.initRGBbyHSL(194, 277, (-1));
    int i30 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    int i16 = hSLColor0.getBlue();
    hSLColor0.setHue(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }


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
    hSLColor0.brighten((float)257);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((-1));
    hSLColor0.setLuminence(169);
    hSLColor0.setSaturation(240);
    int i14 = hSLColor0.getHue();
    hSLColor0.setLuminence(277);
    hSLColor0.initHSLbyRGB(277, 162, 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 178);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(200, 90, 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(100);
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }


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
    hSLColor0.setLuminence(230);
    
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
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)100, (int)' ', (int)(short)0);
    hSLColor0.initHSLbyRGB(17, (int)(byte)100, 249);
    hSLColor0.setLuminence(92);
    hSLColor0.initHSLbyRGB(37, (int)'4', (int)'4');
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getLuminence();
    hSLColor0.setHue(116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 178);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(88, 152, 87);
    hSLColor0.initHSLbyRGB(194, 51, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.brighten((float)100L);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(141, 116, 200);
    
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
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setSaturation(113);
    hSLColor0.setHue(78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getLuminence();
    int i10 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(85, 195, (int)'4');
    
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }


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
    int i23 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 106);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend(311, 45, 178, (float)45);
    hSLColor0.setLuminence(178);
    int i23 = hSLColor0.getBlue();
    hSLColor0.setLuminence(242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 178);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(1, 192, 186);
    hSLColor0.setSaturation(250);
    hSLColor0.setSaturation(30);
    
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

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i9 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getBlue();
    int i16 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(244, 48, 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.setHue(1);
    hSLColor0.setLuminence((int)'#');
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setSaturation(49);
    hSLColor0.setLuminence(67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.blend((-1), 260, 17, (float)'a');
    int i18 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    int i22 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(51, 131, 72);
    int i27 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 131);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten(100.0f);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getGreen();
    hSLColor0.setLuminence(46);
    hSLColor0.initRGBbyHSL(0, 39, 135);
    hSLColor0.initRGBbyHSL(249, 105, 200);
    int i20 = hSLColor0.getSaturation();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 105);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(50);
    hSLColor0.setLuminence(7);
    hSLColor0.reverseColor();
    
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

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.brighten((float)193);
    hSLColor0.setSaturation(2);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)252);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.brighten((float)88);
    int i12 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(50, 178, (int)(short)0);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    hSLColor0.setHue((int)(byte)1);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(110);
    
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
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.setHue(213);
    hSLColor0.setHue(250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL((int)'4', (int)(short)-1, (int)(byte)100);
    hSLColor0.setSaturation(17);
    hSLColor0.initRGBbyHSL(48, 40, (int)' ');
    hSLColor0.brighten((float)170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.setSaturation(45);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.initHSLbyRGB(212, 49, 14);
    int i22 = hSLColor0.getRed();
    hSLColor0.blend(63, (int)(byte)1, 35, (float)99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 212);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }


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
    int i27 = hSLColor0.getRed();
    hSLColor0.brighten((float)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }


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
    int i12 = hSLColor0.getLuminence();
    hSLColor0.setLuminence(169);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setHue(255);
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
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(52);
    hSLColor0.blend((int)'#', 113, 113, (float)213);
    int i14 = hSLColor0.getBlue();
    hSLColor0.setSaturation(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 113);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getHue();
    int i23 = hSLColor0.getBlue();
    hSLColor0.blend(152, 116, 12, (float)162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(106, 6, 0);
    hSLColor0.initHSLbyRGB(52, 277, 85);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 85);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.blend(255, 5, 254, (float)53);
    int i26 = hSLColor0.getBlue();
    int i27 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 213);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getRed();
    int i20 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getHue();
    int i23 = hSLColor0.getBlue();
    int i24 = hSLColor0.getHue();
    hSLColor0.setHue(211);
    int i27 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(27, 92, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    hSLColor0.brighten(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(93, 211, 137);
    hSLColor0.setSaturation(148);
    
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
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getRed();
    hSLColor0.setLuminence(167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(128, 105, (int)(short)-1);
    int i10 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 128);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    int i8 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i10 = hSLColor0.getRed();
    hSLColor0.setLuminence(154);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 175);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(86, 263, 235);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getRed();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.setSaturation(239);
    int i12 = hSLColor0.getRed();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.setHue((int)'#');
    hSLColor0.initRGBbyHSL(168, (int)'4', 93);
    hSLColor0.setHue((int)(short)100);
    int i23 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 52);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.brighten((float)113);
    int i8 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(242, 216, 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    hSLColor0.blend(0, 151, 32, (float)227);
    hSLColor0.initRGBbyHSL(193, 35, 127);
    int i20 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 127);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)(short)100);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getGreen();
    
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
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((int)'#', 1, 10);
    int i17 = hSLColor0.getHue();
    hSLColor0.setLuminence(169);
    hSLColor0.blend(48, 87, (int)(byte)0, (float)(byte)1);
    hSLColor0.brighten((float)(short)10);
    hSLColor0.blend(191, 34, 12, (float)154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.blend(50, 85, 213, (float)178);
    hSLColor0.initHSLbyRGB((int)(byte)10, 87, 35);
    hSLColor0.setSaturation(213);
    int i16 = hSLColor0.getRed();
    hSLColor0.setSaturation(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 8);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 48, (int)(short)10, (float)213);
    hSLColor0.initHSLbyRGB(137, 97, 53);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(byte)0, 143, 1, 0.0f);
    int i26 = hSLColor0.getRed();
    hSLColor0.setSaturation((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 53);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }


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
    int i14 = hSLColor0.getRed();
    int i15 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 131);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 104);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }


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
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.initRGBbyHSL((int)'a', (int)'a', (int)(byte)0);
    hSLColor0.setHue((int)(byte)1);
    hSLColor0.initRGBbyHSL(24, 42, 23);
    int i16 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(34, 217, 61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 27);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getBlue();
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(byte)100);
    hSLColor0.setSaturation((int)(short)0);
    hSLColor0.blend(172, 234, 168, 0.0f);
    int i19 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 50);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)100, 40);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(6, 254, 174);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(5, 1, (int)' ');
    int i18 = hSLColor0.getRed();
    hSLColor0.setSaturation(255);
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.brighten((float)73);
    hSLColor0.brighten((float)49);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getLuminence();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.blend(64, 194, 87, 0.0f);
    
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
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(106, 0, 172);
    hSLColor0.setSaturation(204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getHue();
    hSLColor0.setLuminence(240);
    hSLColor0.setSaturation(205);
    hSLColor0.initHSLbyRGB(251, 184, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 38);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }


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
    hSLColor0.setHue(211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.brighten(0.0f);
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }


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
    hSLColor0.setLuminence(69);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getBlue();
    int i17 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 267);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.setHue(48);
    int i9 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(94, 35, 234);
    hSLColor0.initRGBbyHSL(0, 105, 14);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }


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
    hSLColor0.setLuminence(265);
    int i19 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }


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
    int i12 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(63, 84, 143);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(101);
    int i7 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getHue();
    int i13 = hSLColor0.getHue();
    hSLColor0.setHue(88);
    hSLColor0.initRGBbyHSL(440, 1, (int)(short)1);
    hSLColor0.setSaturation(0);
    hSLColor0.setLuminence(191);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 85);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getRed();
    
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
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(0, 184, 48);
    hSLColor0.setSaturation(244);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.setHue(257);
    hSLColor0.blend(88, 5, 2, (float)(short)0);
    int i21 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 51);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.setSaturation(243);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 243);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getLuminence();
    int i16 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 51);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }


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
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    hSLColor0.setSaturation(202);
    hSLColor0.initRGBbyHSL(9, 227, 159);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 110);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.setSaturation(449);
    hSLColor0.blend(249, 227, 46, (float)104);
    int i16 = hSLColor0.getHue();
    int i17 = hSLColor0.getLuminence();
    hSLColor0.initHSLbyRGB(68, 50, 56);
    hSLColor0.brighten(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 148);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }


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
    int i28 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    hSLColor0.initRGBbyHSL((int)(byte)10, 104, 93);
    int i25 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(59, 23, 103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 104);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }


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
    hSLColor0.blend(258, 36, 260, (float)131);
    int i36 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 266);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }


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
    hSLColor0.brighten((float)21);
    
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
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(33);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(10, 217, 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten(0.0f);
    int i11 = hSLColor0.getGreen();
    int i12 = hSLColor0.getLuminence();
    int i13 = hSLColor0.getGreen();
    hSLColor0.blend((int)'a', 20, 78, (float)212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getRed();
    hSLColor0.setLuminence(17);
    int i8 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(50, 255, (int)(short)1);
    hSLColor0.setSaturation((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 17);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getBlue();
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }


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
    int i13 = hSLColor0.getBlue();
    hSLColor0.setLuminence(52);
    
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
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }


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
    hSLColor0.blend(84, 35, 177, (float)64);
    hSLColor0.initRGBbyHSL(154, 36, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)100);
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 50);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getHue();
    hSLColor0.setLuminence(45);
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 169);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setHue((int)(byte)10);
    int i5 = hSLColor0.getBlue();
    int i6 = hSLColor0.getBlue();
    hSLColor0.setLuminence(45);
    hSLColor0.initRGBbyHSL(184, 216, 232);
    hSLColor0.initHSLbyRGB(52, 243, 0);
    int i17 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(89);
    hSLColor0.blend(61, 141, 170, (float)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 255);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.initHSLbyRGB(113, 0, 60);
    hSLColor0.initHSLbyRGB(214, 184, (int)(short)-1);
    int i22 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 107);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getGreen();
    hSLColor0.blend(311, (int)(short)100, 238, (float)204);
    
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
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.brighten((float)52);
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(184);
    hSLColor0.setLuminence(23);
    int i13 = hSLColor0.getRed();
    hSLColor0.setLuminence(103);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 51);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getSaturation();
    hSLColor0.blend(0, (-10), 159, (float)131);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 75);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence((int)(byte)0);
    hSLColor0.initRGBbyHSL(0, 52, (int)(short)1);
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)14);
    hSLColor0.reverseColor();

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }


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
    int i22 = hSLColor0.getSaturation();
    
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
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }


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
    hSLColor0.setSaturation(40);
    int i17 = hSLColor0.getLuminence();
    
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
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setSaturation(5);
    hSLColor0.initHSLbyRGB((int)'4', 105, 153);
    hSLColor0.setHue(52);
    int i11 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 125);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }


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
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 125);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.blend(177, 13, 167, (float)92);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 13);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.blend((int)(byte)100, (int)(byte)100, 0, (float)0);
    int i15 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(32, 255, 0);
    int i20 = hSLColor0.getSaturation();
    hSLColor0.setHue(440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    int i8 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 88);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    hSLColor0.blend(260, 169, 48, (float)88);
    int i16 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(51, 185, 92);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(40, 86, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 48);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend(50, 143, 51, (float)232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }


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
    hSLColor0.reverseColor();
    int i20 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 214);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getRed();
    hSLColor0.blend(50, 0, 181, (float)259);
    hSLColor0.setSaturation(107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    hSLColor0.initRGBbyHSL((int)(byte)-1, 260, 52);
    int i12 = hSLColor0.getGreen();
    hSLColor0.setSaturation(113);
    hSLColor0.blend(260, 8, 0, (float)140);
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 260);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getBlue();
    hSLColor0.setLuminence(49);
    hSLColor0.blend((int)'a', 311, 127, (float)84);
    int i17 = hSLColor0.getGreen();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getLuminence();
    hSLColor0.blend(156, 6, 177, (float)152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 204);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    int i6 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(60, (int)' ', (int)(byte)0);
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 60);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.initRGBbyHSL(239, 248, 191);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.setLuminence(88);
    hSLColor0.initHSLbyRGB(57, 61, 93);
    hSLColor0.initRGBbyHSL(74, 37, 127);
    int i16 = hSLColor0.getSaturation();
    int i17 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 145);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    hSLColor0.initRGBbyHSL(239, 192, 48);
    int i19 = hSLColor0.getLuminence();
    hSLColor0.setHue(68);
    hSLColor0.blend(102, 211, (-1), (float)27);
    hSLColor0.initRGBbyHSL(125, 101, 226);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 48);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }


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
    hSLColor0.setHue(203);
    
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
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }


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
    int i24 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 42);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }


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
    int i13 = hSLColor0.getBlue();
    
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
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getLuminence();
    int i19 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }


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
    hSLColor0.initHSLbyRGB(0, 8, 211);
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 8);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.setLuminence(10);
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getRed();
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.brighten((float)68);
    hSLColor0.brighten((float)186);
    int i13 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getRed();
    int i22 = hSLColor0.getGreen();
    int i23 = hSLColor0.getSaturation();
    hSLColor0.blend(39, 117, 259, (float)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    int i13 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    int i11 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(72);
    hSLColor0.setHue(78);
    int i16 = hSLColor0.getRed();
    int i17 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 78);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }


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
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)-1);
    int i8 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
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
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getRed();
    hSLColor0.blend(100, 0, 239, (float)'a');
    int i12 = hSLColor0.getBlue();
    hSLColor0.blend(36, 84, (int)(byte)1, (float)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 239);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(short)1);
    hSLColor0.setHue(50);
    hSLColor0.setSaturation(241);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 81);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)169);
    int i5 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 127);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    int i8 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(10, (int)'#', 0);
    int i13 = hSLColor0.getHue();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((int)(byte)1, (int)(byte)10, (int)(short)100);
    hSLColor0.initHSLbyRGB(113, 0, 60);
    hSLColor0.reverseColor();
    int i19 = hSLColor0.getBlue();
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 104);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }


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
    hSLColor0.blend(175, 224, 159, (float)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 127);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }


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
    hSLColor0.setLuminence((-5457));
    
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
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.setSaturation(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.reverseColor();
    int i13 = hSLColor0.getHue();
    hSLColor0.setSaturation(232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 212);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    int i8 = hSLColor0.getHue();
    hSLColor0.brighten((float)(byte)100);
    hSLColor0.brighten((float)165);
    int i13 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }


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
    int i20 = hSLColor0.getSaturation();
    hSLColor0.blend(30, 137, 224, (float)(-5457));
    
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
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)'4');
    hSLColor0.setHue(195);
    hSLColor0.setLuminence((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.blend((int)'#', (int)(byte)0, 100, (float)113);
    hSLColor0.initRGBbyHSL((int)(byte)10, 104, 93);
    int i25 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 73);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.brighten(0.0f);
    hSLColor0.brighten((float)(short)1);
    int i12 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }


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
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(85);
    hSLColor0.setLuminence(194);
    
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
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }


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
    hSLColor0.initHSLbyRGB(33, 1, 12);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getRed();
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
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.blend((int)(short)-1, 1, 17, (float)(byte)-1);
    hSLColor0.setHue(183);
    hSLColor0.blend((-11), 67, 57, (float)2);
    hSLColor0.setLuminence(255);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getSaturation();
    hSLColor0.blend(127, 311, 165, (float)104);
    hSLColor0.blend(226, 211, 83, (float)171);
    int i17 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 226);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    int i19 = hSLColor0.getSaturation();
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getHue();
    int i22 = hSLColor0.getGreen();
    int i23 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    hSLColor0.brighten((float)(short)100);
    int i6 = hSLColor0.getSaturation();
    int i7 = hSLColor0.getLuminence();
    hSLColor0.blend(32, 38, 240, (float)99);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    hSLColor0.reverseColor();
    int i8 = hSLColor0.getHue();
    hSLColor0.setHue(102);
    hSLColor0.initRGBbyHSL(185, (int)(byte)-1, 67);
    int i15 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 67);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setHue(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }


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
    int i20 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 255);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }


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
    hSLColor0.initRGBbyHSL(10, 224, 8);
    
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
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(311, 0, (int)(short)10);
    int i11 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(39, 71, 440);
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.setSaturation(0);
    int i5 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getRed();
    hSLColor0.setHue(262);
    hSLColor0.setSaturation(64);
    hSLColor0.setHue(21);
    hSLColor0.initHSLbyRGB(78, (-4), 225);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.brighten((float)(byte)1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    int i3 = hSLColor0.getLuminence();
    int i4 = hSLColor0.getHue();
    int i5 = hSLColor0.getSaturation();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)(short)0, 165, (int)' ');
    hSLColor0.initRGBbyHSL(225, 26, 0);
    
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
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(45);
    hSLColor0.blend(35, 0, 32, (float)40);
    int i13 = hSLColor0.getRed();
    hSLColor0.setLuminence(251);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }


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
    int i17 = hSLColor0.getLuminence();
    hSLColor0.blend(70, 76, 249, (float)211);
    hSLColor0.setLuminence(169);
    
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
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(188, 87, 212);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 49);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    int i16 = hSLColor0.getGreen();
    hSLColor0.setSaturation(178);
    hSLColor0.reverseColor();
    hSLColor0.setHue(257);
    int i22 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.initRGBbyHSL(213, (int)(short)100, 1);
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getHue();
    int i23 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(117, (int)' ', 60);
    int i28 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 145);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    hSLColor0.blend((int)'4', 311, (int)(short)100, (float)'a');
    int i10 = hSLColor0.getRed();
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getGreen();
    hSLColor0.brighten((float)130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 449);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 311);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }


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
    int i27 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setSaturation(52);
    hSLColor0.brighten((float)100L);
    hSLColor0.setLuminence(255);
    hSLColor0.blend(28, 135, 28, 0.0f);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(100, 88, (int)(short)100);
    int i12 = hSLColor0.getHue();
    hSLColor0.brighten((float)(short)-1);
    int i15 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)240);
    hSLColor0.setSaturation(154);
    hSLColor0.initHSLbyRGB(23, (-1), 128);
    int i24 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)0L);
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getGreen();
    hSLColor0.setSaturation(263);
    hSLColor0.setLuminence(257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getGreen();
    hSLColor0.setSaturation(14);
    int i7 = hSLColor0.getBlue();
    int i8 = hSLColor0.getGreen();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)(-1L));
    
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
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }


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
    int i25 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 34);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.initRGBbyHSL(85, 1, 0);
    hSLColor0.blend(311, (int)'a', (int)(byte)-1, (float)240);
    int i21 = hSLColor0.getGreen();
    int i22 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 97);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)'a', (float)'4');
    int i9 = hSLColor0.getRed();
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getHue();
    hSLColor0.initRGBbyHSL(35, (int)(byte)-1, 105);
    hSLColor0.setHue(88);
    hSLColor0.initHSLbyRGB(51, 75, 152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 169);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }


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
    hSLColor0.initRGBbyHSL(183, 141, 177);
    hSLColor0.blend(216, 535, 154, (float)36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getHue();
    int i10 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB(252, 49, 104);
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }


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
    int i20 = hSLColor0.getBlue();
    int i21 = hSLColor0.getBlue();
    int i22 = hSLColor0.getRed();
    int i23 = hSLColor0.getHue();
    hSLColor0.setSaturation(50);
    int i26 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 50);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(33);
    hSLColor0.setLuminence(227);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 227);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    int i3 = hSLColor0.getGreen();
    hSLColor0.initRGBbyHSL(61, 5, 0);
    int i8 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 61);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    hSLColor0.brighten((float)'a');
    int i7 = hSLColor0.getHue();
    int i8 = hSLColor0.getHue();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(232, 0, 85);
    int i14 = hSLColor0.getLuminence();
    hSLColor0.blend(10, 177, 0, (float)(short)1);
    int i20 = hSLColor0.getLuminence();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 89);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    int i6 = hSLColor0.getBlue();
    int i7 = hSLColor0.getGreen();
    int i8 = hSLColor0.getBlue();
    hSLColor0.setSaturation(41);
    
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
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    hSLColor0.blend(53, 25, 186, (float)85);
    hSLColor0.blend(109, (int)(short)0, 52, (float)(-10));
    hSLColor0.setSaturation(102);
    int i17 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 106);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }


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
    hSLColor0.setLuminence(263);
    
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

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    int i5 = hSLColor0.getRed();
    int i6 = hSLColor0.getHue();
    int i7 = hSLColor0.getGreen();
    hSLColor0.setSaturation(168);
    int i10 = hSLColor0.getBlue();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.initRGBbyHSL((int)(short)0, 100, (int)'4');
    hSLColor0.brighten((float)73);
    hSLColor0.blend(15, 166, 266, (float)177);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }


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
    hSLColor0.setLuminence(311);
    hSLColor0.initHSLbyRGB(25, 95, 6);
    int i22 = hSLColor0.getHue();
    
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
    org.junit.Assert.assertTrue(i22 == 76);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }


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
    int i32 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.initHSLbyRGB((int)(short)10, 260, 1);
    int i15 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(257, 25, 75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(52, 32, (int)(short)1);
    hSLColor0.initRGBbyHSL((int)(byte)100, 0, (int)(short)-1);
    int i11 = hSLColor0.getHue();
    hSLColor0.setHue(259);
    int i14 = hSLColor0.getHue();
    int i15 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }


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
    hSLColor0.setSaturation(49);
    hSLColor0.setHue(224);
    
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
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setSaturation(1);
    int i3 = hSLColor0.getRed();
    hSLColor0.setLuminence((int)'a');
    hSLColor0.brighten((float)213);
    hSLColor0.setSaturation(0);
    hSLColor0.setSaturation(154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getLuminence();
    hSLColor0.initRGBbyHSL(198, 101, (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }


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
    hSLColor0.blend(267, 20, 255, (float)242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }


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
    hSLColor0.brighten((float)37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 50);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }


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
    hSLColor0.initRGBbyHSL(141, 0, 212);
    int i18 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 212);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    int i3 = hSLColor0.getRed();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getLuminence();
    int i6 = hSLColor0.getGreen();
    hSLColor0.brighten((float)127);
    
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
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }


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
    int i23 = hSLColor0.getGreen();
    hSLColor0.setLuminence(252);
    
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
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.setLuminence(85);
    hSLColor0.initRGBbyHSL(0, 210, 73);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.blend(214, 0, 32, (float)239);
    int i13 = hSLColor0.getGreen();
    hSLColor0.brighten((float)93);
    hSLColor0.setLuminence(241);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }


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
    hSLColor0.setHue(162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 140);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setLuminence(1);
    hSLColor0.setSaturation((int)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.initHSLbyRGB(265, 175, 106);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.initRGBbyHSL(32, 311, 0);
    hSLColor0.initRGBbyHSL(52, (int)(short)-1, (int)'4');
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.initHSLbyRGB((-1), 87, 178);
    hSLColor0.blend(255, 232, 0, (float)50);
    hSLColor0.brighten((float)38);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getSaturation();
    int i5 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.blend(0, 14, 226, (float)9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getSaturation();
    hSLColor0.setHue(101);
    int i5 = hSLColor0.getBlue();
    hSLColor0.setHue(79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend(1, (int)(byte)-1, (int)(short)10, 1.0f);
    hSLColor0.setHue((int)(short)10);
    int i8 = hSLColor0.getSaturation();
    int i9 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB((int)' ', 23, 151);
    hSLColor0.blend((-10), 0, 41, (float)'a');
    hSLColor0.initHSLbyRGB(47, (int)'4', 243);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }


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
    int i14 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 71);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)' ', (int)(byte)1, 1, (float)(byte)1);
    hSLColor0.setSaturation(0);
    hSLColor0.initHSLbyRGB(0, (int)(byte)10, 0);
    hSLColor0.setHue(105);
    int i14 = hSLColor0.getBlue();
    int i15 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getBlue();
    hSLColor0.initHSLbyRGB(234, 186, 214);
    int i10 = hSLColor0.getLuminence();
    hSLColor0.blend(177, 17, 249, (float)100L);
    hSLColor0.reverseColor();
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 210);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 17);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setHue(1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    int i5 = hSLColor0.getGreen();
    hSLColor0.setHue((int)(short)100);
    hSLColor0.blend((int)(byte)100, 1, 97, (float)32);
    hSLColor0.brighten((float)' ');
    int i15 = hSLColor0.getRed();
    int i16 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 255);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }


    HSLColor hSLColor0 = new HSLColor();
    int i1 = hSLColor0.getSaturation();
    int i2 = hSLColor0.getGreen();
    int i3 = hSLColor0.getHue();
    hSLColor0.reverseColor();
    hSLColor0.initRGBbyHSL(260, (int)(byte)100, 0);
    hSLColor0.initHSLbyRGB(52, 93, 159);
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 93);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    int i13 = hSLColor0.getSaturation();
    int i14 = hSLColor0.getRed();
    hSLColor0.blend(0, 200, 154, 0.0f);
    int i20 = hSLColor0.getLuminence();
    int i21 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.setLuminence((int)(short)0);
    int i10 = hSLColor0.getHue();
    int i11 = hSLColor0.getBlue();
    int i12 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.initHSLbyRGB((int)(short)100, (int)(short)-1, (int)'4');
    int i7 = hSLColor0.getSaturation();
    hSLColor0.setSaturation((int)'4');
    int i10 = hSLColor0.getHue();
    hSLColor0.setSaturation((int)(short)10);
    hSLColor0.setSaturation((int)(short)1);
    hSLColor0.setHue(33);
    int i17 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 232);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 50);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.brighten((float)(byte)0);
    hSLColor0.blend((int)'#', (int)(short)0, (int)'a', (float)(byte)10);
    hSLColor0.blend((int)(byte)-1, (int)(short)10, (int)(byte)-1, (float)100);
    hSLColor0.initHSLbyRGB((-1), 1, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getGreen();
    hSLColor0.blend(51, 159, 257, (float)1);
    int i24 = hSLColor0.getBlue();
    hSLColor0.setSaturation(184);
    hSLColor0.setHue(255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 257);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }


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
    hSLColor0.initRGBbyHSL(171, 101, 185);
    int i27 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 213);

  }

}
