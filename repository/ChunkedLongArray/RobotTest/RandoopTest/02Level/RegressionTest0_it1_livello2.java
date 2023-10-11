
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array8 = new long[] { (byte)-1, ' ', 10L, (-1L), 1L, (short)1 };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array8, (int)(short)-1, (int)'a', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    int i2 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)(byte)100);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'a');

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get((int)(byte)-1);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    // The following exception was thrown during execution in test generation
    try {
    long long2 = chunkedLongArray0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.lang.String str0 = ChunkedLongArray.memStats();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Allocated memory: 115MB, Allocated unused memory: 74MB, Heap memory used: 40MB, Max memory: 1691MB"+ "'", str0.equals("Allocated memory: 115MB, Allocated unused memory: 74MB, Heap memory used: 40MB, Max memory: 1691MB"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    int i0 = ChunkedLongArray.DEFAULT_CHUNK_BITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 20);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    java.lang.String str8 = chunkedLongArray7.toString();
    java.lang.String str9 = chunkedLongArray7.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray7, (int)(byte)0, 100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    long long12 = chunkedLongArray0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    chunkedLongArray0.add((long)1048576);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray();
    java.lang.String str14 = chunkedLongArray13.toString();
    long[] long_array15 = new long[] {  };
    chunkedLongArray13.set(long_array15, 10, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array15, 0, 10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    int i8 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1048576);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    java.lang.String str2 = chunkedLongArray1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get((int)(short)-1);
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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    chunkedLongArray0.add((long)1048576);
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray();
    java.lang.String str14 = chunkedLongArray13.toString();
    long[] long_array15 = new long[] {  };
    chunkedLongArray13.set(long_array15, 10, 0, 0);
    int i20 = chunkedLongArray13.size();
    java.lang.String str21 = chunkedLongArray13.toString();
    int i22 = chunkedLongArray13.capacity();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray13, (int)(byte)10, (int)(byte)-1, 1048576);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str21.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1048576);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i11 = chunkedLongArray0.size();
    int i12 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray1.set((int)(byte)-1, 1L);
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1048576);
    // The following exception was thrown during execution in test generation
    try {
    long long3 = chunkedLongArray1.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long5 = chunkedLongArray0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'#');
    chunkedLongArray1.sort();

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i11 = chunkedLongArray0.size();
    // The following exception was thrown during execution in test generation
    try {
    long long13 = chunkedLongArray0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    chunkedLongArray0.add((long)1048576);
    chunkedLongArray0.add(10L);
    chunkedLongArray0.set(10, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    int i9 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = chunkedLongArray0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.capacity();
    java.lang.String str4 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray();
    java.lang.String str9 = chunkedLongArray8.toString();
    long[] long_array10 = new long[] {  };
    chunkedLongArray8.set(long_array10, 10, 0, 0);
    chunkedLongArray0.set(long_array10, (int)(short)-1, (int)'#', (int)(short)0);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray21 = new ChunkedLongArray((int)' ');
    java.lang.String str22 = chunkedLongArray21.toString();
    java.lang.String str23 = chunkedLongArray21.toString();
    long[] long_array30 = new long[] { 20, 10L, 1L, (byte)10, 1048576, 20 };
    chunkedLongArray21.set(long_array30, 1048576, 0, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array30, 1, (int)' ', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str22.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str23.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array30);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    int i8 = chunkedLongArray0.capacity();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1048576);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    int i1 = chunkedLongArray0.size();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    java.lang.String str8 = chunkedLongArray7.toString();
    long[] long_array9 = new long[] {  };
    chunkedLongArray7.set(long_array9, 10, 0, 0);
    chunkedLongArray0.set(long_array9, 0, (int)'a', 0);
    chunkedLongArray0.add((long)'#');
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i11 = chunkedLongArray0.size();
    // The following exception was thrown during execution in test generation
    try {
    long long13 = chunkedLongArray0.get((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.capacity();
    java.lang.String str11 = chunkedLongArray3.toString();
    chunkedLongArray0.set(chunkedLongArray3, 0, 100, (int)(byte)-1);
    chunkedLongArray3.sort();
    int i17 = chunkedLongArray3.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1048576);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.capacity();
    java.lang.String str11 = chunkedLongArray3.toString();
    chunkedLongArray0.set(chunkedLongArray3, 0, 100, (int)(byte)-1);
    chunkedLongArray0.set((int)(byte)1, 10L);
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.capacity();
    java.lang.String str11 = chunkedLongArray3.toString();
    chunkedLongArray0.set(chunkedLongArray3, 0, 100, (int)(byte)-1);
    long[] long_array18 = new long[] { (byte)100, 1L };
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array18, 100, 1048576, 1048576);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array18);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    java.lang.String str2 = chunkedLongArray1.toString();
    int i3 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    int i2 = chunkedLongArray1.size();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get((int)(short)-1);
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
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    java.lang.String str8 = chunkedLongArray7.toString();
    long[] long_array9 = new long[] {  };
    chunkedLongArray7.set(long_array9, 10, 0, 0);
    chunkedLongArray0.set(long_array9, 0, (int)'a', 0);
    chunkedLongArray0.add((long)'#');
    int i20 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1048576);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1048576);
    int i2 = chunkedLongArray1.size();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = chunkedLongArray0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    chunkedLongArray0.add((long)1048576);
    chunkedLongArray0.add(10L);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    java.lang.String str8 = chunkedLongArray7.toString();
    long[] long_array9 = new long[] {  };
    chunkedLongArray7.set(long_array9, 10, 0, 0);
    chunkedLongArray0.set(long_array9, 0, (int)'a', 0);
    chunkedLongArray0.add((long)'#');
    int i20 = chunkedLongArray0.size();
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray22, 0, 100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)' ');
    java.lang.String str2 = chunkedLongArray1.toString();
    java.lang.String str3 = chunkedLongArray1.toString();
    chunkedLongArray1.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str3.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    int i13 = chunkedLongArray12.size();
    chunkedLongArray0.set(chunkedLongArray12, 20, (int)(short)-1, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.capacity();
    chunkedLongArray0.add(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1048576);
    int i2 = chunkedLongArray1.size();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.size();
    chunkedLongArray3.add((long)(short)1);
    chunkedLongArray1.set(chunkedLongArray3, (int)'#', (int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    long long18 = chunkedLongArray1.get(10);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    chunkedLongArray0.add((long)1048576);
    chunkedLongArray0.add(10L);
    int i15 = chunkedLongArray0.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1048576);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    int i3 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray();
    java.lang.String str5 = chunkedLongArray4.toString();
    chunkedLongArray0.set(chunkedLongArray4, (-1), (int)(byte)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str5.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    chunkedLongArray0.set((int)'a', (long)(byte)-1);
    int i11 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 98);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((int)'4');

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    java.lang.String str13 = chunkedLongArray12.toString();
    long[] long_array14 = new long[] {  };
    chunkedLongArray12.set(long_array14, 10, 0, 0);
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray();
    java.lang.String str20 = chunkedLongArray19.toString();
    long[] long_array21 = new long[] {  };
    chunkedLongArray19.set(long_array21, 10, 0, 0);
    chunkedLongArray12.set(long_array21, 0, (int)'a', 0);
    chunkedLongArray12.add((long)'#');
    chunkedLongArray0.set(chunkedLongArray12, 1, (int)(byte)10, (int)(byte)1);
    long long37 = chunkedLongArray0.get((int)(short)1);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray();
    java.lang.String str39 = chunkedLongArray38.toString();
    long[] long_array40 = new long[] {  };
    chunkedLongArray38.set(long_array40, 10, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array40, 20, (int)(byte)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str13.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    chunkedLongArray0.add((long)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    long long12 = chunkedLongArray0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    ChunkedLongArray chunkedLongArray7 = new ChunkedLongArray();
    java.lang.String str8 = chunkedLongArray7.toString();
    long[] long_array9 = new long[] {  };
    chunkedLongArray7.set(long_array9, 10, 0, 0);
    chunkedLongArray0.set(long_array9, 0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    long long19 = chunkedLongArray0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i11 = chunkedLongArray0.size();
    chunkedLongArray0.set(0, (long)'#');
    ChunkedLongArray chunkedLongArray16 = new ChunkedLongArray((int)' ');
    java.lang.String str17 = chunkedLongArray16.toString();
    java.lang.String str18 = chunkedLongArray16.toString();
    long[] long_array25 = new long[] { 20, 10L, 1L, (byte)10, 1048576, 20 };
    chunkedLongArray16.set(long_array25, 1048576, 0, (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array25, (int)(byte)100, (int)(short)-1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str17.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array25);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    int i9 = chunkedLongArray0.size();
    java.lang.String str10 = chunkedLongArray0.toString();
    chunkedLongArray0.add((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 8MB)"+ "'", str10.equals("ChunkedLongArray(1 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.capacity();
    java.lang.String str11 = chunkedLongArray3.toString();
    chunkedLongArray0.set(chunkedLongArray3, 0, 100, (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = chunkedLongArray0.get((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    int i2 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    java.lang.String str4 = chunkedLongArray0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    // The following exception was thrown during execution in test generation
    try {
    long long9 = chunkedLongArray0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    int i11 = chunkedLongArray0.size();
    chunkedLongArray0.set(0, (long)'#');
    ChunkedLongArray chunkedLongArray15 = new ChunkedLongArray();
    java.lang.String str16 = chunkedLongArray15.toString();
    long[] long_array17 = new long[] {  };
    chunkedLongArray15.set(long_array17, 10, 0, 0);
    ChunkedLongArray chunkedLongArray22 = new ChunkedLongArray();
    java.lang.String str23 = chunkedLongArray22.toString();
    long[] long_array24 = new long[] {  };
    chunkedLongArray22.set(long_array24, 10, 0, 0);
    chunkedLongArray15.set(long_array24, 0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array24, (int)(short)-1, (int)(byte)10, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str16.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str23.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array24);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    chunkedLongArray0.add(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    java.lang.String str13 = chunkedLongArray12.toString();
    long[] long_array14 = new long[] {  };
    chunkedLongArray12.set(long_array14, 10, 0, 0);
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray();
    java.lang.String str20 = chunkedLongArray19.toString();
    long[] long_array21 = new long[] {  };
    chunkedLongArray19.set(long_array21, 10, 0, 0);
    chunkedLongArray12.set(long_array21, 0, (int)'a', 0);
    chunkedLongArray12.add((long)'#');
    chunkedLongArray0.set(chunkedLongArray12, 1, (int)(byte)10, (int)(byte)1);
    int i36 = chunkedLongArray12.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str13.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1048576);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    java.lang.String str13 = chunkedLongArray12.toString();
    long[] long_array14 = new long[] {  };
    chunkedLongArray12.set(long_array14, 10, 0, 0);
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray();
    java.lang.String str20 = chunkedLongArray19.toString();
    long[] long_array21 = new long[] {  };
    chunkedLongArray19.set(long_array21, 10, 0, 0);
    chunkedLongArray12.set(long_array21, 0, (int)'a', 0);
    chunkedLongArray12.add((long)'#');
    chunkedLongArray0.set(chunkedLongArray12, 1, (int)(byte)10, (int)(byte)1);
    long long37 = chunkedLongArray0.get((int)(short)1);
    ChunkedLongArray chunkedLongArray38 = new ChunkedLongArray();
    java.lang.String str39 = chunkedLongArray38.toString();
    long[] long_array40 = new long[] {  };
    chunkedLongArray38.set(long_array40, 10, 0, 0);
    int i45 = chunkedLongArray38.capacity();
    ChunkedLongArray chunkedLongArray46 = new ChunkedLongArray();
    java.lang.String str47 = chunkedLongArray46.toString();
    long[] long_array48 = new long[] {  };
    chunkedLongArray46.set(long_array48, 10, 0, 0);
    chunkedLongArray38.set(long_array48, (int)(short)-1, (int)'#', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array48, 1, (int)(short)0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str13.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str39.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str47.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array48);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.sort();
    chunkedLongArray0.add(10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(20);
    chunkedLongArray1.add((long)(byte)0);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    chunkedLongArray0.add((long)(-1));
    int i9 = chunkedLongArray0.size();
    java.lang.String str10 = chunkedLongArray0.toString();
    chunkedLongArray0.add((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 8MB)"+ "'", str10.equals("ChunkedLongArray(1 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1048576);
    java.lang.String str2 = chunkedLongArray1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long4 = chunkedLongArray1.get((int)(short)0);
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
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray3 = new ChunkedLongArray();
    java.lang.String str4 = chunkedLongArray3.toString();
    long[] long_array5 = new long[] {  };
    chunkedLongArray3.set(long_array5, 10, 0, 0);
    int i10 = chunkedLongArray3.capacity();
    java.lang.String str11 = chunkedLongArray3.toString();
    chunkedLongArray0.set(chunkedLongArray3, 0, 100, (int)(byte)-1);
    chunkedLongArray3.sort();
    ChunkedLongArray chunkedLongArray17 = new ChunkedLongArray();
    java.lang.String str18 = chunkedLongArray17.toString();
    long[] long_array19 = new long[] {  };
    chunkedLongArray17.set(long_array19, 10, 0, 0);
    chunkedLongArray17.add((long)(-1));
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray3.set(chunkedLongArray17, (-1), (int)'#', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str4.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str11.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str18.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.size();
    java.lang.String str8 = chunkedLongArray0.toString();
    int i9 = chunkedLongArray0.capacity();
    chunkedLongArray0.add((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1048576);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray((int)' ');
    java.lang.String str14 = chunkedLongArray13.toString();
    java.lang.String str15 = chunkedLongArray13.toString();
    long[] long_array22 = new long[] { 20, 10L, 1L, (byte)10, 1048576, 20 };
    chunkedLongArray13.set(long_array22, 1048576, 0, (int)(short)-1);
    chunkedLongArray0.set(long_array22, (int)(byte)0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str15.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    ChunkedLongArray chunkedLongArray8 = new ChunkedLongArray();
    java.lang.String str9 = chunkedLongArray8.toString();
    long[] long_array10 = new long[] {  };
    chunkedLongArray8.set(long_array10, 10, 0, 0);
    chunkedLongArray0.set(long_array10, (int)(short)-1, (int)'#', (int)(short)0);
    chunkedLongArray0.sort();
    chunkedLongArray0.add((long)100);
    chunkedLongArray0.sort();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str9.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array10);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    java.lang.String str8 = chunkedLongArray0.toString();
    chunkedLongArray0.set((int)(byte)10, (long)(-1));
    ChunkedLongArray chunkedLongArray12 = new ChunkedLongArray();
    java.lang.String str13 = chunkedLongArray12.toString();
    long[] long_array14 = new long[] {  };
    chunkedLongArray12.set(long_array14, 10, 0, 0);
    ChunkedLongArray chunkedLongArray19 = new ChunkedLongArray();
    java.lang.String str20 = chunkedLongArray19.toString();
    long[] long_array21 = new long[] {  };
    chunkedLongArray19.set(long_array21, 10, 0, 0);
    chunkedLongArray12.set(long_array21, 0, (int)'a', 0);
    chunkedLongArray12.add((long)'#');
    chunkedLongArray0.set(chunkedLongArray12, 1, (int)(byte)10, (int)(byte)1);
    long long37 = chunkedLongArray12.get(0);
    java.lang.String str38 = chunkedLongArray12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ChunkedLongArray(0 entries, 1 chunks, 8MB)"+ "'", str8.equals("ChunkedLongArray(0 entries, 1 chunks, 8MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str13.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str20.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "ChunkedLongArray(1 entries, 1 chunks, 8MB)"+ "'", str38.equals("ChunkedLongArray(1 entries, 1 chunks, 8MB)"));

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    java.lang.String str2 = chunkedLongArray0.toString();
    ChunkedLongArray chunkedLongArray4 = new ChunkedLongArray(20);
    java.lang.String str5 = chunkedLongArray4.toString();
    java.lang.String str6 = chunkedLongArray4.toString();
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(chunkedLongArray4, (int)(short)0, (int)'#', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str2.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str5.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str6.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    long[] long_array2 = new long[] {  };
    chunkedLongArray0.set(long_array2, 10, 0, 0);
    int i7 = chunkedLongArray0.capacity();
    int i8 = chunkedLongArray0.size();
    chunkedLongArray0.set(0, (long)(byte)0);
    chunkedLongArray0.sort();
    ChunkedLongArray chunkedLongArray13 = new ChunkedLongArray();
    java.lang.String str14 = chunkedLongArray13.toString();
    long[] long_array15 = new long[] {  };
    chunkedLongArray13.set(long_array15, 10, 0, 0);
    ChunkedLongArray chunkedLongArray20 = new ChunkedLongArray();
    java.lang.String str21 = chunkedLongArray20.toString();
    long[] long_array22 = new long[] {  };
    chunkedLongArray20.set(long_array22, 10, 0, 0);
    chunkedLongArray13.set(long_array22, 0, (int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    chunkedLongArray0.set(long_array22, 98, (int)(short)10, 20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str14.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str21.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray((-1));

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    ChunkedLongArray chunkedLongArray1 = new ChunkedLongArray(1048576);
    int i2 = chunkedLongArray1.capacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    ChunkedLongArray chunkedLongArray0 = new ChunkedLongArray();
    java.lang.String str1 = chunkedLongArray0.toString();
    int i2 = chunkedLongArray0.capacity();
    int i3 = chunkedLongArray0.capacity();
    int i4 = chunkedLongArray0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ChunkedLongArray(0 entries, 0 chunks, 0MB)"+ "'", str1.equals("ChunkedLongArray(0 entries, 0 chunks, 0MB)"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

}
