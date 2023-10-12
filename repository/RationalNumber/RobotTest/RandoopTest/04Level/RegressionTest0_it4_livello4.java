
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = rationalNumber2.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = rationalNumber5.intValue();
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

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = rationalNumber2.longValue();
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

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = rationalNumber2.toDisplayString();
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
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = rationalNumber4.intValue();
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

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    float f5 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    byte byte6 = rationalNumber2.byteValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    java.lang.String str4 = rationalNumber2.toString();
    // The following exception was thrown during execution in test generation
    try {
    byte byte5 = rationalNumber2.byteValue();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (10/0)"+ "'", str4.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
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
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    byte byte4 = rationalNumber2.byteValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = rationalNumber5.intValue();
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

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toString();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = rationalNumber4.intValue();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Invalid rational (-10/0)"+ "'", str5.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber5.longValue();
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
    org.junit.Assert.assertTrue(i6 == (-10));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = rationalNumber2.intValue();
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
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)0);
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
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    long long6 = rationalNumber2.longValue();
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

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber5.toDisplayString();
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

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.1"+ "'", str5.equals("0.1"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.divisor;
    double d12 = rationalNumber6.doubleValue();
    
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
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.1d);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    short s4 = rationalNumber2.shortValue();
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber6.toDisplayString();
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
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.numerator;
    int i8 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    java.lang.String str8 = rationalNumber5.toString();
    // The following exception was thrown during execution in test generation
    try {
    short s9 = rationalNumber5.shortValue();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (-10/0)"+ "'", str8.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber4.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-10));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    long long6 = rationalNumber2.longValue();
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
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', 32);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    int i5 = rationalNumber3.divisor;
    int i6 = rationalNumber3.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    int i7 = rationalNumber5.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = rationalNumber5.toDisplayString();
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toString();
    int i13 = rationalNumber6.divisor;
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10/100 (0.1)"+ "'", str12.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    int i7 = rationalNumber5.intValue();
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

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    double d8 = rationalNumber2.doubleValue();
    
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
    org.junit.Assert.assertTrue(d8 == 0.32d);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.divisor;
    java.lang.String str6 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.1"+ "'", str6.equals("0.1"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = rationalNumber2.intValue();
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

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-32));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    short s5 = rationalNumber1.shortValue();
    int i6 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    long long2 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = rationalNumber5.toDisplayString();
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

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    int i5 = rationalNumber3.divisor;
    float f6 = rationalNumber3.floatValue();
    double d7 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    int i4 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.1d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.NEGATIVE_INFINITY);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.divisor;
    int i6 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    short s5 = rationalNumber2.shortValue();
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

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber5.toDisplayString();
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

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = rationalNumber2.toDisplayString();
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
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, 0);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    float f4 = rationalNumber1.floatValue();
    int i5 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)100);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.1f);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    java.lang.String str4 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    float f3 = rationalNumber1.floatValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    long long10 = rationalNumber6.longValue();
    int i11 = rationalNumber6.numerator;
    
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
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)'#');

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32/100 (0.32)"+ "'", str6.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toString();
    // The following exception was thrown during execution in test generation
    try {
    byte byte6 = rationalNumber4.byteValue();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Invalid rational (-10/0)"+ "'", str5.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    double d5 = rationalNumber2.doubleValue();
    byte byte6 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    int i6 = rationalNumber1.divisor;
    
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
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = rationalNumber2.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    int i8 = rationalNumber5.numerator;
    double d9 = rationalNumber5.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    byte byte10 = rationalNumber5.byteValue();
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
    org.junit.Assert.assertTrue(i8 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == Double.NEGATIVE_INFINITY);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32/100 (0.32)"+ "'", str7.equals("32/100 (0.32)"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-0.3125d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    double d4 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = rationalNumber2.toDisplayString();
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    RationalNumber rationalNumber8 = rationalNumber6.negate();
    float f9 = rationalNumber6.floatValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.1f);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    long long8 = rationalNumber7.longValue();
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

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = rationalNumber2.toDisplayString();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-0.1f));
    int i2 = rationalNumber1.divisor;
    double d3 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.1d));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    long long7 = rationalNumber2.longValue();
    short s8 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.1f);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    java.lang.String str7 = rationalNumber2.toString();
    // The following exception was thrown during execution in test generation
    try {
    short s8 = rationalNumber2.shortValue();
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)-1);
    long long3 = rationalNumber2.longValue();
    double d4 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-1.0d));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    long long7 = rationalNumber2.longValue();
    java.lang.String str8 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32/100 (0.32)"+ "'", str8.equals("32/100 (0.32)"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber2.shortValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.1"+ "'", str7.equals("0.1"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    int i6 = rationalNumber1.divisor;
    java.lang.String str7 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10);
    byte byte2 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)10);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (-1));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte6 = rationalNumber5.byteValue();
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

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.numerator;
    java.lang.String str5 = rationalNumber2.toString();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Invalid rational (-1/0)"+ "'", str5.equals("Invalid rational (-1/0)"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10.0f);
    short s2 = rationalNumber1.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)10);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    int i9 = rationalNumber6.numerator;
    
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
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    java.lang.String str9 = rationalNumber8.toString();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-32/100 (-0.32)"+ "'", str9.equals("-32/100 (-0.32)"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    RationalNumber rationalNumber2 = new RationalNumber(32, (int)(byte)-1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    float f7 = rationalNumber5.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    long long8 = rationalNumber5.longValue();
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
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    short s4 = rationalNumber1.shortValue();
    float f5 = rationalNumber1.floatValue();
    int i6 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


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
    RationalNumber rationalNumber12 = rationalNumber2.negate();
    double d13 = rationalNumber12.doubleValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-0.32d));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, (int)(byte)10);
    double d3 = rationalNumber2.doubleValue();
    long long4 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 10L);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    byte byte5 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (-10));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    float f6 = rationalNumber5.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    short s3 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toString();
    int i5 = rationalNumber1.divisor;
    
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

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    int i7 = rationalNumber2.numerator;
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (-10));
    int i3 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber2.toDisplayString();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber5.floatValue();
    int i7 = rationalNumber5.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber6.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    int i4 = rationalNumber2.numerator;
    java.lang.String str5 = rationalNumber2.toString();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Invalid rational (-1/0)"+ "'", str5.equals("Invalid rational (-1/0)"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber2.floatValue();
    int i7 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    byte byte4 = rationalNumber1.byteValue();
    float f5 = rationalNumber1.floatValue();
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)0);
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
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    short s5 = rationalNumber3.shortValue();
    java.lang.String str6 = rationalNumber3.toDisplayString();
    long long7 = rationalNumber3.longValue();
    long long8 = rationalNumber3.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    java.lang.String str2 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)-1);
    int i2 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    double d7 = rationalNumber2.doubleValue();
    float f8 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.intValue();
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    byte byte5 = rationalNumber3.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-32/100 (-0.32)"+ "'", str4.equals("-32/100 (-0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber7.divisor;
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte8 = rationalNumber7.byteValue();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    int i7 = rationalNumber1.divisor;
    short s8 = rationalNumber1.shortValue();
    int i9 = rationalNumber1.numerator;
    
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
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    long long10 = rationalNumber6.longValue();
    long long11 = rationalNumber6.longValue();
    
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
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)-10);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    byte byte2 = rationalNumber1.byteValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)100);
    int i3 = rationalNumber2.divisor;
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber2.longValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    float f7 = rationalNumber5.floatValue();
    int i8 = rationalNumber5.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-0.02857142857142857d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    int i7 = rationalNumber6.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)32);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    byte byte3 = rationalNumber1.byteValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.numerator;
    java.lang.String str6 = rationalNumber2.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber2.toDisplayString();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (10/0)"+ "'", str4.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid rational (10/0)"+ "'", str6.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = rationalNumber2.intValue();
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
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    float f5 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    byte byte5 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


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
    int i13 = rationalNumber6.intValue();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.intValue();
    byte byte5 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)1);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    short s6 = rationalNumber1.shortValue();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    int i8 = rationalNumber7.divisor;
    
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
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    int i6 = rationalNumber4.intValue();
    
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

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)'#');
    java.lang.String str3 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-0.029"+ "'", str3.equals("-0.029"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    int i7 = rationalNumber5.numerator;
    int i8 = rationalNumber5.divisor;
    long long9 = rationalNumber5.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)-1);
    float f2 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == (-1.0f));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    java.lang.String str7 = rationalNumber5.toString();
    java.lang.String str8 = rationalNumber5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-10/100 (-0.1)"+ "'", str7.equals("-10/100 (-0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10/100 (-0.1)"+ "'", str8.equals("-10/100 (-0.1)"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    short s3 = rationalNumber2.shortValue();
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (-10));
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-0.1d));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


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
    float f14 = rationalNumber2.floatValue();
    
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
    org.junit.Assert.assertTrue(f14 == 0.32f);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(short)0);
    int i3 = rationalNumber2.divisor;
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
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 1);
    int i3 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.numerator;
    double d8 = rationalNumber2.doubleValue();
    java.lang.String str9 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (10/0)"+ "'", str9.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    double d7 = rationalNumber5.doubleValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    java.lang.String str9 = rationalNumber5.toDisplayString();
    int i10 = rationalNumber5.intValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-0.1"+ "'", str9.equals("-0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    int i6 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.3125d));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    int i4 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    java.lang.String str3 = rationalNumber2.toString();
    float f4 = rationalNumber2.floatValue();
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.1d);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    java.lang.String str3 = rationalNumber2.toDisplayString();
    int i4 = rationalNumber2.numerator;
    long long5 = rationalNumber2.longValue();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.32"+ "'", str3.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.32d);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    double d8 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.divisor;
    int i6 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    byte byte7 = rationalNumber2.byteValue();
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    int i7 = rationalNumber5.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-32));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    double d7 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber8 = rationalNumber4.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    float f10 = rationalNumber8.floatValue();
    java.lang.String str11 = rationalNumber8.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.1"+ "'", str9.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.1"+ "'", str11.equals("0.1"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    short s3 = rationalNumber2.shortValue();
    int i4 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    float f7 = rationalNumber5.floatValue();
    float f8 = rationalNumber5.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = rationalNumber5.toDisplayString();
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
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    float f5 = rationalNumber3.floatValue();
    int i6 = rationalNumber3.intValue();
    long long7 = rationalNumber3.longValue();
    int i8 = rationalNumber3.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-32/100 (-0.32)"+ "'", str4.equals("-32/100 (-0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.32"+ "'", str7.equals("0.32"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    java.lang.String str4 = rationalNumber2.toString();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (10/0)"+ "'", str4.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Invalid rational (10/0)"+ "'", str5.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.divisor;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = rationalNumber2.intValue();
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
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, 10);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber2.floatValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    double d8 = rationalNumber7.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.NEGATIVE_INFINITY);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (int)(byte)0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    long long8 = rationalNumber2.longValue();
    java.lang.String str9 = rationalNumber2.toDisplayString();
    
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
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.32"+ "'", str9.equals("0.32"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.32d);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


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
    java.lang.String str12 = rationalNumber1.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0"+ "'", str12.equals("0"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)32);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-10));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


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
    short s13 = rationalNumber2.shortValue();
    
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
    org.junit.Assert.assertTrue(s13 == (short)0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)100);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    short s6 = rationalNumber5.shortValue();
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

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)(short)0);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (-1/0)"+ "'", str4.equals("Invalid rational (-1/0)"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.1f);
    float f2 = rationalNumber1.floatValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.1f);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)'#');
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.02857142857142857d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    int i5 = rationalNumber2.divisor;
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    java.lang.String str7 = rationalNumber1.toDisplayString();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)'4');
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    int i4 = rationalNumber1.numerator;
    double d5 = rationalNumber1.doubleValue();
    int i6 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    RationalNumber rationalNumber2 = new RationalNumber((-32), (int)(byte)100);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.intValue();
    int i9 = rationalNumber6.intValue();
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)32);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    int i2 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    long long8 = rationalNumber4.longValue();
    RationalNumber rationalNumber9 = rationalNumber4.negate();
    
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
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(short)100);
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.32f);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.1d);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    RationalNumber rationalNumber2 = new RationalNumber(1, 35);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


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
    long long11 = rationalNumber1.longValue();
    double d12 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber13 = rationalNumber1.negate();
    java.lang.String str14 = rationalNumber1.toString();
    
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
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0"+ "'", str14.equals("0"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte6 = rationalNumber2.byteValue();
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

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


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
    RationalNumber rationalNumber12 = rationalNumber2.negate();
    java.lang.String str13 = rationalNumber2.toDisplayString();
    
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
    org.junit.Assert.assertNotNull(rationalNumber12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0.32"+ "'", str13.equals("0.32"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.1d);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    short s5 = rationalNumber2.shortValue();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)-1, (int)(byte)-1);
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)'4');
    java.lang.String str3 = rationalNumber2.toString();
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/52 (0.192)"+ "'", str3.equals("10/52 (0.192)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.19230769230769232d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.19230769230769232d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.19230769230769232d);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber4.negate();
    java.lang.String str6 = rationalNumber4.toString();
    float f7 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid rational (-10/0)"+ "'", str6.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    float f3 = rationalNumber1.floatValue();
    int i4 = rationalNumber1.numerator;
    float f5 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)-1);
    long long2 = rationalNumber1.longValue();
    long long3 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    java.lang.String str9 = rationalNumber5.toString();
    // The following exception was thrown during execution in test generation
    try {
    byte byte10 = rationalNumber5.byteValue();
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
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (-10/0)"+ "'", str9.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber3.negate();
    byte byte6 = rationalNumber3.byteValue();
    int i7 = rationalNumber3.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.312"+ "'", str4.equals("0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-32));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = rationalNumber2.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'4', (int)'4');
    java.lang.String str3 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1"+ "'", str3.equals("1"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.1f);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    float f8 = rationalNumber6.floatValue();
    int i9 = rationalNumber6.numerator;
    float f10 = rationalNumber6.floatValue();
    java.lang.String str11 = rationalNumber6.toDisplayString();
    
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
    org.junit.Assert.assertTrue(f10 == 0.1f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.1"+ "'", str11.equals("0.1"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)'#');

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (-1));
    short s3 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)'#');

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    RationalNumber rationalNumber2 = new RationalNumber(1, 0);
    double d3 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.19230769230769232d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)32, (int)(short)0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)32, (int)(byte)100);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    double d8 = rationalNumber4.doubleValue();
    long long9 = rationalNumber4.longValue();
    
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
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber5.negate();
    java.lang.String str7 = rationalNumber5.toString();
    java.lang.String str8 = rationalNumber5.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-10/100 (-0.1)"+ "'", str7.equals("-10/100 (-0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-0.1"+ "'", str8.equals("-0.1"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    java.lang.String str5 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    RationalNumber rationalNumber2 = new RationalNumber(8, 32);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


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
    double d12 = rationalNumber6.doubleValue();
    short s13 = rationalNumber6.shortValue();
    
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
    org.junit.Assert.assertTrue(d12 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s13 == (short)0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber4.negate();
    double d6 = rationalNumber5.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber5.longValue();
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

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    java.lang.String str11 = rationalNumber6.toDisplayString();
    java.lang.String str12 = rationalNumber6.toDisplayString();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.1"+ "'", str11.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.1"+ "'", str12.equals("0.1"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    double d2 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 1.0d);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    RationalNumber rationalNumber4 = rationalNumber3.negate();
    int i5 = rationalNumber4.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.numerator;
    java.lang.String str6 = rationalNumber2.toString();
    int i7 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (10/0)"+ "'", str4.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid rational (10/0)"+ "'", str6.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    float f7 = rationalNumber5.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    short s8 = rationalNumber5.shortValue();
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
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    short s10 = rationalNumber6.shortValue();
    double d11 = rationalNumber6.doubleValue();
    
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
    org.junit.Assert.assertTrue(s10 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.1d);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    int i9 = rationalNumber2.intValue();
    long long10 = rationalNumber2.longValue();
    int i11 = rationalNumber2.numerator;
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    java.lang.String str9 = rationalNumber1.toString();
    long long10 = rationalNumber1.longValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0"+ "'", str9.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    java.lang.String str8 = rationalNumber5.toString();
    // The following exception was thrown during execution in test generation
    try {
    byte byte9 = rationalNumber5.byteValue();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (-10/0)"+ "'", str8.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toString();
    double d13 = rationalNumber6.doubleValue();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10/100 (0.1)"+ "'", str12.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.1d);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    double d4 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = rationalNumber2.intValue();
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
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    java.lang.String str5 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)10);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.intValue();
    short s5 = rationalNumber3.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)'#');
    double d3 = rationalNumber2.doubleValue();
    double d4 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.02857142857142857d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == (-0.02857142857142857d));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    int i2 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (-1));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    byte byte11 = rationalNumber6.byteValue();
    
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
    org.junit.Assert.assertTrue(byte11 == (byte)0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    java.lang.String str10 = rationalNumber6.toDisplayString();
    long long11 = rationalNumber6.longValue();
    double d12 = rationalNumber6.doubleValue();
    java.lang.String str13 = rationalNumber6.toString();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.1"+ "'", str10.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10/100 (0.1)"+ "'", str13.equals("10/100 (0.1)"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    short s7 = rationalNumber6.shortValue();
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
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(byte)1);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    short s5 = rationalNumber2.shortValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber6.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-10));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


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
    java.lang.String str12 = rationalNumber2.toDisplayString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.32"+ "'", str12.equals("0.32"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)'4');
    short s3 = rationalNumber2.shortValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    long long5 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.192"+ "'", str4.equals("0.192"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    long long4 = rationalNumber3.longValue();
    double d5 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(3.2d);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 5);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(short)0);
    float f3 = rationalNumber2.floatValue();
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
    org.junit.Assert.assertTrue(f3 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    float f4 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(3.2d);
    short s2 = rationalNumber1.shortValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 3.2f);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    RationalNumber rationalNumber6 = rationalNumber1.negate();
    short s7 = rationalNumber6.shortValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber3.longValue();
    int i5 = rationalNumber3.intValue();
    double d6 = rationalNumber3.doubleValue();
    java.lang.String str7 = rationalNumber3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-32/100 (-0.32)"+ "'", str7.equals("-32/100 (-0.32)"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    int i6 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    RationalNumber rationalNumber7 = rationalNumber5.negate();
    byte byte8 = rationalNumber7.byteValue();
    java.lang.String str9 = rationalNumber7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte8 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32/100 (0.32)"+ "'", str9.equals("32/100 (0.32)"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    int i7 = rationalNumber5.divisor;
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    double d9 = rationalNumber5.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == Double.NEGATIVE_INFINITY);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


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
    int i15 = rationalNumber2.numerator;
    double d16 = rationalNumber2.doubleValue();
    float f17 = rationalNumber2.floatValue();
    
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
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f17 == 0.32f);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte7 = rationalNumber2.byteValue();
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
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)1, (-10));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.divisor;
    int i5 = rationalNumber3.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
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
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    double d7 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber8 = rationalNumber4.negate();
    long long9 = rationalNumber4.longValue();
    int i10 = rationalNumber4.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)10);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


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
    long long11 = rationalNumber1.longValue();
    double d12 = rationalNumber1.doubleValue();
    int i13 = rationalNumber1.intValue();
    
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
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    RationalNumber rationalNumber8 = rationalNumber1.negate();
    RationalNumber rationalNumber9 = rationalNumber1.negate();
    java.lang.String str10 = rationalNumber9.toString();
    int i11 = rationalNumber9.divisor;
    long long12 = rationalNumber9.longValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0"+ "'", str10.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toDisplayString();
    int i5 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.312"+ "'", str4.equals("0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-10));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


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
    java.lang.String str13 = rationalNumber1.toString();
    int i14 = rationalNumber1.divisor;
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0"+ "'", str13.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.divisor;
    java.lang.String str9 = rationalNumber6.toDisplayString();
    java.lang.String str10 = rationalNumber6.toString();
    
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
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.1"+ "'", str9.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10/100 (0.1)"+ "'", str10.equals("10/100 (0.1)"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    double d9 = rationalNumber8.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = rationalNumber8.toDisplayString();
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
    org.junit.Assert.assertTrue(d9 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    java.lang.String str8 = rationalNumber5.toString();
    java.lang.String str9 = rationalNumber5.toString();
    int i10 = rationalNumber5.numerator;
    // The following exception was thrown during execution in test generation
    try {
    short s11 = rationalNumber5.shortValue();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (-10/0)"+ "'", str8.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (-10/0)"+ "'", str9.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-10));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber4.floatValue();
    long long6 = rationalNumber4.longValue();
    double d7 = rationalNumber4.doubleValue();
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
    org.junit.Assert.assertTrue(d7 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-10));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    // The following exception was thrown during execution in test generation
    try {
    short s8 = rationalNumber2.shortValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)0);
    java.lang.String str2 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)0);
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
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-10, 1);
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-10L));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    byte byte9 = rationalNumber2.byteValue();
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
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    RationalNumber rationalNumber8 = rationalNumber7.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = rationalNumber7.intValue();
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
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    RationalNumber rationalNumber8 = rationalNumber7.negate();
    // The following exception was thrown during execution in test generation
    try {
    short s9 = rationalNumber7.shortValue();
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
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    int i6 = rationalNumber1.intValue();
    java.lang.String str7 = rationalNumber1.toString();
    long long8 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    long long8 = rationalNumber2.longValue();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    
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
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    int i7 = rationalNumber5.numerator;
    java.lang.String str8 = rationalNumber5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-32/100 (-0.32)"+ "'", str8.equals("-32/100 (-0.32)"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    int i9 = rationalNumber2.intValue();
    float f10 = rationalNumber2.floatValue();
    long long11 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = rationalNumber2.toDisplayString();
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
    org.junit.Assert.assertNotNull(rationalNumber6);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    int i7 = rationalNumber5.divisor;
    // The following exception was thrown during execution in test generation
    try {
    long long8 = rationalNumber5.longValue();
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    java.lang.String str9 = rationalNumber8.toDisplayString();
    int i10 = rationalNumber8.divisor;
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-0.32"+ "'", str9.equals("-0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    int i3 = rationalNumber1.numerator;
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toString();
    java.lang.String str13 = rationalNumber6.toString();
    int i14 = rationalNumber6.divisor;
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10/100 (0.1)"+ "'", str12.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10/100 (0.1)"+ "'", str13.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    RationalNumber rationalNumber2 = new RationalNumber(35, (int)(short)1);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.03125d);
    double d2 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.03125d);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.intValue();
    RationalNumber rationalNumber7 = rationalNumber5.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-32));
    java.lang.String str3 = rationalNumber2.toDisplayString();
    java.lang.String str4 = rationalNumber2.toString();
    double d5 = rationalNumber2.doubleValue();
    long long6 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-0.312"+ "'", str3.equals("-0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10/-32 (-0.312)"+ "'", str4.equals("10/-32 (-0.312)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.3125d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)100);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)1L);
    short s2 = rationalNumber1.shortValue();
    int i3 = rationalNumber1.numerator;
    java.lang.String str4 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1"+ "'", str4.equals("1"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (-32));
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.numerator;
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.1"+ "'", str7.equals("0.1"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    int i9 = rationalNumber2.intValue();
    float f10 = rationalNumber2.floatValue();
    float f11 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f11 == 0.32f);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = rationalNumber2.longValue();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10.0f);
    int i2 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)0);
    java.lang.String str3 = rationalNumber2.toString();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Invalid rational (0/0)"+ "'", str3.equals("Invalid rational (0/0)"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)(short)3);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(short)0);
    float f3 = rationalNumber2.floatValue();
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
    org.junit.Assert.assertTrue(f3 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.numerator;
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    java.lang.String str4 = rationalNumber3.toString();
    double d5 = rationalNumber3.doubleValue();
    int i6 = rationalNumber3.divisor;
    double d7 = rationalNumber3.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-32/100 (-0.32)"+ "'", str4.equals("-32/100 (-0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.32d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-0.32d));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    int i2 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.numerator;
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    long long9 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber7.numerator;
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
    org.junit.Assert.assertTrue(i8 == (-10));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, (-32));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    byte byte8 = rationalNumber6.byteValue();
    RationalNumber rationalNumber9 = rationalNumber6.negate();
    long long10 = rationalNumber9.longValue();
    int i11 = rationalNumber9.numerator;
    
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
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-10));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    byte byte2 = rationalNumber1.byteValue();
    double d3 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber1.negate();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    int i6 = rationalNumber5.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte2 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    double d4 = rationalNumber1.doubleValue();
    short s5 = rationalNumber1.shortValue();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    int i7 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    float f7 = rationalNumber4.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == (-0.1f));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toString();
    short s4 = rationalNumber1.shortValue();
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    short s7 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32/100 (0.32)"+ "'", str6.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)'4');
    java.lang.String str3 = rationalNumber2.toString();
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    int i6 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/52 (0.192)"+ "'", str3.equals("10/52 (0.192)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.19230769230769232d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.19230769230769232d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    java.lang.String str9 = rationalNumber2.toString();
    int i10 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32/100 (0.32)"+ "'", str9.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)100, 52);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    RationalNumber rationalNumber2 = new RationalNumber(8, 0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)100);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    java.lang.String str10 = rationalNumber6.toDisplayString();
    double d11 = rationalNumber6.doubleValue();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.1"+ "'", str10.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.1d);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    double d2 = rationalNumber1.doubleValue();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    java.lang.String str10 = rationalNumber6.toDisplayString();
    int i11 = rationalNumber6.intValue();
    float f12 = rationalNumber6.floatValue();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.1"+ "'", str10.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f12 == 0.1f);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


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
    long long15 = rationalNumber2.longValue();
    java.lang.String str16 = rationalNumber2.toString();
    
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
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "32/100 (0.32)"+ "'", str16.equals("32/100 (0.32)"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


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
    java.lang.String str14 = rationalNumber6.toString();
    double d15 = rationalNumber6.doubleValue();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10/100 (0.1)"+ "'", str14.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.1d);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)(byte)100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    java.lang.String str5 = rationalNumber2.toString();
    int i6 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1/100 (-0.01)"+ "'", str5.equals("-1/100 (-0.01)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


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
    long long11 = rationalNumber1.longValue();
    double d12 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber13 = rationalNumber1.negate();
    java.lang.String str14 = rationalNumber1.toDisplayString();
    java.lang.String str15 = rationalNumber1.toString();
    
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
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0"+ "'", str14.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0"+ "'", str15.equals("0"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(byte)1);
    byte byte3 = rationalNumber2.byteValue();
    java.lang.String str4 = rationalNumber2.toString();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10"+ "'", str4.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10"+ "'", str5.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    RationalNumber rationalNumber2 = new RationalNumber(3, 8);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    int i9 = rationalNumber2.intValue();
    double d10 = rationalNumber2.doubleValue();
    int i11 = rationalNumber2.divisor;
    long long12 = rationalNumber2.longValue();
    int i13 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    short s9 = rationalNumber2.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s9 == (short)0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (int)(byte)0);
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Invalid rational (0/0)"+ "'", str3.equals("Invalid rational (0/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Invalid rational (0/0)"+ "'", str4.equals("Invalid rational (0/0)"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    long long12 = rationalNumber6.longValue();
    long long13 = rationalNumber6.longValue();
    double d14 = rationalNumber6.doubleValue();
    byte byte15 = rationalNumber6.byteValue();
    java.lang.String str16 = rationalNumber6.toString();
    java.lang.String str17 = rationalNumber6.toDisplayString();
    java.lang.String str18 = rationalNumber6.toDisplayString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.1d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte15 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10/100 (0.1)"+ "'", str16.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0.1"+ "'", str17.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0.1"+ "'", str18.equals("0.1"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)100, (-1));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(100.0d);
    int i2 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    long long6 = rationalNumber5.longValue();
    
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
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.divisor;
    int i9 = rationalNumber2.intValue();
    long long10 = rationalNumber2.longValue();
    byte byte11 = rationalNumber2.byteValue();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    float f5 = rationalNumber2.floatValue();
    long long6 = rationalNumber2.longValue();
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


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
    byte byte15 = rationalNumber14.byteValue();
    
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
    org.junit.Assert.assertTrue(byte15 == (byte)0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    float f5 = rationalNumber1.floatValue();
    int i6 = rationalNumber1.intValue();
    int i7 = rationalNumber1.divisor;
    long long8 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    byte byte8 = rationalNumber7.byteValue();
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

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, 5);
    int i3 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(10.0d);
    java.lang.String str2 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10"+ "'", str2.equals("10"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    java.lang.String str9 = rationalNumber2.toString();
    RationalNumber rationalNumber10 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32/100 (0.32)"+ "'", str9.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)' ');
    float f2 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 32.0f);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    float f6 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.0f);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
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
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, (-32));
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-32));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    byte byte4 = rationalNumber1.byteValue();
    long long5 = rationalNumber1.longValue();
    byte byte6 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    float f3 = rationalNumber1.floatValue();
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    long long3 = rationalNumber1.longValue();
    float f4 = rationalNumber1.floatValue();
    java.lang.String str5 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1"+ "'", str5.equals("-1"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)'#');
    double d3 = rationalNumber2.doubleValue();
    float f4 = rationalNumber2.floatValue();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-0.02857142857142857d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-0.028571429f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-0.029"+ "'", str5.equals("-0.029"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', (int)(short)10);
    double d3 = rationalNumber2.doubleValue();
    long long4 = rationalNumber2.longValue();
    java.lang.String str5 = rationalNumber2.toDisplayString();
    int i6 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.2d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3.2"+ "'", str5.equals("3.2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)(short)0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    int i3 = rationalNumber1.numerator;
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
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


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
    java.lang.String str12 = rationalNumber6.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10/100 (0.1)"+ "'", str12.equals("10/100 (0.1)"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    java.lang.String str3 = rationalNumber2.toString();
    int i4 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10/100 (0.1)"+ "'", str3.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    RationalNumber rationalNumber2 = new RationalNumber(100, (int)(short)100);
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1L);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    RationalNumber rationalNumber8 = rationalNumber7.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i9 = rationalNumber8.intValue();
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
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


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
    double d13 = rationalNumber2.doubleValue();
    int i14 = rationalNumber2.numerator;
    java.lang.String str15 = rationalNumber2.toString();
    int i16 = rationalNumber2.intValue();
    
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
    org.junit.Assert.assertTrue(d13 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "32/100 (0.32)"+ "'", str15.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber4.floatValue();
    long long6 = rationalNumber4.longValue();
    long long7 = rationalNumber4.longValue();
    short s8 = rationalNumber4.shortValue();
    float f9 = rationalNumber4.floatValue();
    
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
    org.junit.Assert.assertTrue(s8 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == (-0.1f));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    double d3 = rationalNumber1.doubleValue();
    double d4 = rationalNumber1.doubleValue();
    java.lang.String str5 = rationalNumber1.toString();
    java.lang.String str6 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    byte byte4 = rationalNumber1.byteValue();
    float f5 = rationalNumber1.floatValue();
    byte byte6 = rationalNumber1.byteValue();
    java.lang.String str7 = rationalNumber1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte6 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0L);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    int i3 = rationalNumber1.intValue();
    float f4 = rationalNumber1.floatValue();
    long long5 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    short s5 = rationalNumber3.shortValue();
    long long6 = rationalNumber3.longValue();
    java.lang.String str7 = rationalNumber3.toString();
    int i8 = rationalNumber3.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10L);
    float f2 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 10.0f);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    RationalNumber rationalNumber2 = new RationalNumber((-32), (int)' ');

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


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
    RationalNumber rationalNumber12 = rationalNumber1.negate();
    float f13 = rationalNumber1.floatValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.0f);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    RationalNumber rationalNumber2 = new RationalNumber(1, (int)(byte)10);
    java.lang.String str3 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/10 (0.1)"+ "'", str3.equals("1/10 (0.1)"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    float f6 = rationalNumber5.floatValue();
    int i7 = rationalNumber5.divisor;
    java.lang.String str8 = rationalNumber5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == (-0.32f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-32/100 (-0.32)"+ "'", str8.equals("-32/100 (-0.32)"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    int i7 = rationalNumber5.divisor;
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    java.lang.String str9 = rationalNumber5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (-10/0)"+ "'", str9.equals("Invalid rational (-10/0)"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    double d8 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    int i10 = rationalNumber9.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


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
    java.lang.String str12 = rationalNumber2.toDisplayString();
    short s13 = rationalNumber2.shortValue();
    float f14 = rationalNumber2.floatValue();
    RationalNumber rationalNumber15 = rationalNumber2.negate();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.32"+ "'", str12.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s13 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f14 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber15);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber4.floatValue();
    long long6 = rationalNumber4.longValue();
    long long7 = rationalNumber4.longValue();
    int i8 = rationalNumber4.divisor;
    
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
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


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
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    double d2 = rationalNumber1.doubleValue();
    short s3 = rationalNumber1.shortValue();
    int i4 = rationalNumber1.intValue();
    byte byte5 = rationalNumber1.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(Double.NEGATIVE_INFINITY);
    double d2 = rationalNumber1.doubleValue();
    long long3 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == (-2.147483647E9d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-2147483647L));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    float f3 = rationalNumber2.floatValue();
    int i4 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, 0);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    float f7 = rationalNumber6.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = rationalNumber6.intValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    float f5 = rationalNumber2.floatValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (10/0)"+ "'", str8.equals("Invalid rational (10/0)"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    RationalNumber rationalNumber2 = new RationalNumber(5, 2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)(byte)100);
    int i3 = rationalNumber2.intValue();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    long long5 = rationalNumber2.longValue();
    double d6 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.1d);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.divisor;
    long long12 = rationalNumber6.longValue();
    short s13 = rationalNumber6.shortValue();
    byte byte14 = rationalNumber6.byteValue();
    
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
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s13 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte14 == (byte)0);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'4');
    float f2 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 52.0f);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    java.lang.String str8 = rationalNumber4.toString();
    long long9 = rationalNumber4.longValue();
    int i10 = rationalNumber4.divisor;
    java.lang.String str11 = rationalNumber4.toString();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10/100 (-0.1)"+ "'", str8.equals("-10/100 (-0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-10/100 (-0.1)"+ "'", str11.equals("-10/100 (-0.1)"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    double d8 = rationalNumber2.doubleValue();
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.numerator;
    java.lang.String str6 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)0, (int)(short)3);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.numerator;
    java.lang.String str9 = rationalNumber2.toDisplayString();
    int i10 = rationalNumber2.numerator;
    
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
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.32"+ "'", str9.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, 5);
    float f3 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 2.0f);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.divisor;
    double d5 = rationalNumber2.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.1d);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 32);
    long long3 = rationalNumber2.longValue();
    float f4 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 1.0f);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(short)1);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    java.lang.String str7 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10"+ "'", str6.equals("10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10"+ "'", str7.equals("10"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    long long9 = rationalNumber2.longValue();
    
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
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    RationalNumber rationalNumber2 = new RationalNumber(52, (int)(short)10);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    int i9 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32/100 (0.32)"+ "'", str7.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.32"+ "'", str8.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


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
    java.lang.String str13 = rationalNumber1.toString();
    long long14 = rationalNumber1.longValue();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0"+ "'", str13.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)0, (int)(short)100);
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    int i8 = rationalNumber4.intValue();
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'#');
    java.lang.String str2 = rationalNumber1.toDisplayString();
    double d3 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35"+ "'", str2.equals("35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 35.0d);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    java.lang.String str3 = rationalNumber1.toDisplayString();
    double d4 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0"+ "'", str3.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


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
    long long12 = rationalNumber1.longValue();
    java.lang.String str13 = rationalNumber1.toDisplayString();
    
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
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0"+ "'", str13.equals("0"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    RationalNumber rationalNumber7 = rationalNumber4.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-0.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    java.lang.String str10 = rationalNumber6.toDisplayString();
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toDisplayString();
    float f13 = rationalNumber6.floatValue();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.1"+ "'", str10.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.1"+ "'", str12.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.1f);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    RationalNumber rationalNumber5 = rationalNumber1.negate();
    long long6 = rationalNumber5.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    byte byte8 = rationalNumber6.byteValue();
    RationalNumber rationalNumber9 = rationalNumber6.negate();
    int i10 = rationalNumber6.numerator;
    short s11 = rationalNumber6.shortValue();
    
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
    org.junit.Assert.assertTrue(s11 == (short)0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1/100 (-0.01)"+ "'", str4.equals("-1/100 (-0.01)"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    RationalNumber rationalNumber2 = new RationalNumber(52, (-1));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    long long4 = rationalNumber2.longValue();
    float f5 = rationalNumber2.floatValue();
    java.lang.String str6 = rationalNumber2.toString();
    float f7 = rationalNumber2.floatValue();
    int i8 = rationalNumber2.numerator;
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32/100 (0.32)"+ "'", str6.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    float f7 = rationalNumber5.floatValue();
    java.lang.String str8 = rationalNumber5.toString();
    java.lang.String str9 = rationalNumber5.toString();
    float f10 = rationalNumber5.floatValue();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (-10/0)"+ "'", str8.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid rational (-10/0)"+ "'", str9.equals("Invalid rational (-10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == Float.NEGATIVE_INFINITY);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    float f3 = rationalNumber1.floatValue();
    long long4 = rationalNumber1.longValue();
    double d5 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    double d4 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.numerator;
    RationalNumber rationalNumber7 = rationalNumber5.negate();
    short s8 = rationalNumber5.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s8 == (short)0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    long long9 = rationalNumber8.longValue();
    
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
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    RationalNumber rationalNumber2 = new RationalNumber((-10), (-1));
    int i3 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    double d7 = rationalNumber5.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = rationalNumber5.toDisplayString();
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
    org.junit.Assert.assertTrue(d7 == Double.NEGATIVE_INFINITY);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)0);
    double d3 = rationalNumber2.doubleValue();
    // The following exception was thrown during execution in test generation
    try {
    byte byte4 = rationalNumber2.byteValue();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    short s7 = rationalNumber2.shortValue();
    long long8 = rationalNumber2.longValue();
    int i9 = rationalNumber2.intValue();
    double d10 = rationalNumber2.doubleValue();
    int i11 = rationalNumber2.divisor;
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
    org.junit.Assert.assertTrue(s7 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.32d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    int i7 = rationalNumber4.divisor;
    double d8 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber9 = rationalNumber4.negate();
    float f10 = rationalNumber4.floatValue();
    
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
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == (-0.1f));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    double d4 = rationalNumber3.doubleValue();
    java.lang.String str5 = rationalNumber3.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber5.doubleValue();
    RationalNumber rationalNumber7 = rationalNumber5.negate();
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
    org.junit.Assert.assertTrue(d6 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.divisor;
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    int i7 = rationalNumber2.divisor;
    int i8 = rationalNumber2.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    short s3 = rationalNumber1.shortValue();
    int i4 = rationalNumber1.divisor;
    int i5 = rationalNumber1.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1"+ "'", str2.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)-1);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    float f3 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-1.0f));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.numerator;
    long long5 = rationalNumber3.longValue();
    double d6 = rationalNumber3.doubleValue();
    
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
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(byte)1);
    int i3 = rationalNumber2.divisor;
    float f4 = rationalNumber2.floatValue();
    short s5 = rationalNumber2.shortValue();
    RationalNumber rationalNumber6 = rationalNumber2.negate();
    byte byte7 = rationalNumber6.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte7 == (byte)-10);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-32));
    java.lang.String str3 = rationalNumber2.toDisplayString();
    java.lang.String str4 = rationalNumber2.toString();
    int i5 = rationalNumber2.numerator;
    java.lang.String str6 = rationalNumber2.toString();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-0.312"+ "'", str3.equals("-0.312"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10/-32 (-0.312)"+ "'", str4.equals("10/-32 (-0.312)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10/-32 (-0.312)"+ "'", str6.equals("10/-32 (-0.312)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(0.0d);
    int i2 = rationalNumber1.intValue();
    double d3 = rationalNumber1.doubleValue();
    int i4 = rationalNumber1.intValue();
    int i5 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)10.0f);
    long long2 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 10L);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)-1);
    int i2 = rationalNumber1.divisor;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)0.0f);
    long long2 = rationalNumber1.longValue();
    float f3 = rationalNumber1.floatValue();
    int i4 = rationalNumber1.numerator;
    double d5 = rationalNumber1.doubleValue();
    long long6 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    int i3 = rationalNumber2.numerator;
    java.lang.String str4 = rationalNumber2.toString();
    byte byte5 = rationalNumber2.byteValue();
    int i6 = rationalNumber2.divisor;
    long long7 = rationalNumber2.longValue();
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'#', 0);
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.divisor;
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(-1L));
    java.lang.String str2 = rationalNumber1.toDisplayString();
    int i3 = rationalNumber1.intValue();
    int i4 = rationalNumber1.numerator;
    long long5 = rationalNumber1.longValue();
    byte byte6 = rationalNumber1.byteValue();
    
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
    org.junit.Assert.assertTrue(byte6 == (byte)-1);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    long long12 = rationalNumber6.longValue();
    long long13 = rationalNumber6.longValue();
    java.lang.String str14 = rationalNumber6.toString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10/100 (0.1)"+ "'", str14.equals("10/100 (0.1)"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    double d6 = rationalNumber2.doubleValue();
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toString();
    float f9 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid rational (10/0)"+ "'", str8.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.numerator;
    double d6 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    float f3 = rationalNumber2.floatValue();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = rationalNumber2.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == Float.POSITIVE_INFINITY);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)32);
    RationalNumber rationalNumber2 = rationalNumber1.negate();
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    int i4 = rationalNumber3.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    int i4 = rationalNumber3.divisor;
    int i5 = rationalNumber3.intValue();
    
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
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


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
    int i10 = rationalNumber9.intValue();
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
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    RationalNumber rationalNumber2 = new RationalNumber((-1), (int)'a');
    float f3 = rationalNumber2.floatValue();
    short s4 = rationalNumber2.shortValue();
    int i5 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f3 == (-0.010309278f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    int i3 = rationalNumber2.divisor;
    double d4 = rationalNumber2.doubleValue();
    double d5 = rationalNumber2.doubleValue();
    float f6 = rationalNumber2.floatValue();
    java.lang.String str7 = rationalNumber2.toString();
    double d8 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = rationalNumber9.toDisplayString();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid rational (10/0)"+ "'", str7.equals("Invalid rational (10/0)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(short)0);
    double d2 = rationalNumber1.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    double d9 = rationalNumber8.doubleValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == Double.POSITIVE_INFINITY);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf(1.0d);
    int i2 = rationalNumber1.intValue();
    int i3 = rationalNumber1.divisor;
    long long4 = rationalNumber1.longValue();
    int i5 = rationalNumber1.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    RationalNumber rationalNumber2 = new RationalNumber(10, (int)(short)0);
    double d3 = rationalNumber2.doubleValue();
    int i4 = rationalNumber2.divisor;
    int i5 = rationalNumber2.numerator;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = rationalNumber2.toDisplayString();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    long long5 = rationalNumber2.longValue();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.1"+ "'", str4.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.1"+ "'", str6.equals("0.1"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    RationalNumber rationalNumber2 = new RationalNumber((-10), 32);
    byte byte3 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte3 == (byte)0);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (-10));
    java.lang.String str3 = rationalNumber2.toString();
    java.lang.String str4 = rationalNumber2.toDisplayString();
    byte byte5 = rationalNumber2.byteValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1"+ "'", str3.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1"+ "'", str4.equals("-1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte5 == (byte)-1);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    int i8 = rationalNumber2.numerator;
    java.lang.String str9 = rationalNumber2.toString();
    float f10 = rationalNumber2.floatValue();
    java.lang.String str11 = rationalNumber2.toDisplayString();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.32"+ "'", str11.equals("0.32"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    byte byte4 = rationalNumber2.byteValue();
    long long5 = rationalNumber2.longValue();
    int i6 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toString();
    java.lang.String str13 = rationalNumber6.toString();
    java.lang.String str14 = rationalNumber6.toString();
    int i15 = rationalNumber6.intValue();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10/100 (0.1)"+ "'", str12.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10/100 (0.1)"+ "'", str13.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10/100 (0.1)"+ "'", str14.equals("10/100 (0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toString();
    short s6 = rationalNumber4.shortValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10/100 (-0.1)"+ "'", str5.equals("-10/100 (-0.1)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    float f4 = rationalNumber1.floatValue();
    long long5 = rationalNumber1.longValue();
    long long6 = rationalNumber1.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)100);
    int i3 = rationalNumber2.numerator;
    int i4 = rationalNumber2.numerator;
    java.lang.String str5 = rationalNumber2.toDisplayString();
    float f6 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.01"+ "'", str5.equals("0.01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f6 == 0.01f);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    byte byte3 = rationalNumber1.byteValue();
    java.lang.String str4 = rationalNumber1.toDisplayString();
    int i5 = rationalNumber1.divisor;
    java.lang.String str6 = rationalNumber1.toString();
    short s7 = rationalNumber1.shortValue();
    double d8 = rationalNumber1.doubleValue();
    long long9 = rationalNumber1.longValue();
    int i10 = rationalNumber1.intValue();
    byte byte11 = rationalNumber1.byteValue();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte11 == (byte)0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)'a', (int)(byte)100);
    int i3 = rationalNumber2.divisor;
    long long4 = rationalNumber2.longValue();
    int i5 = rationalNumber2.intValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    byte byte4 = rationalNumber1.byteValue();
    long long5 = rationalNumber1.longValue();
    short s6 = rationalNumber1.shortValue();
    RationalNumber rationalNumber7 = rationalNumber1.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(byte4 == (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s6 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    int i11 = rationalNumber6.intValue();
    java.lang.String str12 = rationalNumber6.toDisplayString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.1"+ "'", str12.equals("0.1"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    int i2 = rationalNumber1.divisor;
    RationalNumber rationalNumber3 = rationalNumber1.negate();
    float f4 = rationalNumber1.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 0.0f);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)10, (int)(byte)0);
    double d3 = rationalNumber2.doubleValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber5.divisor;
    float f7 = rationalNumber5.floatValue();
    RationalNumber rationalNumber8 = rationalNumber5.negate();
    RationalNumber rationalNumber9 = rationalNumber8.negate();
    RationalNumber rationalNumber10 = rationalNumber8.negate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == Float.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber10);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    RationalNumber rationalNumber2 = new RationalNumber(0, 32);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toDisplayString();
    short s8 = rationalNumber2.shortValue();
    float f9 = rationalNumber2.floatValue();
    int i10 = rationalNumber2.intValue();
    double d11 = rationalNumber2.doubleValue();
    
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
    org.junit.Assert.assertTrue(s8 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f9 == 0.32f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.32d);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)(byte)0);
    float f2 = rationalNumber1.floatValue();
    double d3 = rationalNumber1.doubleValue();
    java.lang.String str4 = rationalNumber1.toString();
    java.lang.String str5 = rationalNumber1.toString();
    java.lang.String str6 = rationalNumber1.toDisplayString();
    java.lang.String str7 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0"+ "'", str4.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0"+ "'", str5.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0"+ "'", str6.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    RationalNumber rationalNumber1 = RationalNumber.valueOf((double)'a');
    java.lang.String str2 = rationalNumber1.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97"+ "'", str2.equals("97"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    java.lang.String str5 = rationalNumber4.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-0.1"+ "'", str5.equals("-0.1"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, (int)(byte)100);
    long long3 = rationalNumber2.longValue();
    RationalNumber rationalNumber4 = rationalNumber2.negate();
    double d5 = rationalNumber4.doubleValue();
    RationalNumber rationalNumber6 = rationalNumber4.negate();
    java.lang.String str7 = rationalNumber6.toString();
    int i8 = rationalNumber6.numerator;
    java.lang.String str9 = rationalNumber6.toString();
    int i10 = rationalNumber6.numerator;
    java.lang.String str11 = rationalNumber6.toDisplayString();
    short s12 = rationalNumber6.shortValue();
    float f13 = rationalNumber6.floatValue();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.1"+ "'", str11.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s12 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f13 == 0.1f);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    java.lang.String str7 = rationalNumber2.toString();
    java.lang.String str8 = rationalNumber2.toDisplayString();
    java.lang.String str9 = rationalNumber2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32/100 (0.32)"+ "'", str7.equals("32/100 (0.32)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.32"+ "'", str8.equals("0.32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32/100 (0.32)"+ "'", str9.equals("32/100 (0.32)"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(short)1, (int)(byte)-1);
    long long3 = rationalNumber2.longValue();
    float f4 = rationalNumber2.floatValue();
    float f5 = rationalNumber2.floatValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == (-1.0f));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)-10, (int)(byte)-1);
    long long3 = rationalNumber2.longValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 10L);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)' ', 100);
    RationalNumber rationalNumber3 = rationalNumber2.negate();
    short s4 = rationalNumber2.shortValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    int i6 = rationalNumber2.divisor;
    int i7 = rationalNumber2.numerator;
    RationalNumber rationalNumber8 = rationalNumber2.negate();
    RationalNumber rationalNumber9 = rationalNumber2.negate();
    java.lang.String str10 = rationalNumber2.toDisplayString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.32"+ "'", str10.equals("0.32"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    RationalNumber rationalNumber2 = new RationalNumber((int)(byte)10, 100);
    int i3 = rationalNumber2.intValue();
    int i4 = rationalNumber2.intValue();
    RationalNumber rationalNumber5 = rationalNumber2.negate();
    java.lang.String str6 = rationalNumber2.toDisplayString();
    RationalNumber rationalNumber7 = rationalNumber2.negate();
    int i8 = rationalNumber2.numerator;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.1"+ "'", str6.equals("0.1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rationalNumber7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

}
