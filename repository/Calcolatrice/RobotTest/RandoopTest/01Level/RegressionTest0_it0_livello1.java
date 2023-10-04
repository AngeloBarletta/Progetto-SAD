
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.add(0, (int)'a');
    int i9 = calcolatrice0.subtract((int)(byte)0, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-10));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    // The following exception was thrown during execution in test generation
    try {
    double d6 = calcolatrice0.divide((double)(byte)1, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.add(0, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
    int i8 = calcolatrice0.factorial((-1260));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.add(97, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 197);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    int i6 = calcolatrice0.subtract((-126000000), (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-125999964));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i12 = calcolatrice0.add(10001, (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8741);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.add(10297, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10307);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i17 = calcolatrice0.factorial((int)(short)100);
    int i20 = calcolatrice0.multiply((-36), 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-3600));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.subtract((-36), (int)(short)0);
    int i13 = calcolatrice0.factorial((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.add(297, 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 350);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.subtract((-36), (int)(short)0);
    int i13 = calcolatrice0.factorial((int)(byte)1);
    int i16 = calcolatrice0.multiply(5200, 10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 53544400);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)(short)100, 97);
    int i6 = calcolatrice0.subtract(284905488, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 284905478);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i10 = calcolatrice0.factorial(10000);
    // The following exception was thrown during execution in test generation
    try {
    double d13 = calcolatrice0.divide((double)0, 0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply(53544400, 53544400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 432130304);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.multiply((-125999964), 100);
    int i17 = calcolatrice0.add(1970001, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 284905488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970000);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial(1);
    double d13 = calcolatrice0.divide((double)(-1225), (double)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-12.25d));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i12 = calcolatrice0.multiply((int)'#', (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-350));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.add((int)' ', 53);
    int i12 = calcolatrice0.multiply((-12600), 10000);
    // The following exception was thrown during execution in test generation
    try {
    int i14 = calcolatrice0.factorial((-15));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-126000000));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.add(197, (int)(short)100);
    int i13 = calcolatrice0.factorial(197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.add((int)'4', 10307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10359);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3628800);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.multiply(1, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    int i13 = calcolatrice0.factorial((-251999728));
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.multiply(0, (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.add(0, (int)'a');
    int i9 = calcolatrice0.subtract((-97), (int)'4');
    int i11 = calcolatrice0.factorial(197);
    // The following exception was thrown during execution in test generation
    try {
    double d14 = calcolatrice0.divide((double)(-36), (double)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-149));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    double d6 = calcolatrice0.divide((double)100L, (double)(-1.0f));
    // The following exception was thrown during execution in test generation
    try {
    int i8 = calcolatrice0.factorial((-149));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-100.0d));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    double d14 = calcolatrice0.divide((double)53, (double)3628800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.4605379188712522E-5d);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    int i11 = calcolatrice0.multiply(8751, 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 463803);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(0, (-125999964));
    int i8 = calcolatrice0.add(10, 8741);
    int i11 = calcolatrice0.multiply(2425, (-12610));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 8751);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-30579250));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add((int)(short)-1, 1970000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1969999);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    double d11 = calcolatrice0.divide((double)10296, (double)5200);
    double d14 = calcolatrice0.divide((double)53544400, (double)284905478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.98d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.18793741831808514d);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i10 = calcolatrice0.factorial(10000);
    int i13 = calcolatrice0.add((-149), 10);
    int i16 = calcolatrice0.subtract((int)(byte)10, (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-139));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 125999874);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    int i11 = calcolatrice0.add(53, (-125999964));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-125999911));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    double d9 = calcolatrice0.divide((double)197, (double)(-12600));
    int i12 = calcolatrice0.subtract((-12600), (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    double d15 = calcolatrice0.divide(0.0d, (double)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-0.015634920634920633d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-12599));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.add((-1260), (int)'#');
    int i16 = calcolatrice0.add((-125999864), (-125999864));
    int i19 = calcolatrice0.add((-350), (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    int i21 = calcolatrice0.factorial((int)(byte)-1);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1225));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-251999728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-340));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i8 = calcolatrice0.factorial(350);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(0, (-125999964));
    int i8 = calcolatrice0.add(10, 8741);
    double d11 = calcolatrice0.divide((double)463803, (double)1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 8751);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 463.803d);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply((int)' ', (-12610));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-403520));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i9 = calcolatrice0.subtract((-125999911), 2425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-126002336));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i12 = calcolatrice0.add((-125999864), (-15));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-125999879));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.multiply(97, 1970001);
    int i25 = calcolatrice0.subtract((int)(short)100, 0);
    int i27 = calcolatrice0.factorial(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 191090097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    double d11 = calcolatrice0.divide((double)(byte)0, (double)197);
    int i14 = calcolatrice0.subtract((-10001), (-1));
    double d17 = calcolatrice0.divide((double)'#', (double)3628800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-10000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 9.645061728395062E-6d);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    double d11 = calcolatrice0.divide((double)(byte)0, (double)197);
    int i14 = calcolatrice0.multiply((-125999964), 10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-341505916));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    double d11 = calcolatrice0.divide((double)10296, (double)5200);
    int i14 = calcolatrice0.subtract((-1), 10296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.98d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-10297));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.add((int)' ', 53);
    int i12 = calcolatrice0.multiply((-12600), 10000);
    double d15 = calcolatrice0.divide((-100.0d), (double)(-125999964));
    int i17 = calcolatrice0.factorial(10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-126000000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 7.936510204082281E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i17 = calcolatrice0.factorial(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2076180480);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i12 = calcolatrice0.multiply((int)' ', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 320);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.multiply((-125999911), (-12599));
    int i19 = calcolatrice0.add(85, 297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1665020831));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 382);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.add((-1260), (int)'#');
    int i16 = calcolatrice0.add((-125999864), (-125999864));
    int i19 = calcolatrice0.subtract((int)(short)10, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1225));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-251999728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-990));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i17 = calcolatrice0.factorial((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    int i19 = calcolatrice0.factorial((-10000));
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i10 = calcolatrice0.factorial(10000);
    int i13 = calcolatrice0.add((-149), 10);
    int i16 = calcolatrice0.add((-10), (-12600));
    int i18 = calcolatrice0.factorial(10000);
    int i21 = calcolatrice0.subtract((-403520), (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-139));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-12610));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-403572));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    double d3 = calcolatrice0.divide((double)(-36), (double)(-126000000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.857142857142857E-7d);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.multiply(1, (int)(short)10);
    int i14 = calcolatrice0.add(320, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1320);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.add(3628800, (-125999964));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-122371164));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i18 = calcolatrice0.add(297, 10000);
    double d21 = calcolatrice0.divide((double)(-126000000), (-12.25d));
    double d24 = calcolatrice0.divide(1.98d, (double)1970000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0285714285714285E7d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 1.0050761421319798E-6d);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(0, (-125999964));
    int i8 = calcolatrice0.multiply((int)(short)-1, 284905478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-284905478));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i11 = calcolatrice0.multiply(1970001, 10307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1170036173));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.add((int)' ', 53);
    int i12 = calcolatrice0.multiply((-12600), 10000);
    int i15 = calcolatrice0.subtract((-1225), 10000);
    double d18 = calcolatrice0.divide((double)(-1225), (double)(-125999964));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-126000000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11225));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 9.722225000000794E-6d);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.subtract((-36), (int)(short)0);
    int i14 = calcolatrice0.multiply((int)(byte)-1, 10001);
    // The following exception was thrown during execution in test generation
    try {
    int i16 = calcolatrice0.factorial((-12600));
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
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-10001));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.subtract(10000, (-1));
    double d9 = calcolatrice0.divide(9.722225000000794E-6d, (double)21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 4.6296309523813306E-7d);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i13 = calcolatrice0.factorial(2076180480);
    int i16 = calcolatrice0.add((-251999728), (-12599));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-252012327));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    double d6 = calcolatrice0.divide((double)100L, (double)(-1.0f));
    int i9 = calcolatrice0.multiply(197, 10000);
    int i12 = calcolatrice0.subtract((-1665020831), (-10297));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1665010534));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    double d9 = calcolatrice0.divide(0.18793741831808514d, 0.00942021948140235d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 19.950428829085798d);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.add((int)' ', 53);
    int i12 = calcolatrice0.multiply((-12600), 10000);
    int i14 = calcolatrice0.factorial(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-126000000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    int i11 = calcolatrice0.multiply(0, 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    double d11 = calcolatrice0.divide((double)(byte)0, (double)197);
    int i14 = calcolatrice0.subtract(1970000, 0);
    double d17 = calcolatrice0.divide((double)85, (double)(-10000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-0.0085d));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i11 = calcolatrice0.factorial((int)(short)100);
    double d14 = calcolatrice0.divide((double)350, (-0.015634920634920633d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-22385.78680203046d));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i10 = calcolatrice0.factorial(10000);
    int i13 = calcolatrice0.add((-149), 10);
    double d16 = calcolatrice0.divide((double)0L, (double)(-12599));
    double d19 = calcolatrice0.divide((double)(-10297), (double)(-30579250));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-139));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 3.367316072173124E-4d);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.multiply((-125999964), 100);
    int i17 = calcolatrice0.add((int)' ', 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 284905488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 5232);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.add(0, (-1665020928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1665020928));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.subtract((-1260), 0);
    double d14 = calcolatrice0.divide((double)97, (double)10297);
    int i17 = calcolatrice0.add((int)(byte)0, (-10297));
    int i20 = calcolatrice0.subtract(100, (-125999964));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.00942021948140235d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-10297));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 126000064);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.multiply(97, 1970001);
    int i24 = calcolatrice0.factorial(8741);
    int i27 = calcolatrice0.subtract((-36), 126000064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 191090097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-126000100));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial(1);
    int i13 = calcolatrice0.multiply((-149), 0);
    int i16 = calcolatrice0.multiply(382, (-3600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1375200));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i11 = calcolatrice0.factorial((int)(short)100);
    int i14 = calcolatrice0.add((int)(short)1, 126000064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 126000065);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)(short)100, 97);
    int i6 = calcolatrice0.add(21, (-284905478));
    int i8 = calcolatrice0.factorial(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-284905457));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(0, (-125999964));
    int i8 = calcolatrice0.subtract((-12599), (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-12600));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i12 = calcolatrice0.subtract(10297, 284905478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-284895181));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i9 = calcolatrice0.subtract((-149), 0);
    int i12 = calcolatrice0.subtract((-990), 109715800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-149));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-109716790));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    int i5 = calcolatrice0.factorial(1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i18 = calcolatrice0.add(297, 10000);
    int i21 = calcolatrice0.multiply((-122371164), (-122371164));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1948467472);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i12 = calcolatrice0.subtract(85, 100);
    // The following exception was thrown during execution in test generation
    try {
    int i14 = calcolatrice0.factorial((-126000000));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-15));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.multiply(97, 1970001);
    int i25 = calcolatrice0.subtract((int)(short)100, 0);
    int i28 = calcolatrice0.multiply((-30579250), (-125999879));
    // The following exception was thrown during execution in test generation
    try {
    int i30 = calcolatrice0.factorial((-251999728));
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 191090097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 998407518);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.subtract((-36), (int)(short)0);
    int i13 = calcolatrice0.factorial((int)(byte)1);
    int i16 = calcolatrice0.multiply((int)'a', 25);
    int i19 = calcolatrice0.add((int)(byte)100, 1970001);
    int i22 = calcolatrice0.multiply(125999874, (-340));
    int i25 = calcolatrice0.multiply((-341505916), 125999874);
    int i28 = calcolatrice0.multiply(998407518, 197);
    int i31 = calcolatrice0.subtract(297, 0);
    double d34 = calcolatrice0.divide((double)19100, (-22385.78680203046d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 109715800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1300628216));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-882214570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == (-0.853219954648526d));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add((-11225), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-11225));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.subtract(10000, (-1));
    int i9 = calcolatrice0.subtract(284905478, 284905488);
    double d12 = calcolatrice0.divide((double)(-30579250), (double)10296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-2970.0126262626263d));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.add(197, (int)(short)100);
    int i14 = calcolatrice0.subtract((int)(byte)1, 320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-319));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    double d9 = calcolatrice0.divide((double)197, (double)(-12600));
    int i12 = calcolatrice0.subtract((-12600), (int)(byte)-1);
    int i15 = calcolatrice0.add(8741, 10359);
    int i18 = calcolatrice0.add((int)'#', (-284905478));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-0.015634920634920633d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-12599));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 19100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-284905443));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)(short)100, 97);
    int i6 = calcolatrice0.subtract(5232, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 5132);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial(1);
    int i13 = calcolatrice0.multiply((-149), 0);
    double d16 = calcolatrice0.divide((double)'a', (double)8741);
    int i19 = calcolatrice0.add(85, (-350));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.01109712847500286d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-265));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i11 = calcolatrice0.subtract((int)(byte)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.subtract((-36), (int)(short)0);
    int i13 = calcolatrice0.factorial((int)(byte)1);
    int i16 = calcolatrice0.multiply((int)'a', 25);
    int i19 = calcolatrice0.add((int)(byte)100, 1970001);
    int i22 = calcolatrice0.multiply(125999874, (-340));
    int i25 = calcolatrice0.multiply((-341505916), 125999874);
    int i28 = calcolatrice0.multiply(998407518, 197);
    int i31 = calcolatrice0.subtract(297, 0);
    double d34 = calcolatrice0.divide(1.0285714285714285E7d, (double)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 109715800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1300628216));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-882214570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == 102857.14285714286d);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract(53, (int)' ');
    int i6 = calcolatrice0.subtract((int)'#', (int)(short)10);
    int i8 = calcolatrice0.factorial(97);
    int i10 = calcolatrice0.factorial(10000);
    int i13 = calcolatrice0.add((-149), 10);
    int i16 = calcolatrice0.add((-10), (-12600));
    int i18 = calcolatrice0.factorial(10000);
    int i20 = calcolatrice0.factorial(191090097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-139));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-12610));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.add((int)(short)100, 97);
    double d6 = calcolatrice0.divide((double)432130304, (double)(-12610));
    int i9 = calcolatrice0.multiply((-125999911), (-403572));
    int i12 = calcolatrice0.multiply(998407518, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-34268.85836637589d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1918264748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-998407518));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)10);
    double d11 = calcolatrice0.divide((double)(-12610), 7.936510204082281E-7d);
    int i13 = calcolatrice0.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.58885954604E10d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    int i8 = calcolatrice0.add(0, 100);
    int i11 = calcolatrice0.add(5200, (int)(byte)0);
    double d14 = calcolatrice0.divide((double)(-10), (double)53544400);
    int i17 = calcolatrice0.subtract(1969999, (-284905478));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.8676089376293319E-7d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 286875477);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial(1);
    int i13 = calcolatrice0.multiply((-149), 0);
    double d16 = calcolatrice0.divide(7.936510204082281E-7d, (-1.8676089376293319E-7d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-4.249556769714633d));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.multiply((-125999964), 100);
    double d17 = calcolatrice0.divide((double)(-265), (double)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 284905488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-265.0d));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply((int)'a', (int)(byte)-1);
    double d8 = calcolatrice0.divide(0.0d, (double)(byte)-1);
    double d11 = calcolatrice0.divide((double)10296, (double)5200);
    int i14 = calcolatrice0.subtract((-1665020831), 97);
    int i17 = calcolatrice0.multiply(0, (-36));
    int i20 = calcolatrice0.multiply((-125999864), (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.98d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1665020928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    int i11 = calcolatrice0.factorial((int)(byte)0);
    int i14 = calcolatrice0.multiply((-125999964), 100);
    int i17 = calcolatrice0.subtract((int)(byte)-1, (-350));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 284905488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 349);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    double d6 = calcolatrice0.divide((double)100L, (double)(-1.0f));
    int i9 = calcolatrice0.subtract((-125999879), (-10297));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125989582));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.subtract((-1260), 0);
    double d14 = calcolatrice0.divide((double)97, (double)10297);
    // The following exception was thrown during execution in test generation
    try {
    int i16 = calcolatrice0.factorial((-1));
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.00942021948140235d);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i15 = calcolatrice0.factorial(100);
    int i18 = calcolatrice0.add(297, 10000);
    double d21 = calcolatrice0.divide((double)(-12599), (double)(-319));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 39.495297805642636d);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.subtract((-10), 197);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-207));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    int i10 = calcolatrice0.factorial((int)'4');
    int i13 = calcolatrice0.multiply((int)'4', (int)(short)100);
    int i16 = calcolatrice0.add((int)(short)1, 1970000);
    int i19 = calcolatrice0.subtract(0, 10);
    int i22 = calcolatrice0.multiply(97, 1970001);
    int i25 = calcolatrice0.subtract((int)(short)100, 0);
    int i28 = calcolatrice0.multiply((-30579250), (-125999879));
    int i30 = calcolatrice0.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 191090097);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 998407518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.add(1, (int)'4');
    double d11 = calcolatrice0.divide((double)(byte)0, (double)197);
    int i14 = calcolatrice0.subtract(1970000, 0);
    int i16 = calcolatrice0.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)10, (-1260));
    double d12 = calcolatrice0.divide((double)85, (double)(-1));
    int i15 = calcolatrice0.subtract(10297, 1);
    // The following exception was thrown during execution in test generation
    try {
    int i17 = calcolatrice0.factorial((-403520));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-12600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-85.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10296);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.subtract((int)(short)-1, (int)'#');
    double d6 = calcolatrice0.divide(0.0d, (double)10);
    int i9 = calcolatrice0.multiply((int)(short)-1, (-3600));
    int i12 = calcolatrice0.multiply(10, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    int i14 = calcolatrice0.factorial((-126000100));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-36));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1000);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i2 = calcolatrice0.factorial(1);
    int i5 = calcolatrice0.multiply(1, 0);
    int i8 = calcolatrice0.multiply((int)(short)100, (int)(byte)100);
    int i11 = calcolatrice0.multiply(1, (int)(short)10);
    int i14 = calcolatrice0.multiply(284905478, (-10));
    double d17 = calcolatrice0.divide((double)350, (double)(-10297));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1445912516);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-0.03399048266485384d));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.subtract(10000, (-1));
    int i9 = calcolatrice0.multiply((int)(byte)-1, 10297);
    int i12 = calcolatrice0.multiply(0, (-252012327));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-10297));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.multiply((int)'#', (-36));
    int i6 = calcolatrice0.multiply(97, 1);
    int i9 = calcolatrice0.add((int)(short)100, (-125999964));
    int i11 = calcolatrice0.factorial((int)(short)100);
    int i13 = calcolatrice0.factorial(1918264748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-125999864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

}
