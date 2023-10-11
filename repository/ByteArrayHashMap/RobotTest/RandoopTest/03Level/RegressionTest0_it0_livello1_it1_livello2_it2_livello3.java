
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = bytearrayhashmap_byte_array2.get(byte_array9, (int)(short)0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    byte[] byte_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = bytearrayhashmap_byte_array2.containsKey(byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    byte[] byte_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = bytearrayhashmap_byte_array0.get(byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)-1, (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)' ', (float)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_byte_array0.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    byte[] byte_array17 = new byte[] { (byte)0, (byte)100, (byte)10, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array18 = bytearrayhashmap_byte_array0.put(byte_array12, byte_array17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    byte[] byte_array15 = new byte[] { (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = bytearrayhashmap_byte_array2.put(byte_array13, byte_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    bytearrayhashmap_byte_array2.clear();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)'a');
    byte[] byte_array2 = new byte[] {  };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = bytearrayhashmap_byte_array1.get(byte_array2, (int)(byte)100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    int i12 = bytearrayhashmap_byte_array2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b8 = bytearrayhashmap_byte_array2.containsKey(byte_array7);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_byte_array9.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    int i3 = bytearrayhashmap_byte_array2.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array7 = new byte[] {  };
    boolean b8 = bytearrayhashmap_byte_array6.containsKey(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array7, (int)'#', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(byte)-1, (float)10L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    boolean b6 = bytearrayhashmap_byte_array5.isEmpty();
    bytearrayhashmap_byte_array5.clear();
    int i8 = bytearrayhashmap_byte_array5.size();
    byte[] byte_array13 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array14 = bytearrayhashmap_byte_array5.get(byte_array13);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = new ByteArrayHashMap<byte[]>();
    boolean b16 = bytearrayhashmap_byte_array15.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = bytearrayhashmap_byte_array15.duplicate();
    boolean b18 = bytearrayhashmap_byte_array17.isEmpty();
    bytearrayhashmap_byte_array17.clear();
    int i20 = bytearrayhashmap_byte_array17.size();
    byte[] byte_array25 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array26 = bytearrayhashmap_byte_array17.get(byte_array25);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>();
    boolean b28 = bytearrayhashmap_byte_array27.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array29 = bytearrayhashmap_byte_array27.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = new ByteArrayHashMap<byte[]>();
    boolean b31 = bytearrayhashmap_byte_array30.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = bytearrayhashmap_byte_array30.duplicate();
    byte[] byte_array38 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array39 = bytearrayhashmap_byte_array30.remove(byte_array38);
    boolean b40 = bytearrayhashmap_byte_array27.containsKey(byte_array38);
    byte[] byte_array41 = bytearrayhashmap_byte_array5.put(byte_array25, byte_array38);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array42 = bytearrayhashmap_byte_array2.get(byte_array41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array41);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b8 = bytearrayhashmap_byte_array2.containsKey(byte_array7);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array9.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((-1), (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)(short)0);
    bytearrayhashmap_byte_array1.clear();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array12.duplicate();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    bytearrayhashmap_byte_array14.clear();
    int i17 = bytearrayhashmap_byte_array14.size();
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.get(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>();
    boolean b28 = bytearrayhashmap_byte_array27.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array29 = bytearrayhashmap_byte_array27.duplicate();
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array36 = bytearrayhashmap_byte_array27.remove(byte_array35);
    boolean b37 = bytearrayhashmap_byte_array24.containsKey(byte_array35);
    byte[] byte_array38 = bytearrayhashmap_byte_array2.put(byte_array22, byte_array35);
    byte[] byte_array39 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array40 = bytearrayhashmap_byte_array2.get(byte_array39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array0.containsKey(byte_array11);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array14.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = new ByteArrayHashMap<byte[]>();
    boolean b18 = bytearrayhashmap_byte_array17.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = bytearrayhashmap_byte_array17.duplicate();
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array26 = bytearrayhashmap_byte_array17.remove(byte_array25);
    boolean b27 = bytearrayhashmap_byte_array14.containsKey(byte_array25);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array30 = bytearrayhashmap_byte_array0.get(byte_array25, (int)(byte)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b8 = bytearrayhashmap_byte_array2.containsKey(byte_array7);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = new ByteArrayHashMap<byte[]>();
    boolean b11 = bytearrayhashmap_byte_array10.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = bytearrayhashmap_byte_array10.duplicate();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    bytearrayhashmap_byte_array12.clear();
    int i15 = bytearrayhashmap_byte_array12.size();
    byte[] byte_array20 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array21 = bytearrayhashmap_byte_array12.get(byte_array20);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = new ByteArrayHashMap<byte[]>();
    boolean b23 = bytearrayhashmap_byte_array22.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = bytearrayhashmap_byte_array22.duplicate();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    bytearrayhashmap_byte_array24.clear();
    int i27 = bytearrayhashmap_byte_array24.size();
    byte[] byte_array32 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array33 = bytearrayhashmap_byte_array24.get(byte_array32);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array34 = new ByteArrayHashMap<byte[]>();
    boolean b35 = bytearrayhashmap_byte_array34.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array36 = bytearrayhashmap_byte_array34.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array37 = new ByteArrayHashMap<byte[]>();
    boolean b38 = bytearrayhashmap_byte_array37.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = bytearrayhashmap_byte_array37.duplicate();
    byte[] byte_array45 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array46 = bytearrayhashmap_byte_array37.remove(byte_array45);
    boolean b47 = bytearrayhashmap_byte_array34.containsKey(byte_array45);
    byte[] byte_array48 = bytearrayhashmap_byte_array12.put(byte_array32, byte_array45);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array51 = bytearrayhashmap_byte_array9.get(byte_array32, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array48);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    boolean b4 = bytearrayhashmap_byte_array2.isEmpty();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array6 = new byte[] {  };
    boolean b7 = bytearrayhashmap_byte_array5.containsKey(byte_array6);
    byte[] byte_array10 = bytearrayhashmap_byte_array2.get(byte_array6, 0, 0);
    int i11 = bytearrayhashmap_byte_array2.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array12.duplicate();
    java.util.List<byte[]> list_byte_array15 = bytearrayhashmap_byte_array14.values();
    byte[] byte_array19 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b20 = bytearrayhashmap_byte_array14.containsKey(byte_array19);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array21 = bytearrayhashmap_byte_array14.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = new ByteArrayHashMap<byte[]>();
    boolean b23 = bytearrayhashmap_byte_array22.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = bytearrayhashmap_byte_array22.duplicate();
    byte[] byte_array30 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array31 = bytearrayhashmap_byte_array22.remove(byte_array30);
    boolean b32 = bytearrayhashmap_byte_array14.containsKey(byte_array30);
    boolean b33 = bytearrayhashmap_byte_array2.containsKey(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array12.duplicate();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    bytearrayhashmap_byte_array14.clear();
    int i17 = bytearrayhashmap_byte_array14.size();
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.get(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>();
    boolean b28 = bytearrayhashmap_byte_array27.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array29 = bytearrayhashmap_byte_array27.duplicate();
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array36 = bytearrayhashmap_byte_array27.remove(byte_array35);
    boolean b37 = bytearrayhashmap_byte_array24.containsKey(byte_array35);
    byte[] byte_array38 = bytearrayhashmap_byte_array2.put(byte_array22, byte_array35);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>();
    boolean b40 = bytearrayhashmap_byte_array39.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array41 = bytearrayhashmap_byte_array39.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>();
    boolean b43 = bytearrayhashmap_byte_array42.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array44 = bytearrayhashmap_byte_array42.duplicate();
    byte[] byte_array50 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array51 = bytearrayhashmap_byte_array42.remove(byte_array50);
    boolean b52 = bytearrayhashmap_byte_array41.containsKey(byte_array50);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array55 = bytearrayhashmap_byte_array2.get(byte_array50, (int)(short)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>();
    boolean b2 = bytearrayhashmap_byte_array1.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array1.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    boolean b14 = bytearrayhashmap_byte_array1.containsKey(byte_array12);
    byte[] byte_array15 = bytearrayhashmap_byte_array0.remove(byte_array12);
    int i16 = bytearrayhashmap_byte_array0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)' ', (float)'#');
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    int i3 = bytearrayhashmap_byte_array2.size();
    bytearrayhashmap_byte_array2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    boolean b4 = bytearrayhashmap_byte_array2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'4', (float)'4');

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array0.containsKey(byte_array11);
    bytearrayhashmap_byte_array0.clear();
    java.util.List<byte[]> list_byte_array15 = bytearrayhashmap_byte_array0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array15);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array6 = new byte[] {  };
    boolean b7 = bytearrayhashmap_byte_array5.containsKey(byte_array6);
    byte[] byte_array10 = bytearrayhashmap_byte_array2.get(byte_array6, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array11 = new ByteArrayHashMap<byte[]>();
    boolean b12 = bytearrayhashmap_byte_array11.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = bytearrayhashmap_byte_array11.duplicate();
    java.util.List<byte[]> list_byte_array14 = bytearrayhashmap_byte_array13.values();
    byte[] byte_array18 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b19 = bytearrayhashmap_byte_array13.containsKey(byte_array18);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = bytearrayhashmap_byte_array13.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array21 = new ByteArrayHashMap<byte[]>();
    boolean b22 = bytearrayhashmap_byte_array21.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array23 = bytearrayhashmap_byte_array21.duplicate();
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array30 = bytearrayhashmap_byte_array21.remove(byte_array29);
    boolean b31 = bytearrayhashmap_byte_array13.containsKey(byte_array29);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array34 = bytearrayhashmap_byte_array2.get(byte_array29, (-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    int i3 = bytearrayhashmap_byte_array2.size();
    boolean b4 = bytearrayhashmap_byte_array2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>(10);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array2.containsKey(byte_array11);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    int i3 = bytearrayhashmap_byte_array0.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array10 = new byte[] {  };
    boolean b11 = bytearrayhashmap_byte_array9.containsKey(byte_array10);
    byte[] byte_array14 = bytearrayhashmap_byte_array6.get(byte_array10, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = new ByteArrayHashMap<byte[]>();
    boolean b16 = bytearrayhashmap_byte_array15.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = bytearrayhashmap_byte_array15.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array18 = new ByteArrayHashMap<byte[]>();
    boolean b19 = bytearrayhashmap_byte_array18.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = bytearrayhashmap_byte_array18.duplicate();
    byte[] byte_array26 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array27 = bytearrayhashmap_byte_array18.remove(byte_array26);
    boolean b28 = bytearrayhashmap_byte_array15.containsKey(byte_array26);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array34 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array35 = new byte[] {  };
    boolean b36 = bytearrayhashmap_byte_array34.containsKey(byte_array35);
    byte[] byte_array39 = bytearrayhashmap_byte_array31.get(byte_array35, 0, 0);
    byte[] byte_array40 = bytearrayhashmap_byte_array6.put(byte_array26, byte_array35);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array43 = bytearrayhashmap_byte_array0.get(byte_array35, (int)' ', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array40);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array0.keys();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)1, (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)' ', (float)10L);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(byte)-1, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array2.containsKey(byte_array11);
    java.util.List<byte[]> list_byte_array14 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array14);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    bytearrayhashmap_byte_array0.clear();
    boolean b4 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array11 = new byte[] {  };
    boolean b12 = bytearrayhashmap_byte_array10.containsKey(byte_array11);
    byte[] byte_array15 = bytearrayhashmap_byte_array7.get(byte_array11, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = bytearrayhashmap_byte_array0.containsKey(byte_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)(byte)0);
    bytearrayhashmap_byte_array1.clear();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array1.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>();
    boolean b8 = bytearrayhashmap_byte_array7.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array7.duplicate();
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array16 = bytearrayhashmap_byte_array7.remove(byte_array15);
    boolean b17 = bytearrayhashmap_byte_array4.containsKey(byte_array15);
    byte[] byte_array18 = bytearrayhashmap_byte_array1.remove(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array18);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(byte)10, (float)10L);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((-1), 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>();
    boolean b2 = bytearrayhashmap_byte_array1.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array1.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    boolean b14 = bytearrayhashmap_byte_array1.containsKey(byte_array12);
    byte[] byte_array15 = bytearrayhashmap_byte_array0.remove(byte_array12);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_byte_array0.values();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_byte_array0.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array18 = new ByteArrayHashMap<byte[]>();
    boolean b19 = bytearrayhashmap_byte_array18.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = bytearrayhashmap_byte_array18.duplicate();
    boolean b21 = bytearrayhashmap_byte_array20.isEmpty();
    bytearrayhashmap_byte_array20.clear();
    int i23 = bytearrayhashmap_byte_array20.size();
    byte[] byte_array28 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array29 = bytearrayhashmap_byte_array20.get(byte_array28);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = new ByteArrayHashMap<byte[]>();
    boolean b31 = bytearrayhashmap_byte_array30.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = bytearrayhashmap_byte_array30.duplicate();
    boolean b33 = bytearrayhashmap_byte_array32.isEmpty();
    bytearrayhashmap_byte_array32.clear();
    int i35 = bytearrayhashmap_byte_array32.size();
    byte[] byte_array40 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array41 = bytearrayhashmap_byte_array32.get(byte_array40);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>();
    boolean b43 = bytearrayhashmap_byte_array42.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array44 = bytearrayhashmap_byte_array42.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array45 = new ByteArrayHashMap<byte[]>();
    boolean b46 = bytearrayhashmap_byte_array45.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array47 = bytearrayhashmap_byte_array45.duplicate();
    byte[] byte_array53 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array54 = bytearrayhashmap_byte_array45.remove(byte_array53);
    boolean b55 = bytearrayhashmap_byte_array42.containsKey(byte_array53);
    byte[] byte_array56 = bytearrayhashmap_byte_array20.put(byte_array40, byte_array53);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array57 = bytearrayhashmap_byte_array0.remove(byte_array56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array56);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)(short)10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_byte_array4.values();
    byte[] byte_array9 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b10 = bytearrayhashmap_byte_array4.containsKey(byte_array9);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array14.duplicate();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_byte_array16.values();
    byte[] byte_array21 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b22 = bytearrayhashmap_byte_array16.containsKey(byte_array21);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array23 = bytearrayhashmap_byte_array16.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array33 = bytearrayhashmap_byte_array24.remove(byte_array32);
    boolean b34 = bytearrayhashmap_byte_array16.containsKey(byte_array32);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array35 = new ByteArrayHashMap<byte[]>();
    boolean b36 = bytearrayhashmap_byte_array35.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array37 = bytearrayhashmap_byte_array35.duplicate();
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array44 = bytearrayhashmap_byte_array35.remove(byte_array43);
    byte[] byte_array45 = bytearrayhashmap_byte_array13.put(byte_array32, byte_array43);
    byte[] byte_array46 = bytearrayhashmap_byte_array1.put(byte_array9, byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array46);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    boolean b12 = bytearrayhashmap_byte_array2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)'#');
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = bytearrayhashmap_byte_array2.duplicate();
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.remove(byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = bytearrayhashmap_byte_array1.remove(byte_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)'4');
    boolean b2 = bytearrayhashmap_byte_array1.isEmpty();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>();
    boolean b2 = bytearrayhashmap_byte_array1.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array1.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    boolean b14 = bytearrayhashmap_byte_array1.containsKey(byte_array12);
    byte[] byte_array15 = bytearrayhashmap_byte_array0.remove(byte_array12);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = new ByteArrayHashMap<byte[]>();
    boolean b17 = bytearrayhashmap_byte_array16.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array18 = bytearrayhashmap_byte_array16.duplicate();
    java.util.List<byte[]> list_byte_array19 = bytearrayhashmap_byte_array18.values();
    byte[] byte_array23 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b24 = bytearrayhashmap_byte_array18.containsKey(byte_array23);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = bytearrayhashmap_byte_array18.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = new ByteArrayHashMap<byte[]>();
    boolean b27 = bytearrayhashmap_byte_array26.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = bytearrayhashmap_byte_array26.duplicate();
    byte[] byte_array34 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array35 = bytearrayhashmap_byte_array26.remove(byte_array34);
    boolean b36 = bytearrayhashmap_byte_array18.containsKey(byte_array34);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array37 = new ByteArrayHashMap<byte[]>();
    boolean b38 = bytearrayhashmap_byte_array37.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = bytearrayhashmap_byte_array37.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array40 = new ByteArrayHashMap<byte[]>();
    boolean b41 = bytearrayhashmap_byte_array40.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = bytearrayhashmap_byte_array40.duplicate();
    byte[] byte_array48 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array49 = bytearrayhashmap_byte_array40.remove(byte_array48);
    boolean b50 = bytearrayhashmap_byte_array37.containsKey(byte_array48);
    byte[] byte_array51 = bytearrayhashmap_byte_array18.remove(byte_array48);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array54 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array55 = new ByteArrayHashMap<byte[]>();
    boolean b56 = bytearrayhashmap_byte_array55.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array57 = bytearrayhashmap_byte_array55.duplicate();
    java.util.List<byte[]> list_byte_array58 = bytearrayhashmap_byte_array57.values();
    byte[] byte_array62 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b63 = bytearrayhashmap_byte_array57.containsKey(byte_array62);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array64 = bytearrayhashmap_byte_array57.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array65 = new ByteArrayHashMap<byte[]>();
    boolean b66 = bytearrayhashmap_byte_array65.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array67 = bytearrayhashmap_byte_array65.duplicate();
    byte[] byte_array73 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array74 = bytearrayhashmap_byte_array65.remove(byte_array73);
    boolean b75 = bytearrayhashmap_byte_array57.containsKey(byte_array73);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array76 = new ByteArrayHashMap<byte[]>();
    boolean b77 = bytearrayhashmap_byte_array76.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array78 = bytearrayhashmap_byte_array76.duplicate();
    byte[] byte_array84 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array85 = bytearrayhashmap_byte_array76.remove(byte_array84);
    byte[] byte_array86 = bytearrayhashmap_byte_array54.put(byte_array73, byte_array84);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array87 = bytearrayhashmap_byte_array0.put(byte_array51, byte_array73);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array86);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array6 = new byte[] {  };
    boolean b7 = bytearrayhashmap_byte_array5.containsKey(byte_array6);
    byte[] byte_array10 = bytearrayhashmap_byte_array2.get(byte_array6, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array11 = new ByteArrayHashMap<byte[]>();
    boolean b12 = bytearrayhashmap_byte_array11.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = bytearrayhashmap_byte_array11.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array14.duplicate();
    byte[] byte_array22 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.remove(byte_array22);
    boolean b24 = bytearrayhashmap_byte_array11.containsKey(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array31 = new byte[] {  };
    boolean b32 = bytearrayhashmap_byte_array30.containsKey(byte_array31);
    byte[] byte_array35 = bytearrayhashmap_byte_array27.get(byte_array31, 0, 0);
    byte[] byte_array36 = bytearrayhashmap_byte_array2.put(byte_array22, byte_array31);
    bytearrayhashmap_byte_array2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array2.containsKey(byte_array11);
    int i14 = bytearrayhashmap_byte_array2.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array15);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    int i3 = bytearrayhashmap_byte_array0.size();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)1, (float)100L);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_byte_array0.values();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array0.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>((int)'4');
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>();
    boolean b8 = bytearrayhashmap_byte_array7.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array7.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = new ByteArrayHashMap<byte[]>();
    boolean b11 = bytearrayhashmap_byte_array10.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = bytearrayhashmap_byte_array10.duplicate();
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array19 = bytearrayhashmap_byte_array10.remove(byte_array18);
    boolean b20 = bytearrayhashmap_byte_array7.containsKey(byte_array18);
    byte[] byte_array21 = bytearrayhashmap_byte_array6.remove(byte_array18);
    byte[] byte_array22 = bytearrayhashmap_byte_array5.remove(byte_array18);
    boolean b23 = bytearrayhashmap_byte_array0.containsKey(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array3 = new byte[] {  };
    boolean b4 = bytearrayhashmap_byte_array2.containsKey(byte_array3);
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)100, 10.0f);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array9 = bytearrayhashmap_byte_array0.remove(byte_array8);
    bytearrayhashmap_byte_array0.clear();
    boolean b11 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array18 = new byte[] {  };
    boolean b19 = bytearrayhashmap_byte_array17.containsKey(byte_array18);
    byte[] byte_array22 = bytearrayhashmap_byte_array14.get(byte_array18, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array23 = new ByteArrayHashMap<byte[]>();
    boolean b24 = bytearrayhashmap_byte_array23.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = bytearrayhashmap_byte_array23.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = new ByteArrayHashMap<byte[]>();
    boolean b27 = bytearrayhashmap_byte_array26.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = bytearrayhashmap_byte_array26.duplicate();
    byte[] byte_array34 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array35 = bytearrayhashmap_byte_array26.remove(byte_array34);
    boolean b36 = bytearrayhashmap_byte_array23.containsKey(byte_array34);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array43 = new byte[] {  };
    boolean b44 = bytearrayhashmap_byte_array42.containsKey(byte_array43);
    byte[] byte_array47 = bytearrayhashmap_byte_array39.get(byte_array43, 0, 0);
    byte[] byte_array48 = bytearrayhashmap_byte_array14.put(byte_array34, byte_array43);
    boolean b49 = bytearrayhashmap_byte_array0.containsKey(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(100, (float)10);
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array10 = new byte[] {  };
    boolean b11 = bytearrayhashmap_byte_array9.containsKey(byte_array10);
    byte[] byte_array14 = bytearrayhashmap_byte_array6.get(byte_array10, 0, 0);
    boolean b15 = bytearrayhashmap_byte_array2.containsKey(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    bytearrayhashmap_byte_array4.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = new ByteArrayHashMap<byte[]>();
    boolean b16 = bytearrayhashmap_byte_array15.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = bytearrayhashmap_byte_array15.duplicate();
    byte[] byte_array23 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array24 = bytearrayhashmap_byte_array15.remove(byte_array23);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = new ByteArrayHashMap<byte[]>();
    boolean b26 = bytearrayhashmap_byte_array25.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = bytearrayhashmap_byte_array25.duplicate();
    java.util.List<byte[]> list_byte_array28 = bytearrayhashmap_byte_array27.values();
    byte[] byte_array32 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b33 = bytearrayhashmap_byte_array27.containsKey(byte_array32);
    byte[] byte_array34 = bytearrayhashmap_byte_array4.put(byte_array23, byte_array32);
    byte[] byte_array35 = bytearrayhashmap_byte_array2.get(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array12.duplicate();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    bytearrayhashmap_byte_array14.clear();
    int i17 = bytearrayhashmap_byte_array14.size();
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.get(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>();
    boolean b28 = bytearrayhashmap_byte_array27.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array29 = bytearrayhashmap_byte_array27.duplicate();
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array36 = bytearrayhashmap_byte_array27.remove(byte_array35);
    boolean b37 = bytearrayhashmap_byte_array24.containsKey(byte_array35);
    byte[] byte_array38 = bytearrayhashmap_byte_array2.put(byte_array22, byte_array35);
    byte[] byte_array42 = new byte[] { (byte)1, (byte)100, (byte)0 };
    byte[] byte_array43 = bytearrayhashmap_byte_array2.get(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array43);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b8 = bytearrayhashmap_byte_array2.containsKey(byte_array7);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_byte_array2.values();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array2.keys();
    java.util.List<byte[]> list_byte_array12 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array12);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)'a');
    bytearrayhashmap_byte_array1.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array8 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array9 = new byte[] {  };
    boolean b10 = bytearrayhashmap_byte_array8.containsKey(byte_array9);
    byte[] byte_array13 = bytearrayhashmap_byte_array5.get(byte_array9, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array14.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = new ByteArrayHashMap<byte[]>();
    boolean b18 = bytearrayhashmap_byte_array17.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = bytearrayhashmap_byte_array17.duplicate();
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array26 = bytearrayhashmap_byte_array17.remove(byte_array25);
    boolean b27 = bytearrayhashmap_byte_array14.containsKey(byte_array25);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array33 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array34 = new byte[] {  };
    boolean b35 = bytearrayhashmap_byte_array33.containsKey(byte_array34);
    byte[] byte_array38 = bytearrayhashmap_byte_array30.get(byte_array34, 0, 0);
    byte[] byte_array39 = bytearrayhashmap_byte_array5.put(byte_array25, byte_array34);
    boolean b40 = bytearrayhashmap_byte_array1.containsKey(byte_array25);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array43 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array44 = new ByteArrayHashMap<byte[]>();
    boolean b45 = bytearrayhashmap_byte_array44.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array46 = bytearrayhashmap_byte_array44.duplicate();
    java.util.List<byte[]> list_byte_array47 = bytearrayhashmap_byte_array46.values();
    byte[] byte_array51 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b52 = bytearrayhashmap_byte_array46.containsKey(byte_array51);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array53 = bytearrayhashmap_byte_array46.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array54 = new ByteArrayHashMap<byte[]>();
    boolean b55 = bytearrayhashmap_byte_array54.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array56 = bytearrayhashmap_byte_array54.duplicate();
    byte[] byte_array62 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array63 = bytearrayhashmap_byte_array54.remove(byte_array62);
    boolean b64 = bytearrayhashmap_byte_array46.containsKey(byte_array62);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array65 = new ByteArrayHashMap<byte[]>();
    boolean b66 = bytearrayhashmap_byte_array65.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array67 = bytearrayhashmap_byte_array65.duplicate();
    byte[] byte_array73 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array74 = bytearrayhashmap_byte_array65.remove(byte_array73);
    byte[] byte_array75 = bytearrayhashmap_byte_array43.put(byte_array62, byte_array73);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array76 = bytearrayhashmap_byte_array1.remove(byte_array75);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array75);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)100, 100.0f);
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(byte)1, (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    java.util.List<byte[]> list_byte_array7 = bytearrayhashmap_byte_array6.values();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b12 = bytearrayhashmap_byte_array6.containsKey(byte_array11);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = bytearrayhashmap_byte_array6.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array14.duplicate();
    byte[] byte_array22 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.remove(byte_array22);
    boolean b24 = bytearrayhashmap_byte_array6.containsKey(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = new ByteArrayHashMap<byte[]>();
    boolean b26 = bytearrayhashmap_byte_array25.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = bytearrayhashmap_byte_array25.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = new ByteArrayHashMap<byte[]>();
    boolean b29 = bytearrayhashmap_byte_array28.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = bytearrayhashmap_byte_array28.duplicate();
    byte[] byte_array36 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array37 = bytearrayhashmap_byte_array28.remove(byte_array36);
    boolean b38 = bytearrayhashmap_byte_array25.containsKey(byte_array36);
    byte[] byte_array39 = bytearrayhashmap_byte_array6.remove(byte_array36);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array42 = bytearrayhashmap_byte_array2.get(byte_array36, (int)(byte)-1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    int i3 = bytearrayhashmap_byte_array0.size();
    bytearrayhashmap_byte_array0.clear();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_byte_array0.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>((int)'a');
    bytearrayhashmap_byte_array7.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array11 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_byte_array14.containsKey(byte_array15);
    byte[] byte_array19 = bytearrayhashmap_byte_array11.get(byte_array15, 0, 0);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = new ByteArrayHashMap<byte[]>();
    boolean b21 = bytearrayhashmap_byte_array20.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = bytearrayhashmap_byte_array20.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array23 = new ByteArrayHashMap<byte[]>();
    boolean b24 = bytearrayhashmap_byte_array23.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = bytearrayhashmap_byte_array23.duplicate();
    byte[] byte_array31 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array32 = bytearrayhashmap_byte_array23.remove(byte_array31);
    boolean b33 = bytearrayhashmap_byte_array20.containsKey(byte_array31);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array36 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>(10, (float)(byte)1);
    byte[] byte_array40 = new byte[] {  };
    boolean b41 = bytearrayhashmap_byte_array39.containsKey(byte_array40);
    byte[] byte_array44 = bytearrayhashmap_byte_array36.get(byte_array40, 0, 0);
    byte[] byte_array45 = bytearrayhashmap_byte_array11.put(byte_array31, byte_array40);
    boolean b46 = bytearrayhashmap_byte_array7.containsKey(byte_array31);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array47 = new ByteArrayHashMap<byte[]>();
    boolean b48 = bytearrayhashmap_byte_array47.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array49 = bytearrayhashmap_byte_array47.duplicate();
    java.util.List<byte[]> list_byte_array50 = bytearrayhashmap_byte_array49.values();
    byte[] byte_array54 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b55 = bytearrayhashmap_byte_array49.containsKey(byte_array54);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array56 = bytearrayhashmap_byte_array49.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array57 = new ByteArrayHashMap<byte[]>();
    boolean b58 = bytearrayhashmap_byte_array57.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array59 = bytearrayhashmap_byte_array57.duplicate();
    byte[] byte_array65 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array66 = bytearrayhashmap_byte_array57.remove(byte_array65);
    boolean b67 = bytearrayhashmap_byte_array49.containsKey(byte_array65);
    byte[] byte_array68 = bytearrayhashmap_byte_array7.remove(byte_array65);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array69 = bytearrayhashmap_byte_array0.remove(byte_array68);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array68);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_byte_array5.values();
    byte[] byte_array10 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b11 = bytearrayhashmap_byte_array5.containsKey(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = bytearrayhashmap_byte_array5.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = new ByteArrayHashMap<byte[]>();
    boolean b14 = bytearrayhashmap_byte_array13.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = bytearrayhashmap_byte_array13.duplicate();
    byte[] byte_array21 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array22 = bytearrayhashmap_byte_array13.remove(byte_array21);
    boolean b23 = bytearrayhashmap_byte_array5.containsKey(byte_array21);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array33 = bytearrayhashmap_byte_array24.remove(byte_array32);
    byte[] byte_array34 = bytearrayhashmap_byte_array2.put(byte_array21, byte_array32);
    java.util.List<byte[]> list_byte_array35 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array35);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)(short)10);
    bytearrayhashmap_byte_array1.clear();

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)100, (float)(byte)100);
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array0.containsKey(byte_array11);
    bytearrayhashmap_byte_array0.clear();
    boolean b15 = bytearrayhashmap_byte_array0.isEmpty();
    bytearrayhashmap_byte_array0.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = new ByteArrayHashMap<byte[]>();
    boolean b18 = bytearrayhashmap_byte_array17.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = bytearrayhashmap_byte_array17.duplicate();
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array26 = bytearrayhashmap_byte_array17.remove(byte_array25);
    byte[] byte_array27 = bytearrayhashmap_byte_array0.get(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array27);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    bytearrayhashmap_byte_array2.clear();
    int i5 = bytearrayhashmap_byte_array2.size();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array11 = bytearrayhashmap_byte_array2.get(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>();
    boolean b13 = bytearrayhashmap_byte_array12.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = bytearrayhashmap_byte_array12.duplicate();
    boolean b15 = bytearrayhashmap_byte_array14.isEmpty();
    bytearrayhashmap_byte_array14.clear();
    int i17 = bytearrayhashmap_byte_array14.size();
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)1, (byte)100, (byte)0 };
    byte[] byte_array23 = bytearrayhashmap_byte_array14.get(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>();
    boolean b25 = bytearrayhashmap_byte_array24.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = bytearrayhashmap_byte_array24.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>();
    boolean b28 = bytearrayhashmap_byte_array27.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array29 = bytearrayhashmap_byte_array27.duplicate();
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array36 = bytearrayhashmap_byte_array27.remove(byte_array35);
    boolean b37 = bytearrayhashmap_byte_array24.containsKey(byte_array35);
    byte[] byte_array38 = bytearrayhashmap_byte_array2.put(byte_array22, byte_array35);
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array40 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array40);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    boolean b4 = bytearrayhashmap_byte_array3.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = bytearrayhashmap_byte_array3.duplicate();
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array12 = bytearrayhashmap_byte_array3.remove(byte_array11);
    boolean b13 = bytearrayhashmap_byte_array0.containsKey(byte_array11);
    bytearrayhashmap_byte_array0.clear();
    boolean b15 = bytearrayhashmap_byte_array0.isEmpty();
    byte[] byte_array16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = bytearrayhashmap_byte_array0.containsKey(byte_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>(0, (float)1L);
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    boolean b1 = bytearrayhashmap_byte_array0.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = bytearrayhashmap_byte_array0.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b8 = bytearrayhashmap_byte_array2.containsKey(byte_array7);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array9 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = new ByteArrayHashMap<byte[]>();
    boolean b11 = bytearrayhashmap_byte_array10.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = bytearrayhashmap_byte_array10.duplicate();
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array19 = bytearrayhashmap_byte_array10.remove(byte_array18);
    boolean b20 = bytearrayhashmap_byte_array2.containsKey(byte_array18);
    java.util.List<byte[]> list_byte_array21 = bytearrayhashmap_byte_array2.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = new ByteArrayHashMap<byte[]>();
    boolean b23 = bytearrayhashmap_byte_array22.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = bytearrayhashmap_byte_array22.duplicate();
    java.util.List<byte[]> list_byte_array25 = bytearrayhashmap_byte_array24.values();
    byte[] byte_array29 = new byte[] { (byte)0, (byte)10, (byte)100 };
    boolean b30 = bytearrayhashmap_byte_array24.containsKey(byte_array29);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = bytearrayhashmap_byte_array24.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = new ByteArrayHashMap<byte[]>();
    boolean b33 = bytearrayhashmap_byte_array32.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array34 = bytearrayhashmap_byte_array32.duplicate();
    byte[] byte_array40 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array41 = bytearrayhashmap_byte_array32.remove(byte_array40);
    boolean b42 = bytearrayhashmap_byte_array24.containsKey(byte_array40);
    boolean b43 = bytearrayhashmap_byte_array2.containsKey(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>();
    boolean b2 = bytearrayhashmap_byte_array1.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array1.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>();
    boolean b5 = bytearrayhashmap_byte_array4.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = bytearrayhashmap_byte_array4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0, (byte)-1, (byte)10, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array4.remove(byte_array12);
    boolean b14 = bytearrayhashmap_byte_array1.containsKey(byte_array12);
    byte[] byte_array15 = bytearrayhashmap_byte_array0.remove(byte_array12);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_byte_array0.values();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_byte_array0.keys();
    java.util.List<byte[]> list_byte_array18 = bytearrayhashmap_byte_array0.keys();
    int i19 = bytearrayhashmap_byte_array0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

}
