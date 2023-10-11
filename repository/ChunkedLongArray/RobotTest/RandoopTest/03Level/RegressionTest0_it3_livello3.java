
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    int i0 = ChunkedLongArray.DEFAULT_CHUNK_BITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 20);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.String str0 = ChunkedLongArray.memStats();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Allocated memory: 115MB, Allocated unused memory: 102MB, Heap memory used: 12MB, Max memory: 1691MB"+ "'", str0.equals("Allocated memory: 115MB, Allocated unused memory: 102MB, Heap memory used: 12MB, Max memory: 1691MB"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray(0);
    chunkedLongArray5.add(1L);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray5, 20, (int)'a', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    long[] long_array6 = new long[] { (short)0, (short)100, '#' };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array6, (int)'#', (int)'4', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array6);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    // The following exception was thrown during execution in test generation
    try {
    long long2 = chunkedLongArray0.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long7 = chunkedLongArray1.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(short)-1, (long)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray1.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray2 = new ChunkedLongArray(0);
    chunkedLongArray2.add(1L);
    chunkedLongArray2.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray2, 0, (int)(short)0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(byte)-1, (long)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray3 = null;
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray3, (int)(byte)1, (int)(short)0, 11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.set((int)'4', (long)20);
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray6, 33, (int)(byte)0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long[] long_array20 = new long[] { 100, 1, ' ', ' ', ' ', ' ' };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array20, (int)(short)0, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    long long8 = chunkedLongArray1.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray6.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    long[] long_array12 = new long[] { (byte)100, (short)100, (short)-1, (byte)10, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array12, 33, (int)(short)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray1.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    int i17 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray35, (int)(short)0, (int)(short)1, (-1));
    long[] long_array50 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray35.set(long_array50, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array50, (int)(short)-1, 1, 33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    int i10 = chunkedLongArray9.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)0, 20, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    long long8 = chunkedLongArray1.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    int i20 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 33);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    int i7 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(0);
    chunkedLongArray8.add(1L);
    chunkedLongArray8.set((int)(short)10, (long)(short)1);
    chunkedLongArray3.set(chunkedLongArray8, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)(short)10, (long)(short)1);
    chunkedLongArray3.set(chunkedLongArray19, (int)(short)0, (int)(short)1, (-1));
    long[] long_array34 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray19.set(long_array34, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array34, (int)(short)-1, 10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set(1, (long)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, (int)(byte)100, (int)' ', 20);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    java.lang.String str15 = chunkedLongArray9.toString();
    chunkedLongArray9.add((long)'#');
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, (int)' ', 0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)' ', (long)0);
    java.lang.String str12 = chunkedLongArray6.toString();
    int i13 = chunkedLongArray6.capacity();
    long[] long_array20 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray6.set(long_array20, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array20, 0, 20, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str12.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long29 = chunkedLongArray17.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    java.lang.String str17 = chunkedLongArray6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    // The following exception was thrown during execution in test generation
    try {
    long long18 = chunkedLongArray6.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((-1), 0L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray1.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    // The following exception was thrown during execution in test generation
    try {
    long long2 = chunkedLongArray0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    java.lang.String str9 = chunkedLongArray3.toString();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray(0);
    chunkedLongArray13.add(1L);
    chunkedLongArray13.set((int)(short)10, (long)(short)1);
    int i19 = chunkedLongArray13.size();
    chunkedLongArray11.set(chunkedLongArray13, (int)'#', (int)(byte)0, 0);
    chunkedLongArray13.set((int)(short)10, (long)10);
    java.lang.String str27 = chunkedLongArray13.toString();
    int i28 = chunkedLongArray13.capacity();
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set((int)(short)10, (long)(short)1);
    int i36 = chunkedLongArray30.size();
    int i37 = chunkedLongArray30.size();
    ChunkedLongArray chunkedLongArray39 = new ChunkedLongArray(0);
    chunkedLongArray39.add(1L);
    chunkedLongArray39.set((int)' ', (long)0);
    java.lang.String str45 = chunkedLongArray39.toString();
    int i46 = chunkedLongArray39.capacity();
    long[] long_array53 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray39.set(long_array53, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray30.set(long_array53, 10, 20, (int)(byte)-1);
    chunkedLongArray13.set(long_array53, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray3.set(long_array53, (int)(byte)0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array53, (int)' ', (int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str45.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(100);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    chunkedLongArray6.sort();
    int i17 = chunkedLongArray6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    int i7 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)(short)10, (long)(short)1);
    int i17 = chunkedLongArray11.size();
    chunkedLongArray9.set(chunkedLongArray11, (int)'#', (int)(byte)0, 0);
    chunkedLongArray11.set((int)(short)10, (long)10);
    java.lang.String str25 = chunkedLongArray11.toString();
    int i26 = chunkedLongArray11.capacity();
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)(short)10, (long)(short)1);
    int i34 = chunkedLongArray28.size();
    int i35 = chunkedLongArray28.size();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.set((int)' ', (long)0);
    java.lang.String str43 = chunkedLongArray37.toString();
    int i44 = chunkedLongArray37.capacity();
    long[] long_array51 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray37.set(long_array51, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray28.set(long_array51, 10, 20, (int)(byte)-1);
    chunkedLongArray11.set(long_array51, (-1), (int)'#', (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray11, (int)' ', (int)(short)0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str43.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    int i7 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    int i16 = chunkedLongArray9.size();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.capacity();
    long[] long_array32 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray18.set(long_array32, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray9.set(long_array32, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array32, (int)(short)10, 2, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    // The following exception was thrown during execution in test generation
    try {
    long long28 = chunkedLongArray17.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)100);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray(0);
    chunkedLongArray5.add(1L);
    chunkedLongArray5.set((int)(short)10, (long)(short)1);
    int i11 = chunkedLongArray5.size();
    chunkedLongArray3.set(chunkedLongArray5, (int)'#', (int)(byte)0, 0);
    chunkedLongArray5.set((int)(short)10, (long)10);
    java.lang.String str19 = chunkedLongArray5.toString();
    int i20 = chunkedLongArray5.capacity();
    int i21 = chunkedLongArray5.capacity();
    chunkedLongArray5.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray5, (int)(byte)-1, (int)(byte)10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray(0);
    chunkedLongArray12.add(1L);
    chunkedLongArray12.set((int)' ', (long)0);
    java.lang.String str18 = chunkedLongArray12.toString();
    int i19 = chunkedLongArray12.capacity();
    java.lang.String str20 = chunkedLongArray12.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray12, (int)(short)100, (int)(byte)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.add((long)(short)-1);
    chunkedLongArray17.add((long)'4');

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray1.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'#');

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(0);
    chunkedLongArray8.add(1L);
    chunkedLongArray8.set((int)(short)10, (long)(short)1);
    int i14 = chunkedLongArray8.size();
    int i15 = chunkedLongArray8.size();
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)' ', (long)0);
    java.lang.String str23 = chunkedLongArray17.toString();
    int i24 = chunkedLongArray17.capacity();
    long[] long_array31 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray17.set(long_array31, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray8.set(long_array31, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array31, 1, (int)(short)0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str23.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array31);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    java.lang.String str17 = chunkedLongArray6.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set((int)(byte)-1, (long)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray35, (int)(short)0, (int)(short)1, (-1));
    long[] long_array50 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray35.set(long_array50, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array50, (int)(short)-1, (int)(short)0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    chunkedLongArray6.add(0L);
    chunkedLongArray6.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    java.lang.String str8 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray(0);
    chunkedLongArray10.add(1L);
    chunkedLongArray10.set((int)(short)10, (long)(short)1);
    java.lang.String str16 = chunkedLongArray10.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray20.set((int)(short)10, (long)10);
    java.lang.String str34 = chunkedLongArray20.toString();
    int i35 = chunkedLongArray20.capacity();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.set((int)(short)10, (long)(short)1);
    int i43 = chunkedLongArray37.size();
    int i44 = chunkedLongArray37.size();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)' ', (long)0);
    java.lang.String str52 = chunkedLongArray46.toString();
    int i53 = chunkedLongArray46.capacity();
    long[] long_array60 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray46.set(long_array60, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray37.set(long_array60, 10, 20, (int)(byte)-1);
    chunkedLongArray20.set(long_array60, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray10.set(long_array60, (int)(byte)0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array60, 2, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str52.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array60);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = chunkedLongArray1.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray(0);
    chunkedLongArray13.add(1L);
    chunkedLongArray13.set((int)(short)10, (long)(short)1);
    int i19 = chunkedLongArray13.size();
    chunkedLongArray11.set(chunkedLongArray13, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.sort();
    chunkedLongArray25.sort();
    int i30 = chunkedLongArray25.size();
    chunkedLongArray25.sort();
    chunkedLongArray13.set(chunkedLongArray25, 100, 11, (int)(byte)0);
    chunkedLongArray25.sort();
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray(0);
    chunkedLongArray38.add(1L);
    chunkedLongArray38.set((int)' ', (long)0);
    java.lang.String str44 = chunkedLongArray38.toString();
    int i45 = chunkedLongArray38.capacity();
    long[] long_array52 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray38.set(long_array52, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray25.set(long_array52, (int)'4', 0, (int)(short)0);
    chunkedLongArray1.set(long_array52, 21, 0, (int)(short)0);
    chunkedLongArray1.add((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str44.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array52);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long19 = chunkedLongArray3.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    chunkedLongArray3.add((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.add((long)(short)-1);
    chunkedLongArray17.add((long)'a');
    chunkedLongArray17.sort();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray1.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = chunkedLongArray1.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray35, (int)(short)0, (int)(short)1, (-1));
    long[] long_array50 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray35.set(long_array50, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array50, (int)(byte)0, (-1), 21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.size();
    int i29 = chunkedLongArray21.capacity();
    chunkedLongArray1.set(chunkedLongArray21, (int)'#', 33, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 33);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray20, 21, 21, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.sort();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray14, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray25, (int)(short)0, (int)(short)1, (-1));
    long[] long_array40 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray25.set(long_array40, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray1.set(long_array40, 0, (int)(byte)100, (int)(short)0);
    ChunkedLongArray chunkedLongArray50 = new ChunkedLongArray(0);
    chunkedLongArray50.add(1L);
    chunkedLongArray50.set((int)(short)10, (long)(short)1);
    java.lang.String str56 = chunkedLongArray50.toString();
    int i57 = chunkedLongArray50.capacity();
    chunkedLongArray1.set(chunkedLongArray50, 100, (int)(byte)10, (-1));
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(byte)-1, (-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str56.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    chunkedLongArray15.set(chunkedLongArray20, 1, (-1), (int)(byte)-1);
    int i30 = chunkedLongArray20.size();
    int i31 = chunkedLongArray20.size();
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)' ', (long)0);
    java.lang.String str39 = chunkedLongArray33.toString();
    int i40 = chunkedLongArray33.size();
    chunkedLongArray20.set(chunkedLongArray33, 20, (int)' ', (int)(byte)10);
    long long46 = chunkedLongArray33.get((int)(short)10);
    chunkedLongArray1.set(chunkedLongArray33, (int)(short)0, (int)(byte)100, 10);
    // The following exception was thrown during execution in test generation
    try {
    long long52 = chunkedLongArray33.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 0L);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.sort();
    chunkedLongArray21.sort();
    int i26 = chunkedLongArray21.size();
    chunkedLongArray21.add(0L);
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)(short)10, (long)(short)1);
    int i39 = chunkedLongArray33.size();
    chunkedLongArray31.set(chunkedLongArray33, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray45 = new ChunkedLongArray(0);
    chunkedLongArray45.add(1L);
    chunkedLongArray45.sort();
    chunkedLongArray45.sort();
    int i50 = chunkedLongArray45.size();
    chunkedLongArray45.sort();
    chunkedLongArray33.set(chunkedLongArray45, 100, 11, (int)(byte)0);
    chunkedLongArray45.sort();
    ChunkedLongArray chunkedLongArray58 = new ChunkedLongArray(0);
    chunkedLongArray58.add(1L);
    chunkedLongArray58.set((int)' ', (long)0);
    java.lang.String str64 = chunkedLongArray58.toString();
    int i65 = chunkedLongArray58.capacity();
    long[] long_array72 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray58.set(long_array72, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray45.set(long_array72, (int)'4', 0, (int)(short)0);
    chunkedLongArray21.set(long_array72, 21, 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array72, 100, 0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str64.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array72);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.add((long)(byte)-1);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)' ', (long)0);
    java.lang.String str26 = chunkedLongArray20.toString();
    int i27 = chunkedLongArray20.capacity();
    long[] long_array34 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray20.set(long_array34, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array34, (int)(short)100, (int)'#', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str26.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.set((int)(short)1, (long)(short)0);
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(11);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray17.set(chunkedLongArray31, 21, 0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)(short)10, (long)(short)1);
    int i17 = chunkedLongArray11.size();
    chunkedLongArray9.set(chunkedLongArray11, (int)'#', (int)(byte)0, 0);
    chunkedLongArray11.set((int)(short)10, (long)10);
    java.lang.String str25 = chunkedLongArray11.toString();
    int i26 = chunkedLongArray11.capacity();
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)(short)10, (long)(short)1);
    int i34 = chunkedLongArray28.size();
    int i35 = chunkedLongArray28.size();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.set((int)' ', (long)0);
    java.lang.String str43 = chunkedLongArray37.toString();
    int i44 = chunkedLongArray37.capacity();
    long[] long_array51 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray37.set(long_array51, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray28.set(long_array51, 10, 20, (int)(byte)-1);
    chunkedLongArray11.set(long_array51, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray1.set(long_array51, (int)(byte)0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    long long69 = chunkedLongArray1.get(33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str43.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(0, (long)' ');
    chunkedLongArray1.add((long)(byte)100);
    int i9 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)(short)10, (long)(short)1);
    int i17 = chunkedLongArray11.size();
    int i18 = chunkedLongArray11.size();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)' ', (long)0);
    java.lang.String str26 = chunkedLongArray20.toString();
    int i27 = chunkedLongArray20.capacity();
    long[] long_array34 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray20.set(long_array34, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray11.set(long_array34, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array34, (int)(byte)10, (int)(byte)-1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str26.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array34);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    long[] long_array35 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray21.set(long_array35, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array35, (int)(short)-1, (int)'#', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array35);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    chunkedLongArray3.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long20 = chunkedLongArray3.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)100);
    chunkedLongArray1.sort();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    chunkedLongArray18.set((int)'#', (long)(byte)1);
    java.lang.String str33 = chunkedLongArray18.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(36 entries, 36 chunks, 0MB)"+ "'", str33.equals("ChunkedLongArray(36 entries, 36 chunks, 0MB)"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    chunkedLongArray3.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long20 = chunkedLongArray3.get(33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(0);
    chunkedLongArray8.add(1L);
    chunkedLongArray8.set((int)(short)10, (long)(short)1);
    chunkedLongArray3.set(chunkedLongArray8, 1, (-1), (int)(byte)-1);
    int i18 = chunkedLongArray8.size();
    int i19 = chunkedLongArray8.size();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.size();
    chunkedLongArray8.set(chunkedLongArray21, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    int i42 = chunkedLongArray36.size();
    chunkedLongArray34.set(chunkedLongArray36, (int)'#', (int)(byte)0, 0);
    chunkedLongArray36.set((int)(short)10, (long)10);
    java.lang.String str50 = chunkedLongArray36.toString();
    int i51 = chunkedLongArray36.capacity();
    ChunkedLongArray chunkedLongArray53 = new ChunkedLongArray(0);
    chunkedLongArray53.add(1L);
    chunkedLongArray53.set((int)(short)10, (long)(short)1);
    int i59 = chunkedLongArray53.size();
    int i60 = chunkedLongArray53.size();
    ChunkedLongArray chunkedLongArray62 = new ChunkedLongArray(0);
    chunkedLongArray62.add(1L);
    chunkedLongArray62.set((int)' ', (long)0);
    java.lang.String str68 = chunkedLongArray62.toString();
    int i69 = chunkedLongArray62.capacity();
    long[] long_array76 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray62.set(long_array76, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray53.set(long_array76, 10, 20, (int)(byte)-1);
    chunkedLongArray36.set(long_array76, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray21.set(chunkedLongArray36, 11, 11, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray36, (int)' ', (int)'4', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str68.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array76);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.sort();
    java.lang.String str15 = chunkedLongArray3.toString();
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.sort();
    chunkedLongArray17.sort();
    int i22 = chunkedLongArray17.size();
    chunkedLongArray17.add(0L);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray17, 0, 2, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(0);
    chunkedLongArray8.add(1L);
    chunkedLongArray8.sort();
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray(0);
    chunkedLongArray13.add(1L);
    chunkedLongArray13.set((int)(short)10, (long)(short)1);
    chunkedLongArray8.set(chunkedLongArray13, 1, (-1), (int)(byte)-1);
    int i23 = chunkedLongArray13.size();
    chunkedLongArray13.sort();
    chunkedLongArray13.add(0L);
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set((int)(short)10, (long)(short)1);
    int i36 = chunkedLongArray30.size();
    chunkedLongArray28.set(chunkedLongArray30, (int)'#', (int)(byte)0, 0);
    chunkedLongArray30.set((int)(short)10, (long)10);
    java.lang.String str44 = chunkedLongArray30.toString();
    int i45 = chunkedLongArray30.capacity();
    int i46 = chunkedLongArray30.capacity();
    chunkedLongArray30.sort();
    chunkedLongArray30.set((int)(short)0, (long)(short)0);
    int i51 = chunkedLongArray30.size();
    chunkedLongArray13.set(chunkedLongArray30, (-1), (int)(short)10, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray13, 0, 1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str44.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 11);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.add((long)(short)-1);
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.sort();
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray30.set(chunkedLongArray35, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)(short)10, (long)(short)1);
    chunkedLongArray30.set(chunkedLongArray46, (int)(short)0, (int)(short)1, (-1));
    long[] long_array61 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray46.set(long_array61, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray17.set(long_array61, (int)'a', (int)(short)10, 11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array61);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    chunkedLongArray17.set(36, (long)33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = chunkedLongArray1.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.capacity();
    long[] long_array32 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray18.set(long_array32, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array32, (int)(short)-1, 0, 21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray((int)(byte)100);
    chunkedLongArray1.set(chunkedLongArray6, (int)(byte)-1, (-1), (int)(short)0);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)(short)0);
    int i24 = chunkedLongArray3.size();
    // The following exception was thrown during execution in test generation
    try {
    long long26 = chunkedLongArray3.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(36);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    long long9 = chunkedLongArray1.get(11);
    chunkedLongArray1.set(21, (long)(byte)100);
    long long14 = chunkedLongArray1.get(0);
    java.lang.String str15 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((-1));
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.add((long)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    chunkedLongArray6.add(0L);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray(0);
    chunkedLongArray23.add(1L);
    chunkedLongArray23.set((int)(short)10, (long)(short)1);
    int i29 = chunkedLongArray23.size();
    chunkedLongArray21.set(chunkedLongArray23, (int)'#', (int)(byte)0, 0);
    chunkedLongArray23.set((int)(short)10, (long)10);
    java.lang.String str37 = chunkedLongArray23.toString();
    int i38 = chunkedLongArray23.capacity();
    int i39 = chunkedLongArray23.capacity();
    chunkedLongArray23.sort();
    chunkedLongArray23.set((int)(short)0, (long)(short)0);
    int i44 = chunkedLongArray23.size();
    chunkedLongArray6.set(chunkedLongArray23, (-1), (int)(short)10, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long50 = chunkedLongArray23.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 11);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set((int)(short)10, (long)(short)1);
    int i36 = chunkedLongArray30.size();
    chunkedLongArray28.set(chunkedLongArray30, (int)'#', (int)(byte)0, 0);
    chunkedLongArray30.set((int)(short)10, (long)10);
    java.lang.String str44 = chunkedLongArray30.toString();
    int i45 = chunkedLongArray30.capacity();
    ChunkedLongArray chunkedLongArray47 = new ChunkedLongArray(0);
    chunkedLongArray47.add(1L);
    chunkedLongArray47.set((int)(short)10, (long)(short)1);
    int i53 = chunkedLongArray47.size();
    int i54 = chunkedLongArray47.size();
    ChunkedLongArray chunkedLongArray56 = new ChunkedLongArray(0);
    chunkedLongArray56.add(1L);
    chunkedLongArray56.set((int)' ', (long)0);
    java.lang.String str62 = chunkedLongArray56.toString();
    int i63 = chunkedLongArray56.capacity();
    long[] long_array70 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray56.set(long_array70, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray47.set(long_array70, 10, 20, (int)(byte)-1);
    chunkedLongArray30.set(long_array70, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray1.set(long_array70, 100, (int)(byte)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
    long long88 = chunkedLongArray1.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str44.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str62.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array70);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    int i6 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.add(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.add((long)11);
    chunkedLongArray1.add((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray56 = new ChunkedLongArray(0);
    chunkedLongArray56.add(1L);
    chunkedLongArray56.set((int)(short)10, (long)(short)1);
    int i62 = chunkedLongArray56.size();
    int i63 = chunkedLongArray56.size();
    ChunkedLongArray chunkedLongArray65 = new ChunkedLongArray(0);
    chunkedLongArray65.add(1L);
    chunkedLongArray65.set((int)' ', (long)0);
    java.lang.String str71 = chunkedLongArray65.toString();
    int i72 = chunkedLongArray65.capacity();
    long[] long_array79 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray65.set(long_array79, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray56.set(long_array79, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array79, (int)(byte)0, (int)(byte)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str71.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array79);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray(0);
    int i5 = chunkedLongArray4.capacity();
    chunkedLongArray4.set((int)(byte)0, (long)(short)-1);
    java.lang.String str9 = chunkedLongArray4.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray4, (int)(byte)100, (int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray(0);
    chunkedLongArray5.add(1L);
    chunkedLongArray5.set((int)(short)10, (long)(short)1);
    int i11 = chunkedLongArray5.size();
    chunkedLongArray3.set(chunkedLongArray5, (int)'#', (int)(byte)0, 0);
    chunkedLongArray5.set((int)(short)10, (long)10);
    java.lang.String str19 = chunkedLongArray5.toString();
    int i20 = chunkedLongArray5.capacity();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray(0);
    chunkedLongArray22.add(1L);
    chunkedLongArray22.set((int)(short)10, (long)(short)1);
    int i28 = chunkedLongArray22.size();
    int i29 = chunkedLongArray22.size();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.set((int)' ', (long)0);
    java.lang.String str37 = chunkedLongArray31.toString();
    int i38 = chunkedLongArray31.capacity();
    long[] long_array45 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray31.set(long_array45, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray22.set(long_array45, 10, 20, (int)(byte)-1);
    chunkedLongArray5.set(long_array45, (-1), (int)'#', (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array45, (int)(short)1, (-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array45);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    long long36 = chunkedLongArray20.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.sort();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray14, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray25, (int)(short)0, (int)(short)1, (-1));
    long[] long_array40 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray25.set(long_array40, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray1.set(long_array40, 0, (int)(byte)100, (int)(short)0);
    int i49 = chunkedLongArray1.size();
    int i50 = chunkedLongArray1.capacity();
    int i51 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 101);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray3.size();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    int i91 = chunkedLongArray34.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 35);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.sort();
    int i27 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    int i10 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(short)-1, (long)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    int i17 = chunkedLongArray3.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    int i34 = chunkedLongArray24.size();
    chunkedLongArray24.add((long)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray24, 53, 2, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    java.lang.String str18 = chunkedLongArray6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)10);
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    chunkedLongArray1.add((long)0);
    int i4 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    java.lang.String str7 = chunkedLongArray6.toString();
    int i8 = chunkedLongArray6.capacity();
    int i9 = chunkedLongArray6.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray6, 101, 33, 33);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)20);
    chunkedLongArray3.sort();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    int i24 = chunkedLongArray18.size();
    int i25 = chunkedLongArray18.size();
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)' ', (long)0);
    java.lang.String str33 = chunkedLongArray27.toString();
    int i34 = chunkedLongArray27.capacity();
    long[] long_array41 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray27.set(long_array41, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray18.set(long_array41, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array41, (int)(short)0, (int)(short)10, 36);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str33.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array41);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    java.lang.String str10 = chunkedLongArray1.toString();
    java.lang.String str11 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str11.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    int i12 = chunkedLongArray9.capacity();
    chunkedLongArray1.set(chunkedLongArray9, 0, 0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    long long18 = chunkedLongArray1.get(101);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)(short)0);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)(short)10, (long)(short)1);
    int i33 = chunkedLongArray27.size();
    chunkedLongArray25.set(chunkedLongArray27, (int)'#', (int)(byte)0, 0);
    chunkedLongArray25.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    chunkedLongArray42.add(1L);
    chunkedLongArray42.set((int)(short)10, (long)(short)1);
    int i48 = chunkedLongArray42.size();
    int i49 = chunkedLongArray42.size();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)' ', (long)0);
    java.lang.String str57 = chunkedLongArray51.toString();
    int i58 = chunkedLongArray51.capacity();
    long[] long_array65 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray51.set(long_array65, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray42.set(long_array65, 10, 20, (int)(byte)-1);
    chunkedLongArray25.set(long_array65, (int)(short)0, (int)' ', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array65, (int)' ', 0, 53);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str57.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array65);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)(short)10, (long)(short)1);
    int i27 = chunkedLongArray21.size();
    chunkedLongArray19.set(chunkedLongArray21, (int)'#', (int)(byte)0, 0);
    chunkedLongArray19.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    int i42 = chunkedLongArray36.size();
    int i43 = chunkedLongArray36.size();
    ChunkedLongArray chunkedLongArray45 = new ChunkedLongArray(0);
    chunkedLongArray45.add(1L);
    chunkedLongArray45.set((int)' ', (long)0);
    java.lang.String str51 = chunkedLongArray45.toString();
    int i52 = chunkedLongArray45.capacity();
    long[] long_array59 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray45.set(long_array59, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray36.set(long_array59, 10, 20, (int)(byte)-1);
    chunkedLongArray19.set(long_array59, (int)(short)0, (int)' ', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array59, (-1), 0, 101);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str51.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array59);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray(0);
    chunkedLongArray10.add(1L);
    chunkedLongArray10.set((int)(short)10, (long)(short)1);
    int i16 = chunkedLongArray10.size();
    chunkedLongArray8.set(chunkedLongArray10, (int)'#', (int)(byte)0, 0);
    chunkedLongArray10.set((int)(short)10, (long)10);
    java.lang.String str24 = chunkedLongArray10.toString();
    chunkedLongArray10.add(10L);
    chunkedLongArray10.sort();
    ChunkedLongArray chunkedLongArray29 = new ChunkedLongArray(0);
    int i30 = chunkedLongArray29.capacity();
    chunkedLongArray29.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray29.sort();
    int i35 = chunkedLongArray29.capacity();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.sort();
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    chunkedLongArray42.add(1L);
    chunkedLongArray42.set((int)(short)10, (long)(short)1);
    chunkedLongArray37.set(chunkedLongArray42, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray53 = new ChunkedLongArray(0);
    chunkedLongArray53.add(1L);
    chunkedLongArray53.set((int)(short)10, (long)(short)1);
    chunkedLongArray37.set(chunkedLongArray53, (int)(short)0, (int)(short)1, (-1));
    long[] long_array68 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray53.set(long_array68, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray29.set(long_array68, 0, (int)(byte)100, (int)(short)0);
    chunkedLongArray10.set(long_array68, 1, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array68, 11, (int)(byte)10, 20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array68);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    int i12 = chunkedLongArray9.capacity();
    chunkedLongArray1.set(chunkedLongArray9, 0, 0, (int)(byte)1);
    java.lang.String str17 = chunkedLongArray1.toString();
    chunkedLongArray1.set((int)(byte)1, (long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(1 entries, 2 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(1 entries, 2 chunks, 0MB)"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    int i9 = chunkedLongArray1.capacity();
    java.lang.String str10 = chunkedLongArray1.toString();
    int i11 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 33);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(53, (long)(short)100);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    chunkedLongArray15.set(chunkedLongArray20, 1, (-1), (int)(byte)-1);
    int i30 = chunkedLongArray20.size();
    int i31 = chunkedLongArray20.size();
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)' ', (long)0);
    java.lang.String str39 = chunkedLongArray33.toString();
    int i40 = chunkedLongArray33.size();
    chunkedLongArray20.set(chunkedLongArray33, 20, (int)' ', (int)(byte)10);
    long long46 = chunkedLongArray33.get((int)(short)10);
    chunkedLongArray1.set(chunkedLongArray33, (int)(short)0, (int)(byte)100, 10);
    long long52 = chunkedLongArray1.get((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long52 == 0L);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray(0);
    chunkedLongArray22.add(1L);
    chunkedLongArray22.set((int)(short)10, (long)(short)1);
    int i28 = chunkedLongArray22.size();
    chunkedLongArray20.set(chunkedLongArray22, (int)'#', (int)(byte)0, 0);
    chunkedLongArray22.set((int)(short)10, (long)10);
    java.lang.String str36 = chunkedLongArray22.toString();
    int i37 = chunkedLongArray22.capacity();
    ChunkedLongArray chunkedLongArray39 = new ChunkedLongArray(0);
    chunkedLongArray39.add(1L);
    chunkedLongArray39.set((int)(short)10, (long)(short)1);
    int i45 = chunkedLongArray39.size();
    int i46 = chunkedLongArray39.size();
    ChunkedLongArray chunkedLongArray48 = new ChunkedLongArray(0);
    chunkedLongArray48.add(1L);
    chunkedLongArray48.set((int)' ', (long)0);
    java.lang.String str54 = chunkedLongArray48.toString();
    int i55 = chunkedLongArray48.capacity();
    long[] long_array62 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray48.set(long_array62, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray39.set(long_array62, 10, 20, (int)(byte)-1);
    chunkedLongArray22.set(long_array62, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray3.set(long_array62, (int)'4', (int)'a', (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str36.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str54.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array62);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    long[] long_array32 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray17.set(long_array32, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray17.set((int)(short)-1, (long)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)(short)10, (long)(short)1);
    int i27 = chunkedLongArray21.size();
    chunkedLongArray19.set(chunkedLongArray21, (int)'#', (int)(byte)0, 0);
    long long33 = chunkedLongArray21.get((int)(byte)0);
    int i34 = chunkedLongArray21.capacity();
    java.lang.String str35 = chunkedLongArray21.toString();
    int i36 = chunkedLongArray21.size();
    chunkedLongArray21.set(20, (long)21);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(chunkedLongArray21, 21, (int)(short)100, 33);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    int i10 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray(0);
    chunkedLongArray12.add(1L);
    chunkedLongArray12.sort();
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray12.set(chunkedLongArray17, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)(short)10, (long)(short)1);
    chunkedLongArray12.set(chunkedLongArray28, (int)(short)0, (int)(short)1, (-1));
    long[] long_array43 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray28.set(long_array43, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array43, (int)(byte)-1, (int)(byte)100, 12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    int i18 = chunkedLongArray6.capacity();
    chunkedLongArray6.sort();
    java.lang.String str20 = chunkedLongArray6.toString();
    chunkedLongArray6.add(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    int i7 = chunkedLongArray1.capacity();
    chunkedLongArray1.add((long)36);
    chunkedLongArray1.add((long)12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.size();
    java.lang.String str20 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    int i27 = chunkedLongArray15.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long29 = chunkedLongArray15.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.add((long)11);
    chunkedLongArray1.set((int)(byte)10, (long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add((long)(short)-1);
    chunkedLongArray1.set(33, (long)(short)0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    chunkedLongArray1.set((int)'#', (long)100);
    int i9 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 36);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    int i7 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)10);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)' ', (long)0);
    java.lang.String str9 = chunkedLongArray3.toString();
    int i10 = chunkedLongArray3.capacity();
    long[] long_array17 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray3.set(long_array17, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array17, (-1), (int)'4', 33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)20);
    java.lang.String str17 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    long long15 = chunkedLongArray3.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');
    int i2 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    int i12 = chunkedLongArray6.size();
    chunkedLongArray4.set(chunkedLongArray6, (int)'#', (int)(byte)0, 0);
    chunkedLongArray6.set((int)(short)10, (long)10);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray6, (int)' ', 98, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(101);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    int i10 = chunkedLongArray9.capacity();
    chunkedLongArray9.set((int)(byte)0, (long)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)1, 98, 36);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray35, (int)(short)0, (int)(short)1, (-1));
    long[] long_array50 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray35.set(long_array50, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array50, 11, (int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    chunkedLongArray1.set((int)'#', (long)100);
    int i9 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long11 = chunkedLongArray1.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 36);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long8 = chunkedLongArray1.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray1.toString();
    int i28 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray20.set((int)(short)10, (long)10);
    java.lang.String str34 = chunkedLongArray20.toString();
    chunkedLongArray20.add(10L);
    chunkedLongArray20.sort();
    ChunkedLongArray chunkedLongArray39 = new ChunkedLongArray(0);
    int i40 = chunkedLongArray39.capacity();
    chunkedLongArray39.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray39.sort();
    int i45 = chunkedLongArray39.capacity();
    ChunkedLongArray chunkedLongArray47 = new ChunkedLongArray(0);
    chunkedLongArray47.add(1L);
    chunkedLongArray47.sort();
    ChunkedLongArray chunkedLongArray52 = new ChunkedLongArray(0);
    chunkedLongArray52.add(1L);
    chunkedLongArray52.set((int)(short)10, (long)(short)1);
    chunkedLongArray47.set(chunkedLongArray52, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray63 = new ChunkedLongArray(0);
    chunkedLongArray63.add(1L);
    chunkedLongArray63.set((int)(short)10, (long)(short)1);
    chunkedLongArray47.set(chunkedLongArray63, (int)(short)0, (int)(short)1, (-1));
    long[] long_array78 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray63.set(long_array78, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray39.set(long_array78, 0, (int)(byte)100, (int)(short)0);
    chunkedLongArray20.set(long_array78, 1, (int)(short)1, 1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array78, (int)(byte)-1, 0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array78);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    chunkedLongArray1.set((int)(byte)0, (long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    int i6 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.add(0L);
    java.lang.String str10 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray(0);
    chunkedLongArray12.add(1L);
    chunkedLongArray12.set((int)' ', (long)0);
    java.lang.String str18 = chunkedLongArray12.toString();
    int i19 = chunkedLongArray12.capacity();
    long[] long_array26 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray12.set(long_array26, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array26, (int)(byte)0, 35, 53);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(3 entries, 3 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(3 entries, 3 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    chunkedLongArray1.sort();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');
    int i2 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(53);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.sort();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray14, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray25, (int)(short)0, (int)(short)1, (-1));
    long[] long_array40 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray25.set(long_array40, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray1.set(long_array40, 0, (int)(byte)100, (int)(short)0);
    ChunkedLongArray chunkedLongArray50 = new ChunkedLongArray(0);
    chunkedLongArray50.add(1L);
    chunkedLongArray50.set((int)(short)10, (long)(short)1);
    java.lang.String str56 = chunkedLongArray50.toString();
    int i57 = chunkedLongArray50.capacity();
    chunkedLongArray1.set(chunkedLongArray50, 100, (int)(byte)10, (-1));
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((-1), (long)11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str56.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.set(35, 0L);
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(2);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray8, 101, (int)(byte)100, 36);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    long long19 = chunkedLongArray3.get((int)(short)10);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.sort();
    chunkedLongArray21.sort();
    int i26 = chunkedLongArray21.size();
    chunkedLongArray21.add(0L);
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)(short)10, (long)(short)1);
    int i39 = chunkedLongArray33.size();
    chunkedLongArray31.set(chunkedLongArray33, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray45 = new ChunkedLongArray(0);
    chunkedLongArray45.add(1L);
    chunkedLongArray45.sort();
    chunkedLongArray45.sort();
    int i50 = chunkedLongArray45.size();
    chunkedLongArray45.sort();
    chunkedLongArray33.set(chunkedLongArray45, 100, 11, (int)(byte)0);
    chunkedLongArray45.sort();
    ChunkedLongArray chunkedLongArray58 = new ChunkedLongArray(0);
    chunkedLongArray58.add(1L);
    chunkedLongArray58.set((int)' ', (long)0);
    java.lang.String str64 = chunkedLongArray58.toString();
    int i65 = chunkedLongArray58.capacity();
    long[] long_array72 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray58.set(long_array72, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray45.set(long_array72, (int)'4', 0, (int)(short)0);
    chunkedLongArray21.set(long_array72, 21, 0, (int)(short)0);
    chunkedLongArray3.set(long_array72, (int)(byte)1, 12, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str64.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array72);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)' ', (long)0);
    java.lang.String str33 = chunkedLongArray27.toString();
    int i34 = chunkedLongArray27.capacity();
    java.lang.String str35 = chunkedLongArray27.toString();
    int i36 = chunkedLongArray27.capacity();
    chunkedLongArray27.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray(0);
    chunkedLongArray41.add(1L);
    chunkedLongArray41.sort();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)(short)10, (long)(short)1);
    chunkedLongArray41.set(chunkedLongArray46, 1, (-1), (int)(byte)-1);
    int i56 = chunkedLongArray46.size();
    int i57 = chunkedLongArray46.size();
    ChunkedLongArray chunkedLongArray59 = new ChunkedLongArray(0);
    chunkedLongArray59.add(1L);
    chunkedLongArray59.set((int)' ', (long)0);
    java.lang.String str65 = chunkedLongArray59.toString();
    int i66 = chunkedLongArray59.size();
    chunkedLongArray46.set(chunkedLongArray59, 20, (int)' ', (int)(byte)10);
    long long72 = chunkedLongArray59.get((int)(short)10);
    chunkedLongArray27.set(chunkedLongArray59, (int)(short)0, (int)(byte)100, 10);
    chunkedLongArray3.set(chunkedLongArray59, 20, (int)'#', (int)(short)-1);
    int i81 = chunkedLongArray59.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str33.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str65.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 33);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    int i20 = chunkedLongArray19.capacity();
    chunkedLongArray19.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray19.sort();
    int i25 = chunkedLongArray19.capacity();
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.sort();
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray(0);
    chunkedLongArray32.add(1L);
    chunkedLongArray32.set((int)(short)10, (long)(short)1);
    chunkedLongArray27.set(chunkedLongArray32, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray43 = new ChunkedLongArray(0);
    chunkedLongArray43.add(1L);
    chunkedLongArray43.set((int)(short)10, (long)(short)1);
    chunkedLongArray27.set(chunkedLongArray43, (int)(short)0, (int)(short)1, (-1));
    long[] long_array58 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray43.set(long_array58, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray19.set(long_array58, 0, (int)(byte)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array58, 21, (int)'a', 21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array58);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    chunkedLongArray1.set((int)(short)0, (long)2);
    int i33 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 101);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(35);
    chunkedLongArray1.sort();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)10);
    chunkedLongArray1.sort();
    int i3 = chunkedLongArray1.size();
    int i4 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.sort();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray14, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray25, (int)(short)0, (int)(short)1, (-1));
    long[] long_array40 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray25.set(long_array40, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray1.set(long_array40, 0, (int)(byte)100, (int)(short)0);
    int i49 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long51 = chunkedLongArray1.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    java.lang.String str2 = chunkedLongArray1.toString();
    java.lang.String str3 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str3.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    java.lang.String str20 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.size();
    int i20 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)(byte)-1);
    chunkedLongArray3.add((long)12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.sort();
    java.lang.String str15 = chunkedLongArray3.toString();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.size();
    chunkedLongArray1.set(20, (long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.sort();
    java.lang.String str15 = chunkedLongArray3.toString();
    int i16 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)20);
    int i17 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long56 = chunkedLongArray21.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    int i18 = chunkedLongArray6.capacity();
    chunkedLongArray6.sort();
    java.lang.String str20 = chunkedLongArray6.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long22 = chunkedLongArray6.get(101);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.sort();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    chunkedLongArray17.set(0, 100L);
    chunkedLongArray17.sort();
    int i32 = chunkedLongArray17.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 11);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    chunkedLongArray1.add(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    int i27 = chunkedLongArray15.capacity();
    chunkedLongArray15.add((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    java.lang.String str30 = chunkedLongArray18.toString();
    int i31 = chunkedLongArray18.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str30.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 33);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    chunkedLongArray1.add(10L);
    chunkedLongArray1.add((long)(short)100);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    chunkedLongArray6.add(0L);
    // The following exception was thrown during execution in test generation
    try {
    long long21 = chunkedLongArray6.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)100, (int)(short)-1, (int)(byte)-1);
    chunkedLongArray9.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.capacity();
    int i4 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray((int)'a');
    chunkedLongArray1.set(chunkedLongArray3, (int)(short)10, 2, (-1));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray15.set((int)(short)10, (long)10);
    java.lang.String str29 = chunkedLongArray15.toString();
    int i30 = chunkedLongArray15.capacity();
    chunkedLongArray1.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(byte)0);
    long long36 = chunkedLongArray1.get(21);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    int i46 = chunkedLongArray40.size();
    chunkedLongArray38.set(chunkedLongArray40, (int)'#', (int)(byte)0, 0);
    long long52 = chunkedLongArray40.get((int)(byte)0);
    int i53 = chunkedLongArray40.capacity();
    java.lang.String str54 = chunkedLongArray40.toString();
    chunkedLongArray1.set(chunkedLongArray40, 10, (int)(byte)100, (int)(short)-1);
    chunkedLongArray40.set(0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long52 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str54.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray(0);
    chunkedLongArray4.add(1L);
    chunkedLongArray4.set((int)(short)10, (long)(short)1);
    java.lang.String str10 = chunkedLongArray4.toString();
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    int i20 = chunkedLongArray14.size();
    chunkedLongArray12.set(chunkedLongArray14, (int)'#', (int)(byte)0, 0);
    chunkedLongArray14.set((int)(short)10, (long)10);
    java.lang.String str28 = chunkedLongArray14.toString();
    int i29 = chunkedLongArray14.capacity();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.set((int)(short)10, (long)(short)1);
    int i37 = chunkedLongArray31.size();
    int i38 = chunkedLongArray31.size();
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)' ', (long)0);
    java.lang.String str46 = chunkedLongArray40.toString();
    int i47 = chunkedLongArray40.capacity();
    long[] long_array54 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray40.set(long_array54, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray31.set(long_array54, 10, 20, (int)(byte)-1);
    chunkedLongArray14.set(long_array54, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray4.set(long_array54, (int)(byte)0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array54, (int)'4', 36, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str28.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str46.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array54);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    int i27 = chunkedLongArray15.capacity();
    ChunkedLongArray chunkedLongArray29 = new ChunkedLongArray(0);
    chunkedLongArray29.add(1L);
    chunkedLongArray29.sort();
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    chunkedLongArray29.set(chunkedLongArray34, 1, (-1), (int)(byte)-1);
    int i44 = chunkedLongArray29.size();
    chunkedLongArray15.set(chunkedLongArray29, 0, (int)' ', 0);
    ChunkedLongArray chunkedLongArray50 = new ChunkedLongArray(0);
    chunkedLongArray50.add(1L);
    chunkedLongArray50.set((int)' ', (long)0);
    java.lang.String str56 = chunkedLongArray50.toString();
    int i57 = chunkedLongArray50.capacity();
    long[] long_array64 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray50.set(long_array64, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray15.set(long_array64, (int)(byte)0, 98, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str56.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array64);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    chunkedLongArray1.set((int)' ', 0L);
    chunkedLongArray1.sort();

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)-1);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    int i4 = chunkedLongArray3.capacity();
    chunkedLongArray3.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray3.sort();
    int i9 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.sort();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray(0);
    chunkedLongArray16.add(1L);
    chunkedLongArray16.set((int)(short)10, (long)(short)1);
    chunkedLongArray11.set(chunkedLongArray16, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)(short)10, (long)(short)1);
    chunkedLongArray11.set(chunkedLongArray27, (int)(short)0, (int)(short)1, (-1));
    long[] long_array42 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray27.set(long_array42, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray3.set(long_array42, 0, (int)(byte)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array42, (int)(short)0, 10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array42);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    // The following exception was thrown during execution in test generation
    try {
    long long92 = chunkedLongArray34.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i11 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(short)-1, (long)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    int i27 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray((int)(byte)100);
    chunkedLongArray1.set(chunkedLongArray6, (int)(byte)-1, (-1), (int)(short)0);
    chunkedLongArray1.sort();
    int i12 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray24, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray19.set(chunkedLongArray35, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str45 = chunkedLongArray35.toString();
    chunkedLongArray35.set(0, 100L);
    chunkedLongArray3.set(chunkedLongArray35, (int)(short)10, (int)' ', (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str45.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    int i18 = chunkedLongArray6.capacity();
    chunkedLongArray6.sort();
    java.lang.String str20 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray((int)(byte)1);
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.sort();
    chunkedLongArray24.sort();
    int i29 = chunkedLongArray24.size();
    chunkedLongArray24.add(0L);
    chunkedLongArray24.sort();
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    int i42 = chunkedLongArray36.size();
    chunkedLongArray34.set(chunkedLongArray36, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray48 = new ChunkedLongArray(0);
    chunkedLongArray48.add(1L);
    chunkedLongArray48.sort();
    chunkedLongArray48.sort();
    int i53 = chunkedLongArray48.size();
    chunkedLongArray48.sort();
    chunkedLongArray36.set(chunkedLongArray48, 100, 11, (int)(byte)0);
    chunkedLongArray48.sort();
    ChunkedLongArray chunkedLongArray61 = new ChunkedLongArray(0);
    chunkedLongArray61.add(1L);
    chunkedLongArray61.set((int)' ', (long)0);
    java.lang.String str67 = chunkedLongArray61.toString();
    int i68 = chunkedLongArray61.capacity();
    long[] long_array75 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray61.set(long_array75, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray48.set(long_array75, (int)'4', 0, (int)(short)0);
    chunkedLongArray24.set(long_array75, 21, 0, (int)(short)0);
    chunkedLongArray22.set(long_array75, 100, 10, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array75, (int)(byte)-1, 35, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str67.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array75);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)(short)0);
    int i24 = chunkedLongArray3.size();
    int i25 = chunkedLongArray3.size();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 11);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.set((int)(short)1, (long)(short)0);
    chunkedLongArray17.add((long)101);
    java.lang.String str32 = chunkedLongArray17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str32.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    // The following exception was thrown during execution in test generation
    try {
    long long6 = chunkedLongArray1.get(33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    int i55 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 101);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray(0);
    chunkedLongArray8.add(1L);
    chunkedLongArray8.set((int)(short)10, (long)(short)1);
    java.lang.String str14 = chunkedLongArray8.toString();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    int i24 = chunkedLongArray18.size();
    chunkedLongArray16.set(chunkedLongArray18, (int)'#', (int)(byte)0, 0);
    chunkedLongArray18.set((int)(short)10, (long)10);
    java.lang.String str32 = chunkedLongArray18.toString();
    int i33 = chunkedLongArray18.capacity();
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    int i41 = chunkedLongArray35.size();
    int i42 = chunkedLongArray35.size();
    ChunkedLongArray chunkedLongArray44 = new ChunkedLongArray(0);
    chunkedLongArray44.add(1L);
    chunkedLongArray44.set((int)' ', (long)0);
    java.lang.String str50 = chunkedLongArray44.toString();
    int i51 = chunkedLongArray44.capacity();
    long[] long_array58 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray44.set(long_array58, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray35.set(long_array58, 10, 20, (int)(byte)-1);
    chunkedLongArray18.set(long_array58, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray8.set(long_array58, (int)(byte)0, (int)'a', 0);
    chunkedLongArray1.set(long_array58, 0, 35, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str32.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array58);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    chunkedLongArray1.set((int)'#', (long)100);
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray1.get(98);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.size();
    int i20 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)(byte)-1);
    chunkedLongArray3.add(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    int i91 = chunkedLongArray19.capacity();
    int i92 = chunkedLongArray19.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 33);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    java.lang.String str24 = chunkedLongArray18.toString();
    chunkedLongArray6.set(chunkedLongArray18, (int)(short)0, 20, 0);
    chunkedLongArray6.sort();
    long long31 = chunkedLongArray6.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 0L);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    long long18 = chunkedLongArray3.get((int)(short)1);
    java.lang.String str19 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get(34);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(34);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.set((int)(byte)1, (long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    java.lang.String str9 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    int i17 = chunkedLongArray1.size();
    int i18 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray(0);
    chunkedLongArray23.add(1L);
    chunkedLongArray23.set((int)(short)10, (long)(short)1);
    int i29 = chunkedLongArray23.size();
    chunkedLongArray21.set(chunkedLongArray23, (int)'#', (int)(byte)0, 0);
    chunkedLongArray23.set((int)(short)10, (long)10);
    java.lang.String str37 = chunkedLongArray23.toString();
    chunkedLongArray23.add(10L);
    chunkedLongArray23.sort();
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    int i43 = chunkedLongArray42.capacity();
    chunkedLongArray42.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray42.sort();
    int i48 = chunkedLongArray42.capacity();
    ChunkedLongArray chunkedLongArray50 = new ChunkedLongArray(0);
    chunkedLongArray50.add(1L);
    chunkedLongArray50.sort();
    ChunkedLongArray chunkedLongArray55 = new ChunkedLongArray(0);
    chunkedLongArray55.add(1L);
    chunkedLongArray55.set((int)(short)10, (long)(short)1);
    chunkedLongArray50.set(chunkedLongArray55, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray66 = new ChunkedLongArray(0);
    chunkedLongArray66.add(1L);
    chunkedLongArray66.set((int)(short)10, (long)(short)1);
    chunkedLongArray50.set(chunkedLongArray66, (int)(short)0, (int)(short)1, (-1));
    long[] long_array81 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray66.set(long_array81, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray42.set(long_array81, 0, (int)(byte)100, (int)(short)0);
    chunkedLongArray23.set(long_array81, 1, (int)(short)1, 1);
    chunkedLongArray1.set(long_array81, 98, 2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array81);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(98);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray15.set((int)(short)10, (long)10);
    java.lang.String str29 = chunkedLongArray15.toString();
    int i30 = chunkedLongArray15.capacity();
    chunkedLongArray1.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(byte)0);
    long long36 = chunkedLongArray1.get(21);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    int i46 = chunkedLongArray40.size();
    chunkedLongArray38.set(chunkedLongArray40, (int)'#', (int)(byte)0, 0);
    long long52 = chunkedLongArray40.get((int)(byte)0);
    int i53 = chunkedLongArray40.capacity();
    java.lang.String str54 = chunkedLongArray40.toString();
    chunkedLongArray1.set(chunkedLongArray40, 10, (int)(byte)100, (int)(short)-1);
    java.lang.String str59 = chunkedLongArray40.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long52 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str54.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str59.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    chunkedLongArray6.sort();
    int i17 = chunkedLongArray6.capacity();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.capacity();
    long[] long_array33 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray19.set(long_array33, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array33, (int)(short)-1, (-1), 33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array33);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    chunkedLongArray1.add((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    java.lang.String str24 = chunkedLongArray18.toString();
    chunkedLongArray6.set(chunkedLongArray18, (int)(short)0, 20, 0);
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set((int)' ', (long)0);
    java.lang.String str36 = chunkedLongArray30.toString();
    int i37 = chunkedLongArray30.capacity();
    long[] long_array44 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray30.set(long_array44, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray6.set(long_array44, 34, 100, 0);
    chunkedLongArray6.set(10, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str36.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array44);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)(short)10, (long)(short)1);
    int i27 = chunkedLongArray21.size();
    chunkedLongArray19.set(chunkedLongArray21, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.sort();
    chunkedLongArray33.sort();
    int i38 = chunkedLongArray33.size();
    chunkedLongArray33.sort();
    chunkedLongArray21.set(chunkedLongArray33, 100, 11, (int)(byte)0);
    chunkedLongArray33.sort();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)' ', (long)0);
    java.lang.String str52 = chunkedLongArray46.toString();
    int i53 = chunkedLongArray46.capacity();
    long[] long_array60 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray46.set(long_array60, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray33.set(long_array60, (int)'4', 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array60, (int)'4', (int)(byte)100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str52.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array60);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'#');
    chunkedLongArray1.set(35, (long)53);
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    int i15 = chunkedLongArray14.capacity();
    chunkedLongArray14.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray14.sort();
    int i20 = chunkedLongArray14.capacity();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray(0);
    chunkedLongArray22.add(1L);
    chunkedLongArray22.sort();
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)(short)10, (long)(short)1);
    chunkedLongArray22.set(chunkedLongArray27, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray(0);
    chunkedLongArray38.add(1L);
    chunkedLongArray38.set((int)(short)10, (long)(short)1);
    chunkedLongArray22.set(chunkedLongArray38, (int)(short)0, (int)(short)1, (-1));
    long[] long_array53 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray38.set(long_array53, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray14.set(long_array53, 0, (int)(byte)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array53, (int)(byte)100, (int)(short)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array53);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray3.size();
    // The following exception was thrown during execution in test generation
    try {
    long long16 = chunkedLongArray3.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)(byte)-1);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray13.set((int)(short)100, (long)'#');
    chunkedLongArray13.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)' ', (long)0);
    java.lang.String str39 = chunkedLongArray33.toString();
    int i40 = chunkedLongArray33.capacity();
    chunkedLongArray33.sort();
    ChunkedLongArray chunkedLongArray43 = new ChunkedLongArray(0);
    chunkedLongArray43.add(1L);
    chunkedLongArray43.sort();
    ChunkedLongArray chunkedLongArray48 = new ChunkedLongArray(0);
    chunkedLongArray48.add(1L);
    chunkedLongArray48.set((int)(short)10, (long)(short)1);
    chunkedLongArray43.set(chunkedLongArray48, 1, (-1), (int)(byte)-1);
    chunkedLongArray33.set(chunkedLongArray48, (int)(short)0, 0, 0);
    java.lang.String str62 = chunkedLongArray33.toString();
    chunkedLongArray13.set(chunkedLongArray33, 11, 33, (int)(byte)-1);
    java.lang.String str67 = chunkedLongArray13.toString();
    chunkedLongArray1.set(chunkedLongArray13, (int)'4', 33, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str62.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "ChunkedLongArray(101 entries, 101 chunks, 0MB)"+ "'", str67.equals("ChunkedLongArray(101 entries, 101 chunks, 0MB)"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    chunkedLongArray34.add((long)53);
    java.lang.String str93 = chunkedLongArray34.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "ChunkedLongArray(12 entries, 35 chunks, 0MB)"+ "'", str93.equals("ChunkedLongArray(12 entries, 35 chunks, 0MB)"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray15.set((int)(short)10, (long)10);
    java.lang.String str29 = chunkedLongArray15.toString();
    int i30 = chunkedLongArray15.capacity();
    chunkedLongArray1.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(byte)0);
    int i35 = chunkedLongArray15.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long25 = chunkedLongArray3.get(98);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    int i6 = chunkedLongArray1.size();
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(21 entries, 21 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(21 entries, 21 chunks, 0MB)"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    chunkedLongArray3.add(10L);
    int i19 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 12);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    chunkedLongArray17.set(0, 100L);
    long long32 = chunkedLongArray17.get((int)(byte)0);
    chunkedLongArray17.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 100L);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    java.lang.String str10 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray(0);
    int i13 = chunkedLongArray12.capacity();
    chunkedLongArray12.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray12.sort();
    int i18 = chunkedLongArray12.capacity();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.sort();
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray20.set(chunkedLongArray25, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray20.set(chunkedLongArray36, (int)(short)0, (int)(short)1, (-1));
    long[] long_array51 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray36.set(long_array51, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray12.set(long_array51, 0, (int)(byte)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array51, 1, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    java.lang.String str30 = chunkedLongArray18.toString();
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    long long46 = chunkedLongArray34.get((int)(byte)0);
    int i47 = chunkedLongArray34.capacity();
    int i48 = chunkedLongArray34.capacity();
    int i49 = chunkedLongArray34.size();
    chunkedLongArray18.set(chunkedLongArray34, 21, 0, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str30.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray1.add((long)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long23 = chunkedLongArray1.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    int i9 = chunkedLongArray1.capacity();
    java.lang.String str10 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)1);
    int i13 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    int i16 = chunkedLongArray15.capacity();
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray15, 1, 36, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    int i17 = chunkedLongArray3.capacity();
    java.lang.String str18 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray15.set((int)(short)10, (long)10);
    java.lang.String str29 = chunkedLongArray15.toString();
    int i30 = chunkedLongArray15.capacity();
    chunkedLongArray1.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(byte)0);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray();
    int i36 = chunkedLongArray35.capacity();
    java.lang.String str37 = chunkedLongArray35.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray15.set(chunkedLongArray35, 33, 101, 36);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)20);
    chunkedLongArray3.sort();
    chunkedLongArray3.add((long)10);
    ChunkedLongArray chunkedLongArray26 = new ChunkedLongArray(1);
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)' ', (long)0);
    java.lang.String str34 = chunkedLongArray28.toString();
    int i35 = chunkedLongArray28.capacity();
    long[] long_array42 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray28.set(long_array42, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray26.set(long_array42, 1, (int)(short)100, 1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array42, (-1), 36, 12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array42);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    int i28 = chunkedLongArray17.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.add((long)(byte)-1);
    chunkedLongArray3.set(0, (long)(-1));
    chunkedLongArray3.add((long)12);
    int i28 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 13);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray1.add((long)(byte)-1);
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)20);
    int i25 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)36);
    java.lang.String str28 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "ChunkedLongArray(36 entries, 36 chunks, 0MB)"+ "'", str28.equals("ChunkedLongArray(36 entries, 36 chunks, 0MB)"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    java.lang.String str27 = chunkedLongArray15.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long29 = chunkedLongArray15.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    chunkedLongArray1.set(10, (long)21);
    java.lang.String str5 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str5.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)36);
    // The following exception was thrown during execution in test generation
    try {
    long long6 = chunkedLongArray1.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray((int)(byte)1);
    int i10 = chunkedLongArray9.size();
    chunkedLongArray9.add((long)36);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, (int)(byte)10, 0, 53);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    long long32 = chunkedLongArray19.get((int)(short)10);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    int i35 = chunkedLongArray34.capacity();
    chunkedLongArray34.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray34.sort();
    int i40 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    chunkedLongArray42.add(1L);
    chunkedLongArray42.sort();
    ChunkedLongArray chunkedLongArray47 = new ChunkedLongArray(0);
    chunkedLongArray47.add(1L);
    chunkedLongArray47.set((int)(short)10, (long)(short)1);
    chunkedLongArray42.set(chunkedLongArray47, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray58 = new ChunkedLongArray(0);
    chunkedLongArray58.add(1L);
    chunkedLongArray58.set((int)(short)10, (long)(short)1);
    chunkedLongArray42.set(chunkedLongArray58, (int)(short)0, (int)(short)1, (-1));
    long[] long_array73 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray58.set(long_array73, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray34.set(long_array73, 0, (int)(byte)100, (int)(short)0);
    chunkedLongArray19.set(long_array73, 21, (int)(short)1, (int)(byte)0);
    chunkedLongArray19.sort();
    chunkedLongArray19.set((int)(byte)100, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array73);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    int i18 = chunkedLongArray6.capacity();
    chunkedLongArray6.sort();
    int i20 = chunkedLongArray6.size();
    int i21 = chunkedLongArray6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    java.lang.String str10 = chunkedLongArray1.toString();
    chunkedLongArray1.set(21, (long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    int i8 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray(0);
    chunkedLongArray10.add(1L);
    chunkedLongArray10.set((int)' ', (long)0);
    java.lang.String str16 = chunkedLongArray10.toString();
    int i17 = chunkedLongArray10.size();
    int i18 = chunkedLongArray10.capacity();
    java.lang.String str19 = chunkedLongArray10.toString();
    chunkedLongArray10.add((long)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray10, 0, 98, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    int i28 = chunkedLongArray17.size();
    int i29 = chunkedLongArray17.size();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.set(1, (long)(byte)0);
    java.lang.String str37 = chunkedLongArray31.toString();
    int i38 = chunkedLongArray31.size();
    long[] long_array44 = new long[] { (byte)10, ' ', 1, (short)10, (-1) };
    chunkedLongArray31.set(long_array44, 10, (-1), 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray17.set(long_array44, 1, 13, 33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array44);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)' ', (long)0);
    java.lang.String str34 = chunkedLongArray28.toString();
    int i35 = chunkedLongArray28.capacity();
    long[] long_array42 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray28.set(long_array42, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray15.set(long_array42, (int)'4', 0, (int)(short)0);
    chunkedLongArray15.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array42);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    int i9 = chunkedLongArray1.capacity();
    java.lang.String str10 = chunkedLongArray1.toString();
    int i11 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 33);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    int i55 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 101);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)(short)0);
    java.lang.String str24 = chunkedLongArray3.toString();
    int i25 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 11);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    java.lang.String str6 = chunkedLongArray1.toString();
    int i7 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str6.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.add((long)0);
    chunkedLongArray6.set((int)(byte)10, (long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    chunkedLongArray6.add(0L);
    chunkedLongArray6.set(0, (long)10);
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.sort();
    ChunkedLongArray chunkedLongArray29 = new ChunkedLongArray(0);
    chunkedLongArray29.add(1L);
    chunkedLongArray29.set((int)(short)10, (long)(short)1);
    chunkedLongArray24.set(chunkedLongArray29, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    chunkedLongArray24.set(chunkedLongArray40, (int)(short)0, (int)(short)1, (-1));
    long[] long_array55 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray40.set(long_array55, (int)' ', (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array55, (int)'4', (int)'#', 34);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array55);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    java.lang.String str35 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray1.add((long)(byte)-1);
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)20);
    int i25 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)36);
    chunkedLongArray1.add((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    int i12 = chunkedLongArray1.size();
    java.lang.String str13 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ChunkedLongArray(98 entries, 98 chunks, 0MB)"+ "'", str13.equals("ChunkedLongArray(98 entries, 98 chunks, 0MB)"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)' ', (long)0);
    java.lang.String str33 = chunkedLongArray27.toString();
    int i34 = chunkedLongArray27.capacity();
    java.lang.String str35 = chunkedLongArray27.toString();
    int i36 = chunkedLongArray27.capacity();
    chunkedLongArray27.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray(0);
    chunkedLongArray41.add(1L);
    chunkedLongArray41.sort();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)(short)10, (long)(short)1);
    chunkedLongArray41.set(chunkedLongArray46, 1, (-1), (int)(byte)-1);
    int i56 = chunkedLongArray46.size();
    int i57 = chunkedLongArray46.size();
    ChunkedLongArray chunkedLongArray59 = new ChunkedLongArray(0);
    chunkedLongArray59.add(1L);
    chunkedLongArray59.set((int)' ', (long)0);
    java.lang.String str65 = chunkedLongArray59.toString();
    int i66 = chunkedLongArray59.size();
    chunkedLongArray46.set(chunkedLongArray59, 20, (int)' ', (int)(byte)10);
    long long72 = chunkedLongArray59.get((int)(short)10);
    chunkedLongArray27.set(chunkedLongArray59, (int)(short)0, (int)(byte)100, 10);
    chunkedLongArray3.set(chunkedLongArray59, 20, (int)'#', (int)(short)-1);
    int i81 = chunkedLongArray3.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str33.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str65.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 11);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray(0);
    chunkedLongArray13.add(1L);
    chunkedLongArray13.set((int)(short)10, (long)(short)1);
    int i19 = chunkedLongArray13.size();
    chunkedLongArray11.set(chunkedLongArray13, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.sort();
    chunkedLongArray25.sort();
    int i30 = chunkedLongArray25.size();
    chunkedLongArray25.sort();
    chunkedLongArray13.set(chunkedLongArray25, 100, 11, (int)(byte)0);
    chunkedLongArray25.sort();
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray(0);
    chunkedLongArray38.add(1L);
    chunkedLongArray38.set((int)' ', (long)0);
    java.lang.String str44 = chunkedLongArray38.toString();
    int i45 = chunkedLongArray38.capacity();
    long[] long_array52 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray38.set(long_array52, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray25.set(long_array52, (int)'4', 0, (int)(short)0);
    chunkedLongArray1.set(long_array52, 21, 0, (int)(short)0);
    int i65 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str44.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 2);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(12);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    chunkedLongArray1.add(10L);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray(0);
    chunkedLongArray5.add(1L);
    chunkedLongArray5.set((int)(short)10, (long)(short)1);
    int i11 = chunkedLongArray5.size();
    int i12 = chunkedLongArray5.size();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)' ', (long)0);
    java.lang.String str20 = chunkedLongArray14.toString();
    int i21 = chunkedLongArray14.capacity();
    long[] long_array28 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray14.set(long_array28, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray5.set(long_array28, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array28, (int)(short)100, 11, 21);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.sort();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray(0);
    chunkedLongArray16.add(1L);
    chunkedLongArray16.set((int)(short)10, (long)(short)1);
    chunkedLongArray11.set(chunkedLongArray16, 1, (-1), (int)(byte)-1);
    chunkedLongArray1.set(chunkedLongArray16, (int)(short)0, 0, 0);
    chunkedLongArray16.add((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    int i7 = chunkedLongArray1.size();
    int i8 = chunkedLongArray1.size();
    java.lang.String str9 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.sort();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray(0);
    chunkedLongArray16.add(1L);
    chunkedLongArray16.set((int)(short)10, (long)(short)1);
    chunkedLongArray11.set(chunkedLongArray16, 1, (-1), (int)(byte)-1);
    int i26 = chunkedLongArray16.size();
    chunkedLongArray16.sort();
    chunkedLongArray16.add(0L);
    chunkedLongArray16.set(0, (long)10);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray16, (-1), 100, 13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    chunkedLongArray3.add(10L);
    chunkedLongArray3.sort();
    chunkedLongArray3.set((int)(short)0, (long)36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    int i12 = chunkedLongArray9.capacity();
    chunkedLongArray1.set(chunkedLongArray9, 0, 0, (int)(byte)1);
    chunkedLongArray1.set(11, (long)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    long long21 = chunkedLongArray1.get(37);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)' ', (long)0);
    java.lang.String str17 = chunkedLongArray11.toString();
    int i18 = chunkedLongArray11.capacity();
    java.lang.String str19 = chunkedLongArray11.toString();
    chunkedLongArray11.add((long)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray11, 11, 37, 101);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    int i8 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray1.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    int i7 = chunkedLongArray1.size();
    int i8 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray(0);
    chunkedLongArray10.add(1L);
    chunkedLongArray10.set((int)' ', (long)0);
    java.lang.String str16 = chunkedLongArray10.toString();
    int i17 = chunkedLongArray10.capacity();
    long[] long_array24 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray10.set(long_array24, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray1.set(long_array24, 10, 20, (int)(byte)-1);
    int i33 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 20);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.sort();
    int i10 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)(short)10, (long)(short)1);
    int i17 = chunkedLongArray11.size();
    chunkedLongArray9.set(chunkedLongArray11, (int)'#', (int)(byte)0, 0);
    chunkedLongArray11.set((int)(short)10, (long)10);
    java.lang.String str25 = chunkedLongArray11.toString();
    int i26 = chunkedLongArray11.capacity();
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)(short)10, (long)(short)1);
    int i34 = chunkedLongArray28.size();
    int i35 = chunkedLongArray28.size();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.set((int)' ', (long)0);
    java.lang.String str43 = chunkedLongArray37.toString();
    int i44 = chunkedLongArray37.capacity();
    long[] long_array51 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray37.set(long_array51, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray28.set(long_array51, 10, 20, (int)(byte)-1);
    chunkedLongArray11.set(long_array51, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray1.set(long_array51, (int)(byte)0, (int)'a', 0);
    chunkedLongArray1.set(11, (long)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str43.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray20.set((int)(short)10, (long)10);
    java.lang.String str34 = chunkedLongArray20.toString();
    int i35 = chunkedLongArray20.capacity();
    int i36 = chunkedLongArray20.size();
    int i37 = chunkedLongArray20.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray20, 36, 37, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 11);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    int i17 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray(0);
    chunkedLongArray23.add(1L);
    chunkedLongArray23.set((int)(short)10, (long)(short)1);
    int i29 = chunkedLongArray23.size();
    chunkedLongArray21.set(chunkedLongArray23, (int)'#', (int)(byte)0, 0);
    chunkedLongArray23.set((int)(short)10, (long)10);
    java.lang.String str37 = chunkedLongArray23.toString();
    int i38 = chunkedLongArray23.capacity();
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    int i46 = chunkedLongArray40.size();
    int i47 = chunkedLongArray40.size();
    ChunkedLongArray chunkedLongArray49 = new ChunkedLongArray(0);
    chunkedLongArray49.add(1L);
    chunkedLongArray49.set((int)' ', (long)0);
    java.lang.String str55 = chunkedLongArray49.toString();
    int i56 = chunkedLongArray49.capacity();
    long[] long_array63 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray49.set(long_array63, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray40.set(long_array63, 10, 20, (int)(byte)-1);
    chunkedLongArray23.set(long_array63, (-1), (int)'#', (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array63, 37, 12, 12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str37.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str55.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array63);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.set((int)(short)10, (long)(short)1);
    int i17 = chunkedLongArray11.size();
    chunkedLongArray9.set(chunkedLongArray11, (int)'#', (int)(byte)0, 0);
    chunkedLongArray11.set((int)(short)10, (long)10);
    java.lang.String str25 = chunkedLongArray11.toString();
    int i26 = chunkedLongArray11.capacity();
    ChunkedLongArray chunkedLongArray28 = new ChunkedLongArray(0);
    chunkedLongArray28.add(1L);
    chunkedLongArray28.set((int)(short)10, (long)(short)1);
    int i34 = chunkedLongArray28.size();
    int i35 = chunkedLongArray28.size();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.set((int)' ', (long)0);
    java.lang.String str43 = chunkedLongArray37.toString();
    int i44 = chunkedLongArray37.capacity();
    long[] long_array51 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray37.set(long_array51, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray28.set(long_array51, 10, 20, (int)(byte)-1);
    chunkedLongArray11.set(long_array51, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray1.set(long_array51, (int)(byte)0, (int)'a', 0);
    chunkedLongArray1.set(2, (long)2);
    int i71 = chunkedLongArray1.capacity();
    java.lang.String str72 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str43.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "ChunkedLongArray(11 entries, 98 chunks, 0MB)"+ "'", str72.equals("ChunkedLongArray(11 entries, 98 chunks, 0MB)"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    chunkedLongArray1.add(10L);
    chunkedLongArray1.sort();

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.add((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    chunkedLongArray1.add((long)'#');

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    int i7 = chunkedLongArray1.capacity();
    int i8 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    chunkedLongArray6.sort();
    chunkedLongArray6.add(0L);
    chunkedLongArray6.set(0, (long)10);
    int i23 = chunkedLongArray6.capacity();
    chunkedLongArray6.add((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 12);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    java.lang.String str55 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)10);
    java.lang.String str58 = chunkedLongArray1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long60 = chunkedLongArray1.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "ChunkedLongArray(101 entries, 101 chunks, 0MB)"+ "'", str55.equals("ChunkedLongArray(101 entries, 101 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "ChunkedLongArray(102 entries, 102 chunks, 0MB)"+ "'", str58.equals("ChunkedLongArray(102 entries, 102 chunks, 0MB)"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)20);
    chunkedLongArray3.sort();
    java.lang.String str23 = chunkedLongArray3.toString();
    int i24 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str23.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 12);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.capacity();
    chunkedLongArray1.add((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');
    chunkedLongArray1.sort();

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    chunkedLongArray3.add((long)33);
    int i37 = chunkedLongArray3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 12);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray(0);
    chunkedLongArray11.add(1L);
    chunkedLongArray11.sort();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray(0);
    chunkedLongArray16.add(1L);
    chunkedLongArray16.set((int)(short)10, (long)(short)1);
    chunkedLongArray11.set(chunkedLongArray16, 1, (-1), (int)(byte)-1);
    chunkedLongArray1.set(chunkedLongArray16, (int)(short)0, 0, 0);
    java.lang.String str30 = chunkedLongArray1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long32 = chunkedLongArray1.get(34);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str30.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.sort();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray(0);
    chunkedLongArray14.add(1L);
    chunkedLongArray14.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray14, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    chunkedLongArray9.set(chunkedLongArray25, (int)(short)0, (int)(short)1, (-1));
    long[] long_array40 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray25.set(long_array40, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray1.set(long_array40, 0, (int)(byte)100, (int)(short)0);
    ChunkedLongArray chunkedLongArray50 = new ChunkedLongArray(0);
    chunkedLongArray50.add(1L);
    chunkedLongArray50.set((int)(short)10, (long)(short)1);
    java.lang.String str56 = chunkedLongArray50.toString();
    int i57 = chunkedLongArray50.capacity();
    chunkedLongArray1.set(chunkedLongArray50, 100, (int)(byte)10, (-1));
    int i62 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray64 = new ChunkedLongArray(0);
    java.lang.String str65 = chunkedLongArray64.toString();
    int i66 = chunkedLongArray64.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray64, 101, 35, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str56.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str65.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get(35);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.capacity();
    chunkedLongArray1.set(53, (long)'#');
    java.lang.String str10 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(54 entries, 54 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(54 entries, 54 chunks, 0MB)"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    chunkedLongArray3.add((long)33);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    int i46 = chunkedLongArray40.size();
    chunkedLongArray38.set(chunkedLongArray40, (int)'#', (int)(byte)0, 0);
    chunkedLongArray40.set((int)'a', (long)(-1));
    chunkedLongArray3.set(chunkedLongArray40, (int)'4', 36, (int)(byte)-1);
    int i58 = chunkedLongArray3.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)(short)10, (long)(short)1);
    int i66 = chunkedLongArray60.size();
    int i67 = chunkedLongArray60.size();
    ChunkedLongArray chunkedLongArray69 = new ChunkedLongArray(0);
    chunkedLongArray69.add(1L);
    chunkedLongArray69.set((int)' ', (long)0);
    java.lang.String str75 = chunkedLongArray69.toString();
    int i76 = chunkedLongArray69.capacity();
    long[] long_array83 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray69.set(long_array83, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray60.set(long_array83, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array83, (int)' ', 11, 20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str75.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array83);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    java.lang.String str35 = chunkedLongArray20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    java.lang.String str17 = chunkedLongArray6.toString();
    chunkedLongArray6.sort();
    int i19 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    int i22 = chunkedLongArray21.capacity();
    chunkedLongArray21.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray21.sort();
    int i27 = chunkedLongArray21.capacity();
    ChunkedLongArray chunkedLongArray29 = new ChunkedLongArray(0);
    chunkedLongArray29.add(1L);
    chunkedLongArray29.sort();
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    chunkedLongArray29.set(chunkedLongArray34, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray45 = new ChunkedLongArray(0);
    chunkedLongArray45.add(1L);
    chunkedLongArray45.set((int)(short)10, (long)(short)1);
    chunkedLongArray29.set(chunkedLongArray45, (int)(short)0, (int)(short)1, (-1));
    long[] long_array60 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray45.set(long_array60, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray21.set(long_array60, 0, (int)(byte)100, (int)(short)0);
    ChunkedLongArray chunkedLongArray70 = new ChunkedLongArray(0);
    chunkedLongArray70.add(1L);
    chunkedLongArray70.set((int)(short)10, (long)(short)1);
    java.lang.String str76 = chunkedLongArray70.toString();
    int i77 = chunkedLongArray70.capacity();
    chunkedLongArray21.set(chunkedLongArray70, 100, (int)(byte)10, (-1));
    chunkedLongArray21.sort();
    chunkedLongArray6.set(chunkedLongArray21, 34, 20, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str76.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 11);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    chunkedLongArray1.add((long)0);
    int i4 = chunkedLongArray1.size();
    java.lang.String str5 = chunkedLongArray1.toString();
    int i6 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 16MB)"+ "'", str5.equals("ChunkedLongArray(1 entries, 1 chunks, 16MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2097152);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    chunkedLongArray1.sort();
    java.lang.String str31 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "ChunkedLongArray(101 entries, 101 chunks, 0MB)"+ "'", str31.equals("ChunkedLongArray(101 entries, 101 chunks, 0MB)"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.set(21, (long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    java.lang.String str91 = chunkedLongArray19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str91.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.set(20, (long)(short)-1);
    int i6 = chunkedLongArray1.size();
    java.lang.String str7 = chunkedLongArray1.toString();
    java.lang.String str8 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(21 entries, 21 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(21 entries, 21 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(21 entries, 21 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(21 entries, 21 chunks, 0MB)"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray(0);
    chunkedLongArray27.add(1L);
    chunkedLongArray27.set((int)' ', (long)0);
    java.lang.String str33 = chunkedLongArray27.toString();
    int i34 = chunkedLongArray27.capacity();
    java.lang.String str35 = chunkedLongArray27.toString();
    int i36 = chunkedLongArray27.capacity();
    chunkedLongArray27.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray(0);
    chunkedLongArray41.add(1L);
    chunkedLongArray41.sort();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)(short)10, (long)(short)1);
    chunkedLongArray41.set(chunkedLongArray46, 1, (-1), (int)(byte)-1);
    int i56 = chunkedLongArray46.size();
    int i57 = chunkedLongArray46.size();
    ChunkedLongArray chunkedLongArray59 = new ChunkedLongArray(0);
    chunkedLongArray59.add(1L);
    chunkedLongArray59.set((int)' ', (long)0);
    java.lang.String str65 = chunkedLongArray59.toString();
    int i66 = chunkedLongArray59.size();
    chunkedLongArray46.set(chunkedLongArray59, 20, (int)' ', (int)(byte)10);
    long long72 = chunkedLongArray59.get((int)(short)10);
    chunkedLongArray27.set(chunkedLongArray59, (int)(short)0, (int)(byte)100, 10);
    chunkedLongArray3.set(chunkedLongArray59, 20, (int)'#', (int)(short)-1);
    java.lang.String str81 = chunkedLongArray3.toString();
    chunkedLongArray3.add((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str33.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str65.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long72 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str81.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.capacity();
    chunkedLongArray3.sort();
    chunkedLongArray3.add((long)(byte)-1);
    chunkedLongArray3.set(0, (long)(-1));
    chunkedLongArray3.set((int)' ', (long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    java.lang.String str17 = chunkedLongArray6.toString();
    chunkedLongArray6.sort();
    int i19 = chunkedLongArray6.size();
    chunkedLongArray6.add(0L);
    chunkedLongArray6.add((long)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    int i12 = chunkedLongArray1.size();
    chunkedLongArray1.set(20, (long)37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 98);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)100, (int)(short)-1, (int)(byte)-1);
    int i20 = chunkedLongArray9.capacity();
    java.lang.String str21 = chunkedLongArray9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str21.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    java.lang.String str27 = chunkedLongArray17.toString();
    int i28 = chunkedLongArray17.size();
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set(1, (long)(byte)0);
    java.lang.String str36 = chunkedLongArray30.toString();
    int i37 = chunkedLongArray30.size();
    long[] long_array43 = new long[] { (byte)10, ' ', 1, (short)10, (-1) };
    chunkedLongArray30.set(long_array43, 10, (-1), 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray17.set(long_array43, 12, (int)(short)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str36.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.add(100L);
    int i6 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    long long32 = chunkedLongArray19.get((int)(short)10);
    chunkedLongArray19.add((long)(short)0);
    chunkedLongArray19.add((long)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 0L);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    chunkedLongArray1.set(2, (long)(short)1);
    int i13 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    long[] long_array32 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray17.set(long_array32, (int)' ', (int)' ', (int)(short)0);
    int i37 = chunkedLongArray17.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 11);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(53);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray6, 0, 0, 11);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    chunkedLongArray6.add(0L);
    chunkedLongArray6.set((int)'4', (long)(byte)0);
    int i23 = chunkedLongArray6.size();
    chunkedLongArray6.add((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 53);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    java.lang.String str17 = chunkedLongArray6.toString();
    chunkedLongArray6.sort();
    chunkedLongArray6.sort();
    chunkedLongArray6.add((long)(byte)1);
    java.lang.String str22 = chunkedLongArray6.toString();
    chunkedLongArray6.set((int)'a', (long)(short)100);
    ChunkedLongArray chunkedLongArray27 = new ChunkedLongArray((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(chunkedLongArray27, (int)(short)0, (int)(byte)-1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str22.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    int i12 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 33);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    java.lang.String str2 = chunkedLongArray0.toString();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray20.set((int)(short)10, (long)10);
    java.lang.String str34 = chunkedLongArray20.toString();
    int i35 = chunkedLongArray20.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray20, 33, (int)(byte)10, 12);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 11);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray(0);
    chunkedLongArray4.add(1L);
    chunkedLongArray4.set((int)' ', (long)0);
    java.lang.String str10 = chunkedLongArray4.toString();
    int i11 = chunkedLongArray4.capacity();
    long[] long_array18 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray4.set(long_array18, 100, (int)(byte)0, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array18, 21, 53, 37);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str10.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    int i17 = chunkedLongArray3.capacity();
    chunkedLongArray3.add((long)101);
    java.lang.String str20 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    long[] long_array14 = new long[] { (byte)10, ' ', 1, (short)10, (-1) };
    chunkedLongArray1.set(long_array14, 10, (-1), 0);
    chunkedLongArray1.add((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.capacity();
    int i8 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray1.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.sort();
    chunkedLongArray3.set(0, (long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.set(1, (long)21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(11);
    chunkedLongArray1.set(0, 0L);
    int i5 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    long long19 = chunkedLongArray3.get((int)(short)10);
    chunkedLongArray3.set(36, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1L);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    chunkedLongArray3.set(10, (long)'4');
    java.lang.String str22 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str22.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)100, (int)(short)-1, (int)(byte)-1);
    int i20 = chunkedLongArray9.capacity();
    chunkedLongArray9.set(1, (long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.add((long)53);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(byte)-1, (long)20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray((int)(byte)100);
    chunkedLongArray1.set(chunkedLongArray6, (int)(byte)-1, (-1), (int)(short)0);
    chunkedLongArray1.sort();
    java.lang.String str12 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str12.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    chunkedLongArray3.add(10L);
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray(0);
    int i23 = chunkedLongArray22.capacity();
    chunkedLongArray22.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray22.sort();
    int i28 = chunkedLongArray22.capacity();
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.sort();
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.set((int)(short)10, (long)(short)1);
    chunkedLongArray30.set(chunkedLongArray35, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray(0);
    chunkedLongArray46.add(1L);
    chunkedLongArray46.set((int)(short)10, (long)(short)1);
    chunkedLongArray30.set(chunkedLongArray46, (int)(short)0, (int)(short)1, (-1));
    long[] long_array61 = new long[] { 1L, '4', 100, 1L, (-1) };
    chunkedLongArray46.set(long_array61, (int)' ', (int)' ', (int)(short)0);
    chunkedLongArray22.set(long_array61, 0, (int)(byte)100, (int)(short)0);
    chunkedLongArray3.set(long_array61, 1, (int)(short)1, 1);
    java.lang.String str74 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str74.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    chunkedLongArray1.set(2, (long)(short)1);
    chunkedLongArray1.set((int)(byte)1, 1L);
    int i16 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    chunkedLongArray15.set(chunkedLongArray20, 1, (-1), (int)(byte)-1);
    int i30 = chunkedLongArray20.size();
    int i31 = chunkedLongArray20.size();
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)' ', (long)0);
    java.lang.String str39 = chunkedLongArray33.toString();
    int i40 = chunkedLongArray33.size();
    chunkedLongArray20.set(chunkedLongArray33, 20, (int)' ', (int)(byte)10);
    long long46 = chunkedLongArray33.get((int)(short)10);
    chunkedLongArray1.set(chunkedLongArray33, (int)(short)0, (int)(byte)100, 10);
    chunkedLongArray33.sort();
    ChunkedLongArray chunkedLongArray53 = new ChunkedLongArray(0);
    chunkedLongArray53.add(1L);
    chunkedLongArray53.set((int)(short)10, (long)(short)1);
    int i59 = chunkedLongArray53.size();
    int i60 = chunkedLongArray53.size();
    ChunkedLongArray chunkedLongArray62 = new ChunkedLongArray(0);
    chunkedLongArray62.add(1L);
    chunkedLongArray62.set((int)' ', (long)0);
    java.lang.String str68 = chunkedLongArray62.toString();
    int i69 = chunkedLongArray62.capacity();
    long[] long_array76 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray62.set(long_array76, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray53.set(long_array76, 10, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray33.set(long_array76, (int)(short)10, 20, 11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long46 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str68.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array76);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    int i14 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)20);
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.sort();
    chunkedLongArray18.add((long)12);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray18, (int)(short)100, 36, 53);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 11);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    int i14 = chunkedLongArray1.size();
    chunkedLongArray1.set(35, (long)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    chunkedLongArray6.add(0L);
    int i20 = chunkedLongArray6.size();
    int i21 = chunkedLongArray6.size();
    chunkedLongArray6.add((long)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)100);
    java.lang.String str2 = chunkedLongArray1.toString();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    int i19 = chunkedLongArray3.size();
    int i20 = chunkedLongArray3.capacity();
    int i21 = chunkedLongArray3.size();
    int i22 = chunkedLongArray3.capacity();
    chunkedLongArray3.set(100, (long)53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 11);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    java.lang.String str24 = chunkedLongArray18.toString();
    chunkedLongArray6.set(chunkedLongArray18, (int)(short)0, 20, 0);
    int i29 = chunkedLongArray6.capacity();
    int i30 = chunkedLongArray6.capacity();
    chunkedLongArray6.add((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    java.lang.String str5 = chunkedLongArray1.toString();
    int i6 = chunkedLongArray1.size();
    java.lang.String str7 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str5.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    java.lang.String str24 = chunkedLongArray18.toString();
    chunkedLongArray6.set(chunkedLongArray18, (int)(short)0, 20, 0);
    int i29 = chunkedLongArray6.capacity();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)' ', (long)0);
    java.lang.String str39 = chunkedLongArray33.toString();
    int i40 = chunkedLongArray33.capacity();
    long[] long_array47 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray33.set(long_array47, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray31.set(long_array47, 1, (int)(short)100, 1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray6.set(long_array47, (-1), (int)' ', 13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(10);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)100, (int)(short)-1, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray(0);
    chunkedLongArray23.add(1L);
    chunkedLongArray23.set((int)(short)10, (long)(short)1);
    int i29 = chunkedLongArray23.size();
    chunkedLongArray21.set(chunkedLongArray23, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(0);
    chunkedLongArray35.add(1L);
    chunkedLongArray35.sort();
    chunkedLongArray35.sort();
    int i40 = chunkedLongArray35.size();
    chunkedLongArray35.sort();
    chunkedLongArray23.set(chunkedLongArray35, 100, 11, (int)(byte)0);
    chunkedLongArray35.sort();
    ChunkedLongArray chunkedLongArray48 = new ChunkedLongArray(0);
    chunkedLongArray48.add(1L);
    chunkedLongArray48.set((int)' ', (long)0);
    java.lang.String str54 = chunkedLongArray48.toString();
    int i55 = chunkedLongArray48.capacity();
    long[] long_array62 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray48.set(long_array62, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray35.set(long_array62, (int)'4', 0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array62, 34, (int)'4', 12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str54.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array62);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.set(101, (long)37);
    int i29 = chunkedLongArray3.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 102);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    chunkedLongArray6.set((int)(short)100, 10L);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.add((long)'a');
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(1);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray(0);
    chunkedLongArray32.add(1L);
    chunkedLongArray32.set((int)' ', (long)0);
    java.lang.String str38 = chunkedLongArray32.toString();
    int i39 = chunkedLongArray32.capacity();
    long[] long_array46 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray32.set(long_array46, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray30.set(long_array46, 1, (int)(short)100, 1);
    chunkedLongArray3.set(long_array46, (int)(byte)0, 35, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str38.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array46);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.capacity();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    java.lang.String str21 = chunkedLongArray15.toString();
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray(0);
    chunkedLongArray25.add(1L);
    chunkedLongArray25.set((int)(short)10, (long)(short)1);
    int i31 = chunkedLongArray25.size();
    chunkedLongArray23.set(chunkedLongArray25, (int)'#', (int)(byte)0, 0);
    chunkedLongArray25.set((int)(short)10, (long)10);
    java.lang.String str39 = chunkedLongArray25.toString();
    int i40 = chunkedLongArray25.capacity();
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    chunkedLongArray42.add(1L);
    chunkedLongArray42.set((int)(short)10, (long)(short)1);
    int i48 = chunkedLongArray42.size();
    int i49 = chunkedLongArray42.size();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)' ', (long)0);
    java.lang.String str57 = chunkedLongArray51.toString();
    int i58 = chunkedLongArray51.capacity();
    long[] long_array65 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray51.set(long_array65, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray42.set(long_array65, 10, 20, (int)(byte)-1);
    chunkedLongArray25.set(long_array65, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray15.set(long_array65, (int)(byte)0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(long_array65, 0, 2, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str21.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str57.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array65);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.add((-1L));
    // The following exception was thrown during execution in test generation
    try {
    long long30 = chunkedLongArray3.get(102);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set(1, (long)(byte)0);
    int i15 = chunkedLongArray9.capacity();
    chunkedLongArray9.add((long)36);
    chunkedLongArray9.sort();
    chunkedLongArray1.set(chunkedLongArray9, 0, (int)(byte)-1, 0);
    ChunkedLongArray chunkedLongArray24 = new ChunkedLongArray(0);
    chunkedLongArray24.add(1L);
    chunkedLongArray24.set((int)(short)10, (long)(short)1);
    java.lang.String str30 = chunkedLongArray24.toString();
    chunkedLongArray24.set(98, (long)(short)10);
    java.lang.String str34 = chunkedLongArray24.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray9.set(chunkedLongArray24, (int)(short)10, (int)(short)0, 2097152);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str30.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(99 entries, 99 chunks, 0MB)"+ "'", str34.equals("ChunkedLongArray(99 entries, 99 chunks, 0MB)"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    chunkedLongArray1.set((int)(byte)1, (long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');
    java.lang.String str2 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    int i12 = chunkedLongArray6.size();
    chunkedLongArray4.set(chunkedLongArray6, (int)'#', (int)(byte)0, 0);
    long long18 = chunkedLongArray6.get((int)(byte)0);
    int i19 = chunkedLongArray6.capacity();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray23 = new ChunkedLongArray(0);
    chunkedLongArray23.add(1L);
    chunkedLongArray23.set((int)(short)10, (long)(short)1);
    int i29 = chunkedLongArray23.size();
    chunkedLongArray21.set(chunkedLongArray23, (int)'#', (int)(byte)0, 0);
    chunkedLongArray6.set(chunkedLongArray23, (int)'4', (int)(byte)1, (int)(byte)0);
    chunkedLongArray6.add((long)33);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray43 = new ChunkedLongArray(0);
    chunkedLongArray43.add(1L);
    chunkedLongArray43.set((int)(short)10, (long)(short)1);
    int i49 = chunkedLongArray43.size();
    chunkedLongArray41.set(chunkedLongArray43, (int)'#', (int)(byte)0, 0);
    chunkedLongArray43.set((int)'a', (long)(-1));
    chunkedLongArray6.set(chunkedLongArray43, (int)'4', 36, (int)(byte)-1);
    chunkedLongArray1.set(chunkedLongArray43, 35, 101, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    java.lang.String str2 = chunkedLongArray1.toString();
    int i3 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.add((-1L));
    int i29 = chunkedLongArray3.size();
    chunkedLongArray3.set(33, (long)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 12);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    int i7 = chunkedLongArray1.size();
    int i8 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    chunkedLongArray6.add(0L);
    int i20 = chunkedLongArray6.size();
    int i21 = chunkedLongArray6.size();
    java.lang.String str22 = chunkedLongArray6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str22.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    int i17 = chunkedLongArray1.size();
    int i18 = chunkedLongArray1.capacity();
    java.lang.String str19 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    chunkedLongArray9.set((int)(short)10, (long)(short)1);
    int i15 = chunkedLongArray9.size();
    chunkedLongArray1.set(chunkedLongArray9, (int)(short)100, (int)(short)-1, (int)(byte)-1);
    int i20 = chunkedLongArray9.capacity();
    ChunkedLongArray chunkedLongArray21 = null;
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray9.set(chunkedLongArray21, 0, (-1), 34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    chunkedLongArray34.add((long)53);
    chunkedLongArray34.set(12, 10L);
    chunkedLongArray34.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    java.lang.String str14 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.add((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    ChunkedLongArray chunkedLongArray32 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)(short)10, (long)(short)1);
    int i40 = chunkedLongArray34.size();
    chunkedLongArray32.set(chunkedLongArray34, (int)'#', (int)(byte)0, 0);
    chunkedLongArray34.set((int)(short)10, (long)10);
    java.lang.String str48 = chunkedLongArray34.toString();
    int i49 = chunkedLongArray34.capacity();
    ChunkedLongArray chunkedLongArray51 = new ChunkedLongArray(0);
    chunkedLongArray51.add(1L);
    chunkedLongArray51.set((int)(short)10, (long)(short)1);
    int i57 = chunkedLongArray51.size();
    int i58 = chunkedLongArray51.size();
    ChunkedLongArray chunkedLongArray60 = new ChunkedLongArray(0);
    chunkedLongArray60.add(1L);
    chunkedLongArray60.set((int)' ', (long)0);
    java.lang.String str66 = chunkedLongArray60.toString();
    int i67 = chunkedLongArray60.capacity();
    long[] long_array74 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray60.set(long_array74, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray51.set(long_array74, 10, 20, (int)(byte)-1);
    chunkedLongArray34.set(long_array74, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray19.set(chunkedLongArray34, 11, 11, 0);
    chunkedLongArray19.sort();
    java.lang.String str92 = chunkedLongArray19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str66.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str92.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    long[] long_array15 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray1.set(long_array15, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray1.add((long)(byte)-1);
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)20);
    int i25 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)36);
    // The following exception was thrown during execution in test generation
    try {
    long long29 = chunkedLongArray1.get(53);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray(0);
    chunkedLongArray17.add(1L);
    chunkedLongArray17.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray17, (int)(short)0, (int)(short)1, (-1));
    chunkedLongArray17.add((long)12);
    java.lang.String str29 = chunkedLongArray17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    chunkedLongArray18.set(chunkedLongArray20, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set(chunkedLongArray20, (int)'4', (int)(byte)1, (int)(byte)0);
    chunkedLongArray3.add((long)33);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray(0);
    chunkedLongArray40.add(1L);
    chunkedLongArray40.set((int)(short)10, (long)(short)1);
    int i46 = chunkedLongArray40.size();
    chunkedLongArray38.set(chunkedLongArray40, (int)'#', (int)(byte)0, 0);
    chunkedLongArray40.set((int)'a', (long)(-1));
    chunkedLongArray3.set(chunkedLongArray40, (int)'4', 36, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long59 = chunkedLongArray3.get(36);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 11);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    long long9 = chunkedLongArray1.get(11);
    chunkedLongArray1.set(21, (long)(byte)100);
    chunkedLongArray1.set((int)' ', (long)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    java.lang.String str2 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)'4');
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray((int)(byte)100);
    chunkedLongArray1.set(chunkedLongArray6, (int)(byte)-1, (-1), (int)(short)0);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray(0);
    java.lang.String str14 = chunkedLongArray13.toString();
    chunkedLongArray13.add((long)'4');
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray13, 98, 20, 34);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray3.sort();
    chunkedLongArray3.add((-1L));
    int i29 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 12);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.sort();
    chunkedLongArray15.sort();
    int i20 = chunkedLongArray15.size();
    chunkedLongArray15.sort();
    chunkedLongArray3.set(chunkedLongArray15, 100, 11, (int)(byte)0);
    chunkedLongArray15.sort();
    java.lang.String str27 = chunkedLongArray15.toString();
    int i28 = chunkedLongArray15.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.sort();
    long long16 = chunkedLongArray3.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    long long9 = chunkedLongArray1.get(11);
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    chunkedLongArray1.sort();
    int i15 = chunkedLongArray1.size();
    int i16 = chunkedLongArray1.capacity();
    java.lang.String str17 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(101 entries, 101 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(101 entries, 101 chunks, 0MB)"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.add(100L);
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(21);
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get(11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray(0);
    chunkedLongArray5.add(1L);
    chunkedLongArray5.sort();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray(0);
    chunkedLongArray10.add(1L);
    chunkedLongArray10.set((int)(short)10, (long)(short)1);
    chunkedLongArray5.set(chunkedLongArray10, 1, (-1), (int)(byte)-1);
    java.lang.String str20 = chunkedLongArray10.toString();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray(0);
    chunkedLongArray22.add(1L);
    chunkedLongArray22.set((int)(short)10, (long)(short)1);
    java.lang.String str28 = chunkedLongArray22.toString();
    chunkedLongArray10.set(chunkedLongArray22, (int)(short)0, 20, 0);
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray(0);
    chunkedLongArray34.add(1L);
    chunkedLongArray34.set((int)' ', (long)0);
    java.lang.String str40 = chunkedLongArray34.toString();
    int i41 = chunkedLongArray34.capacity();
    long[] long_array48 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray34.set(long_array48, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray10.set(long_array48, 34, 100, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array48, 0, 36, 102);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str28.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str40.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    chunkedLongArray6.add(0L);
    int i20 = chunkedLongArray6.size();
    chunkedLongArray6.set(0, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 12);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray6.size();
    int i17 = chunkedLongArray6.size();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray(0);
    chunkedLongArray19.add(1L);
    chunkedLongArray19.set((int)' ', (long)0);
    java.lang.String str25 = chunkedLongArray19.toString();
    int i26 = chunkedLongArray19.size();
    chunkedLongArray6.set(chunkedLongArray19, 20, (int)' ', (int)(byte)10);
    chunkedLongArray6.set(10, (long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str25.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 33);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.set((int)'4', (long)20);
    int i5 = chunkedLongArray1.capacity();
    chunkedLongArray1.add((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 53);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    chunkedLongArray3.add(10L);
    java.lang.String str19 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str19.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    int i7 = chunkedLongArray1.capacity();
    long long9 = chunkedLongArray1.get(11);
    chunkedLongArray1.set(21, (long)(byte)100);
    int i13 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 33);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    int i16 = chunkedLongArray1.size();
    chunkedLongArray1.add(0L);
    chunkedLongArray1.set((int)'4', (long)' ');
    int i22 = chunkedLongArray1.capacity();
    java.lang.String str23 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(53 entries, 53 chunks, 0MB)"+ "'", str23.equals("ChunkedLongArray(53 entries, 53 chunks, 0MB)"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)10);
    int i2 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)' ', (long)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    java.lang.String str9 = chunkedLongArray1.toString();
    int i10 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)100, (long)1);
    chunkedLongArray1.sort();
    long long16 = chunkedLongArray1.get((int)(short)1);
    long long18 = chunkedLongArray1.get(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set(1, (long)(byte)0);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.size();
    chunkedLongArray1.set((int)'a', (-1L));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray(0);
    chunkedLongArray15.add(1L);
    chunkedLongArray15.set((int)(short)10, (long)(short)1);
    int i21 = chunkedLongArray15.size();
    chunkedLongArray13.set(chunkedLongArray15, (int)'#', (int)(byte)0, 0);
    chunkedLongArray15.set((int)(short)10, (long)10);
    java.lang.String str29 = chunkedLongArray15.toString();
    int i30 = chunkedLongArray15.capacity();
    chunkedLongArray1.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(byte)0);
    int i35 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(2 entries, 2 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(2 entries, 2 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str29.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 98);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.set((int)(short)10, (long)(short)1);
    java.lang.String str7 = chunkedLongArray1.toString();
    int i8 = chunkedLongArray1.capacity();
    chunkedLongArray1.sort();
    chunkedLongArray1.add(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 11);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)' ', (long)0);
    java.lang.String str24 = chunkedLongArray18.toString();
    int i25 = chunkedLongArray18.size();
    chunkedLongArray1.set(chunkedLongArray18, 0, (int)(short)10, 2);
    chunkedLongArray18.set((int)'#', (long)(byte)1);
    chunkedLongArray18.add((long)' ');
    int i35 = chunkedLongArray18.size();
    ChunkedLongArray chunkedLongArray37 = new ChunkedLongArray(0);
    chunkedLongArray37.add(1L);
    chunkedLongArray37.sort();
    chunkedLongArray18.set(chunkedLongArray37, 98, 20, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long46 = chunkedLongArray18.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 37);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    long long15 = chunkedLongArray3.get((int)(byte)0);
    int i16 = chunkedLongArray3.capacity();
    java.lang.String str17 = chunkedLongArray3.toString();
    long long19 = chunkedLongArray3.get((int)(short)10);
    chunkedLongArray3.sort();
    long long22 = chunkedLongArray3.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray1.set((int)(short)100, (long)'#');
    chunkedLongArray1.set((int)'#', (long)'4');
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray(0);
    chunkedLongArray21.add(1L);
    chunkedLongArray21.set((int)' ', (long)0);
    java.lang.String str27 = chunkedLongArray21.toString();
    int i28 = chunkedLongArray21.capacity();
    chunkedLongArray21.sort();
    ChunkedLongArray chunkedLongArray31 = new ChunkedLongArray(0);
    chunkedLongArray31.add(1L);
    chunkedLongArray31.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray(0);
    chunkedLongArray36.add(1L);
    chunkedLongArray36.set((int)(short)10, (long)(short)1);
    chunkedLongArray31.set(chunkedLongArray36, 1, (-1), (int)(byte)-1);
    chunkedLongArray21.set(chunkedLongArray36, (int)(short)0, 0, 0);
    java.lang.String str50 = chunkedLongArray21.toString();
    chunkedLongArray1.set(chunkedLongArray21, 11, 33, (int)(byte)-1);
    chunkedLongArray21.add((long)'a');
    java.lang.String str57 = chunkedLongArray21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str27.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str50.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "ChunkedLongArray(34 entries, 34 chunks, 0MB)"+ "'", str57.equals("ChunkedLongArray(34 entries, 34 chunks, 0MB)"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    chunkedLongArray1.set(chunkedLongArray6, 1, (-1), (int)(byte)-1);
    java.lang.String str16 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray(0);
    chunkedLongArray18.add(1L);
    chunkedLongArray18.set((int)(short)10, (long)(short)1);
    java.lang.String str24 = chunkedLongArray18.toString();
    chunkedLongArray6.set(chunkedLongArray18, (int)(short)0, 20, 0);
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray(0);
    chunkedLongArray30.add(1L);
    chunkedLongArray30.set((int)' ', (long)0);
    java.lang.String str36 = chunkedLongArray30.toString();
    int i37 = chunkedLongArray30.capacity();
    long[] long_array44 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray30.set(long_array44, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray6.set(long_array44, 34, 100, 0);
    int i53 = chunkedLongArray6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str24.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str36.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 11);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray(0);
    chunkedLongArray3.add(1L);
    chunkedLongArray3.set((int)(short)10, (long)(short)1);
    int i9 = chunkedLongArray3.size();
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    chunkedLongArray3.set((int)(short)10, (long)10);
    java.lang.String str17 = chunkedLongArray3.toString();
    int i18 = chunkedLongArray3.capacity();
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray(0);
    chunkedLongArray20.add(1L);
    chunkedLongArray20.set((int)(short)10, (long)(short)1);
    int i26 = chunkedLongArray20.size();
    int i27 = chunkedLongArray20.size();
    ChunkedLongArray chunkedLongArray29 = new ChunkedLongArray(0);
    chunkedLongArray29.add(1L);
    chunkedLongArray29.set((int)' ', (long)0);
    java.lang.String str35 = chunkedLongArray29.toString();
    int i36 = chunkedLongArray29.capacity();
    long[] long_array43 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray29.set(long_array43, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray20.set(long_array43, 10, 20, (int)(byte)-1);
    chunkedLongArray3.set(long_array43, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray3.add((long)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str35.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(byte)1, (long)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.set((int)'4', (long)20);
    int i5 = chunkedLongArray1.capacity();
    long long7 = chunkedLongArray1.get(13);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    int i2 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)(byte)0, (long)(short)-1);
    chunkedLongArray1.sort();
    int i7 = chunkedLongArray1.size();
    java.lang.String str8 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)36);
    ChunkedLongArray chunkedLongArray6 = new ChunkedLongArray(0);
    chunkedLongArray6.add(1L);
    chunkedLongArray6.set((int)(short)10, (long)(short)1);
    java.lang.String str12 = chunkedLongArray6.toString();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray((int)(byte)0);
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray(0);
    chunkedLongArray16.add(1L);
    chunkedLongArray16.set((int)(short)10, (long)(short)1);
    int i22 = chunkedLongArray16.size();
    chunkedLongArray14.set(chunkedLongArray16, (int)'#', (int)(byte)0, 0);
    chunkedLongArray16.set((int)(short)10, (long)10);
    java.lang.String str30 = chunkedLongArray16.toString();
    int i31 = chunkedLongArray16.capacity();
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray(0);
    chunkedLongArray33.add(1L);
    chunkedLongArray33.set((int)(short)10, (long)(short)1);
    int i39 = chunkedLongArray33.size();
    int i40 = chunkedLongArray33.size();
    ChunkedLongArray chunkedLongArray42 = new ChunkedLongArray(0);
    chunkedLongArray42.add(1L);
    chunkedLongArray42.set((int)' ', (long)0);
    java.lang.String str48 = chunkedLongArray42.toString();
    int i49 = chunkedLongArray42.capacity();
    long[] long_array56 = new long[] { 0L, (-1L), (short)0, 11, (byte)100, ' ' };
    chunkedLongArray42.set(long_array56, 100, (int)(byte)0, (int)(byte)-1);
    chunkedLongArray33.set(long_array56, 10, 20, (int)(byte)-1);
    chunkedLongArray16.set(long_array56, (-1), (int)'#', (int)(short)-1);
    chunkedLongArray6.set(long_array56, (int)(byte)0, (int)'a', 0);
    chunkedLongArray1.set(long_array56, 1, 101, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str12.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ChunkedLongArray(11 entries, 11 chunks, 0MB)"+ "'", str30.equals("ChunkedLongArray(11 entries, 11 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ChunkedLongArray(33 entries, 33 chunks, 0MB)"+ "'", str48.equals("ChunkedLongArray(33 entries, 33 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array56);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    int i6 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(0);
    chunkedLongArray9.add(1L);
    int i12 = chunkedLongArray9.capacity();
    chunkedLongArray1.set(chunkedLongArray9, 0, 0, (int)(byte)1);
    chunkedLongArray1.set(11, (long)(byte)1);
    java.lang.String str20 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(12 entries, 12 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(12 entries, 12 chunks, 0MB)"));

  }

}
