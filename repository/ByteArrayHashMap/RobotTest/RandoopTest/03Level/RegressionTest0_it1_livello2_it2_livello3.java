
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
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)10, (-1.0f));
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


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    byte[] byte_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i3 = bytearrayhashmap_i0.remove(byte_array2);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array7 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b8 = bytearrayhashmap_i1.containsKey(byte_array7);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i9 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b10 = bytearrayhashmap_i9.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array18 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b19 = bytearrayhashmap_i12.containsKey(byte_array18);
    java.lang.Integer i20 = bytearrayhashmap_i9.get(byte_array18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i23 = bytearrayhashmap_i1.get(byte_array18, (int)' ', (int)'#');
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    byte[] byte_array4 = new byte[] { (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = bytearrayhashmap_i1.get(byte_array4, (int)(short)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.lang.Integer i13 = bytearrayhashmap_i2.get(byte_array11);
    java.lang.Integer i15 = bytearrayhashmap_i0.put(byte_array11, (java.lang.Integer)(-1));
    byte[] byte_array19 = new byte[] { (byte)10, (byte)-1, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i22 = bytearrayhashmap_i0.get(byte_array19, (int)(short)-1, (int)'#');
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)(short)10, (float)0L);
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


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i5.keys();
    bytearrayhashmap_i5.clear();
    boolean b8 = bytearrayhashmap_i5.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i9 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i11 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array17 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b18 = bytearrayhashmap_i11.containsKey(byte_array17);
    java.lang.Integer i19 = bytearrayhashmap_i9.remove(byte_array17);
    java.lang.Integer i21 = bytearrayhashmap_i5.put(byte_array17, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i24 = bytearrayhashmap_i1.get(byte_array17, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    java.util.List<java.lang.Integer> list_i13 = bytearrayhashmap_i0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array15 = bytearrayhashmap_i14.keys();
    bytearrayhashmap_i14.clear();
    boolean b17 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i18 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i20 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array26 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b27 = bytearrayhashmap_i20.containsKey(byte_array26);
    java.lang.Integer i28 = bytearrayhashmap_i18.remove(byte_array26);
    java.lang.Integer i30 = bytearrayhashmap_i14.put(byte_array26, (java.lang.Integer)1);
    boolean b31 = bytearrayhashmap_i0.containsKey(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array14 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b15 = bytearrayhashmap_i8.containsKey(byte_array14);
    java.lang.Integer i16 = bytearrayhashmap_i6.remove(byte_array14);
    java.lang.Integer i17 = bytearrayhashmap_i5.remove(byte_array14);
    boolean b18 = bytearrayhashmap_i1.containsKey(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i6 = bytearrayhashmap_i5.values();
    boolean b7 = bytearrayhashmap_i5.isEmpty();
    bytearrayhashmap_i5.clear();
    int i9 = bytearrayhashmap_i5.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b11 = bytearrayhashmap_i10.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b13 = bytearrayhashmap_i12.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array21 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b22 = bytearrayhashmap_i15.containsKey(byte_array21);
    java.lang.Integer i23 = bytearrayhashmap_i12.get(byte_array21);
    java.lang.Integer i25 = bytearrayhashmap_i10.put(byte_array21, (java.lang.Integer)(-1));
    java.lang.Integer i26 = bytearrayhashmap_i5.remove(byte_array21);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i29 = bytearrayhashmap_i1.get(byte_array21, (int)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i26);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    byte[] byte_array4 = new byte[] {  };
    java.lang.Integer i5 = bytearrayhashmap_i1.remove(byte_array4);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = new ByteArrayHashMap<java.lang.Integer>((int)'a');
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i9 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_i9.keys();
    bytearrayhashmap_i9.clear();
    boolean b12 = bytearrayhashmap_i9.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array15 = bytearrayhashmap_i14.keys();
    bytearrayhashmap_i14.clear();
    byte[] byte_array17 = new byte[] {  };
    java.lang.Integer i18 = bytearrayhashmap_i14.remove(byte_array17);
    java.lang.Integer i21 = bytearrayhashmap_i9.get(byte_array17, 0, 0);
    java.lang.Integer i22 = bytearrayhashmap_i7.remove(byte_array17);
    java.lang.Integer i23 = bytearrayhashmap_i1.get(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i4 = bytearrayhashmap_i3.values();
    boolean b5 = bytearrayhashmap_i3.isEmpty();
    bytearrayhashmap_i3.clear();
    int i7 = bytearrayhashmap_i3.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b9 = bytearrayhashmap_i8.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b11 = bytearrayhashmap_i10.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array19 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b20 = bytearrayhashmap_i13.containsKey(byte_array19);
    java.lang.Integer i21 = bytearrayhashmap_i10.get(byte_array19);
    java.lang.Integer i23 = bytearrayhashmap_i8.put(byte_array19, (java.lang.Integer)(-1));
    java.lang.Integer i24 = bytearrayhashmap_i3.remove(byte_array19);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i27 = bytearrayhashmap_i1.get(byte_array19, (int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array7 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b8 = bytearrayhashmap_i1.containsKey(byte_array7);
    java.util.List<java.lang.Integer> list_i9 = bytearrayhashmap_i1.values();
    byte[] byte_array10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = bytearrayhashmap_i1.get(byte_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i9);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    boolean b12 = bytearrayhashmap_i0.isEmpty();
    boolean b13 = bytearrayhashmap_i0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array20 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b21 = bytearrayhashmap_i14.containsKey(byte_array20);
    boolean b22 = bytearrayhashmap_i12.containsKey(byte_array20);
    int i23 = bytearrayhashmap_i12.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    byte[] byte_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = bytearrayhashmap_i1.containsKey(byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)0, (byte)-1 };
    java.lang.Integer i9 = bytearrayhashmap_i1.remove(byte_array8);
    java.util.List<java.lang.Integer> list_i10 = bytearrayhashmap_i1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i10);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array21 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b22 = bytearrayhashmap_i15.containsKey(byte_array21);
    java.util.List<java.lang.Integer> list_i23 = bytearrayhashmap_i15.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b25 = bytearrayhashmap_i24.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array33 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b34 = bytearrayhashmap_i27.containsKey(byte_array33);
    java.lang.Integer i35 = bytearrayhashmap_i24.get(byte_array33);
    java.lang.Integer i37 = bytearrayhashmap_i15.put(byte_array33, (java.lang.Integer)(-1));
    java.lang.Integer i38 = bytearrayhashmap_i12.get(byte_array33);
    bytearrayhashmap_i12.clear();
    java.util.List<java.lang.Integer> list_i40 = bytearrayhashmap_i12.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i40);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b23 = bytearrayhashmap_i16.containsKey(byte_array22);
    java.lang.Integer i24 = bytearrayhashmap_i14.remove(byte_array22);
    boolean b25 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = bytearrayhashmap_i14.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i28 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array34 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b35 = bytearrayhashmap_i28.containsKey(byte_array34);
    boolean b36 = bytearrayhashmap_i26.containsKey(byte_array34);
    java.lang.Integer i38 = bytearrayhashmap_i0.put(byte_array34, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b40 = bytearrayhashmap_i39.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i42 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array48 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b49 = bytearrayhashmap_i42.containsKey(byte_array48);
    java.lang.Integer i50 = bytearrayhashmap_i39.get(byte_array48);
    boolean b51 = bytearrayhashmap_i0.containsKey(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    bytearrayhashmap_i1.clear();
    int i5 = bytearrayhashmap_i1.size();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i1.keys();
    java.util.List<java.lang.Integer> list_i7 = bytearrayhashmap_i1.values();
    int i8 = bytearrayhashmap_i1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    byte[] byte_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i4 = bytearrayhashmap_i1.put(byte_array2, (java.lang.Integer)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b23 = bytearrayhashmap_i16.containsKey(byte_array22);
    java.lang.Integer i24 = bytearrayhashmap_i14.remove(byte_array22);
    boolean b25 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = bytearrayhashmap_i14.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i28 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array34 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b35 = bytearrayhashmap_i28.containsKey(byte_array34);
    boolean b36 = bytearrayhashmap_i26.containsKey(byte_array34);
    java.lang.Integer i38 = bytearrayhashmap_i0.put(byte_array34, (java.lang.Integer)1);
    byte[] byte_array45 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)-1, (byte)10, (byte)-1 };
    java.lang.Integer i46 = bytearrayhashmap_i0.get(byte_array45);
    java.util.List<byte[]> list_byte_array47 = bytearrayhashmap_i0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array47);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i5.keys();
    bytearrayhashmap_i5.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i9 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array15 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b16 = bytearrayhashmap_i9.containsKey(byte_array15);
    java.lang.Integer i18 = bytearrayhashmap_i5.put(byte_array15, (java.lang.Integer)100);
    java.lang.Integer i19 = bytearrayhashmap_i3.remove(byte_array15);
    boolean b20 = bytearrayhashmap_i1.containsKey(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    java.util.List<java.lang.Integer> list_i14 = bytearrayhashmap_i0.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i17 = bytearrayhashmap_i16.values();
    boolean b18 = bytearrayhashmap_i16.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i20 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array21 = bytearrayhashmap_i20.keys();
    bytearrayhashmap_i20.clear();
    boolean b23 = bytearrayhashmap_i20.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array32 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b33 = bytearrayhashmap_i26.containsKey(byte_array32);
    java.lang.Integer i34 = bytearrayhashmap_i24.remove(byte_array32);
    java.lang.Integer i36 = bytearrayhashmap_i20.put(byte_array32, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i38 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array39 = bytearrayhashmap_i38.keys();
    bytearrayhashmap_i38.clear();
    byte[] byte_array41 = new byte[] {  };
    java.lang.Integer i42 = bytearrayhashmap_i38.remove(byte_array41);
    java.lang.Integer i44 = bytearrayhashmap_i20.put(byte_array41, (java.lang.Integer)0);
    java.lang.Integer i45 = bytearrayhashmap_i16.remove(byte_array41);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i48 = bytearrayhashmap_i0.get(byte_array41, (int)(short)0, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i45);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(10, (float)100L);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array13 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b14 = bytearrayhashmap_i7.containsKey(byte_array13);
    java.lang.Integer i15 = bytearrayhashmap_i5.remove(byte_array13);
    java.lang.Integer i17 = bytearrayhashmap_i1.put(byte_array13, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i19 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array20 = bytearrayhashmap_i19.keys();
    bytearrayhashmap_i19.clear();
    byte[] byte_array22 = new byte[] {  };
    java.lang.Integer i23 = bytearrayhashmap_i19.remove(byte_array22);
    java.lang.Integer i25 = bytearrayhashmap_i1.put(byte_array22, (java.lang.Integer)0);
    bytearrayhashmap_i1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i25);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array7 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b8 = bytearrayhashmap_i1.containsKey(byte_array7);
    java.util.List<java.lang.Integer> list_i9 = bytearrayhashmap_i1.values();
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_i1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b23 = bytearrayhashmap_i16.containsKey(byte_array22);
    java.lang.Integer i24 = bytearrayhashmap_i14.remove(byte_array22);
    boolean b25 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = bytearrayhashmap_i14.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = bytearrayhashmap_i26.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i29 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array35 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b36 = bytearrayhashmap_i29.containsKey(byte_array35);
    java.util.List<java.lang.Integer> list_i37 = bytearrayhashmap_i29.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i38 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b39 = bytearrayhashmap_i38.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b48 = bytearrayhashmap_i41.containsKey(byte_array47);
    java.lang.Integer i49 = bytearrayhashmap_i38.get(byte_array47);
    java.lang.Integer i51 = bytearrayhashmap_i29.put(byte_array47, (java.lang.Integer)(-1));
    java.lang.Integer i52 = bytearrayhashmap_i26.get(byte_array47);
    java.lang.Integer i53 = bytearrayhashmap_i0.get(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i53);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)'a', 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(1, (float)(short)100);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)0, (byte)-1 };
    java.lang.Integer i9 = bytearrayhashmap_i1.remove(byte_array8);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b11 = bytearrayhashmap_i10.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array19 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b20 = bytearrayhashmap_i13.containsKey(byte_array19);
    java.lang.Integer i21 = bytearrayhashmap_i10.get(byte_array19);
    int i22 = bytearrayhashmap_i10.size();
    int i23 = bytearrayhashmap_i10.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array32 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b33 = bytearrayhashmap_i26.containsKey(byte_array32);
    java.lang.Integer i34 = bytearrayhashmap_i24.remove(byte_array32);
    boolean b35 = bytearrayhashmap_i24.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i36 = bytearrayhashmap_i24.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i38 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array44 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b45 = bytearrayhashmap_i38.containsKey(byte_array44);
    boolean b46 = bytearrayhashmap_i36.containsKey(byte_array44);
    java.lang.Integer i48 = bytearrayhashmap_i10.put(byte_array44, (java.lang.Integer)1);
    byte[] byte_array55 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)-1, (byte)10, (byte)-1 };
    java.lang.Integer i56 = bytearrayhashmap_i10.get(byte_array55);
    java.lang.Integer i57 = bytearrayhashmap_i1.remove(byte_array55);
    bytearrayhashmap_i1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i57);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0, (float)(short)1);
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    bytearrayhashmap_i1.clear();
    boolean b6 = bytearrayhashmap_i1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.util.List<java.lang.Integer> list_i13 = bytearrayhashmap_i5.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b15 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i17 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b24 = bytearrayhashmap_i17.containsKey(byte_array23);
    java.lang.Integer i25 = bytearrayhashmap_i14.get(byte_array23);
    java.lang.Integer i27 = bytearrayhashmap_i5.put(byte_array23, (java.lang.Integer)(-1));
    java.lang.Integer i28 = bytearrayhashmap_i3.remove(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.lang.Integer i14 = bytearrayhashmap_i1.put(byte_array11, (java.lang.Integer)100);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b16 = bytearrayhashmap_i15.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i18 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array24 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b25 = bytearrayhashmap_i18.containsKey(byte_array24);
    java.lang.Integer i26 = bytearrayhashmap_i15.get(byte_array24);
    java.lang.Integer i27 = bytearrayhashmap_i1.remove(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    bytearrayhashmap_i1.clear();
    int i5 = bytearrayhashmap_i1.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b7 = bytearrayhashmap_i6.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b9 = bytearrayhashmap_i8.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i11 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array17 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b18 = bytearrayhashmap_i11.containsKey(byte_array17);
    java.lang.Integer i19 = bytearrayhashmap_i8.get(byte_array17);
    java.lang.Integer i21 = bytearrayhashmap_i6.put(byte_array17, (java.lang.Integer)(-1));
    java.lang.Integer i22 = bytearrayhashmap_i1.remove(byte_array17);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i25 = bytearrayhashmap_i24.values();
    boolean b26 = bytearrayhashmap_i24.isEmpty();
    bytearrayhashmap_i24.clear();
    int i28 = bytearrayhashmap_i24.size();
    bytearrayhashmap_i24.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i31 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i33 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_i33.keys();
    bytearrayhashmap_i33.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i37 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array43 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b44 = bytearrayhashmap_i37.containsKey(byte_array43);
    java.lang.Integer i46 = bytearrayhashmap_i33.put(byte_array43, (java.lang.Integer)100);
    java.lang.Integer i47 = bytearrayhashmap_i31.remove(byte_array43);
    java.lang.Integer i48 = bytearrayhashmap_i24.remove(byte_array43);
    boolean b49 = bytearrayhashmap_i1.containsKey(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    boolean b4 = bytearrayhashmap_i3.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array7 = bytearrayhashmap_i6.keys();
    bytearrayhashmap_i6.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b17 = bytearrayhashmap_i10.containsKey(byte_array16);
    java.lang.Integer i19 = bytearrayhashmap_i6.put(byte_array16, (java.lang.Integer)100);
    java.lang.Integer i20 = bytearrayhashmap_i3.get(byte_array16);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i22 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_i22.keys();
    bytearrayhashmap_i22.clear();
    boolean b25 = bytearrayhashmap_i22.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i28 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array34 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b35 = bytearrayhashmap_i28.containsKey(byte_array34);
    java.lang.Integer i36 = bytearrayhashmap_i26.remove(byte_array34);
    java.lang.Integer i38 = bytearrayhashmap_i22.put(byte_array34, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i40 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array41 = bytearrayhashmap_i40.keys();
    bytearrayhashmap_i40.clear();
    byte[] byte_array43 = new byte[] {  };
    java.lang.Integer i44 = bytearrayhashmap_i40.remove(byte_array43);
    java.lang.Integer i46 = bytearrayhashmap_i22.put(byte_array43, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i49 = bytearrayhashmap_i3.get(byte_array43, (int)'a', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i46);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)'a');
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i4 = bytearrayhashmap_i3.values();
    boolean b5 = bytearrayhashmap_i3.isEmpty();
    bytearrayhashmap_i3.clear();
    int i7 = bytearrayhashmap_i3.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b9 = bytearrayhashmap_i8.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b11 = bytearrayhashmap_i10.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array19 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b20 = bytearrayhashmap_i13.containsKey(byte_array19);
    java.lang.Integer i21 = bytearrayhashmap_i10.get(byte_array19);
    java.lang.Integer i23 = bytearrayhashmap_i8.put(byte_array19, (java.lang.Integer)(-1));
    java.lang.Integer i24 = bytearrayhashmap_i3.remove(byte_array19);
    boolean b25 = bytearrayhashmap_i1.containsKey(byte_array19);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = bytearrayhashmap_i1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i26);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_i15.keys();
    bytearrayhashmap_i15.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i19 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array25 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b26 = bytearrayhashmap_i19.containsKey(byte_array25);
    java.lang.Integer i28 = bytearrayhashmap_i15.put(byte_array25, (java.lang.Integer)100);
    java.lang.Integer i30 = bytearrayhashmap_i0.put(byte_array25, (java.lang.Integer)1);
    java.util.List<java.lang.Integer> list_i31 = bytearrayhashmap_i0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i31);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array7 = bytearrayhashmap_i6.keys();
    bytearrayhashmap_i6.clear();
    byte[] byte_array9 = new byte[] {  };
    java.lang.Integer i10 = bytearrayhashmap_i6.remove(byte_array9);
    java.lang.Integer i13 = bytearrayhashmap_i1.get(byte_array9, 0, 0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = bytearrayhashmap_i1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i14);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    int i13 = bytearrayhashmap_i12.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b15 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i17 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b24 = bytearrayhashmap_i17.containsKey(byte_array23);
    java.lang.Integer i27 = bytearrayhashmap_i14.get(byte_array23, 0, (int)(byte)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i29 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i30 = bytearrayhashmap_i29.values();
    boolean b31 = bytearrayhashmap_i29.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i33 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_i33.keys();
    bytearrayhashmap_i33.clear();
    boolean b36 = bytearrayhashmap_i33.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i37 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array45 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b46 = bytearrayhashmap_i39.containsKey(byte_array45);
    java.lang.Integer i47 = bytearrayhashmap_i37.remove(byte_array45);
    java.lang.Integer i49 = bytearrayhashmap_i33.put(byte_array45, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i51 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array52 = bytearrayhashmap_i51.keys();
    bytearrayhashmap_i51.clear();
    byte[] byte_array54 = new byte[] {  };
    java.lang.Integer i55 = bytearrayhashmap_i51.remove(byte_array54);
    java.lang.Integer i57 = bytearrayhashmap_i33.put(byte_array54, (java.lang.Integer)0);
    java.lang.Integer i58 = bytearrayhashmap_i29.remove(byte_array54);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i60 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i60.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i62 = bytearrayhashmap_i60.duplicate();
    boolean b63 = bytearrayhashmap_i62.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i65 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array66 = bytearrayhashmap_i65.keys();
    bytearrayhashmap_i65.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i69 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array75 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b76 = bytearrayhashmap_i69.containsKey(byte_array75);
    java.lang.Integer i78 = bytearrayhashmap_i65.put(byte_array75, (java.lang.Integer)100);
    java.lang.Integer i79 = bytearrayhashmap_i62.get(byte_array75);
    java.lang.Integer i81 = bytearrayhashmap_i29.put(byte_array75, (java.lang.Integer)1);
    java.lang.Integer i82 = bytearrayhashmap_i14.remove(byte_array75);
    java.lang.Integer i84 = bytearrayhashmap_i13.put(byte_array75, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i84);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i5.keys();
    bytearrayhashmap_i5.clear();
    boolean b8 = bytearrayhashmap_i5.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i9 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i11 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array17 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b18 = bytearrayhashmap_i11.containsKey(byte_array17);
    java.lang.Integer i19 = bytearrayhashmap_i9.remove(byte_array17);
    java.lang.Integer i21 = bytearrayhashmap_i5.put(byte_array17, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array24 = bytearrayhashmap_i23.keys();
    bytearrayhashmap_i23.clear();
    byte[] byte_array26 = new byte[] {  };
    java.lang.Integer i27 = bytearrayhashmap_i23.remove(byte_array26);
    java.lang.Integer i29 = bytearrayhashmap_i5.put(byte_array26, (java.lang.Integer)0);
    java.lang.Integer i30 = bytearrayhashmap_i1.remove(byte_array26);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i32 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i32.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i34 = bytearrayhashmap_i32.duplicate();
    boolean b35 = bytearrayhashmap_i34.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i37 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array38 = bytearrayhashmap_i37.keys();
    bytearrayhashmap_i37.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b48 = bytearrayhashmap_i41.containsKey(byte_array47);
    java.lang.Integer i50 = bytearrayhashmap_i37.put(byte_array47, (java.lang.Integer)100);
    java.lang.Integer i51 = bytearrayhashmap_i34.get(byte_array47);
    java.lang.Integer i53 = bytearrayhashmap_i1.put(byte_array47, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i55 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array56 = bytearrayhashmap_i55.keys();
    bytearrayhashmap_i55.clear();
    boolean b58 = bytearrayhashmap_i55.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i59 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i61 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array67 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b68 = bytearrayhashmap_i61.containsKey(byte_array67);
    java.lang.Integer i69 = bytearrayhashmap_i59.remove(byte_array67);
    java.lang.Integer i71 = bytearrayhashmap_i55.put(byte_array67, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i73 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array74 = bytearrayhashmap_i73.keys();
    bytearrayhashmap_i73.clear();
    byte[] byte_array76 = new byte[] {  };
    java.lang.Integer i77 = bytearrayhashmap_i73.remove(byte_array76);
    java.lang.Integer i79 = bytearrayhashmap_i55.put(byte_array76, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i82 = bytearrayhashmap_i1.get(byte_array76, (int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i79);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    bytearrayhashmap_i1.clear();
    int i3 = bytearrayhashmap_i1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    bytearrayhashmap_i1.clear();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_i1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    byte[] byte_array4 = new byte[] {  };
    java.lang.Integer i5 = bytearrayhashmap_i1.remove(byte_array4);
    int i6 = bytearrayhashmap_i1.size();
    boolean b7 = bytearrayhashmap_i1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array9 = bytearrayhashmap_i8.keys();
    bytearrayhashmap_i8.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array18 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b19 = bytearrayhashmap_i12.containsKey(byte_array18);
    java.lang.Integer i21 = bytearrayhashmap_i8.put(byte_array18, (java.lang.Integer)100);
    java.lang.Integer i22 = bytearrayhashmap_i6.remove(byte_array18);
    java.lang.Integer i24 = bytearrayhashmap_i1.put(byte_array18, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = bytearrayhashmap_i12.duplicate();
    java.util.List<java.lang.Integer> list_i14 = bytearrayhashmap_i12.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i14);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = new ByteArrayHashMap<java.lang.Integer>((int)'a');
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array7 = bytearrayhashmap_i6.keys();
    bytearrayhashmap_i6.clear();
    boolean b9 = bytearrayhashmap_i6.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i11 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array12 = bytearrayhashmap_i11.keys();
    bytearrayhashmap_i11.clear();
    byte[] byte_array14 = new byte[] {  };
    java.lang.Integer i15 = bytearrayhashmap_i11.remove(byte_array14);
    java.lang.Integer i18 = bytearrayhashmap_i6.get(byte_array14, 0, 0);
    java.lang.Integer i19 = bytearrayhashmap_i4.remove(byte_array14);
    java.lang.Integer i21 = bytearrayhashmap_i1.put(byte_array14, (java.lang.Integer)0);
    bytearrayhashmap_i1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array20 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b21 = bytearrayhashmap_i14.containsKey(byte_array20);
    boolean b22 = bytearrayhashmap_i12.containsKey(byte_array20);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = bytearrayhashmap_i12.duplicate();
    java.util.List<java.lang.Integer> list_i24 = bytearrayhashmap_i12.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i24);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array13 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b14 = bytearrayhashmap_i7.containsKey(byte_array13);
    java.lang.Integer i15 = bytearrayhashmap_i5.remove(byte_array13);
    java.lang.Integer i17 = bytearrayhashmap_i1.put(byte_array13, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i19 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array20 = bytearrayhashmap_i19.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i22 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_i22.keys();
    bytearrayhashmap_i22.clear();
    boolean b25 = bytearrayhashmap_i22.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i28 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array34 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b35 = bytearrayhashmap_i28.containsKey(byte_array34);
    java.lang.Integer i36 = bytearrayhashmap_i26.remove(byte_array34);
    java.lang.Integer i38 = bytearrayhashmap_i22.put(byte_array34, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i40 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array41 = bytearrayhashmap_i40.keys();
    bytearrayhashmap_i40.clear();
    byte[] byte_array43 = new byte[] {  };
    java.lang.Integer i44 = bytearrayhashmap_i40.remove(byte_array43);
    java.lang.Integer i46 = bytearrayhashmap_i22.put(byte_array43, (java.lang.Integer)0);
    boolean b47 = bytearrayhashmap_i19.containsKey(byte_array43);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i48 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i50 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array56 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b57 = bytearrayhashmap_i50.containsKey(byte_array56);
    java.lang.Integer i58 = bytearrayhashmap_i48.remove(byte_array56);
    boolean b59 = bytearrayhashmap_i48.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i60 = bytearrayhashmap_i48.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i62 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array68 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b69 = bytearrayhashmap_i62.containsKey(byte_array68);
    boolean b70 = bytearrayhashmap_i60.containsKey(byte_array68);
    java.lang.Integer i72 = bytearrayhashmap_i19.put(byte_array68, (java.lang.Integer)100);
    java.lang.Integer i73 = bytearrayhashmap_i1.remove(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 1+ "'", i73.equals(1));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array21 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b22 = bytearrayhashmap_i15.containsKey(byte_array21);
    java.util.List<java.lang.Integer> list_i23 = bytearrayhashmap_i15.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b25 = bytearrayhashmap_i24.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array33 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b34 = bytearrayhashmap_i27.containsKey(byte_array33);
    java.lang.Integer i35 = bytearrayhashmap_i24.get(byte_array33);
    java.lang.Integer i37 = bytearrayhashmap_i15.put(byte_array33, (java.lang.Integer)(-1));
    java.lang.Integer i38 = bytearrayhashmap_i12.get(byte_array33);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b48 = bytearrayhashmap_i41.containsKey(byte_array47);
    java.lang.Integer i49 = bytearrayhashmap_i39.remove(byte_array47);
    boolean b50 = bytearrayhashmap_i39.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i51 = bytearrayhashmap_i39.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i52 = bytearrayhashmap_i51.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i54 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array60 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b61 = bytearrayhashmap_i54.containsKey(byte_array60);
    java.util.List<java.lang.Integer> list_i62 = bytearrayhashmap_i54.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i63 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b64 = bytearrayhashmap_i63.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i66 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array72 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b73 = bytearrayhashmap_i66.containsKey(byte_array72);
    java.lang.Integer i74 = bytearrayhashmap_i63.get(byte_array72);
    java.lang.Integer i76 = bytearrayhashmap_i54.put(byte_array72, (java.lang.Integer)(-1));
    java.lang.Integer i77 = bytearrayhashmap_i51.get(byte_array72);
    java.lang.Integer i79 = bytearrayhashmap_i12.put(byte_array72, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i79);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = bytearrayhashmap_i1.duplicate();
    bytearrayhashmap_i2.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i5.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = bytearrayhashmap_i5.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b17 = bytearrayhashmap_i10.containsKey(byte_array16);
    java.lang.Integer i18 = bytearrayhashmap_i8.remove(byte_array16);
    java.lang.Integer i19 = bytearrayhashmap_i7.get(byte_array16);
    java.lang.Integer i20 = bytearrayhashmap_i2.remove(byte_array16);
    bytearrayhashmap_i2.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i22 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array30 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b31 = bytearrayhashmap_i24.containsKey(byte_array30);
    java.lang.Integer i32 = bytearrayhashmap_i22.remove(byte_array30);
    boolean b33 = bytearrayhashmap_i22.isEmpty();
    boolean b34 = bytearrayhashmap_i22.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i36 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array37 = bytearrayhashmap_i36.keys();
    bytearrayhashmap_i36.clear();
    boolean b39 = bytearrayhashmap_i36.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array42 = bytearrayhashmap_i41.keys();
    bytearrayhashmap_i41.clear();
    byte[] byte_array44 = new byte[] {  };
    java.lang.Integer i45 = bytearrayhashmap_i41.remove(byte_array44);
    java.lang.Integer i48 = bytearrayhashmap_i36.get(byte_array44, 0, 0);
    java.lang.Integer i50 = bytearrayhashmap_i22.put(byte_array44, (java.lang.Integer)1);
    java.lang.Integer i51 = bytearrayhashmap_i2.remove(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i51);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    boolean b5 = bytearrayhashmap_i1.isEmpty();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>((int)'a');
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_i10.keys();
    bytearrayhashmap_i10.clear();
    boolean b13 = bytearrayhashmap_i10.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_i15.keys();
    bytearrayhashmap_i15.clear();
    byte[] byte_array18 = new byte[] {  };
    java.lang.Integer i19 = bytearrayhashmap_i15.remove(byte_array18);
    java.lang.Integer i22 = bytearrayhashmap_i10.get(byte_array18, 0, 0);
    java.lang.Integer i23 = bytearrayhashmap_i8.remove(byte_array18);
    java.lang.Integer i24 = bytearrayhashmap_i1.get(byte_array18);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i25 = bytearrayhashmap_i1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i25);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = bytearrayhashmap_i0.duplicate();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_i4.keys();
    bytearrayhashmap_i4.clear();
    boolean b7 = bytearrayhashmap_i4.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i10 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array16 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b17 = bytearrayhashmap_i10.containsKey(byte_array16);
    java.lang.Integer i18 = bytearrayhashmap_i8.remove(byte_array16);
    java.lang.Integer i20 = bytearrayhashmap_i4.put(byte_array16, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i22 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_i22.keys();
    bytearrayhashmap_i22.clear();
    byte[] byte_array25 = new byte[] {  };
    java.lang.Integer i26 = bytearrayhashmap_i22.remove(byte_array25);
    java.lang.Integer i28 = bytearrayhashmap_i4.put(byte_array25, (java.lang.Integer)0);
    boolean b29 = bytearrayhashmap_i1.containsKey(byte_array25);
    boolean b30 = bytearrayhashmap_i1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)'#');

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i0.keys();
    byte[] byte_array4 = new byte[] { (byte)1 };
    boolean b5 = bytearrayhashmap_i0.containsKey(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b4 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array13 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b14 = bytearrayhashmap_i7.containsKey(byte_array13);
    java.lang.Integer i15 = bytearrayhashmap_i5.remove(byte_array13);
    java.lang.Integer i17 = bytearrayhashmap_i1.put(byte_array13, (java.lang.Integer)1);
    bytearrayhashmap_i1.clear();
    boolean b19 = bytearrayhashmap_i1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.lang.Integer i13 = bytearrayhashmap_i2.get(byte_array11);
    java.lang.Integer i15 = bytearrayhashmap_i0.put(byte_array11, (java.lang.Integer)(-1));
    java.util.List<java.lang.Integer> list_i16 = bytearrayhashmap_i0.values();
    java.util.List<java.lang.Integer> list_i17 = bytearrayhashmap_i0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i17);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)(short)100, (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i0.keys();
    java.util.List<java.lang.Integer> list_i3 = bytearrayhashmap_i0.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = bytearrayhashmap_i0.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i4);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i13 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b14 = bytearrayhashmap_i13.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b23 = bytearrayhashmap_i16.containsKey(byte_array22);
    java.lang.Integer i24 = bytearrayhashmap_i13.get(byte_array22);
    int i25 = bytearrayhashmap_i13.size();
    int i26 = bytearrayhashmap_i13.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i29 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array35 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b36 = bytearrayhashmap_i29.containsKey(byte_array35);
    java.lang.Integer i37 = bytearrayhashmap_i27.remove(byte_array35);
    boolean b38 = bytearrayhashmap_i27.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = bytearrayhashmap_i27.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b48 = bytearrayhashmap_i41.containsKey(byte_array47);
    boolean b49 = bytearrayhashmap_i39.containsKey(byte_array47);
    java.lang.Integer i51 = bytearrayhashmap_i13.put(byte_array47, (java.lang.Integer)1);
    java.lang.Integer i53 = bytearrayhashmap_i0.put(byte_array47, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i53);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = bytearrayhashmap_i0.duplicate();
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    bytearrayhashmap_i0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    bytearrayhashmap_i1.clear();
    int i5 = bytearrayhashmap_i1.size();
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i8 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array14 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b15 = bytearrayhashmap_i8.containsKey(byte_array14);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i17 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i18 = bytearrayhashmap_i17.values();
    boolean b19 = bytearrayhashmap_i17.isEmpty();
    bytearrayhashmap_i17.clear();
    int i21 = bytearrayhashmap_i17.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i22 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b23 = bytearrayhashmap_i22.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b25 = bytearrayhashmap_i24.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array33 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b34 = bytearrayhashmap_i27.containsKey(byte_array33);
    java.lang.Integer i35 = bytearrayhashmap_i24.get(byte_array33);
    java.lang.Integer i37 = bytearrayhashmap_i22.put(byte_array33, (java.lang.Integer)(-1));
    java.lang.Integer i38 = bytearrayhashmap_i17.remove(byte_array33);
    java.lang.Integer i39 = bytearrayhashmap_i8.remove(byte_array33);
    java.lang.Integer i40 = bytearrayhashmap_i1.remove(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i40);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.lang.Integer i13 = bytearrayhashmap_i2.get(byte_array11);
    java.lang.Integer i15 = bytearrayhashmap_i0.put(byte_array11, (java.lang.Integer)(-1));
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i17 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i18 = bytearrayhashmap_i17.values();
    boolean b19 = bytearrayhashmap_i17.isEmpty();
    bytearrayhashmap_i17.clear();
    int i21 = bytearrayhashmap_i17.size();
    bytearrayhashmap_i17.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array27 = bytearrayhashmap_i26.keys();
    bytearrayhashmap_i26.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i30 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array36 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b37 = bytearrayhashmap_i30.containsKey(byte_array36);
    java.lang.Integer i39 = bytearrayhashmap_i26.put(byte_array36, (java.lang.Integer)100);
    java.lang.Integer i40 = bytearrayhashmap_i24.remove(byte_array36);
    java.lang.Integer i41 = bytearrayhashmap_i17.remove(byte_array36);
    java.lang.Integer i43 = bytearrayhashmap_i0.put(byte_array36, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(100, (float)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(10, (float)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)(short)100);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    int i4 = bytearrayhashmap_i1.size();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_i1.keys();
    bytearrayhashmap_i1.clear();
    boolean b7 = bytearrayhashmap_i1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b23 = bytearrayhashmap_i16.containsKey(byte_array22);
    java.lang.Integer i24 = bytearrayhashmap_i14.remove(byte_array22);
    boolean b25 = bytearrayhashmap_i14.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i26 = bytearrayhashmap_i14.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i28 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array34 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b35 = bytearrayhashmap_i28.containsKey(byte_array34);
    boolean b36 = bytearrayhashmap_i26.containsKey(byte_array34);
    java.lang.Integer i38 = bytearrayhashmap_i0.put(byte_array34, (java.lang.Integer)1);
    byte[] byte_array45 = new byte[] { (byte)0, (byte)10, (byte)100, (byte)-1, (byte)10, (byte)-1 };
    java.lang.Integer i46 = bytearrayhashmap_i0.get(byte_array45);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i48 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i50 = new ByteArrayHashMap<java.lang.Integer>(1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i51 = bytearrayhashmap_i50.duplicate();
    bytearrayhashmap_i51.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i54 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i54.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i56 = bytearrayhashmap_i54.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i57 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i59 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array65 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b66 = bytearrayhashmap_i59.containsKey(byte_array65);
    java.lang.Integer i67 = bytearrayhashmap_i57.remove(byte_array65);
    java.lang.Integer i68 = bytearrayhashmap_i56.get(byte_array65);
    java.lang.Integer i69 = bytearrayhashmap_i51.remove(byte_array65);
    java.lang.Integer i71 = bytearrayhashmap_i48.put(byte_array65, (java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i74 = bytearrayhashmap_i0.get(byte_array65, (int)(byte)10, (int)(short)100);
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
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i71);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    java.util.List<java.lang.Integer> list_i4 = bytearrayhashmap_i1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i4);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array20 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b21 = bytearrayhashmap_i14.containsKey(byte_array20);
    boolean b22 = bytearrayhashmap_i12.containsKey(byte_array20);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i25 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i26 = bytearrayhashmap_i25.values();
    bytearrayhashmap_i25.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i29 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array30 = bytearrayhashmap_i29.keys();
    bytearrayhashmap_i29.clear();
    boolean b32 = bytearrayhashmap_i29.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i33 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i35 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array41 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b42 = bytearrayhashmap_i35.containsKey(byte_array41);
    java.lang.Integer i43 = bytearrayhashmap_i33.remove(byte_array41);
    java.lang.Integer i45 = bytearrayhashmap_i29.put(byte_array41, (java.lang.Integer)1);
    java.lang.Integer i47 = bytearrayhashmap_i25.put(byte_array41, (java.lang.Integer)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i50 = bytearrayhashmap_i12.get(byte_array41, (int)(byte)-1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i47);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i5 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array11 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b12 = bytearrayhashmap_i5.containsKey(byte_array11);
    java.lang.Integer i13 = bytearrayhashmap_i2.get(byte_array11);
    java.lang.Integer i15 = bytearrayhashmap_i0.put(byte_array11, (java.lang.Integer)(-1));
    java.util.List<java.lang.Integer> list_i16 = bytearrayhashmap_i0.values();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_i0.keys();
    int i18 = bytearrayhashmap_i0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    java.util.List<java.lang.Integer> list_i4 = bytearrayhashmap_i1.values();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_i1.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = bytearrayhashmap_i1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i6);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>((int)(short)100, (float)10);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i11 = bytearrayhashmap_i0.get(byte_array9);
    int i12 = bytearrayhashmap_i0.size();
    int i13 = bytearrayhashmap_i0.size();
    java.util.List<java.lang.Integer> list_i14 = bytearrayhashmap_i0.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i16 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i17 = bytearrayhashmap_i16.values();
    boolean b18 = bytearrayhashmap_i16.isEmpty();
    bytearrayhashmap_i16.clear();
    int i20 = bytearrayhashmap_i16.size();
    bytearrayhashmap_i16.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i25 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array26 = bytearrayhashmap_i25.keys();
    bytearrayhashmap_i25.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i29 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array35 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b36 = bytearrayhashmap_i29.containsKey(byte_array35);
    java.lang.Integer i38 = bytearrayhashmap_i25.put(byte_array35, (java.lang.Integer)100);
    java.lang.Integer i39 = bytearrayhashmap_i23.remove(byte_array35);
    java.lang.Integer i40 = bytearrayhashmap_i16.remove(byte_array35);
    java.lang.Integer i41 = bytearrayhashmap_i0.remove(byte_array35);
    java.util.List<byte[]> list_byte_array42 = bytearrayhashmap_i0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array42);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i14 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array20 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b21 = bytearrayhashmap_i14.containsKey(byte_array20);
    boolean b22 = bytearrayhashmap_i12.containsKey(byte_array20);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = bytearrayhashmap_i12.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i25 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i27 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array33 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b34 = bytearrayhashmap_i27.containsKey(byte_array33);
    java.lang.Integer i35 = bytearrayhashmap_i25.remove(byte_array33);
    boolean b36 = bytearrayhashmap_i25.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i37 = bytearrayhashmap_i25.duplicate();
    java.util.List<java.lang.Integer> list_i38 = bytearrayhashmap_i37.values();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b40 = bytearrayhashmap_i39.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i42 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array48 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b49 = bytearrayhashmap_i42.containsKey(byte_array48);
    java.lang.Integer i50 = bytearrayhashmap_i39.get(byte_array48);
    int i51 = bytearrayhashmap_i39.size();
    int i52 = bytearrayhashmap_i39.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i53 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i55 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array61 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b62 = bytearrayhashmap_i55.containsKey(byte_array61);
    java.lang.Integer i63 = bytearrayhashmap_i53.remove(byte_array61);
    boolean b64 = bytearrayhashmap_i53.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i65 = bytearrayhashmap_i53.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i67 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array73 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b74 = bytearrayhashmap_i67.containsKey(byte_array73);
    boolean b75 = bytearrayhashmap_i65.containsKey(byte_array73);
    java.lang.Integer i77 = bytearrayhashmap_i39.put(byte_array73, (java.lang.Integer)1);
    java.lang.Integer i78 = bytearrayhashmap_i37.get(byte_array73);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i81 = bytearrayhashmap_i12.get(byte_array73, (int)(short)0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i78);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>((int)(short)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b3 = bytearrayhashmap_i2.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b5 = bytearrayhashmap_i4.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i7 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array13 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b14 = bytearrayhashmap_i7.containsKey(byte_array13);
    java.lang.Integer i15 = bytearrayhashmap_i4.get(byte_array13);
    java.lang.Integer i17 = bytearrayhashmap_i2.put(byte_array13, (java.lang.Integer)(-1));
    java.util.List<java.lang.Integer> list_i18 = bytearrayhashmap_i2.values();
    java.util.List<byte[]> list_byte_array19 = bytearrayhashmap_i2.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i21 = new ByteArrayHashMap<java.lang.Integer>((int)(byte)0);
    java.util.List<byte[]> list_byte_array22 = bytearrayhashmap_i21.keys();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i24 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array25 = bytearrayhashmap_i24.keys();
    bytearrayhashmap_i24.clear();
    byte[] byte_array27 = new byte[] {  };
    java.lang.Integer i28 = bytearrayhashmap_i24.remove(byte_array27);
    java.lang.Integer i29 = bytearrayhashmap_i21.get(byte_array27);
    java.lang.Integer i30 = bytearrayhashmap_i2.remove(byte_array27);
    java.lang.Integer i31 = bytearrayhashmap_i1.remove(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i31);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i2 = bytearrayhashmap_i1.values();
    boolean b3 = bytearrayhashmap_i1.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = bytearrayhashmap_i1.duplicate();
    java.util.List<java.lang.Integer> list_i5 = bytearrayhashmap_i1.values();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_i1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i1.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = bytearrayhashmap_i1.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i4 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i6 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array12 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b13 = bytearrayhashmap_i6.containsKey(byte_array12);
    java.lang.Integer i14 = bytearrayhashmap_i4.remove(byte_array12);
    java.lang.Integer i15 = bytearrayhashmap_i3.get(byte_array12);
    boolean b16 = bytearrayhashmap_i3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    boolean b1 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i3 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b10 = bytearrayhashmap_i3.containsKey(byte_array9);
    java.lang.Integer i13 = bytearrayhashmap_i0.get(byte_array9, 0, (int)(byte)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(10);
    java.util.List<java.lang.Integer> list_i16 = bytearrayhashmap_i15.values();
    boolean b17 = bytearrayhashmap_i15.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i19 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array20 = bytearrayhashmap_i19.keys();
    bytearrayhashmap_i19.clear();
    boolean b22 = bytearrayhashmap_i19.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i23 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i25 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array31 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b32 = bytearrayhashmap_i25.containsKey(byte_array31);
    java.lang.Integer i33 = bytearrayhashmap_i23.remove(byte_array31);
    java.lang.Integer i35 = bytearrayhashmap_i19.put(byte_array31, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i37 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array38 = bytearrayhashmap_i37.keys();
    bytearrayhashmap_i37.clear();
    byte[] byte_array40 = new byte[] {  };
    java.lang.Integer i41 = bytearrayhashmap_i37.remove(byte_array40);
    java.lang.Integer i43 = bytearrayhashmap_i19.put(byte_array40, (java.lang.Integer)0);
    java.lang.Integer i44 = bytearrayhashmap_i15.remove(byte_array40);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i46 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i46.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i48 = bytearrayhashmap_i46.duplicate();
    boolean b49 = bytearrayhashmap_i48.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i51 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array52 = bytearrayhashmap_i51.keys();
    bytearrayhashmap_i51.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i55 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array61 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b62 = bytearrayhashmap_i55.containsKey(byte_array61);
    java.lang.Integer i64 = bytearrayhashmap_i51.put(byte_array61, (java.lang.Integer)100);
    java.lang.Integer i65 = bytearrayhashmap_i48.get(byte_array61);
    java.lang.Integer i67 = bytearrayhashmap_i15.put(byte_array61, (java.lang.Integer)1);
    java.lang.Integer i68 = bytearrayhashmap_i0.remove(byte_array61);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i70 = new ByteArrayHashMap<java.lang.Integer>(0);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i71 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i73 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array79 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b80 = bytearrayhashmap_i73.containsKey(byte_array79);
    java.lang.Integer i81 = bytearrayhashmap_i71.remove(byte_array79);
    java.lang.Integer i82 = bytearrayhashmap_i70.remove(byte_array79);
    java.lang.Integer i84 = bytearrayhashmap_i0.put(byte_array79, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i84);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i1 = new ByteArrayHashMap<java.lang.Integer>(1);
    bytearrayhashmap_i1.clear();

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }


    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i0 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i2 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array8 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b9 = bytearrayhashmap_i2.containsKey(byte_array8);
    java.lang.Integer i10 = bytearrayhashmap_i0.remove(byte_array8);
    boolean b11 = bytearrayhashmap_i0.isEmpty();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i12 = bytearrayhashmap_i0.duplicate();
    int i13 = bytearrayhashmap_i0.size();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i15 = new ByteArrayHashMap<java.lang.Integer>(0);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_i15.keys();
    bytearrayhashmap_i15.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i19 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array25 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b26 = bytearrayhashmap_i19.containsKey(byte_array25);
    java.lang.Integer i28 = bytearrayhashmap_i15.put(byte_array25, (java.lang.Integer)100);
    java.lang.Integer i30 = bytearrayhashmap_i0.put(byte_array25, (java.lang.Integer)1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i32 = new ByteArrayHashMap<java.lang.Integer>(1);
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i33 = bytearrayhashmap_i32.duplicate();
    bytearrayhashmap_i33.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i36 = new ByteArrayHashMap<java.lang.Integer>(0);
    bytearrayhashmap_i36.clear();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i38 = bytearrayhashmap_i36.duplicate();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i39 = new ByteArrayHashMap<java.lang.Integer>();
    ByteArrayHashMap<java.lang.Integer> bytearrayhashmap_i41 = new ByteArrayHashMap<java.lang.Integer>(0);
    byte[] byte_array47 = new byte[] { (byte)1, (byte)1, (byte)1, (byte)0, (byte)1 };
    boolean b48 = bytearrayhashmap_i41.containsKey(byte_array47);
    java.lang.Integer i49 = bytearrayhashmap_i39.remove(byte_array47);
    java.lang.Integer i50 = bytearrayhashmap_i38.get(byte_array47);
    java.lang.Integer i51 = bytearrayhashmap_i33.remove(byte_array47);
    java.lang.Integer i53 = bytearrayhashmap_i0.put(byte_array47, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 1+ "'", i53.equals(1));

  }

}
