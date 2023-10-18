package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide((double)1000, (double)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    double d11 = calcolatrice0.divide(100.0d, (double)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1000.0d);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = calcolatrice0.factorial((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    int i4 = calcolatrice0.factorial((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)'a', 1000);
    int i11 = calcolatrice0.multiply((int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    int i4 = calcolatrice0.factorial((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i11 = calcolatrice0.multiply((int)(short)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide((double)1000, (double)(short)1);
    int i11 = calcolatrice0.subtract(0, 101);
    double d14 = calcolatrice0.divide((-0.10548523206751055d), (double)(-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1000.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0010444082382921837d);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.subtract((int)(short)10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-42));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)100, 25);
    int i8 = calcolatrice0.subtract(0, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-90));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    // The following exception was thrown during execution in test generation
    try {
    int i13 = calcolatrice0.factorial((-4320));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i7 = calcolatrice0.factorial(2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    // The following exception was thrown during execution in test generation
    try {
    int i7 = calcolatrice0.factorial((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    // The following exception was thrown during execution in test generation
    try {
    double d14 = calcolatrice0.divide((double)86, (double)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.add((-101), 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 31432899);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide((double)' ', 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 32.0d);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)913, (double)913);
    int i7 = calcolatrice0.factorial(0);
    // The following exception was thrown during execution in test generation
    try {
    double d10 = calcolatrice0.divide((double)0, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.multiply(0, 948);
    int i15 = calcolatrice0.factorial(31433);
    int i18 = calcolatrice0.multiply(1, 1000);
    // The following exception was thrown during execution in test generation
    try {
    double d21 = calcolatrice0.divide(3.181369897878026E-4d, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1000);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.add((int)(byte)1, 0);
    int i19 = calcolatrice0.add((int)(byte)1, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 91);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.add((int)(byte)1, 0);
    int i19 = calcolatrice0.multiply(0, 1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i16 = calcolatrice0.factorial(1);
    double d19 = calcolatrice0.divide((double)100L, (double)(-10));
    double d22 = calcolatrice0.divide((double)250, (double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 250.0d);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(1, 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2500);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i17 = calcolatrice0.add((-100), 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2400);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    // The following exception was thrown during execution in test generation
    try {
    int i7 = calcolatrice0.factorial((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(101);
    double d13 = calcolatrice0.divide((double)(byte)10, (double)(-1L));
    int i16 = calcolatrice0.multiply((-10), (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-970));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    double d8 = calcolatrice0.divide(0.0d, (double)(-90));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i12 = calcolatrice0.factorial(3628800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)'a', 1000);
    // The following exception was thrown during execution in test generation
    try {
    int i10 = calcolatrice0.factorial((-51));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1097);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(3143300, (int)(short)10);
    int i17 = calcolatrice0.add((-110), (-100));
    double d20 = calcolatrice0.divide((double)(short)100, (double)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 2.857142857142857d);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i20 = calcolatrice0.add(90, (int)(short)1);
    int i23 = calcolatrice0.subtract((int)(short)10, 2400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-2390));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i15 = calcolatrice0.factorial((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    int i17 = calcolatrice0.factorial((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i15 = calcolatrice0.factorial((int)(short)1);
    int i18 = calcolatrice0.subtract(1000, (int)(byte)0);
    int i21 = calcolatrice0.add((int)(short)0, 2400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2400);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.add(90, (-90));
    // The following exception was thrown during execution in test generation
    try {
    double d20 = calcolatrice0.divide((double)30336, (double)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i15 = calcolatrice0.factorial((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i20 = calcolatrice0.add(90, (int)(short)1);
    double d23 = calcolatrice0.divide((double)(-4320), (double)101);
    int i26 = calcolatrice0.add((int)(short)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == (-42.772277227722775d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = calcolatrice0.factorial((-101));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i7 = calcolatrice0.factorial((int)(byte)100);
    int i10 = calcolatrice0.add(31463336, (-90));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 31463246);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(3143300, (int)(short)10);
    int i17 = calcolatrice0.multiply(25, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = calcolatrice0.factorial((-42));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-25));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.add((int)(byte)1, 0);
    int i18 = calcolatrice0.factorial(2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.add((int)'4', 34);
    int i17 = calcolatrice0.multiply((-4320), (int)(short)-1);
    double d20 = calcolatrice0.divide(4.0d, (double)1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.004d);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(3143300, (int)(short)10);
    int i17 = calcolatrice0.multiply(25, (int)(short)-1);
    int i20 = calcolatrice0.add(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-25));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i11 = calcolatrice0.multiply((int)(short)1, (-1000));
    int i14 = calcolatrice0.subtract(2076180480, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2076180470);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    // The following exception was thrown during execution in test generation
    try {
    double d22 = calcolatrice0.divide((double)35, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.add((int)(byte)100, (int)(short)1);
    int i16 = calcolatrice0.subtract(100, (-970));
    int i19 = calcolatrice0.multiply((-42), 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1070);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1320186));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i20 = calcolatrice0.add((int)(short)100, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 190);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i16 = calcolatrice0.add((int)(short)0, (int)(short)0);
    int i19 = calcolatrice0.add(0, 86);
    // The following exception was thrown during execution in test generation
    try {
    int i21 = calcolatrice0.factorial((-4320));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 86);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i7 = calcolatrice0.factorial((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i16 = calcolatrice0.factorial(1);
    double d19 = calcolatrice0.divide((double)100L, (double)(-10));
    int i22 = calcolatrice0.subtract(0, 25);
    double d25 = calcolatrice0.divide((double)(short)1, (double)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-25));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == (-1.0d));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i20 = calcolatrice0.subtract(1070, 913);
    double d23 = calcolatrice0.divide((double)2500, (double)948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 2.6371308016877637d);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.subtract(86, (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 186);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(948, 35);
    int i17 = calcolatrice0.multiply(35, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    int i5 = calcolatrice0.add(30336, (-20900));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 9436);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = calcolatrice0.factorial((-51));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.multiply(0, 948);
    int i15 = calcolatrice0.factorial(31433);
    int i18 = calcolatrice0.multiply((-1320186), 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-44886324));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide((double)1000, (double)(short)1);
    int i11 = calcolatrice0.subtract(0, 101);
    int i14 = calcolatrice0.subtract((int)(byte)1, 0);
    int i17 = calcolatrice0.subtract((-20997), (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1000.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-20897));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(31432899, (-4320));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1648829792);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.add(1, (int)(short)10);
    int i10 = calcolatrice0.factorial((int)(byte)1);
    double d13 = calcolatrice0.divide((double)(-2390), (double)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-239.0d));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i16 = calcolatrice0.factorial(1);
    double d19 = calcolatrice0.divide((double)100L, (double)(-10));
    int i22 = calcolatrice0.subtract(0, 25);
    int i25 = calcolatrice0.add(1070, 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-25));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2018);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    int i5 = calcolatrice0.add((int)(byte)1, 100);
    int i8 = calcolatrice0.multiply((-10), 31463336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-314633360));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.multiply((int)(short)10, 25);
    int i13 = calcolatrice0.factorial(31433000);
    // The following exception was thrown during execution in test generation
    try {
    int i15 = calcolatrice0.factorial((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.add(90, (-90));
    int i19 = calcolatrice0.factorial(31463246);
    int i22 = calcolatrice0.add((int)(byte)100, 157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 257);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(958, 948);
    int i17 = calcolatrice0.add(1000, 0);
    int i19 = calcolatrice0.factorial((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    double d16 = calcolatrice0.divide((double)100L, (double)25);
    int i18 = calcolatrice0.factorial((int)(byte)10);
    int i21 = calcolatrice0.add(0, (int)(byte)-1);
    double d24 = calcolatrice0.divide((double)(-51), (double)(byte)10);
    int i27 = calcolatrice0.multiply((int)(short)1, 31463336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3628800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == (-5.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 31463336);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)100, 25);
    int i7 = calcolatrice0.factorial(0);
    int i10 = calcolatrice0.multiply(86, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 8600);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i10 = calcolatrice0.factorial((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i14 = calcolatrice0.multiply(100, 31433);
    int i17 = calcolatrice0.subtract(2076180480, 31463246);
    int i19 = calcolatrice0.factorial(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3143300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2044717234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2076180480);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.add(1, (int)(short)10);
    int i11 = calcolatrice0.multiply((int)' ', (-135));
    int i13 = calcolatrice0.factorial((int)(short)100);
    int i16 = calcolatrice0.subtract((-20900), (int)'a');
    // The following exception was thrown during execution in test generation
    try {
    int i18 = calcolatrice0.factorial((-90));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-4320));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-20997));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    double d13 = calcolatrice0.divide(4.0d, (double)(-20900));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.9138755980861245E-4d));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.multiply((int)(short)10, 25);
    int i13 = calcolatrice0.factorial(31433000);
    int i16 = calcolatrice0.multiply((int)(byte)-1, 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-31433));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.add(31433000, 30336);
    double d11 = calcolatrice0.divide((double)(-20900), (double)1648829792);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 31463336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.2675656457328253E-5d));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.add((int)'4', 34);
    int i17 = calcolatrice0.subtract(0, 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-86));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    double d8 = calcolatrice0.divide((-0.12306289881494986d), (double)(-135));
    int i11 = calcolatrice0.subtract((-210), 34);
    double d14 = calcolatrice0.divide((double)1000, (double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 9.115770282588879E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-244));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    int i21 = calcolatrice0.factorial((int)'4');
    int i24 = calcolatrice0.subtract(1, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i16 = calcolatrice0.add((int)(short)0, (int)(short)0);
    int i19 = calcolatrice0.add(0, 86);
    // The following exception was thrown during execution in test generation
    try {
    int i21 = calcolatrice0.factorial((-31433));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 86);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)'#', (-1));
    int i6 = calcolatrice0.subtract((int)(short)100, (int)(byte)10);
    double d9 = calcolatrice0.divide((-239.0d), (double)(-31432865));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 7.603506711844434E-6d);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    int i8 = calcolatrice0.multiply((-1), (int)(byte)-1);
    int i10 = calcolatrice0.factorial(86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)'a', 1000);
    double d11 = calcolatrice0.divide((double)(-10), (double)10.0f);
    // The following exception was thrown during execution in test generation
    try {
    int i13 = calcolatrice0.factorial((-42));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i16 = calcolatrice0.add((int)(short)0, (int)(short)0);
    int i19 = calcolatrice0.add(0, 86);
    int i22 = calcolatrice0.subtract(4320, (-10));
    int i24 = calcolatrice0.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 4330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)'#', (-1));
    double d6 = calcolatrice0.divide((double)(-10), (double)'4');
    int i8 = calcolatrice0.factorial(34);
    int i11 = calcolatrice0.subtract(9436, 9436);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.19230769230769232d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i16 = calcolatrice0.factorial(1);
    double d19 = calcolatrice0.divide((double)100L, (double)(-10));
    int i22 = calcolatrice0.multiply((int)'#', (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-35));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    int i8 = calcolatrice0.multiply((-1), (int)(byte)-1);
    int i10 = calcolatrice0.factorial(0);
    int i13 = calcolatrice0.subtract((int)(short)0, 186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-186));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)913, (double)913);
    int i7 = calcolatrice0.factorial(0);
    double d10 = calcolatrice0.divide((double)186, (double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 5.8125d);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i14 = calcolatrice0.multiply(100, 31433);
    int i17 = calcolatrice0.subtract(2076180480, 31463246);
    int i20 = calcolatrice0.multiply(190, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3143300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2044717234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 190000);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i16 = calcolatrice0.add((int)(short)0, (int)(short)0);
    int i19 = calcolatrice0.subtract((-135), 8600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-8735));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i16 = calcolatrice0.add((int)(short)0, (int)(short)0);
    int i19 = calcolatrice0.subtract((-135), (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-135));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.multiply(0, 948);
    int i15 = calcolatrice0.factorial(31433);
    int i18 = calcolatrice0.multiply(1, 1000);
    int i21 = calcolatrice0.add((int)' ', 35);
    // The following exception was thrown during execution in test generation
    try {
    int i23 = calcolatrice0.factorial((-210));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 67);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide(9.115770282588879E-4d, (double)(short)10);
    int i14 = calcolatrice0.multiply((-42), 913);
    double d17 = calcolatrice0.divide(0.0d, (double)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 9.115770282588879E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-38346));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.add((-20897), (-31432865));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-31453762));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i11 = calcolatrice0.multiply(10, (-100));
    int i14 = calcolatrice0.multiply(157, 35);
    int i17 = calcolatrice0.multiply(3628811, 1070);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5495);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-412139526));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    int i11 = calcolatrice0.add((int)'#', (int)(byte)-1);
    int i14 = calcolatrice0.multiply(1, (int)(short)1);
    int i16 = calcolatrice0.factorial(1);
    double d19 = calcolatrice0.divide((double)100L, (double)(-10));
    int i22 = calcolatrice0.subtract(0, 25);
    // The following exception was thrown during execution in test generation
    try {
    int i24 = calcolatrice0.factorial((-250));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-25));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    int i5 = calcolatrice0.add((int)(byte)1, 100);
    int i8 = calcolatrice0.multiply((-110), 190);
    int i11 = calcolatrice0.multiply(250, 1);
    int i14 = calcolatrice0.subtract((-90), (-35));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-20900));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-55));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.multiply((int)(short)0, 0);
    int i17 = calcolatrice0.multiply(1, 4320);
    int i20 = calcolatrice0.subtract(0, 250);
    int i23 = calcolatrice0.multiply(1648829792, 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-250));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2143046496);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(3143300, (int)(short)10);
    int i17 = calcolatrice0.multiply((-244), (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-23668));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.add((int)'4', 34);
    int i17 = calcolatrice0.multiply((-4320), (int)(short)-1);
    int i20 = calcolatrice0.subtract((-210), 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-221));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)'#', (-1));
    double d6 = calcolatrice0.divide((double)(-10), (double)'4');
    int i8 = calcolatrice0.factorial(34);
    double d11 = calcolatrice0.divide((double)(-31433), (double)1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.19230769230769232d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-28.653600729261623d));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.add((int)(byte)100, (int)(short)1);
    double d16 = calcolatrice0.divide(0.0d, (double)(-35));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-0.0d));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    int i21 = calcolatrice0.factorial((int)'4');
    int i24 = calcolatrice0.subtract(250, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 250);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.add(3628800, 11);
    int i17 = calcolatrice0.add((-186), (-110));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3628811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-296));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.add((int)'4', 34);
    int i16 = calcolatrice0.factorial(67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)'#', (-1));
    int i6 = calcolatrice0.subtract(34, 31432899);
    int i9 = calcolatrice0.add((-25), 9436);
    int i12 = calcolatrice0.multiply(35, 2018);
    int i14 = calcolatrice0.factorial(2400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-31432865));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 9411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 70630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.add(90, (-90));
    int i19 = calcolatrice0.factorial(31463246);
    double d22 = calcolatrice0.divide((double)2076180470, (double)1.0f);
    int i25 = calcolatrice0.multiply((-244), 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 2.07618047E9d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-231312));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.add(948, 10);
    int i14 = calcolatrice0.add(70630, 86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 70716);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)100, 25);
    int i7 = calcolatrice0.factorial(0);
    double d10 = calcolatrice0.divide((double)190, (double)31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.00604460280596825d);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.add(1, (int)(short)10);
    int i11 = calcolatrice0.multiply((int)' ', (-135));
    int i13 = calcolatrice0.factorial((int)(short)100);
    int i16 = calcolatrice0.subtract((-20900), (int)'a');
    int i19 = calcolatrice0.multiply(9436, (-38346));
    int i22 = calcolatrice0.add((-23668), (-31432865));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-4320));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-20997));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-361832856));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-31456533));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial(4330);
    double d13 = calcolatrice0.divide((double)(-44886324), (double)190000);
    int i16 = calcolatrice0.multiply(34, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-236.2438105263158d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 34);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    int i4 = calcolatrice0.factorial((int)'#');
    int i7 = calcolatrice0.subtract((int)(byte)100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 90);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add(25, (-135));
    int i6 = calcolatrice0.multiply((-186), (-20897));
    int i8 = calcolatrice0.factorial((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-110));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3886842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.add((int)(byte)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    int i18 = calcolatrice0.factorial((-44886324));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.multiply(2500, 958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2395000);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)'#', (-1));
    double d6 = calcolatrice0.divide((double)(-10), (double)'4');
    double d9 = calcolatrice0.divide((double)250, 1.0d);
    int i12 = calcolatrice0.subtract((int)'a', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-0.19230769230769232d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 250.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 96);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.subtract((int)'#', 0);
    int i14 = calcolatrice0.multiply(3143300, (int)(short)10);
    int i17 = calcolatrice0.multiply(25, (int)(short)-1);
    int i20 = calcolatrice0.multiply((-35), (-31453762));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-25));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1100881670);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)'a', 1000);
    double d11 = calcolatrice0.divide((double)31433000, (double)(-51));
    int i14 = calcolatrice0.subtract(1000, 958);
    int i17 = calcolatrice0.multiply(0, (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-616333.3333333334d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply(0, (-38346));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.add(1, (int)(short)10);
    int i10 = calcolatrice0.factorial((int)(byte)1);
    int i13 = calcolatrice0.subtract((int)(short)-1, (int)(byte)10);
    int i16 = calcolatrice0.add(70716, 3143300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3214016);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i13 = calcolatrice0.factorial(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3628800);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    double d16 = calcolatrice0.divide((-0.10548523206751055d), (double)100);
    int i19 = calcolatrice0.subtract(2395000, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-0.0010548523206751056d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2394000);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    int i21 = calcolatrice0.factorial((int)'4');
    int i24 = calcolatrice0.subtract((int)(short)100, (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 200);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide(9.115770282588879E-4d, (double)(short)10);
    int i14 = calcolatrice0.multiply((-42), 913);
    int i17 = calcolatrice0.subtract((-135), 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 9.115770282588879E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-38346));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1048));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i11 = calcolatrice0.multiply((int)(short)1, (-1000));
    int i14 = calcolatrice0.multiply((int)(short)1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    double d16 = calcolatrice0.divide((double)100L, (double)25);
    int i18 = calcolatrice0.factorial((int)(byte)10);
    int i21 = calcolatrice0.add(0, (int)(byte)-1);
    double d24 = calcolatrice0.divide((double)(-51), (double)(byte)10);
    int i27 = calcolatrice0.add(2076180480, 0);
    // The following exception was thrown during execution in test generation
    try {
    int i29 = calcolatrice0.factorial((-4320));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3628800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == (-5.1d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2076180480);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    double d8 = calcolatrice0.divide((double)3143300, (double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 31433.0d);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    int i21 = calcolatrice0.factorial((int)'4');
    int i23 = calcolatrice0.factorial(86);
    int i25 = calcolatrice0.factorial(67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i14 = calcolatrice0.add(31463336, (-23668));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 31439668);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.add(90, (-90));
    int i19 = calcolatrice0.factorial(31463246);
    int i22 = calcolatrice0.add(157, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 156);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)100, 25);
    int i8 = calcolatrice0.multiply(70716, (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-777876));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    int i15 = calcolatrice0.factorial((int)(short)1);
    int i18 = calcolatrice0.subtract(1000, (int)(byte)0);
    double d21 = calcolatrice0.divide((double)(short)0, 3.181369897878026E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    int i5 = calcolatrice0.subtract((int)(byte)-1, (int)(short)100);
    int i8 = calcolatrice0.multiply((int)(short)1, 2076180480);
    int i10 = calcolatrice0.factorial(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    double d17 = calcolatrice0.divide(0.0d, (double)250);
    int i19 = calcolatrice0.factorial(0);
    int i21 = calcolatrice0.factorial(101);
    int i23 = calcolatrice0.factorial(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)(byte)1, (-51));
    int i11 = calcolatrice0.subtract((-20997), 3886842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-50));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-3907839));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(10, 11);
    int i17 = calcolatrice0.add(90, (-90));
    int i19 = calcolatrice0.factorial(31463246);
    // The following exception was thrown during execution in test generation
    try {
    int i21 = calcolatrice0.factorial((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.add(30336, 1097);
    int i8 = calcolatrice0.subtract((-25), 67);
    double d11 = calcolatrice0.divide((double)3886842, (double)(-31433));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 31433);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-92));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-123.65482136608023d));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(948, 35);
    int i17 = calcolatrice0.multiply((-110), (-42));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 913);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 4620);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i7 = calcolatrice0.factorial(91);
    int i10 = calcolatrice0.multiply(70630, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    double d8 = calcolatrice0.divide(0.0d, (double)100.0f);
    int i11 = calcolatrice0.multiply(10, (-100));
    int i14 = calcolatrice0.multiply(157, 35);
    int i17 = calcolatrice0.subtract(3143300, 31432899);
    int i20 = calcolatrice0.add(91, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5495);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-28289599));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 91);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    double d11 = calcolatrice0.divide((double)(-100), (double)948);
    int i13 = calcolatrice0.factorial(100);
    int i16 = calcolatrice0.add((int)(byte)1, 0);
    int i19 = calcolatrice0.subtract((int)(short)1, (int)'4');
    int i22 = calcolatrice0.subtract(30336, (-231312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.10548523206751055d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-51));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 261648);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract(1000, (int)'4');
    int i11 = calcolatrice0.subtract((int)'a', (-92));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 189);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.subtract((-100), (int)'#');
    double d11 = calcolatrice0.divide((double)(-135), (double)1097);
    int i14 = calcolatrice0.subtract(958, 948);
    double d17 = calcolatrice0.divide((double)(-1000), (double)31433000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-135));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-0.12306289881494986d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-3.181369897878026E-5d));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i10 = calcolatrice0.factorial(25);
    int i13 = calcolatrice0.add((int)(byte)100, (int)(short)1);
    int i16 = calcolatrice0.multiply((-186), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1860);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(short)10, 100);
    int i8 = calcolatrice0.subtract((int)'#', 10);
    int i11 = calcolatrice0.add(948, 10);
    int i14 = calcolatrice0.multiply((-4320), (-1320186));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 958);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1408236224);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(100);
    int i5 = calcolatrice0.multiply((int)(byte)100, (int)(byte)-1);
    int i8 = calcolatrice0.multiply(948, (int)' ');
    int i10 = calcolatrice0.factorial((int)(short)1);
    int i13 = calcolatrice0.multiply((int)(byte)10, (int)(short)-1);
    double d16 = calcolatrice0.divide((double)(short)10, (double)31433);
    // The following exception was thrown during execution in test generation
    try {
    int i18 = calcolatrice0.factorial((-210));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 30336);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 3.181369897878026E-4d);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial((int)(byte)1);
    double d5 = calcolatrice0.divide((double)10.0f, (-1.0d));
    int i8 = calcolatrice0.add((int)'a', 1000);
    double d11 = calcolatrice0.divide((double)31433000, (double)(-51));
    int i14 = calcolatrice0.subtract(1000, 958);
    int i16 = calcolatrice0.factorial(2076180480);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-616333.3333333334d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

}
