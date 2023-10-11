
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    int i0 = ChunkedLongArray.DEFAULT_CHUNK_BITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 20);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    int i14 = chunkedLongArray0.size();
    // The following exception was thrown during execution in test generation
    try {
    long long16 = chunkedLongArray0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 36);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)-1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    chunkedLongArray1.sort();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    int i14 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    int i16 = chunkedLongArray15.size();
    chunkedLongArray15.set((int)'#', (long)'a');
    long[] long_array24 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray15.set(long_array24, (int)(byte)0, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array24, (int)'a', 20, 1);
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
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.lang.String str0 = ChunkedLongArray.memStats();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Allocated memory: 188MB, Allocated unused memory: 89MB, Heap memory used: 98MB, Max memory: 1691MB"+ "'", str0.equals("Allocated memory: 188MB, Allocated unused memory: 89MB, Heap memory used: 98MB, Max memory: 1691MB"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    int i2 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.sort();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    int i16 = chunkedLongArray15.size();
    chunkedLongArray15.set((int)'#', (long)'a');
    long[] long_array24 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray15.set(long_array24, (int)(byte)0, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray15, (-1), (int)(byte)0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    chunkedLongArray1.add((long)(short)10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.set(long_array14, (int)(byte)0, (int)' ', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    long long24 = chunkedLongArray0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.set(long_array14, (int)(byte)0, (int)' ', (int)(short)0);
    int i23 = chunkedLongArray0.size();
    int i24 = chunkedLongArray0.size();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 36);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.sort();
    int i15 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray();
    int i17 = chunkedLongArray16.size();
    chunkedLongArray16.set((int)'#', (long)'a');
    long[] long_array25 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray16.set(long_array25, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray16.sort();
    int i31 = chunkedLongArray16.capacity();
    chunkedLongArray16.sort();
    long long34 = chunkedLongArray16.get(20);
    chunkedLongArray0.set(chunkedLongArray16, (int)'a', (int)(short)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    ChunkedLongArray chunkedLongArray14 = new ChunkedLongArray();
    int i15 = chunkedLongArray14.size();
    chunkedLongArray14.set((int)'#', (long)'a');
    long[] long_array23 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray14.set(long_array23, (int)(byte)0, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array23, (int)'4', (int)(byte)100, 36);
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
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array23);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array14, (int)(byte)0, (int)(byte)1, (int)(short)10);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)1);
    chunkedLongArray1.add(10L);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)(short)100, 1L);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    int i19 = chunkedLongArray5.size();
    chunkedLongArray0.set(chunkedLongArray5, 0, (int)' ', 10);
    long[] long_array25 = new long[] { (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray5.set(long_array25, (int)(short)100, (int)'a', 100);
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
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    long[] long_array9 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray0.set(long_array9, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.sort();
    int i15 = chunkedLongArray0.capacity();
    int i16 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray18 = new ChunkedLongArray((int)'4');
    int i19 = chunkedLongArray18.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray18, (int)(byte)1, 1048576, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray2 = new ChunkedLongArray();
    int i3 = chunkedLongArray2.size();
    chunkedLongArray2.set((int)'#', (long)'a');
    long[] long_array11 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray2.set(long_array11, (int)(byte)0, 20, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array11, (int)(byte)1, (int)(byte)10, (int)' ');
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array11);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)(short)100, 1L);
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    int i19 = chunkedLongArray5.size();
    chunkedLongArray0.set(chunkedLongArray5, 0, (int)' ', 10);
    int i24 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1048576);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');
    int i2 = chunkedLongArray1.capacity();
    int i3 = chunkedLongArray1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    chunkedLongArray0.set((int)'#', (long)'a');
    ChunkedLongArray chunkedLongArray5 = new ChunkedLongArray();
    int i6 = chunkedLongArray5.size();
    chunkedLongArray5.set((int)'#', (long)'a');
    long[] long_array14 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray5.set(long_array14, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray0.set(long_array14, (int)(byte)0, (int)' ', (int)(short)0);
    int i23 = chunkedLongArray0.size();
    int i24 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray25 = new ChunkedLongArray();
    int i26 = chunkedLongArray25.size();
    chunkedLongArray25.set((int)'#', (long)'a');
    ChunkedLongArray chunkedLongArray30 = new ChunkedLongArray();
    int i31 = chunkedLongArray30.size();
    chunkedLongArray30.set((int)'#', (long)'a');
    long[] long_array39 = new long[] { 0, 100, (short)-1, (short)0 };
    chunkedLongArray30.set(long_array39, (int)(byte)0, 20, (int)(byte)-1);
    chunkedLongArray25.set(long_array39, (int)(byte)0, (int)' ', (int)(short)0);
    chunkedLongArray25.sort();
    chunkedLongArray0.set(chunkedLongArray25, 0, (-1), 0);
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array39);

  }

}
