
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    java.lang.String str8 = rationalNumber1.toDisplayString();
    java.lang.String str9 = rationalNumber1.toDisplayString();
    int i10 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    short s4 = rationalNumber1.shortValue();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    int i6 = rationalNumber5.numerator;
    int i7 = rationalNumber5.numerator;
    float f8 = rationalNumber5.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    double d4 = rationalNumber2.doubleValue();
    short s5 = rationalNumber2.shortValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    float f7 = rationalNumber6.floatValue();
    int i8 = rationalNumber6.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == (-10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)-1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)1);
    java.lang.String str2 = rationalNumber1.toString();
    short s3 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1"+ "'", str2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (-10));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)'#');
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(short)10);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.numerator;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber6.intValue();
    RationalNumber rationalNumber8 = rationalNumber6.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/10 (0.1)"+ "'", str3.equals("1/10 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/10 (0.1)"+ "'", str4.equals("1/10 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    java.lang.String str11 = rationalNumber10.toString();
    java.lang.String str12 = rationalNumber10.toString();
    int i13 = rationalNumber10.divisor;
    int i14 = rationalNumber10.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)(short)10);
    byte byte3 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)3);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    int i7 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.intValue();
    int i5 = rationalNumber2.numerator;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    double d7 = rationalNumber6.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10"+ "'", str3.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-10.0d));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.intValue();
    byte byte7 = rationalNumber2.byteValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    short s9 = rationalNumber2.shortValue();
    int i10 = rationalNumber2.divisor;
    RationalNumber rationalNumber11 = rationalNumber2.negate();
    int i12 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)'#');
    short s3 = rationalNumber2.shortValue();
    int i4 = rationalNumber2.divisor;
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1L);
    long long2 = rationalNumber1.longValue();
    double d3 = rationalNumber1.doubleValue();
    int i4 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.divisor;
    byte byte5 = rationalNumber3.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber2.numerator;
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    byte byte6 = rationalNumber5.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    short s7 = rationalNumber2.shortValue();
    int i8 = rationalNumber2.intValue();
    double d9 = rationalNumber2.doubleValue();
    int i10 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    double d5 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-10, (int)(byte)-10);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    short s7 = rationalNumber2.shortValue();
    java.lang.String str8 = rationalNumber2.toString();
    int i9 = rationalNumber2.divisor;
    int i10 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    float f8 = rationalNumber1.floatValue();
    int i9 = rationalNumber1.intValue();
    int i10 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (-1));
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, 10);
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    double d7 = rationalNumber2.doubleValue();
    float f8 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    long long9 = rationalNumber2.longValue();
    java.lang.String str10 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10"+ "'", str10.equals("10"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)(short)0);
    float f3 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    int i4 = rationalNumber2.intValue();
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)(byte)100);
    float f3 = rationalNumber2.floatValue();
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.32f);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    double d2 = rationalNumber1.doubleValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    java.lang.String str4 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    double d7 = rationalNumber2.doubleValue();
    java.lang.String str8 = rationalNumber2.toString();
    java.lang.String str9 = rationalNumber2.toString();
    long long10 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10"+ "'", str9.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    java.lang.String str10 = rationalNumber8.toDisplayString();
    RationalNumber rationalNumber11 = rationalNumber8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)'#');
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)-1);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (-1));
    byte byte3 = rationalNumber2.byteValue();
    byte byte4 = rationalNumber2.byteValue();
    int i5 = rationalNumber2.numerator;
    byte byte6 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)(short)-1);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    int i5 = rationalNumber1.numerator;
    int i6 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    java.lang.String str8 = rationalNumber1.toDisplayString();
    int i9 = rationalNumber1.numerator;
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    RationalNumber rationalNumber11 = rationalNumber10.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    long long10 = rationalNumber1.longValue();
    byte byte11 = rationalNumber1.byteValue();
    int i12 = rationalNumber1.numerator;
    int i13 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    RationalNumber rationalNumber4 = rationalNumber3.negate();
    int i5 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)0);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.divisor;
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Invalid rational (10/0)"+ "'", str3.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)' ');
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.divisor;
    int i4 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32"+ "'", str2.equals("32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, (int)(byte)100);
    int i3 = rationalNumber2.intValue();
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 1.0f);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(10.0d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    java.lang.String str3 = rationalNumber2.toDisplayString();
    double d4 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-10"+ "'", str3.equals("-10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-10.0d));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    RationalNumber rationalNumber8 = rationalNumber7.negate();
    RationalNumber rationalNumber9 = rationalNumber7.negate();
    double d10 = rationalNumber9.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    byte byte6 = rationalNumber1.byteValue();
    int i7 = rationalNumber1.divisor;
    double d8 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    long long5 = rationalNumber1.longValue();
    float f6 = rationalNumber1.floatValue();
    byte byte7 = rationalNumber1.byteValue();
    int i8 = rationalNumber1.numerator;
    int i9 = rationalNumber1.numerator;
    int i10 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    double d4 = rationalNumber2.doubleValue();
    int i5 = rationalNumber2.divisor;
    int i6 = rationalNumber2.numerator;
    java.lang.String str7 = rationalNumber2.toString();
    long long8 = rationalNumber2.longValue();
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 10.0f);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    int i5 = rationalNumber4.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber2.numerator;
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    double d2 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    short s4 = rationalNumber1.shortValue();
    short s5 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    short s6 = rationalNumber2.shortValue();
    double d7 = rationalNumber2.doubleValue();
    double d8 = rationalNumber2.doubleValue();
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    int i4 = rationalNumber1.numerator;
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100"+ "'", str6.equals("100"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    short s4 = rationalNumber1.shortValue();
    float f5 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)'4');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (-1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    long long4 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)0);
    int i3 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    RationalNumber rationalNumber2 = new RationalNumber((-10), (int)(short)0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, (int)(byte)100);
    double d3 = rationalNumber2.doubleValue();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    RationalNumber rationalNumber9 = rationalNumber1.negate();
    long long10 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)'#');
    short s3 = rationalNumber2.shortValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1/35 (0.029)"+ "'", str5.equals("1/35 (0.029)"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10"+ "'", str3.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10"+ "'", str4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(Double.NaN);
    float f2 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10"+ "'", str3.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10"+ "'", str4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    int i6 = rationalNumber1.divisor;
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    int i8 = rationalNumber7.numerator;
    double d9 = rationalNumber7.doubleValue();
    short s10 = rationalNumber7.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s10 == (short)0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    short s7 = rationalNumber2.shortValue();
    int i8 = rationalNumber2.intValue();
    int i9 = rationalNumber2.intValue();
    double d10 = rationalNumber2.doubleValue();
    int i11 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)100.0f);
    short s2 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)100);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)(short)-1);
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.divisor;
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.numerator;
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.intValue();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    int i8 = rationalNumber2.divisor;
    int i9 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    int i8 = rationalNumber1.intValue();
    int i9 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, (int)(byte)100);
    double d3 = rationalNumber2.doubleValue();
    short s4 = rationalNumber2.shortValue();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    double d4 = rationalNumber2.doubleValue();
    int i5 = rationalNumber2.numerator;
    double d6 = rationalNumber2.doubleValue();
    java.lang.String str7 = rationalNumber2.toString();
    short s8 = rationalNumber2.shortValue();
    byte byte9 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte9 == (byte)10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.intValue();
    byte byte7 = rationalNumber2.byteValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    int i10 = rationalNumber9.numerator;
    java.lang.String str11 = rationalNumber9.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 10);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 1);
    long long3 = rationalNumber2.longValue();
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)(byte)32);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    short s2 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)52);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)'#');
    short s3 = rationalNumber2.shortValue();
    int i4 = rationalNumber2.divisor;
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.02857142857142857d));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    int i2 = rationalNumber1.numerator;
    byte byte3 = rationalNumber1.byteValue();
    float f4 = rationalNumber1.floatValue();
    int i5 = rationalNumber1.numerator;
    int i6 = rationalNumber1.intValue();
    java.lang.String str7 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1"+ "'", str7.equals("-1"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    java.lang.String str8 = rationalNumber1.toDisplayString();
    int i9 = rationalNumber1.numerator;
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    java.lang.String str11 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    double d6 = rationalNumber4.doubleValue();
    long long7 = rationalNumber4.longValue();
    java.lang.String str8 = rationalNumber4.toDisplayString();
    float f9 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10"+ "'", str8.equals("-10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == (-10.0f));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    double d2 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    int i5 = rationalNumber3.intValue();
    java.lang.String str6 = rationalNumber3.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-32, (int)(short)-32);
    byte byte3 = rationalNumber2.byteValue();
    float f4 = rationalNumber2.floatValue();
    java.lang.String str5 = rationalNumber2.toString();
    byte byte6 = rationalNumber2.byteValue();
    int i7 = rationalNumber2.intValue();
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1"+ "'", str5.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-32));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    int i9 = rationalNumber2.numerator;
    java.lang.String str10 = rationalNumber2.toDisplayString();
    java.lang.String str11 = rationalNumber2.toString();
    java.lang.String str12 = rationalNumber2.toString();
    int i13 = rationalNumber2.divisor;
    int i14 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10"+ "'", str10.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10"+ "'", str11.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10"+ "'", str12.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    java.lang.String str6 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    long long6 = rationalNumber2.longValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    byte byte8 = rationalNumber7.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)-10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    float f4 = rationalNumber1.floatValue();
    int i5 = rationalNumber1.numerator;
    java.lang.String str6 = rationalNumber1.toString();
    double d7 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, (-100));
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    long long10 = rationalNumber8.longValue();
    RationalNumber rationalNumber11 = rationalNumber8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.intValue();
    int i5 = rationalNumber2.numerator;
    int i6 = rationalNumber2.divisor;
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10"+ "'", str3.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(short)1);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    int i9 = rationalNumber2.numerator;
    java.lang.String str10 = rationalNumber2.toString();
    byte byte11 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10"+ "'", str10.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    double d2 = rationalNumber1.doubleValue();
    byte byte3 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    RationalNumber rationalNumber2 = new RationalNumber(35, (int)(short)0);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.divisor;
    int i4 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    long long5 = rationalNumber2.longValue();
    byte byte6 = rationalNumber2.byteValue();
    long long7 = rationalNumber2.longValue();
    int i8 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    long long10 = rationalNumber8.longValue();
    java.lang.String str11 = rationalNumber8.toDisplayString();
    int i12 = rationalNumber8.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    float f11 = rationalNumber10.floatValue();
    int i12 = rationalNumber10.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toString();
    int i10 = rationalNumber8.intValue();
    int i11 = rationalNumber8.numerator;
    int i12 = rationalNumber8.divisor;
    RationalNumber rationalNumber13 = rationalNumber8.negate();
    float f14 = rationalNumber13.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.0f);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    RationalNumber rationalNumber9 = rationalNumber1.negate();
    long long10 = rationalNumber9.longValue();
    int i11 = rationalNumber9.intValue();
    RationalNumber rationalNumber12 = rationalNumber9.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber12);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    long long10 = rationalNumber8.longValue();
    java.lang.String str11 = rationalNumber8.toDisplayString();
    RationalNumber rationalNumber12 = rationalNumber8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber12);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, (int)(byte)100);
    int i3 = rationalNumber2.intValue();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    long long2 = rationalNumber1.longValue();
    java.lang.String str3 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100"+ "'", str3.equals("100"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)32, (-32));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.divisor;
    int i4 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    double d6 = rationalNumber2.doubleValue();
    float f7 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.divisor;
    java.lang.String str8 = rationalNumber1.toString();
    double d9 = rationalNumber1.doubleValue();
    int i10 = rationalNumber1.numerator;
    int i11 = rationalNumber1.numerator;
    java.lang.String str12 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    long long10 = rationalNumber1.longValue();
    byte byte11 = rationalNumber1.byteValue();
    long long12 = rationalNumber1.longValue();
    long long13 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber2.numerator;
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.intValue();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    short s8 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    double d4 = rationalNumber2.doubleValue();
    int i5 = rationalNumber2.numerator;
    double d6 = rationalNumber2.doubleValue();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    long long10 = rationalNumber8.longValue();
    java.lang.String str11 = rationalNumber8.toDisplayString();
    java.lang.String str12 = rationalNumber8.toString();
    RationalNumber rationalNumber13 = rationalNumber8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0"+ "'", str11.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber13);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber2.numerator;
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = rationalNumber2.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    java.lang.String str8 = rationalNumber1.toDisplayString();
    java.lang.String str9 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    double d6 = rationalNumber4.doubleValue();
    long long7 = rationalNumber4.longValue();
    int i8 = rationalNumber4.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)10);
    byte byte2 = rationalNumber1.byteValue();
    short s3 = rationalNumber1.shortValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    RationalNumber rationalNumber2 = new RationalNumber((-10), 35);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    int i2 = rationalNumber1.divisor;
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.divisor;
    byte byte5 = rationalNumber1.byteValue();
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    int i8 = rationalNumber1.intValue();
    long long9 = rationalNumber1.longValue();
    int i10 = rationalNumber1.intValue();
    byte byte11 = rationalNumber1.byteValue();
    byte byte12 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte12 == (byte)0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10"+ "'", str4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.divisor;
    long long8 = rationalNumber1.longValue();
    int i9 = rationalNumber1.numerator;
    java.lang.String str10 = rationalNumber1.toString();
    int i11 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    RationalNumber rationalNumber10 = rationalNumber1.negate();
    RationalNumber rationalNumber11 = rationalNumber10.negate();
    int i12 = rationalNumber10.numerator;
    double d13 = rationalNumber10.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    long long4 = rationalNumber1.longValue();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    double d5 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 100.0d);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    int i9 = rationalNumber8.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-10));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    double d4 = rationalNumber2.doubleValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    long long9 = rationalNumber2.longValue();
    double d10 = rationalNumber2.doubleValue();
    java.lang.String str11 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10"+ "'", str8.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10"+ "'", str11.equals("10"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    RationalNumber rationalNumber2 = new RationalNumber((-100), (int)(byte)-10);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10"+ "'", str3.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-10));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.numerator;
    float f4 = rationalNumber2.floatValue();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.numerator;
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-10, (int)(short)-32);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber6.divisor;
    int i8 = rationalNumber6.divisor;
    short s9 = rationalNumber6.shortValue();
    int i10 = rationalNumber6.divisor;
    int i11 = rationalNumber6.divisor;
    int i12 = rationalNumber6.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber2.numerator;
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber4.shortValue();
    long long6 = rationalNumber4.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.35d);
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
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)'a');
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    long long3 = rationalNumber2.longValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    double d8 = rationalNumber7.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-10.0d));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    java.lang.String str10 = rationalNumber8.toDisplayString();
    double d11 = rationalNumber8.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(100.0d);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    short s2 = rationalNumber1.shortValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1"+ "'", str4.equals("1"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    int i6 = rationalNumber1.divisor;
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    int i8 = rationalNumber7.numerator;
    double d9 = rationalNumber7.doubleValue();
    double d10 = rationalNumber7.doubleValue();
    int i11 = rationalNumber7.intValue();
    long long12 = rationalNumber7.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    int i8 = rationalNumber1.intValue();
    long long9 = rationalNumber1.longValue();
    int i10 = rationalNumber1.intValue();
    byte byte11 = rationalNumber1.byteValue();
    java.lang.String str12 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    int i6 = rationalNumber1.divisor;
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    int i8 = rationalNumber7.numerator;
    double d9 = rationalNumber7.doubleValue();
    double d10 = rationalNumber7.doubleValue();
    RationalNumber rationalNumber11 = rationalNumber7.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    int i9 = rationalNumber1.divisor;
    float f10 = rationalNumber1.floatValue();
    int i11 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    float f4 = rationalNumber1.floatValue();
    int i5 = rationalNumber1.numerator;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    java.lang.String str7 = rationalNumber1.toString();
    int i8 = rationalNumber1.intValue();
    java.lang.String str9 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    java.lang.String str3 = rationalNumber2.toString();
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.intValue();
    byte byte7 = rationalNumber2.byteValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    int i10 = rationalNumber9.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    RationalNumber rationalNumber7 = rationalNumber5.negate();
    java.lang.String str8 = rationalNumber5.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10"+ "'", str8.equals("-10"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.intValue();
    byte byte7 = rationalNumber2.byteValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    short s9 = rationalNumber2.shortValue();
    int i10 = rationalNumber2.divisor;
    RationalNumber rationalNumber11 = rationalNumber2.negate();
    short s12 = rationalNumber11.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s12 == (short)0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)32, (int)(short)-10);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 1);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    java.lang.String str2 = rationalNumber1.toString();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52"+ "'", str2.equals("52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "52"+ "'", str3.equals("52"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.numerator;
    short s3 = rationalNumber1.shortValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    double d7 = rationalNumber2.doubleValue();
    double d8 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    RationalNumber rationalNumber2 = new RationalNumber(35, (int)(short)10);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    long long10 = rationalNumber8.longValue();
    int i11 = rationalNumber8.intValue();
    int i12 = rationalNumber8.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (-100));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    double d2 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    java.lang.String str5 = rationalNumber3.toDisplayString();
    java.lang.String str6 = rationalNumber3.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

}
