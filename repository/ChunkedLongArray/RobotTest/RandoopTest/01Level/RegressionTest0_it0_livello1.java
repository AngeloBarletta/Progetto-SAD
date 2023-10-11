
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
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Allocated memory: 234MB, Allocated unused memory: 223MB, Heap memory used: 10MB, Max memory: 3456MB"+ "'", str0.equals("Allocated memory: 234MB, Allocated unused memory: 223MB, Heap memory used: 10MB, Max memory: 3456MB"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray1, (int)' ', 10, (int)(short)1);
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


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    long[] long_array17 = new long[] { (byte)0, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array17, (int)(short)-1, (int)(short)-1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    long long34 = chunkedLongArray0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.add(10L);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    chunkedLongArray3.set((int)(byte)100, (long)'#');
    java.lang.String str7 = chunkedLongArray3.toString();
    long[] long_array12 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray3.set(long_array12, (int)(byte)0, (int)'#', (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray3, 100, (int)(short)0, 1048576);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str7.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    int i14 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1048576);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray();
    chunkedLongArray41.set((int)(byte)100, (long)'#');
    java.lang.String str45 = chunkedLongArray41.toString();
    long[] long_array50 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray41.set(long_array50, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray41.sort();
    ChunkedLongArray chunkedLongArray56 = new ChunkedLongArray();
    chunkedLongArray56.set((int)(byte)100, (long)'#');
    java.lang.String str60 = chunkedLongArray56.toString();
    long[] long_array65 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray56.set(long_array65, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray41.set(chunkedLongArray56, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray74 = new ChunkedLongArray();
    chunkedLongArray74.set((int)(byte)0, (long)(short)100);
    chunkedLongArray56.set(chunkedLongArray74, (int)(short)0, 101, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray33.set(chunkedLongArray56, (-1), 10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str45.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str60.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array65);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray0.get(10);
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


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray();
    chunkedLongArray41.set((int)(byte)100, (long)'#');
    long[] long_array48 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray41.set(long_array48, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray33.set(long_array48, (int)(byte)100, (int)'a', 0);
    ChunkedLongArray chunkedLongArray57 = new ChunkedLongArray();
    chunkedLongArray57.set((int)(byte)100, (long)'#');
    java.lang.String str61 = chunkedLongArray57.toString();
    long[] long_array66 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray57.set(long_array66, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray57.sort();
    ChunkedLongArray chunkedLongArray72 = new ChunkedLongArray();
    chunkedLongArray72.set((int)(byte)100, (long)'#');
    java.lang.String str76 = chunkedLongArray72.toString();
    long[] long_array81 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray72.set(long_array81, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray57.set(chunkedLongArray72, (int)'a', (int)(byte)10, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray33.set(chunkedLongArray72, 1048576, (int)'a', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str61.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str76.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array81);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)100, (long)'#');
    java.lang.String str37 = chunkedLongArray33.toString();
    long[] long_array42 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray33.set(long_array42, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray33.sort();
    ChunkedLongArray chunkedLongArray48 = new ChunkedLongArray();
    chunkedLongArray48.set((int)(byte)100, (long)'#');
    java.lang.String str52 = chunkedLongArray48.toString();
    long[] long_array57 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray48.set(long_array57, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray33.set(chunkedLongArray48, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray66 = new ChunkedLongArray();
    chunkedLongArray66.set((int)(byte)0, (long)(short)100);
    chunkedLongArray48.set(chunkedLongArray66, (int)(short)0, 101, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray74 = new ChunkedLongArray();
    chunkedLongArray74.set((int)(byte)100, (long)'#');
    long[] long_array81 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray74.set(long_array81, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray66.set(long_array81, (int)(byte)100, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray15.set(long_array81, 36, (int)(byte)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str37.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str52.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array81);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.sort();
    ChunkedLongArray chunkedLongArray9 = new ChunkedLongArray(36);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray9, 1, (int)(byte)1, (int)(short)100);
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
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    int i14 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray15.sort();
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray();
    chunkedLongArray30.set((int)(byte)100, (long)'#');
    java.lang.String str34 = chunkedLongArray30.toString();
    long[] long_array39 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray30.set(long_array39, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray15.set(chunkedLongArray30, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray15.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray15, 100, (int)'4', 1048576);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str34.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get(0);
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


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    chunkedLongArray0.set((int)(byte)1, 0L);
    chunkedLongArray0.set(20, (long)(byte)-1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    int i14 = chunkedLongArray0.size();
    chunkedLongArray0.set(1048576, (long)(short)1);
    int i18 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2097152);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)1);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    chunkedLongArray5.set((int)(byte)100, (long)'#');
    long[] long_array12 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray5.set(long_array12, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray1.set(chunkedLongArray5, 0, (int)'#', (int)(short)100);
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray((int)(short)1);
    int i23 = chunkedLongArray22.size();
    int i24 = chunkedLongArray22.capacity();
    chunkedLongArray22.set((int)'#', 10L);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray5.set(chunkedLongArray22, (int)(short)1, 2097152, (int)(short)100);
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
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)100, (long)'#');
    long[] long_array40 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray33.set(long_array40, (int)(byte)-1, 20, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array40, 0, (int)(byte)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    // The following exception was thrown during execution in test generation
    try {
    long long2 = chunkedLongArray0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.add(0L);
    int i35 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1048576);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.set((int)(short)0, (long)(short)0);
    chunkedLongArray0.set(36, (long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    long[] long_array11 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray4.set(long_array11, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray0.set(long_array11, (-1), (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    long long21 = chunkedLongArray0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    long[] long_array7 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray0.set(long_array7, (int)(byte)-1, 20, (int)(short)-1);
    java.lang.String str12 = chunkedLongArray0.toString();
    int i13 = chunkedLongArray0.size();
    int i14 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str12.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray();
    chunkedLongArray41.set((int)(byte)100, (long)'#');
    long[] long_array48 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray41.set(long_array48, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray33.set(long_array48, (int)(byte)100, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    long long58 = chunkedLongArray33.get((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    int i41 = chunkedLongArray33.size();
    int i42 = chunkedLongArray33.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1048576);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    long[] long_array7 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray0.set(long_array7, (int)(byte)-1, 20, (int)(short)-1);
    java.lang.String str12 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray();
    chunkedLongArray13.set((int)(byte)100, (long)'#');
    java.lang.String str17 = chunkedLongArray13.toString();
    long[] long_array22 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray13.set(long_array22, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray13.sort();
    chunkedLongArray13.add(10L);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray13, (int)(short)-1, (int)(byte)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str12.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str17.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    long long42 = chunkedLongArray15.get((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long42 == 0L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    int i14 = chunkedLongArray0.size();
    int i15 = chunkedLongArray0.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray0.get(2097152);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1048576);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.add((long)(short)10);
    java.lang.String str11 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(3 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(3 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    java.lang.String str33 = chunkedLongArray15.toString();
    java.lang.String str34 = chunkedLongArray15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str33.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str34.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(2 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(2 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    chunkedLongArray33.set((int)'4', 0L);
    long[] long_array46 = new long[] { 100L, 1048576 };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray33.set(long_array46, (int)(byte)10, (int)'4', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array46);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    ChunkedLongArray chunkedLongArray2 = new ChunkedLongArray();
    chunkedLongArray2.set((int)(byte)100, (long)'#');
    java.lang.String str6 = chunkedLongArray2.toString();
    long[] long_array11 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray2.set(long_array11, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray2.sort();
    chunkedLongArray2.add(10L);
    java.lang.String str19 = chunkedLongArray2.toString();
    chunkedLongArray2.sort();
    chunkedLongArray2.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray2, 2097152, 10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str6.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.set((int)(short)0, (long)(short)0);
    chunkedLongArray0.set(100, 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray((int)(short)1);
    int i11 = chunkedLongArray10.size();
    int i12 = chunkedLongArray10.capacity();
    chunkedLongArray10.set((int)'#', 10L);
    int i16 = chunkedLongArray10.capacity();
    chunkedLongArray10.set(36, (long)(byte)0);
    chunkedLongArray10.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray10, 1048576, (-1), 101);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 36);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    int i14 = chunkedLongArray0.size();
    chunkedLongArray0.set(1048576, (long)(short)1);
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray();
    chunkedLongArray18.set((int)(byte)100, (long)'#');
    java.lang.String str22 = chunkedLongArray18.toString();
    long[] long_array27 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray18.set(long_array27, (int)(byte)0, (int)'#', (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array27, (int)'a', (int)'#', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str22.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)100);
    int i2 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.add(10L);
    java.lang.String str17 = chunkedLongArray0.toString();
    int i18 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str17.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1048576);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.add(10L);
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    chunkedLongArray3.set((int)(byte)100, (long)'#');
    java.lang.String str7 = chunkedLongArray3.toString();
    long[] long_array12 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray3.set(long_array12, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray3.add((long)100);
    chunkedLongArray0.set(chunkedLongArray3, (int)' ', 1048576, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str7.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long6 = chunkedLongArray0.get(2097152);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.add((long)(short)10);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray();
    chunkedLongArray11.set((int)(byte)100, (long)'#');
    java.lang.String str15 = chunkedLongArray11.toString();
    long[] long_array20 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray11.set(long_array20, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(long_array20, (int)(byte)-1, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    long long30 = chunkedLongArray0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str15.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    int i5 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    java.lang.String str2 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    chunkedLongArray3.set(chunkedLongArray4, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray1.set(chunkedLongArray3, 1, 1048576, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray3.get((int)'4');
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long42 = chunkedLongArray33.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.add(10L);
    int i17 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 102);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)1);
    // The following exception was thrown during execution in test generation
    try {
    long long6 = chunkedLongArray1.get(10);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray();
    chunkedLongArray10.set((int)(byte)0, (long)(short)100);
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray();
    chunkedLongArray14.set((int)(byte)100, (long)'#');
    long[] long_array21 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray14.set(long_array21, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray10.set(long_array21, (-1), (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array21, 0, (int)(byte)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(2 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(2 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    long[] long_array7 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray0.set(long_array7, (int)(byte)-1, 20, (int)(short)-1);
    java.lang.String str12 = chunkedLongArray0.toString();
    int i13 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray();
    chunkedLongArray14.set((int)(byte)0, (long)(short)100);
    chunkedLongArray14.set((int)(byte)1, (long)(byte)1);
    int i21 = chunkedLongArray14.capacity();
    chunkedLongArray0.set(chunkedLongArray14, (int)'a', 0, (int)'4');
    chunkedLongArray14.set(0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str12.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1048576);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    long[] long_array7 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray0.set(long_array7, (int)(byte)-1, 20, (int)(short)-1);
    java.lang.String str12 = chunkedLongArray0.toString();
    int i13 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray();
    chunkedLongArray14.set((int)(byte)0, (long)(short)100);
    chunkedLongArray14.set((int)(byte)1, (long)(byte)1);
    int i21 = chunkedLongArray14.capacity();
    chunkedLongArray0.set(chunkedLongArray14, (int)'a', 0, (int)'4');
    int i26 = chunkedLongArray14.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str12.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1048576);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long long6 = chunkedLongArray0.get((int)(short)100);
    java.lang.String str7 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str7.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    int i41 = chunkedLongArray33.size();
    chunkedLongArray33.set((int)'#', (long)36);
    java.lang.String str45 = chunkedLongArray33.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "ChunkedLongArray(36 entries, 1 chunks, 8MB)"+ "'", str45.equals("ChunkedLongArray(36 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    int i7 = chunkedLongArray1.capacity();
    chunkedLongArray1.set(36, (long)(byte)0);
    chunkedLongArray1.sort();
    chunkedLongArray1.add(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 36);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    long long36 = chunkedLongArray0.get((int)(short)10);
    int i37 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 101);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    chunkedLongArray0.add((long)'a');
    chunkedLongArray0.add((long)102);
    chunkedLongArray0.add((long)(byte)-1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)0, (long)(short)100);
    chunkedLongArray4.set((int)(short)0, (long)(-1));
    int i11 = chunkedLongArray4.size();
    chunkedLongArray0.set(chunkedLongArray4, 0, 100, 100);
    chunkedLongArray4.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.set((int)(short)0, (long)(short)0);
    chunkedLongArray0.set(36, (long)(byte)1);
    ChunkedLongArray chunkedLongArray40 = new ChunkedLongArray();
    chunkedLongArray40.set((int)(byte)100, (long)'#');
    long[] long_array47 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray40.set(long_array47, (int)(byte)-1, 20, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array47, 0, (int)(short)1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    chunkedLongArray1.sort();
    java.lang.String str3 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str3.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    long[] long_array11 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray4.set(long_array11, (int)(byte)-1, 20, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(long_array11, 101, (int)(byte)100, (int)'4');
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
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)1);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    chunkedLongArray5.set((int)(byte)100, (long)'#');
    long[] long_array12 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray5.set(long_array12, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray1.set(chunkedLongArray5, 0, (int)'#', (int)(short)100);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray();
    chunkedLongArray22.set((int)(byte)100, (long)'#');
    chunkedLongArray21.set(chunkedLongArray22, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray5.set(chunkedLongArray21, (int)'a', 100, 36);
    int i34 = chunkedLongArray5.size();
    // The following exception was thrown during execution in test generation
    try {
    long long36 = chunkedLongArray5.get((int)(byte)-1);
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
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 101);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    java.lang.String str2 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    chunkedLongArray3.set(chunkedLongArray4, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray1.set(chunkedLongArray3, 1, 1048576, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray1.get((int)(short)0);
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set(10, (long)10);
    java.lang.String str12 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(2 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(2 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ChunkedLongArray(11 entries, 1 chunks, 8MB)"+ "'", str12.equals("ChunkedLongArray(11 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    chunkedLongArray1.sort();
    int i3 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i9 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray10 = new ChunkedLongArray();
    chunkedLongArray10.set((int)(byte)0, (long)(short)100);
    chunkedLongArray10.set((int)(byte)1, (long)(byte)1);
    int i17 = chunkedLongArray10.capacity();
    chunkedLongArray10.sort();
    chunkedLongArray10.add((long)(short)10);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray();
    chunkedLongArray21.set((int)(byte)100, (long)'#');
    java.lang.String str25 = chunkedLongArray21.toString();
    long[] long_array30 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray21.set(long_array30, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray10.set(long_array30, (int)(byte)-1, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array30, 102, (int)(byte)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str25.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray0.get(102);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray1.get(36);
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

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray35 = new ChunkedLongArray(36);
    chunkedLongArray35.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray35, 102, (int)(short)10, 36);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set(10, (long)10);
    int i12 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(2 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(2 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1048576);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray0.sort();
    int i10 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.add(0L);
    chunkedLongArray0.add((long)(byte)-1);
    int i37 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 103);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    java.lang.String str33 = chunkedLongArray15.toString();
    chunkedLongArray15.add(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str33.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray0.sort();
    // The following exception was thrown during execution in test generation
    try {
    long long11 = chunkedLongArray0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.set((int)(byte)1, (long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray36 = new ChunkedLongArray((int)(short)1);
    int i37 = chunkedLongArray36.size();
    chunkedLongArray36.add((long)1);
    chunkedLongArray0.set(chunkedLongArray36, (int)'#', 10, (int)(byte)0);
    chunkedLongArray36.add((long)'4');
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray();
    chunkedLongArray46.set((int)(byte)100, (long)'#');
    java.lang.String str50 = chunkedLongArray46.toString();
    long[] long_array55 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray46.set(long_array55, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray46.sort();
    chunkedLongArray46.add(10L);
    java.lang.String str63 = chunkedLongArray46.toString();
    chunkedLongArray46.sort();
    chunkedLongArray36.set(chunkedLongArray46, 2097152, (int)(short)1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str50.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str63.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    chunkedLongArray33.set((int)'4', 0L);
    java.lang.String str44 = chunkedLongArray33.toString();
    int i45 = chunkedLongArray33.capacity();
    chunkedLongArray33.set(2097152, (long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ChunkedLongArray(53 entries, 1 chunks, 8MB)"+ "'", str44.equals("ChunkedLongArray(53 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1048576);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)0, (long)(short)100);
    chunkedLongArray4.set((int)(short)0, (long)(-1));
    int i11 = chunkedLongArray4.size();
    chunkedLongArray0.set(chunkedLongArray4, 0, 100, 100);
    chunkedLongArray4.set((int)(byte)10, (long)20);
    chunkedLongArray4.set(100, (long)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.add(0L);
    chunkedLongArray0.add((long)(byte)-1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray();
    chunkedLongArray38.set((int)(byte)100, (long)'#');
    java.lang.String str42 = chunkedLongArray38.toString();
    long[] long_array47 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray38.set(long_array47, (int)(byte)0, (int)'#', (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array47, (int)(byte)1, (int)(byte)-1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str42.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array47);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    chunkedLongArray0.add((long)10);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    ChunkedLongArray chunkedLongArray33 = new ChunkedLongArray();
    chunkedLongArray33.set((int)(byte)0, (long)(short)100);
    chunkedLongArray15.set(chunkedLongArray33, (int)(short)0, 101, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray41 = new ChunkedLongArray();
    chunkedLongArray41.set((int)(byte)100, (long)'#');
    long[] long_array48 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray41.set(long_array48, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray33.set(long_array48, (int)(byte)100, (int)'a', 0);
    int i57 = chunkedLongArray33.capacity();
    chunkedLongArray33.add(1L);
    java.lang.String str60 = chunkedLongArray33.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "ChunkedLongArray(2 entries, 1 chunks, 8MB)"+ "'", str60.equals("ChunkedLongArray(2 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray();
    chunkedLongArray14.set((int)(byte)100, (long)'#');
    java.lang.String str18 = chunkedLongArray14.toString();
    long[] long_array23 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray14.set(long_array23, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray14.sort();
    chunkedLongArray14.add(10L);
    java.lang.String str31 = chunkedLongArray14.toString();
    chunkedLongArray14.sort();
    chunkedLongArray0.set(chunkedLongArray14, (int)(short)100, (int)(byte)100, (int)(byte)-1);
    chunkedLongArray14.add((long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str18.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str31.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)1);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    chunkedLongArray5.set((int)(byte)100, (long)'#');
    long[] long_array12 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray5.set(long_array12, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray1.set(chunkedLongArray5, 0, (int)'#', (int)(short)100);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray();
    chunkedLongArray22.set((int)(byte)100, (long)'#');
    chunkedLongArray21.set(chunkedLongArray22, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray5.set(chunkedLongArray21, (int)'a', 100, 36);
    int i34 = chunkedLongArray21.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1048576);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    java.lang.String str2 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    chunkedLongArray3.set(chunkedLongArray4, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray1.set(chunkedLongArray3, 1, 1048576, (int)(short)0);
    java.lang.String str16 = chunkedLongArray1.toString();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(36 entries, 18 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(36 entries, 18 chunks, 0MB)"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.set((int)(short)10, (long)(short)0);
    int i10 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 36);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    int i4 = chunkedLongArray1.size();
    int i5 = chunkedLongArray1.capacity();
    chunkedLongArray1.add((long)(short)-1);
    chunkedLongArray1.add((long)100);
    
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    long[] long_array11 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray4.set(long_array11, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray0.set(long_array11, (-1), (int)(byte)0, 0);
    chunkedLongArray0.add((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    int i2 = chunkedLongArray1.capacity();
    java.lang.String str3 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str3.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.add((long)100);
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray();
    chunkedLongArray16.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set(chunkedLongArray16, (int)(short)1, 1048576, 100);
    // The following exception was thrown during execution in test generation
    try {
    long long25 = chunkedLongArray16.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray0.add((long)(byte)1);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.add((long)1);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    chunkedLongArray5.set((int)(byte)100, (long)'#');
    long[] long_array12 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray5.set(long_array12, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray1.set(chunkedLongArray5, 0, (int)'#', (int)(short)100);
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray();
    chunkedLongArray22.set((int)(byte)100, (long)'#');
    chunkedLongArray21.set(chunkedLongArray22, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray5.set(chunkedLongArray21, (int)'a', 100, 36);
    long[] long_array34 = null;
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray21.set(long_array34, 36, 103, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.add(10L);
    java.lang.String str17 = chunkedLongArray0.toString();
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray();
    chunkedLongArray19.set((int)(byte)100, (long)'#');
    java.lang.String str23 = chunkedLongArray19.toString();
    long[] long_array28 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray19.set(long_array28, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray19.sort();
    ChunkedLongArray chunkedLongArray34 = new ChunkedLongArray();
    chunkedLongArray34.set((int)(byte)100, (long)'#');
    java.lang.String str38 = chunkedLongArray34.toString();
    long[] long_array43 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray34.set(long_array43, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray19.set(chunkedLongArray34, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray19.add(0L);
    chunkedLongArray19.add((long)(byte)-1);
    chunkedLongArray19.sort();
    long long58 = chunkedLongArray19.get((int)(short)1);
    chunkedLongArray0.set(chunkedLongArray19, 102, 1048576, 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str17.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str23.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str38.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 0L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.add(10L);
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray0.get(103);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    chunkedLongArray0.add((long)(short)0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    chunkedLongArray7.set((int)(byte)0, (long)(short)100);
    chunkedLongArray7.set((int)(byte)1, (long)(byte)1);
    int i14 = chunkedLongArray7.capacity();
    chunkedLongArray7.sort();
    chunkedLongArray7.add((long)(short)10);
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray();
    chunkedLongArray18.set((int)(byte)100, (long)'#');
    java.lang.String str22 = chunkedLongArray18.toString();
    long[] long_array27 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray18.set(long_array27, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray7.set(long_array27, (int)(byte)-1, (int)(short)1, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array27, (int)(short)0, (int)(byte)10, 103);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str22.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array27);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    chunkedLongArray0.add((long)'a');
    chunkedLongArray0.add((long)102);
    long long9 = chunkedLongArray0.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.set((int)(short)0, (long)(short)0);
    chunkedLongArray0.set(36, (long)(byte)1);
    chunkedLongArray0.add((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(short)0, (long)(-1));
    int i7 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray();
    chunkedLongArray8.set((int)(byte)0, (long)(short)100);
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    chunkedLongArray12.set((int)(byte)100, (long)'#');
    long[] long_array19 = new long[] { (short)100, '4', (byte)10 };
    chunkedLongArray12.set(long_array19, (int)(byte)-1, 20, (int)(short)-1);
    chunkedLongArray8.set(long_array19, (-1), (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array19, 36, (int)(byte)-1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    int i8 = chunkedLongArray0.capacity();
    int i9 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    java.lang.String str3 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str3.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    java.lang.String str2 = chunkedLongArray1.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    chunkedLongArray4.set((int)(byte)100, (long)'#');
    chunkedLongArray3.set(chunkedLongArray4, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray1.set(chunkedLongArray3, 1, 1048576, (int)(short)0);
    chunkedLongArray3.add(0L);
    java.lang.String str18 = chunkedLongArray3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 8MB)"+ "'", str18.equals("ChunkedLongArray(1 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    int i10 = chunkedLongArray0.capacity();
    int i11 = chunkedLongArray0.size();
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.sort();
    chunkedLongArray0.set(100, (long)101);
    java.lang.String str8 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(36);
    chunkedLongArray1.sort();
    int i3 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set(chunkedLongArray5, (int)(short)100, (int)'4', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    chunkedLongArray15.set((int)(byte)100, (long)'#');
    java.lang.String str19 = chunkedLongArray15.toString();
    long[] long_array24 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray15.set(long_array24, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(chunkedLongArray15, (int)'a', (int)(byte)10, (int)(byte)1);
    chunkedLongArray0.add(0L);
    chunkedLongArray0.add((long)(byte)-1);
    chunkedLongArray0.set(10, (long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str19.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    chunkedLongArray1.add((long)103);
    int i11 = chunkedLongArray1.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long13 = chunkedLongArray1.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1048576);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)0, (long)(short)100);
    chunkedLongArray0.set((int)(byte)1, (long)(byte)1);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.add((long)(short)10);
    ChunkedLongArray chunkedLongArray11 = new ChunkedLongArray();
    chunkedLongArray11.set((int)(byte)100, (long)'#');
    java.lang.String str15 = chunkedLongArray11.toString();
    long[] long_array20 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray11.set(long_array20, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.set(long_array20, (int)(byte)-1, (int)(short)1, 0);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str15.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array20);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray();
    chunkedLongArray1.set((int)(byte)100, (long)'#');
    chunkedLongArray0.set(chunkedLongArray1, (int)(short)100, 101, (int)(byte)1);
    java.lang.String str9 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str9.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    chunkedLongArray0.set((int)(byte)100, (long)'#');
    java.lang.String str4 = chunkedLongArray0.toString();
    long[] long_array9 = new long[] { 10, (byte)1, (-1), 1L };
    chunkedLongArray0.set(long_array9, (int)(byte)0, (int)'#', (int)(byte)1);
    chunkedLongArray0.sort();
    chunkedLongArray0.add(10L);
    java.lang.String str17 = chunkedLongArray0.toString();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(101 entries, 1 chunks, 8MB)"+ "'", str4.equals("ChunkedLongArray(101 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(102 entries, 1 chunks, 8MB)"+ "'", str17.equals("ChunkedLongArray(102 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    chunkedLongArray1.set(0, (long)(short)1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)0);
    chunkedLongArray1.add((long)103);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    int i7 = chunkedLongArray1.capacity();
    java.lang.String str8 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(36 entries, 18 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(36 entries, 18 chunks, 0MB)"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(103);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    int i7 = chunkedLongArray1.capacity();
    chunkedLongArray1.add(1L);
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 36);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(0);
    chunkedLongArray1.sort();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.sort();
    chunkedLongArray1.set(20, (long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');
    int i2 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)'#');
    chunkedLongArray1.sort();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1);
    chunkedLongArray1.add(0L);
    java.lang.String str4 = chunkedLongArray1.toString();
    chunkedLongArray1.add((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(1 entries, 1 chunks, 0MB)"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    chunkedLongArray1.set(20, 0L);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    java.lang.String str7 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    java.lang.String str9 = chunkedLongArray1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ChunkedLongArray(36 entries, 18 chunks, 0MB)"+ "'", str7.equals("ChunkedLongArray(36 entries, 18 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(36 entries, 18 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(36 entries, 18 chunks, 0MB)"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(short)1);
    int i2 = chunkedLongArray1.size();
    int i3 = chunkedLongArray1.capacity();
    chunkedLongArray1.set((int)'#', 10L);
    chunkedLongArray1.sort();
    chunkedLongArray1.add((long)'#');
    chunkedLongArray1.add((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(20);

  }

}
