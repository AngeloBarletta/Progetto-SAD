
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, 10);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    byte byte5 = rationalNumber2.byteValue();
    long long6 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, (int)(short)100);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)-1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    float f6 = rationalNumber4.floatValue();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    java.lang.String str8 = rationalNumber7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)(short)-1);
    java.lang.String str3 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-52"+ "'", str3.equals("-52"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
    int i3 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)(short)-1);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    int i6 = rationalNumber4.numerator;
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber3.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    short s3 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-10);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    float f6 = rationalNumber4.floatValue();
    int i7 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-10));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)-10);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    short s3 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    float f7 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    long long6 = rationalNumber4.longValue();
    java.lang.String str7 = rationalNumber4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)(short)-1);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-52.0d));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0);
    java.lang.String str2 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    short s5 = rationalNumber2.shortValue();
    float f6 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)(short)-1);
    java.lang.String str3 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-52"+ "'", str3.equals("-52"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    float f4 = rationalNumber1.floatValue();
    java.lang.String str5 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    RationalNumber rationalNumber2 = new RationalNumber(1, (-1));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    byte byte7 = rationalNumber2.byteValue();
    int i8 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (-1));
    float f3 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    short s4 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)-1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    int i6 = rationalNumber1.numerator;
    java.lang.String str7 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1"+ "'", str7.equals("-1"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-10, (int)'4');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    float f4 = rationalNumber1.floatValue();
    byte byte5 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)10);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.numerator;
    float f5 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    short s6 = rationalNumber4.shortValue();
    java.lang.String str7 = rationalNumber4.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    byte byte5 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    float f6 = rationalNumber4.floatValue();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    double d8 = rationalNumber7.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-52.0d));
    double d2 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == (-52.0d));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    int i6 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    long long3 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    long long5 = rationalNumber2.longValue();
    byte byte6 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    long long4 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    int i2 = rationalNumber1.intValue();
    long long3 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.divisor;
    byte byte5 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    double d5 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    long long5 = rationalNumber2.longValue();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.intValue();
    float f8 = rationalNumber2.floatValue();
    double d9 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    double d7 = rationalNumber2.doubleValue();
    double d8 = rationalNumber2.doubleValue();
    java.lang.String str9 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    long long2 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (-1));
    java.lang.String str3 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    java.lang.String str3 = rationalNumber1.toString();
    int i4 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.numerator;
    float f6 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    int i2 = rationalNumber1.intValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(short)0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
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
    org.junit.Assert.assertTrue(s4 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    long long4 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)(byte)1);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    java.lang.String str4 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    int i3 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    java.lang.String str8 = rationalNumber2.toString();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    int i10 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)-1);
    float f3 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-0.0f));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    byte byte4 = rationalNumber3.byteValue();
    float f5 = rationalNumber3.floatValue();
    long long6 = rationalNumber3.longValue();
    byte byte7 = rationalNumber3.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)-1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    float f6 = rationalNumber4.floatValue();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    int i8 = rationalNumber7.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toString();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)' ');
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/32 (-0.031)"+ "'", str3.equals("-1/32 (-0.031)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-0.03125f));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-0.01d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    int i9 = rationalNumber2.divisor;
    RationalNumber rationalNumber10 = rationalNumber2.negate();
    double d11 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    float f5 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-52.0d));
    java.lang.String str2 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-52"+ "'", str2.equals("-52"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    int i7 = rationalNumber2.divisor;
    long long8 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    int i9 = rationalNumber2.divisor;
    int i10 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    short s5 = rationalNumber2.shortValue();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    double d8 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    short s3 = rationalNumber1.shortValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    long long5 = rationalNumber2.longValue();
    float f6 = rationalNumber2.floatValue();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    float f4 = rationalNumber3.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-1.0f));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    java.lang.String str8 = rationalNumber2.toString();
    int i9 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    short s7 = rationalNumber4.shortValue();
    byte byte8 = rationalNumber4.byteValue();
    int i9 = rationalNumber4.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    float f5 = rationalNumber1.floatValue();
    long long6 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    java.lang.String str3 = rationalNumber1.toString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    int i5 = rationalNumber1.divisor;
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    RationalNumber rationalNumber2 = new RationalNumber((-10), (int)'a');

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    java.lang.String str6 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    short s6 = rationalNumber4.shortValue();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    byte byte8 = rationalNumber7.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    double d5 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    int i2 = rationalNumber1.divisor;
    int i3 = rationalNumber1.divisor;
    short s4 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)-1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    float f5 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-52.0d));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-52.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-52.0d));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    byte byte5 = rationalNumber2.byteValue();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    java.lang.String str3 = rationalNumber2.toDisplayString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-10"+ "'", str3.equals("-10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-10"+ "'", str4.equals("-10"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    short s7 = rationalNumber2.shortValue();
    int i8 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    float f7 = rationalNumber2.floatValue();
    long long8 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    int i8 = rationalNumber2.numerator;
    int i9 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
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
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    int i2 = rationalNumber1.divisor;
    java.lang.String str3 = rationalNumber1.toString();
    float f4 = rationalNumber1.floatValue();
    double d5 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    short s5 = rationalNumber2.shortValue();
    int i6 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    double d7 = rationalNumber2.doubleValue();
    int i8 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1"+ "'", str2.equals("1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.intValue();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/100 (-0.01)"+ "'", str3.equals("-1/100 (-0.01)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-0.01"+ "'", str4.equals("-0.01"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    short s7 = rationalNumber2.shortValue();
    double d8 = rationalNumber2.doubleValue();
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    byte byte4 = rationalNumber3.byteValue();
    float f5 = rationalNumber3.floatValue();
    int i6 = rationalNumber3.intValue();
    float f7 = rationalNumber3.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == (-1.0f));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)(byte)1);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-52, (-10));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    short s6 = rationalNumber4.shortValue();
    int i7 = rationalNumber4.intValue();
    float f8 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-1));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    short s6 = rationalNumber4.shortValue();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    int i8 = rationalNumber4.intValue();
    int i9 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    byte byte4 = rationalNumber3.byteValue();
    float f5 = rationalNumber3.floatValue();
    int i6 = rationalNumber3.intValue();
    double d7 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    byte byte2 = rationalNumber1.byteValue();
    long long3 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber6.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    java.lang.String str3 = rationalNumber2.toString();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/100 (-0.01)"+ "'", str3.equals("-1/100 (-0.01)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    double d3 = rationalNumber2.doubleValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.01d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-0.01d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-0.01"+ "'", str5.equals("-0.01"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    double d7 = rationalNumber2.doubleValue();
    float f8 = rationalNumber2.floatValue();
    java.lang.String str9 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    long long7 = rationalNumber2.longValue();
    int i8 = rationalNumber2.numerator;
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    java.lang.String str8 = rationalNumber2.toString();
    java.lang.String str9 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    long long8 = rationalNumber2.longValue();
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    short s6 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)' ');
    double d3 = rationalNumber2.doubleValue();
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.03125d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (-1));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)100.0f);
    int i2 = rationalNumber1.intValue();
    byte byte3 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)100);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    short s6 = rationalNumber2.shortValue();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    int i9 = rationalNumber2.numerator;
    int i10 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.intValue();
    java.lang.String str8 = rationalNumber2.toString();
    java.lang.String str9 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.divisor;
    float f5 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    int i6 = rationalNumber1.numerator;
    long long7 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-52, (int)(short)0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'#', (int)'#');
    java.lang.String str3 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1"+ "'", str3.equals("1"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    short s3 = rationalNumber1.shortValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    double d5 = rationalNumber1.doubleValue();
    long long6 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    java.lang.String str5 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)' ');
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/32 (-0.031)"+ "'", str3.equals("-1/32 (-0.031)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    java.lang.String str6 = rationalNumber4.toString();
    byte byte7 = rationalNumber4.byteValue();
    int i8 = rationalNumber4.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    byte byte7 = rationalNumber6.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    int i6 = rationalNumber4.numerator;
    float f7 = rationalNumber4.floatValue();
    float f8 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(short)1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    byte byte6 = rationalNumber2.byteValue();
    float f7 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    byte byte4 = rationalNumber3.byteValue();
    float f5 = rationalNumber3.floatValue();
    double d6 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    short s3 = rationalNumber1.shortValue();
    int i4 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    byte byte7 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)-1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)' ');
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/32 (-0.031)"+ "'", str3.equals("-1/32 (-0.031)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-52.0d));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    float f4 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-52.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-52.0f));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    long long5 = rationalNumber2.longValue();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    int i7 = rationalNumber4.intValue();
    byte byte8 = rationalNumber4.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-0.03125f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toString();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    java.lang.String str8 = rationalNumber1.toDisplayString();
    short s9 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1"+ "'", str8.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)-1);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    long long3 = rationalNumber2.longValue();
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    long long6 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)(short)-1);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    float f5 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)1);
    double d2 = rationalNumber1.doubleValue();
    int i3 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    short s7 = rationalNumber2.shortValue();
    int i8 = rationalNumber2.numerator;
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.0f);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, 0);
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(short)100);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    java.lang.String str3 = rationalNumber2.toString();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    byte byte4 = rationalNumber3.byteValue();
    float f5 = rationalNumber3.floatValue();
    float f6 = rationalNumber3.floatValue();
    long long7 = rationalNumber3.longValue();
    double d8 = rationalNumber3.doubleValue();
    java.lang.String str9 = rationalNumber3.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1"+ "'", str9.equals("-1"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)-10);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    float f3 = rationalNumber1.floatValue();
    short s4 = rationalNumber1.shortValue();
    long long5 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.intValue();
    long long6 = rationalNumber1.longValue();
    long long7 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toString();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    float f8 = rationalNumber1.floatValue();
    float f9 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == (-1.0f));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    short s5 = rationalNumber2.shortValue();
    int i6 = rationalNumber2.intValue();
    int i7 = rationalNumber2.intValue();
    int i8 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, 100);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    byte byte7 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)-1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    java.lang.String str6 = rationalNumber4.toString();
    byte byte7 = rationalNumber4.byteValue();
    int i8 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.numerator;
    float f8 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == (-1.0f));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    byte byte7 = rationalNumber4.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-10.0f));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    int i5 = rationalNumber1.divisor;
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    long long6 = rationalNumber2.longValue();
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    byte byte6 = rationalNumber2.byteValue();
    int i7 = rationalNumber2.intValue();
    float f8 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)100);
    double d2 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 100.0d);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    java.lang.String str6 = rationalNumber4.toString();
    int i7 = rationalNumber4.divisor;
    java.lang.String str8 = rationalNumber4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)' ');
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    long long5 = rationalNumber2.longValue();
    float f6 = rationalNumber2.floatValue();
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(byte)100);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)(byte)1);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    long long5 = rationalNumber1.longValue();
    java.lang.String str6 = rationalNumber1.toString();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    java.lang.String str8 = rationalNumber1.toDisplayString();
    java.lang.String str9 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1"+ "'", str6.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1"+ "'", str8.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1"+ "'", str9.equals("-1"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    double d4 = rationalNumber2.doubleValue();
    short s5 = rationalNumber2.shortValue();
    int i6 = rationalNumber2.intValue();
    float f7 = rationalNumber2.floatValue();
    double d8 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.numerator;
    byte byte6 = rationalNumber2.byteValue();
    int i7 = rationalNumber2.intValue();
    long long8 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    int i7 = rationalNumber4.intValue();
    RationalNumber rationalNumber8 = rationalNumber4.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber1.floatValue();
    java.lang.String str4 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.divisor;
    java.lang.String str6 = rationalNumber4.toDisplayString();
    int i7 = rationalNumber4.intValue();
    short s8 = rationalNumber4.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    int i2 = rationalNumber1.intValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(byte)1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber7.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    double d4 = rationalNumber1.doubleValue();
    int i5 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.intValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    byte byte8 = rationalNumber2.byteValue();
    int i9 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toString();
    short s3 = rationalNumber1.shortValue();
    byte byte4 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)-1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    short s3 = rationalNumber1.shortValue();
    int i4 = rationalNumber1.numerator;
    byte byte5 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), 100);
    double d3 = rationalNumber2.doubleValue();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.01d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-0.01d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.intValue();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.intValue();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0"+ "'", str8.equals("0"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    java.lang.String str6 = rationalNumber4.toString();
    long long7 = rationalNumber4.longValue();
    int i8 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-10, (int)(byte)-52);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber2.shortValue();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    long long6 = rationalNumber2.longValue();
    double d7 = rationalNumber2.doubleValue();
    int i8 = rationalNumber2.intValue();
    java.lang.String str9 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)10);
    float f3 = rationalNumber2.floatValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber2.toString();
    java.lang.String str6 = rationalNumber2.toString();
    double d7 = rationalNumber2.doubleValue();
    float f8 = rationalNumber2.floatValue();
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

}
