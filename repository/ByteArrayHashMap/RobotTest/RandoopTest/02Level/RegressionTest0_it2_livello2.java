
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(byte)1, (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b10 = bytearrayhashmap_f3.containsKey(byte_array9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f13 = bytearrayhashmap_f1.get(byte_array9, (int)(byte)-1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_f1.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b11 = bytearrayhashmap_f4.containsKey(byte_array10);
    java.lang.Float f12 = bytearrayhashmap_f1.remove(byte_array10);
    java.util.List<byte[]> list_byte_array13 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array13);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    java.util.List<java.lang.Float> list_f10 = bytearrayhashmap_f1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    int i11 = bytearrayhashmap_f1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>(0, (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    int i2 = bytearrayhashmap_f1.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = bytearrayhashmap_f1.duplicate();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    int i2 = bytearrayhashmap_f1.size();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b13 = bytearrayhashmap_f6.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f3.remove(byte_array12);
    java.lang.Float f16 = bytearrayhashmap_f1.put(byte_array12, (java.lang.Float)(-1.0f));
    boolean b17 = bytearrayhashmap_f1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    java.util.List<byte[]> list_byte_array12 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array12);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(short)-1, (float)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((-1));
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


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b13 = bytearrayhashmap_f6.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f3.remove(byte_array12);
    java.lang.Float f16 = bytearrayhashmap_f1.put(byte_array12, (java.lang.Float)(-1.0f));
    int i17 = bytearrayhashmap_f1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b13 = bytearrayhashmap_f6.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f3.remove(byte_array12);
    java.lang.Float f16 = bytearrayhashmap_f1.put(byte_array12, (java.lang.Float)(-1.0f));
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f18 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array24 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b25 = bytearrayhashmap_f18.containsKey(byte_array24);
    bytearrayhashmap_f18.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f28 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array34 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b35 = bytearrayhashmap_f28.containsKey(byte_array34);
    boolean b36 = bytearrayhashmap_f18.containsKey(byte_array34);
    java.lang.Float f38 = bytearrayhashmap_f1.put(byte_array34, (java.lang.Float)1.0f);
    byte[] byte_array39 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f40 = bytearrayhashmap_f1.get(byte_array39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f38 + "' != '" + (-1.0f)+ "'", f38.equals((-1.0f)));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_f1.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b11 = bytearrayhashmap_f4.containsKey(byte_array10);
    java.lang.Float f12 = bytearrayhashmap_f1.remove(byte_array10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f13 = bytearrayhashmap_f1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f13);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = bytearrayhashmap_f1.duplicate();
    boolean b5 = bytearrayhashmap_f4.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f7 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array13 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b14 = bytearrayhashmap_f7.containsKey(byte_array13);
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_f7.containsKey(byte_array15);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f19 = bytearrayhashmap_f4.get(byte_array15, (int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    java.util.List<byte[]> list_byte_array9 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array9);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>(1);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f5 = bytearrayhashmap_f4.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f7 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array13 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b14 = bytearrayhashmap_f7.containsKey(byte_array13);
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_f7.containsKey(byte_array15);
    java.lang.Float f17 = bytearrayhashmap_f4.remove(byte_array15);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f20 = bytearrayhashmap_f1.get(byte_array15, (int)(byte)0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f17);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((-1), (float)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>(100, (float)'#');

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f13 = new ByteArrayHashMap<java.lang.Float>(1);
    int i14 = bytearrayhashmap_f13.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f16 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b23 = bytearrayhashmap_f16.containsKey(byte_array22);
    byte[] byte_array24 = new byte[] {  };
    boolean b25 = bytearrayhashmap_f16.containsKey(byte_array24);
    java.lang.Float f26 = bytearrayhashmap_f13.get(byte_array24);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f27 = bytearrayhashmap_f13.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f29 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array35 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b36 = bytearrayhashmap_f29.containsKey(byte_array35);
    byte[] byte_array37 = new byte[] {  };
    boolean b38 = bytearrayhashmap_f29.containsKey(byte_array37);
    java.lang.Float f39 = bytearrayhashmap_f13.get(byte_array37);
    boolean b40 = bytearrayhashmap_f11.containsKey(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f12 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array13 = bytearrayhashmap_f12.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f15 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array21 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b22 = bytearrayhashmap_f15.containsKey(byte_array21);
    java.lang.Float f23 = bytearrayhashmap_f12.remove(byte_array21);
    java.lang.Float f24 = bytearrayhashmap_f1.remove(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f24);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f5 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array11 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b12 = bytearrayhashmap_f5.containsKey(byte_array11);
    byte[] byte_array13 = new byte[] {  };
    boolean b14 = bytearrayhashmap_f5.containsKey(byte_array13);
    byte[] byte_array17 = new byte[] { (byte)0, (byte)1 };
    boolean b18 = bytearrayhashmap_f5.containsKey(byte_array17);
    java.lang.Float f19 = bytearrayhashmap_f1.get(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f19);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(byte)1, (float)(short)10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    int i10 = bytearrayhashmap_f1.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f12 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array18 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b19 = bytearrayhashmap_f12.containsKey(byte_array18);
    java.lang.Float f21 = bytearrayhashmap_f1.put(byte_array18, (java.lang.Float)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f21);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>(1, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b10 = bytearrayhashmap_f3.containsKey(byte_array9);
    bytearrayhashmap_f3.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f13 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array19 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b20 = bytearrayhashmap_f13.containsKey(byte_array19);
    boolean b21 = bytearrayhashmap_f3.containsKey(byte_array19);
    boolean b22 = bytearrayhashmap_f1.containsKey(byte_array19);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f23 = new ByteArrayHashMap<java.lang.Float>();
    int i24 = bytearrayhashmap_f23.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f26 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array32 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b33 = bytearrayhashmap_f26.containsKey(byte_array32);
    java.lang.Float f35 = bytearrayhashmap_f23.put(byte_array32, (java.lang.Float)100.0f);
    java.lang.Float f37 = bytearrayhashmap_f1.put(byte_array32, (java.lang.Float)1.0f);
    java.util.List<java.lang.Float> list_f38 = bytearrayhashmap_f1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f38);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = bytearrayhashmap_f1.duplicate();
    java.util.List<java.lang.Float> list_f5 = bytearrayhashmap_f4.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)' ');

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_f1.keys();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_f1.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f5 = bytearrayhashmap_f1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f5);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b13 = bytearrayhashmap_f6.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f3.remove(byte_array12);
    java.lang.Float f16 = bytearrayhashmap_f1.put(byte_array12, (java.lang.Float)(-1.0f));
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f18 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array24 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b25 = bytearrayhashmap_f18.containsKey(byte_array24);
    bytearrayhashmap_f18.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f28 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array34 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b35 = bytearrayhashmap_f28.containsKey(byte_array34);
    boolean b36 = bytearrayhashmap_f18.containsKey(byte_array34);
    java.lang.Float f38 = bytearrayhashmap_f1.put(byte_array34, (java.lang.Float)1.0f);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f39 = bytearrayhashmap_f1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f38 + "' != '" + (-1.0f)+ "'", f38.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f39);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f12 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array20 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b21 = bytearrayhashmap_f14.containsKey(byte_array20);
    byte[] byte_array22 = new byte[] {  };
    boolean b23 = bytearrayhashmap_f14.containsKey(byte_array22);
    java.lang.Float f24 = bytearrayhashmap_f12.get(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f24);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = bytearrayhashmap_f1.duplicate();
    boolean b5 = bytearrayhashmap_f4.isEmpty();
    bytearrayhashmap_f4.clear();
    int i7 = bytearrayhashmap_f4.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    int i2 = bytearrayhashmap_f1.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b11 = bytearrayhashmap_f4.containsKey(byte_array10);
    byte[] byte_array12 = new byte[] {  };
    boolean b13 = bytearrayhashmap_f4.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f1.get(byte_array12);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f15 = bytearrayhashmap_f1.duplicate();
    int i16 = bytearrayhashmap_f15.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)'a', (float)' ');
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_f4.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f7 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array13 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b14 = bytearrayhashmap_f7.containsKey(byte_array13);
    java.lang.Float f15 = bytearrayhashmap_f4.remove(byte_array13);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f16 = new ByteArrayHashMap<java.lang.Float>();
    int i17 = bytearrayhashmap_f16.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f19 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array25 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b26 = bytearrayhashmap_f19.containsKey(byte_array25);
    java.lang.Float f28 = bytearrayhashmap_f16.put(byte_array25, (java.lang.Float)100.0f);
    java.lang.Float f30 = bytearrayhashmap_f4.put(byte_array25, (java.lang.Float)(-1.0f));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f33 = bytearrayhashmap_f2.get(byte_array25, (-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f30);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array17 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b18 = bytearrayhashmap_f11.containsKey(byte_array17);
    boolean b19 = bytearrayhashmap_f1.containsKey(byte_array17);
    bytearrayhashmap_f1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)'#', (float)10);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    int i10 = bytearrayhashmap_f1.size();
    int i11 = bytearrayhashmap_f1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(byte)1, (float)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f13 = new ByteArrayHashMap<java.lang.Float>(1);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = bytearrayhashmap_f13.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f16 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b23 = bytearrayhashmap_f16.containsKey(byte_array22);
    byte[] byte_array24 = new byte[] {  };
    boolean b25 = bytearrayhashmap_f16.containsKey(byte_array24);
    java.lang.Float f26 = bytearrayhashmap_f13.remove(byte_array24);
    java.lang.Float f27 = bytearrayhashmap_f11.get(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f27);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>(10, (float)'4');

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b10 = bytearrayhashmap_f3.containsKey(byte_array9);
    java.lang.Float f11 = bytearrayhashmap_f1.remove(byte_array9);
    int i12 = bytearrayhashmap_f1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f3.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b13 = bytearrayhashmap_f6.containsKey(byte_array12);
    java.lang.Float f14 = bytearrayhashmap_f3.remove(byte_array12);
    java.lang.Float f16 = bytearrayhashmap_f1.put(byte_array12, (java.lang.Float)(-1.0f));
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f18 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f20 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array26 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b27 = bytearrayhashmap_f20.containsKey(byte_array26);
    java.lang.Float f28 = bytearrayhashmap_f18.remove(byte_array26);
    java.lang.Float f29 = bytearrayhashmap_f1.remove(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f29 + "' != '" + (-1.0f)+ "'", f29.equals((-1.0f)));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f0 = new ByteArrayHashMap<java.lang.Float>();
    bytearrayhashmap_f0.clear();

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = bytearrayhashmap_f1.duplicate();
    boolean b5 = bytearrayhashmap_f4.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f7 = new ByteArrayHashMap<java.lang.Float>(1);
    int i8 = bytearrayhashmap_f7.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f10 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array16 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b17 = bytearrayhashmap_f10.containsKey(byte_array16);
    byte[] byte_array18 = new byte[] {  };
    boolean b19 = bytearrayhashmap_f10.containsKey(byte_array18);
    java.lang.Float f20 = bytearrayhashmap_f7.get(byte_array18);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f21 = bytearrayhashmap_f7.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f23 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array29 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b30 = bytearrayhashmap_f23.containsKey(byte_array29);
    byte[] byte_array31 = new byte[] {  };
    boolean b32 = bytearrayhashmap_f23.containsKey(byte_array31);
    java.lang.Float f33 = bytearrayhashmap_f7.get(byte_array31);
    java.lang.Float f34 = bytearrayhashmap_f4.remove(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f34);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(short)1, (float)(short)100);
    int i3 = bytearrayhashmap_f2.size();
    boolean b4 = bytearrayhashmap_f2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    java.util.List<java.lang.Float> list_f2 = bytearrayhashmap_f1.values();
    int i3 = bytearrayhashmap_f1.size();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    int i2 = bytearrayhashmap_f1.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b11 = bytearrayhashmap_f4.containsKey(byte_array10);
    bytearrayhashmap_f4.clear();
    boolean b13 = bytearrayhashmap_f4.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = bytearrayhashmap_f4.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f15 = bytearrayhashmap_f4.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f17 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f19 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array20 = bytearrayhashmap_f19.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f22 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array28 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b29 = bytearrayhashmap_f22.containsKey(byte_array28);
    java.lang.Float f30 = bytearrayhashmap_f19.remove(byte_array28);
    java.lang.Float f32 = bytearrayhashmap_f17.put(byte_array28, (java.lang.Float)(-1.0f));
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f34 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array40 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b41 = bytearrayhashmap_f34.containsKey(byte_array40);
    bytearrayhashmap_f34.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f44 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array50 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b51 = bytearrayhashmap_f44.containsKey(byte_array50);
    boolean b52 = bytearrayhashmap_f34.containsKey(byte_array50);
    java.lang.Float f54 = bytearrayhashmap_f17.put(byte_array50, (java.lang.Float)1.0f);
    java.util.List<java.lang.Float> list_f55 = bytearrayhashmap_f17.values();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f58 = new ByteArrayHashMap<java.lang.Float>((int)'a', (float)' ');
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f60 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array66 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b67 = bytearrayhashmap_f60.containsKey(byte_array66);
    bytearrayhashmap_f60.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f70 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f72 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array78 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b79 = bytearrayhashmap_f72.containsKey(byte_array78);
    java.lang.Float f80 = bytearrayhashmap_f70.remove(byte_array78);
    java.lang.Float f82 = bytearrayhashmap_f60.put(byte_array78, (java.lang.Float)0.0f);
    java.lang.Float f83 = bytearrayhashmap_f58.get(byte_array78);
    java.lang.Float f84 = bytearrayhashmap_f17.remove(byte_array78);
    java.lang.Float f85 = bytearrayhashmap_f4.get(byte_array78);
    boolean b86 = bytearrayhashmap_f1.containsKey(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f54 + "' != '" + (-1.0f)+ "'", f54.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + f84 + "' != '" + 1.0f+ "'", f84.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    int i2 = bytearrayhashmap_f1.size();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f3 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f5 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_f5.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f8 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b15 = bytearrayhashmap_f8.containsKey(byte_array14);
    byte[] byte_array16 = new byte[] {  };
    boolean b17 = bytearrayhashmap_f8.containsKey(byte_array16);
    java.lang.Float f18 = bytearrayhashmap_f5.remove(byte_array16);
    java.lang.Float f19 = bytearrayhashmap_f3.get(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f19);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = new ByteArrayHashMap<java.lang.Float>((int)(byte)100, (float)'#');

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = bytearrayhashmap_f1.duplicate();
    java.util.List<java.lang.Float> list_f3 = bytearrayhashmap_f1.values();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_f1.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f6 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f8 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b15 = bytearrayhashmap_f8.containsKey(byte_array14);
    bytearrayhashmap_f8.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f18 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array24 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b25 = bytearrayhashmap_f18.containsKey(byte_array24);
    boolean b26 = bytearrayhashmap_f8.containsKey(byte_array24);
    boolean b27 = bytearrayhashmap_f6.containsKey(byte_array24);
    boolean b28 = bytearrayhashmap_f1.containsKey(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_f3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    byte[] byte_array9 = new byte[] {  };
    boolean b10 = bytearrayhashmap_f1.containsKey(byte_array9);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    bytearrayhashmap_f1.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    java.util.List<byte[]> list_byte_array15 = bytearrayhashmap_f14.keys();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f17 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array23 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b24 = bytearrayhashmap_f17.containsKey(byte_array23);
    byte[] byte_array25 = new byte[] {  };
    boolean b26 = bytearrayhashmap_f17.containsKey(byte_array25);
    java.lang.Float f27 = bytearrayhashmap_f14.remove(byte_array25);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Float f30 = bytearrayhashmap_f1.get(byte_array25, (int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f27);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)0);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>(1);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f2 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f4 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b11 = bytearrayhashmap_f4.containsKey(byte_array10);
    bytearrayhashmap_f4.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f16 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array22 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b23 = bytearrayhashmap_f16.containsKey(byte_array22);
    java.lang.Float f24 = bytearrayhashmap_f14.remove(byte_array22);
    java.lang.Float f26 = bytearrayhashmap_f4.put(byte_array22, (java.lang.Float)0.0f);
    boolean b27 = bytearrayhashmap_f4.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f29 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array35 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b36 = bytearrayhashmap_f29.containsKey(byte_array35);
    byte[] byte_array37 = new byte[] {  };
    boolean b38 = bytearrayhashmap_f29.containsKey(byte_array37);
    java.lang.Float f40 = bytearrayhashmap_f4.put(byte_array37, (java.lang.Float)10.0f);
    java.lang.Float f41 = bytearrayhashmap_f2.get(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f41);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f1 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b8 = bytearrayhashmap_f1.containsKey(byte_array7);
    bytearrayhashmap_f1.clear();
    boolean b10 = bytearrayhashmap_f1.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f11 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f12 = bytearrayhashmap_f1.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f14 = new ByteArrayHashMap<java.lang.Float>(1);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f15 = bytearrayhashmap_f14.duplicate();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f17 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array23 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b24 = bytearrayhashmap_f17.containsKey(byte_array23);
    bytearrayhashmap_f17.clear();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f27 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f29 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array35 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b36 = bytearrayhashmap_f29.containsKey(byte_array35);
    java.lang.Float f37 = bytearrayhashmap_f27.remove(byte_array35);
    java.lang.Float f39 = bytearrayhashmap_f17.put(byte_array35, (java.lang.Float)0.0f);
    boolean b40 = bytearrayhashmap_f17.isEmpty();
    ByteArrayHashMap<java.lang.Float> bytearrayhashmap_f42 = new ByteArrayHashMap<java.lang.Float>((int)(short)10);
    byte[] byte_array48 = new byte[] { (byte)-1, (byte)-1, (byte)10, (byte)-1, (byte)1 };
    boolean b49 = bytearrayhashmap_f42.containsKey(byte_array48);
    byte[] byte_array50 = new byte[] {  };
    boolean b51 = bytearrayhashmap_f42.containsKey(byte_array50);
    java.lang.Float f53 = bytearrayhashmap_f17.put(byte_array50, (java.lang.Float)10.0f);
    boolean b54 = bytearrayhashmap_f15.containsKey(byte_array50);
    java.lang.Float f55 = bytearrayhashmap_f1.get(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_f15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(f55);

  }

}
