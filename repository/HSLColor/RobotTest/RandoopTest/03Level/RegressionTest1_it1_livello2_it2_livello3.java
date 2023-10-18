package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1_it1_livello2_it2_livello3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (int)(short)1, (int)(short)0);
    hSLColor0.initRGBbyHSL((int)(short)-1, 137, (int)' ');
    hSLColor0.initRGBbyHSL(75, 28, 21);
    hSLColor0.initRGBbyHSL(16, 77, 50);
    int i27 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 50);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.blend(104, (int)'a', 127, (float)1L);
    hSLColor0.initHSLbyRGB(0, (int)(short)100, (int)'a');
    int i14 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 50);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    int i9 = hSLColor0.getGreen();
    hSLColor0.reverseColor();
    int i11 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 254);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getLuminence();
    int i11 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(32, (int)(byte)0, (int)'#');
    hSLColor0.setLuminence((int)(byte)-1);
    hSLColor0.reverseColor();
    int i15 = hSLColor0.getSaturation();
    hSLColor0.setLuminence(68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 255);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(24);
    hSLColor0.setSaturation(258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    hSLColor0.blend(104, 0, (int)(short)0, 0.0f);
    hSLColor0.reverseColor();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }


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
    hSLColor0.setSaturation(42);
    int i19 = hSLColor0.getSaturation();
    hSLColor0.initRGBbyHSL(265, 97, 59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 42);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    hSLColor0.setHue((int)(short)0);
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getGreen();
    hSLColor0.brighten((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test11"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setSaturation(1);
    int i11 = hSLColor0.getHue();
    int i12 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 127);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test12"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.blend((int)(byte)100, (int)(byte)-1, (int)' ', (float)'#');
    int i10 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    hSLColor0.setHue((-1));
    hSLColor0.blend(245, (int)'a', 0, (float)116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test13"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten(1.0f);
    hSLColor0.brighten((float)(byte)100);
    int i14 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 42);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test14"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.setSaturation(13);
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test15"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.blend((int)(byte)10, 241, 260, (float)26);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test16"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    int i8 = hSLColor0.getBlue();
    hSLColor0.blend(201, 0, (int)(byte)10, (float)(byte)100);
    int i14 = hSLColor0.getRed();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 201);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test17"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.setSaturation(137);
    hSLColor0.brighten((float)59);
    hSLColor0.initHSLbyRGB((int)(byte)100, (int)'#', 48);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 68);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test18"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setLuminence((int)(short)100);
    hSLColor0.setHue((int)'4');
    hSLColor0.initRGBbyHSL(0, 28, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test19"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    int i4 = hSLColor0.getBlue();
    hSLColor0.setHue(100);
    hSLColor0.initHSLbyRGB((-1), 36, 52);
    int i11 = hSLColor0.getSaturation();
    int i12 = hSLColor0.getSaturation();
    int i13 = hSLColor0.getRed();
    int i14 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 36);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test20"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getSaturation();
    hSLColor0.setHue(52);
    int i13 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test21"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    hSLColor0.blend(96, 1, 32, (float)96);
    hSLColor0.setSaturation(1);
    hSLColor0.setHue(54);
    int i18 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test22"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    hSLColor0.initHSLbyRGB((int)(short)-1, 127, 137);
    hSLColor0.setSaturation(35);
    hSLColor0.setLuminence(70);
    hSLColor0.initHSLbyRGB(160, 49, (int)(byte)-1);
    int i18 = hSLColor0.getHue();
    hSLColor0.initHSLbyRGB(28, 27, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test23"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    int i7 = hSLColor0.getSaturation();
    hSLColor0.initHSLbyRGB(36, 32, 53);
    int i12 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 43);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test24"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    int i5 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test25"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test26"); }


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
    hSLColor0.initRGBbyHSL(27, 254, (-1));
    int i20 = hSLColor0.getHue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 27);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test27"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.setSaturation(137);
    hSLColor0.setSaturation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test28"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getRed();
    int i9 = hSLColor0.getBlue();
    hSLColor0.brighten((float)213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test29"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    hSLColor0.setSaturation(100);
    hSLColor0.brighten((float)(short)0);
    int i8 = hSLColor0.getLuminence();
    int i9 = hSLColor0.getLuminence();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test30"); }


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
    hSLColor0.blend(245, 23, 0, (float)170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test31"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(1);
    int i17 = hSLColor0.getHue();
    hSLColor0.blend(251, 0, 45, (float)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 224);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test32"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.blend((int)(byte)1, (int)'a', (int)(byte)1, 0.0f);
    hSLColor0.initHSLbyRGB((int)' ', (int)(short)0, (int)(short)100);
    hSLColor0.setSaturation(100);
    int i12 = hSLColor0.getGreen();
    hSLColor0.initHSLbyRGB(254, 98, 10);
    int i17 = hSLColor0.getRed();
    int i18 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test33"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)(short)10);
    hSLColor0.blend((int)(short)-1, 32, 32, 100.0f);
    hSLColor0.setLuminence(235);
    int i14 = hSLColor0.getGreen();
    hSLColor0.setLuminence(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 255);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test34"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getBlue();
    int i10 = hSLColor0.getGreen();
    int i11 = hSLColor0.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 96);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test35"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getBlue();
    hSLColor0.blend(255, (int)(short)10, (int)(short)1, (float)31);
    hSLColor0.setLuminence(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 96);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test36"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)(short)1, (int)(short)0, (int)' ');
    hSLColor0.setSaturation((int)(byte)10);
    hSLColor0.setLuminence((int)(short)-1);
    int i13 = hSLColor0.getSaturation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test37"); }


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
    int i21 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test38"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation((int)(byte)-1);
    int i6 = hSLColor0.getSaturation();
    hSLColor0.setLuminence((int)' ');
    hSLColor0.setHue(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test39"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    hSLColor0.setHue((int)'4');
    int i9 = hSLColor0.getBlue();
    hSLColor0.blend((int)'4', (int)(byte)-1, 32, (float)(short)1);
    hSLColor0.setHue(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test40"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    int i10 = hSLColor0.getRed();
    hSLColor0.initRGBbyHSL(30, (int)(short)1, (int)(short)0);
    hSLColor0.initRGBbyHSL((int)(short)-1, 137, (int)' ');
    hSLColor0.initRGBbyHSL(75, 28, 21);
    hSLColor0.initRGBbyHSL(16, 77, 50);
    int i27 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 46);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test41"); }


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
    int i18 = hSLColor0.getSaturation();
    
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

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test42"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setHue(0);
    hSLColor0.setHue(172);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test43"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.setHue((int)'a');
    hSLColor0.blend((int)(short)0, (int)(byte)1, (int)(byte)100, (float)(-1));
    hSLColor0.setSaturation(104);
    hSLColor0.reverseColor();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(byte)1);
    int i18 = hSLColor0.getLuminence();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test44"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setHue(116);
    hSLColor0.setHue(104);
    int i14 = hSLColor0.getRed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 96);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test45"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten((float)59);
    hSLColor0.setHue(265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test46"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.initRGBbyHSL(10, (int)(short)10, (int)(short)100);
    int i9 = hSLColor0.getSaturation();
    hSLColor0.blend(96, (int)'#', (int)(byte)0, (float)' ');
    hSLColor0.setLuminence(31);
    int i17 = hSLColor0.getLuminence();
    hSLColor0.brighten((float)'#');
    hSLColor0.setHue(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 31);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test47"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.brighten((float)(byte)10);
    int i5 = hSLColor0.getSaturation();
    hSLColor0.reverseColor();
    hSLColor0.brighten((float)(short)100);
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.setHue(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test48"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    int i3 = hSLColor0.getGreen();
    hSLColor0.brighten(10.0f);
    hSLColor0.initHSLbyRGB((int)'4', (int)'4', 1);
    hSLColor0.brighten((float)(byte)-1);
    hSLColor0.reverseColor();
    hSLColor0.setLuminence(0);
    hSLColor0.brighten((float)245);
    int i17 = hSLColor0.getSaturation();
    int i18 = hSLColor0.getSaturation();
    int i19 = hSLColor0.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test49"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    hSLColor0.brighten((float)' ');
    hSLColor0.reverseColor();
    int i6 = hSLColor0.getGreen();
    int i7 = hSLColor0.getLuminence();
    int i8 = hSLColor0.getBlue();
    hSLColor0.initRGBbyHSL(31, 251, 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test50"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)0);
    hSLColor0.reverseColor();
    hSLColor0.setSaturation(1);
    hSLColor0.setLuminence(30);
    int i8 = hSLColor0.getBlue();
    hSLColor0.reverseColor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test51"); }


    HSLColor hSLColor0 = new HSLColor();
    hSLColor0.setLuminence((int)(short)1);
    int i3 = hSLColor0.getSaturation();
    int i4 = hSLColor0.getRed();
    hSLColor0.initHSLbyRGB((int)'4', (int)(byte)10, (int)(short)10);
    int i9 = hSLColor0.getLuminence();
    hSLColor0.setSaturation(69);
    hSLColor0.blend((int)'#', 201, 255, (float)(-1));
    hSLColor0.setSaturation(258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 31);

  }

}
