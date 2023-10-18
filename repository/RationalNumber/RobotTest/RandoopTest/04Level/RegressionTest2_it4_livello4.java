package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2_it4_livello4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-2147483647L));
    int i2 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483647));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    float f6 = rationalNumber1.floatValue();
    java.lang.String str7 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    int i3 = rationalNumber2.numerator;
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber4.negate();
    short s6 = rationalNumber5.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)-1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 8);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    double d9 = rationalNumber2.doubleValue();
    java.lang.String str10 = rationalNumber2.toString();
    double d11 = rationalNumber2.doubleValue();
    double d12 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber13 = rationalNumber2.negate();
    java.lang.String str14 = rationalNumber2.toString();
    int i15 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32/100 (0.32)"+ "'", str10.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32/100 (0.32)"+ "'", str14.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    double d11 = rationalNumber6.doubleValue();
    int i12 = rationalNumber6.divisor;
    java.lang.String str13 = rationalNumber6.toString();
    double d14 = rationalNumber6.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10/100 (0.1)"+ "'", str9.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10/100 (0.1)"+ "'", str13.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.1d);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber3.negate();
    byte byte6 = rationalNumber3.byteValue();
    byte byte7 = rationalNumber3.byteValue();
    float f8 = rationalNumber3.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.312"+ "'", str4.equals("0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.3125f);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.32d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 8);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 4.0d);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(short)100);
    java.lang.String str3 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (-10));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.1d);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)1);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    byte byte5 = rationalNumber4.byteValue();
    java.lang.String str6 = rationalNumber4.toDisplayString();
    java.lang.String str7 = rationalNumber4.toDisplayString();
    byte byte8 = rationalNumber4.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-10"+ "'", str6.equals("-10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-10"+ "'", str7.equals("-10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)-10);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    java.lang.String str6 = rationalNumber5.toString();
    int i7 = rationalNumber5.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid rational (-10/0)"+ "'", str6.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    float f5 = rationalNumber1.floatValue();
    double d6 = rationalNumber1.doubleValue();
    short s7 = rationalNumber1.shortValue();
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    float f9 = rationalNumber8.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber4.floatValue();
    long long6 = rationalNumber4.longValue();
    long long7 = rationalNumber4.longValue();
    int i8 = rationalNumber4.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-0.1f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-10));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(7.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)(byte)0);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    RationalNumber rationalNumber2 = new RationalNumber((-3), 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, 52);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.019"+ "'", str4.equals("0.019"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    int i3 = rationalNumber1.intValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    long long5 = rationalNumber1.longValue();
    float f6 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1"+ "'", str2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.03125d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)100);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    double d9 = rationalNumber2.doubleValue();
    java.lang.String str10 = rationalNumber2.toString();
    double d11 = rationalNumber2.doubleValue();
    int i12 = rationalNumber2.divisor;
    int i13 = rationalNumber2.numerator;
    RationalNumber rationalNumber14 = rationalNumber2.negate();
    float f15 = rationalNumber14.floatValue();
    int i16 = rationalNumber14.intValue();
    RationalNumber rationalNumber17 = rationalNumber14.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32/100 (0.32)"+ "'", str10.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    double d8 = rationalNumber1.doubleValue();
    long long9 = rationalNumber1.longValue();
    byte byte10 = rationalNumber1.byteValue();
    java.lang.String str11 = rationalNumber1.toString();
    RationalNumber rationalNumber12 = rationalNumber1.negate();
    short s13 = rationalNumber12.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte10 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s13 == (short)0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    float f3 = rationalNumber1.floatValue();
    double d4 = rationalNumber1.doubleValue();
    double d5 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    float f7 = rationalNumber1.floatValue();
    long long8 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)32);
    java.lang.String str2 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32"+ "'", str2.equals("32"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    int i6 = rationalNumber4.divisor;
    short s7 = rationalNumber4.shortValue();
    java.lang.String str8 = rationalNumber4.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1"+ "'", str5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1"+ "'", str8.equals("1"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    byte byte9 = rationalNumber8.byteValue();
    java.lang.String str10 = rationalNumber8.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.32"+ "'", str7.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte9 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-0.32"+ "'", str10.equals("-0.32"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.divisor;
    int i5 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    int i4 = rationalNumber2.intValue();
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.32d);
    long long2 = rationalNumber1.longValue();
    short s3 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    byte byte6 = rationalNumber5.byteValue();
    byte byte7 = rationalNumber5.byteValue();
    java.lang.String str8 = rationalNumber5.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-0.32"+ "'", str8.equals("-0.32"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.03125d);
    int i2 = rationalNumber1.numerator;
    int i3 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)1);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    byte byte5 = rationalNumber4.byteValue();
    float f6 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == (-10.0f));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    int i5 = rationalNumber3.divisor;
    byte byte6 = rationalNumber3.byteValue();
    double d7 = rationalNumber3.doubleValue();
    int i8 = rationalNumber3.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-32/100 (-0.32)"+ "'", str4.equals("-32/100 (-0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-0.32f));
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.32d));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    java.lang.String str9 = rationalNumber8.toString();
    int i10 = rationalNumber8.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (10/0)"+ "'", str9.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(byte)100);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.97d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "97/100 (0.97)"+ "'", str5.equals("97/100 (0.97)"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber4.floatValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-0.1f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.01d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)32);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    long long5 = rationalNumber2.longValue();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1/100 (0.01)"+ "'", str6.equals("1/100 (0.01)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber4.shortValue();
    long long6 = rationalNumber4.longValue();
    byte byte7 = rationalNumber4.byteValue();
    long long8 = rationalNumber4.longValue();
    short s9 = rationalNumber4.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10/100 (0.1)"+ "'", str5.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(short)-1);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.0d));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)32);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 32.0d);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber5.floatValue();
    java.lang.String str7 = rationalNumber5.toDisplayString();
    double d8 = rationalNumber5.doubleValue();
    int i9 = rationalNumber5.intValue();
    double d10 = rationalNumber5.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-0.32"+ "'", str7.equals("-0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-0.32d));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    long long3 = rationalNumber1.longValue();
    float f4 = rationalNumber1.floatValue();
    int i5 = rationalNumber1.intValue();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    int i8 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    double d11 = rationalNumber6.doubleValue();
    int i12 = rationalNumber6.divisor;
    int i13 = rationalNumber6.divisor;
    int i14 = rationalNumber6.divisor;
    float f15 = rationalNumber6.floatValue();
    byte byte16 = rationalNumber6.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10/100 (0.1)"+ "'", str9.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte16 == (byte)0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    byte byte4 = rationalNumber1.byteValue();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    short s6 = rationalNumber5.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(byte)-10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    java.lang.String str9 = rationalNumber8.toString();
    java.lang.String str10 = rationalNumber8.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = rationalNumber8.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (10/0)"+ "'", str9.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Invalid rational (10/0)"+ "'", str10.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)52, (int)'#');

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber2.shortValue();
    int i6 = rationalNumber2.divisor;
    double d7 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.1d);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    int i5 = rationalNumber3.numerator;
    int i6 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.intValue();
    float f5 = rationalNumber3.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-0.32f));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    int i7 = rationalNumber5.numerator;
    double d8 = rationalNumber5.doubleValue();
    RationalNumber rationalNumber9 = rationalNumber5.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte10 = rationalNumber9.byteValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    byte byte3 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    byte byte8 = rationalNumber6.byteValue();
    RationalNumber rationalNumber9 = rationalNumber6.negate();
    int i10 = rationalNumber6.numerator;
    float f11 = rationalNumber6.floatValue();
    RationalNumber rationalNumber12 = rationalNumber6.negate();
    long long13 = rationalNumber12.longValue();
    java.lang.String str14 = rationalNumber12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-10/100 (-0.1)"+ "'", str14.equals("-10/100 (-0.1)"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber6.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)(byte)-10);
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-10, 32);
    java.lang.String str3 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-10/32 (-0.312)"+ "'", str3.equals("-10/32 (-0.312)"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, 3);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    short s6 = rationalNumber1.shortValue();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    java.lang.String str8 = rationalNumber1.toDisplayString();
    long long9 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    short s6 = rationalNumber2.shortValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    float f11 = rationalNumber6.floatValue();
    long long12 = rationalNumber6.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10/100 (0.1)"+ "'", str9.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    int i6 = rationalNumber4.numerator;
    java.lang.String str7 = rationalNumber4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-10/100 (-0.1)"+ "'", str7.equals("-10/100 (-0.1)"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    double d9 = rationalNumber2.doubleValue();
    java.lang.String str10 = rationalNumber2.toString();
    int i11 = rationalNumber2.intValue();
    int i12 = rationalNumber2.numerator;
    long long13 = rationalNumber2.longValue();
    int i14 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32/100 (0.32)"+ "'", str10.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    float f8 = rationalNumber6.floatValue();
    int i9 = rationalNumber6.numerator;
    int i10 = rationalNumber6.divisor;
    int i11 = rationalNumber6.intValue();
    int i12 = rationalNumber6.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    int i8 = rationalNumber2.numerator;
    java.lang.String str9 = rationalNumber2.toString();
    float f10 = rationalNumber2.floatValue();
    RationalNumber rationalNumber11 = rationalNumber2.negate();
    int i12 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.32"+ "'", str7.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32/100 (0.32)"+ "'", str9.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)10);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    long long5 = rationalNumber3.longValue();
    RationalNumber rationalNumber6 = rationalNumber3.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    RationalNumber rationalNumber2 = new RationalNumber((-32), 10);
    int i3 = rationalNumber2.numerator;
    float f4 = rationalNumber2.floatValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-3.2f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    double d7 = rationalNumber5.doubleValue();
    int i8 = rationalNumber5.intValue();
    byte byte9 = rationalNumber5.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte9 == (byte)0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    double d4 = rationalNumber1.doubleValue();
    double d5 = rationalNumber1.doubleValue();
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (-10));
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.intValue();
    int i5 = rationalNumber2.intValue();
    float f6 = rationalNumber2.floatValue();
    long long7 = rationalNumber2.longValue();
    byte byte8 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.32d);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    double d8 = rationalNumber1.doubleValue();
    long long9 = rationalNumber1.longValue();
    java.lang.String str10 = rationalNumber1.toDisplayString();
    byte byte11 = rationalNumber1.byteValue();
    java.lang.String str12 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(100.0d);
    double d2 = rationalNumber1.doubleValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    int i4 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100"+ "'", str3.equals("100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    java.lang.String str6 = rationalNumber4.toString();
    int i7 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1"+ "'", str5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1"+ "'", str6.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (-32));
    byte byte3 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    long long3 = rationalNumber1.longValue();
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    byte byte7 = rationalNumber5.byteValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    int i9 = rationalNumber8.numerator;
    short s10 = rationalNumber8.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s10 == (short)0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (-10));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.divisor;
    RationalNumber rationalNumber5 = rationalNumber3.negate();
    long long6 = rationalNumber5.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    double d8 = rationalNumber1.doubleValue();
    long long9 = rationalNumber1.longValue();
    java.lang.String str10 = rationalNumber1.toDisplayString();
    int i11 = rationalNumber1.numerator;
    int i12 = rationalNumber1.numerator;
    java.lang.String str13 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0"+ "'", str13.equals("0"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, (int)(byte)10);
    long long3 = rationalNumber2.longValue();
    int i4 = rationalNumber2.divisor;
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    int i7 = rationalNumber2.intValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    double d8 = rationalNumber4.doubleValue();
    int i9 = rationalNumber4.numerator;
    int i10 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    byte byte8 = rationalNumber6.byteValue();
    RationalNumber rationalNumber9 = rationalNumber6.negate();
    java.lang.String str10 = rationalNumber9.toString();
    RationalNumber rationalNumber11 = rationalNumber9.negate();
    java.lang.String str12 = rationalNumber9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-10/100 (-0.1)"+ "'", str10.equals("-10/100 (-0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-10/100 (-0.1)"+ "'", str12.equals("-10/100 (-0.1)"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    byte byte6 = rationalNumber2.byteValue();
    java.lang.String str7 = rationalNumber2.toString();
    float f8 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/100 (0.1)"+ "'", str7.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.1f);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)100);
    java.lang.String str3 = rationalNumber2.toString();
    short s4 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    long long7 = rationalNumber2.longValue();
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.1"+ "'", str6.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-32));
    java.lang.String str3 = rationalNumber2.toDisplayString();
    java.lang.String str4 = rationalNumber2.toString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-0.312"+ "'", str3.equals("-0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10/-32 (-0.312)"+ "'", str4.equals("10/-32 (-0.312)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-0.312"+ "'", str5.equals("-0.312"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    float f8 = rationalNumber7.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = rationalNumber7.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'a');
    int i2 = rationalNumber1.divisor;
    java.lang.String str3 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "97"+ "'", str3.equals("97"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)-10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.1d);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)(short)10);
    double d3 = rationalNumber2.doubleValue();
    long long4 = rationalNumber2.longValue();
    long long5 = rationalNumber2.longValue();
    java.lang.String str6 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.2d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32/10 (3.2)"+ "'", str6.equals("32/10 (3.2)"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)52);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    int i5 = rationalNumber3.divisor;
    double d6 = rationalNumber3.doubleValue();
    int i7 = rationalNumber3.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-32/100 (-0.32)"+ "'", str4.equals("-32/100 (-0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    RationalNumber rationalNumber7 = rationalNumber5.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber3.longValue();
    int i5 = rationalNumber3.intValue();
    double d6 = rationalNumber3.doubleValue();
    long long7 = rationalNumber3.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    double d8 = rationalNumber1.doubleValue();
    long long9 = rationalNumber1.longValue();
    java.lang.String str10 = rationalNumber1.toDisplayString();
    int i11 = rationalNumber1.divisor;
    int i12 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-10);
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-10"+ "'", str3.equals("-10"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10/100 (0.1)"+ "'", str5.equals("10/100 (0.1)"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)'a');
    float f3 = rationalNumber2.floatValue();
    int i4 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-0.010309278f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    long long5 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)'4');
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.numerator;
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, (int)(byte)10);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.numerator;
    long long5 = rationalNumber2.longValue();
    float f6 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);

  }

}
