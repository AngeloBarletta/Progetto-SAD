package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1_it2_livello2_it3_livello3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)0, (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b12 = bytearrayhashmap_b2.get(byte_array9, (int)(short)-1, (int)(byte)100);
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


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)100, (float)(byte)1);
    bytearrayhashmap_b2.clear();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((-1), (float)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b1 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    bytearrayhashmap_b1.clear();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b4 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    bytearrayhashmap_b4.clear();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b8 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array9 = new byte[] {  };
    java.lang.Boolean b11 = bytearrayhashmap_b8.put(byte_array9, (java.lang.Boolean)false);
    boolean b12 = bytearrayhashmap_b8.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b15 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array22 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b23 = bytearrayhashmap_b15.get(byte_array22);
    java.lang.Boolean b25 = bytearrayhashmap_b8.put(byte_array22, (java.lang.Boolean)false);
    java.lang.Boolean b26 = bytearrayhashmap_b4.remove(byte_array22);
    java.lang.Boolean b27 = bytearrayhashmap_b1.get(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b27);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b1 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)-1);
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
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)-1, (float)100);
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


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_b2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)100, (float)(byte)1);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b5 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array12 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b13 = bytearrayhashmap_b5.get(byte_array12);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b16 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b24 = bytearrayhashmap_b16.get(byte_array23);
    boolean b25 = bytearrayhashmap_b5.containsKey(byte_array23);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b28 = bytearrayhashmap_b2.get(byte_array23, 100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)(-1L));
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


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array3 = new byte[] {  };
    java.lang.Boolean b5 = bytearrayhashmap_b2.put(byte_array3, (java.lang.Boolean)false);
    boolean b6 = bytearrayhashmap_b2.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b9 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array10 = new byte[] {  };
    java.lang.Boolean b12 = bytearrayhashmap_b9.put(byte_array10, (java.lang.Boolean)false);
    boolean b13 = bytearrayhashmap_b9.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b16 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array23 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b24 = bytearrayhashmap_b16.get(byte_array23);
    boolean b25 = bytearrayhashmap_b9.containsKey(byte_array23);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b28 = bytearrayhashmap_b2.get(byte_array23, 1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b0 = new ByteArrayHashMap<java.lang.Boolean>();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b3 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array10 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b11 = bytearrayhashmap_b3.get(byte_array10);
    java.lang.Boolean b12 = bytearrayhashmap_b0.get(byte_array10);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b13 = new ByteArrayHashMap<java.lang.Boolean>();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b16 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array17 = new byte[] {  };
    java.lang.Boolean b19 = bytearrayhashmap_b16.put(byte_array17, (java.lang.Boolean)false);
    boolean b20 = bytearrayhashmap_b16.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b23 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array30 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b31 = bytearrayhashmap_b23.get(byte_array30);
    boolean b32 = bytearrayhashmap_b16.containsKey(byte_array30);
    java.lang.Boolean b34 = bytearrayhashmap_b13.put(byte_array30, (java.lang.Boolean)true);
    java.lang.Boolean b35 = bytearrayhashmap_b0.remove(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b35);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array3 = new byte[] {  };
    java.lang.Boolean b5 = bytearrayhashmap_b2.put(byte_array3, (java.lang.Boolean)false);
    boolean b6 = bytearrayhashmap_b2.isEmpty();
    java.util.List<java.lang.Boolean> list_b7 = bytearrayhashmap_b2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b0 = new ByteArrayHashMap<java.lang.Boolean>();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b3 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array4 = new byte[] {  };
    java.lang.Boolean b6 = bytearrayhashmap_b3.put(byte_array4, (java.lang.Boolean)false);
    boolean b7 = bytearrayhashmap_b3.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b10 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array17 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b18 = bytearrayhashmap_b10.get(byte_array17);
    boolean b19 = bytearrayhashmap_b3.containsKey(byte_array17);
    java.lang.Boolean b21 = bytearrayhashmap_b0.put(byte_array17, (java.lang.Boolean)true);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b24 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array25 = new byte[] {  };
    java.lang.Boolean b27 = bytearrayhashmap_b24.put(byte_array25, (java.lang.Boolean)false);
    boolean b28 = bytearrayhashmap_b24.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b31 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array38 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b39 = bytearrayhashmap_b31.get(byte_array38);
    java.lang.Boolean b41 = bytearrayhashmap_b24.put(byte_array38, (java.lang.Boolean)false);
    java.lang.Boolean b43 = bytearrayhashmap_b0.put(byte_array38, (java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b43 + "' != '" + true+ "'", b43.equals(true));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b0 = new ByteArrayHashMap<java.lang.Boolean>();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b3 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array4 = new byte[] {  };
    java.lang.Boolean b6 = bytearrayhashmap_b3.put(byte_array4, (java.lang.Boolean)false);
    boolean b7 = bytearrayhashmap_b3.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b10 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array17 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b18 = bytearrayhashmap_b10.get(byte_array17);
    boolean b19 = bytearrayhashmap_b3.containsKey(byte_array17);
    java.lang.Boolean b21 = bytearrayhashmap_b0.put(byte_array17, (java.lang.Boolean)true);
    int i22 = bytearrayhashmap_b0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b3 = bytearrayhashmap_b2.duplicate();
    java.util.List<java.lang.Boolean> list_b4 = bytearrayhashmap_b2.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b6 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    java.util.List<java.lang.Boolean> list_b7 = bytearrayhashmap_b6.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b9 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    bytearrayhashmap_b9.clear();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b13 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array14 = new byte[] {  };
    java.lang.Boolean b16 = bytearrayhashmap_b13.put(byte_array14, (java.lang.Boolean)false);
    boolean b17 = bytearrayhashmap_b13.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b20 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array27 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b28 = bytearrayhashmap_b20.get(byte_array27);
    java.lang.Boolean b30 = bytearrayhashmap_b13.put(byte_array27, (java.lang.Boolean)false);
    java.lang.Boolean b31 = bytearrayhashmap_b9.remove(byte_array27);
    java.lang.Boolean b34 = bytearrayhashmap_b6.get(byte_array27, 1, (int)(short)1);
    boolean b35 = bytearrayhashmap_b2.containsKey(byte_array27);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b38 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array39 = new byte[] {  };
    java.lang.Boolean b41 = bytearrayhashmap_b38.put(byte_array39, (java.lang.Boolean)false);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Boolean b44 = bytearrayhashmap_b2.get(byte_array39, 10, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b41);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b2 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b3 = bytearrayhashmap_b2.duplicate();
    java.util.List<java.lang.Boolean> list_b4 = bytearrayhashmap_b2.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b6 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    java.util.List<java.lang.Boolean> list_b7 = bytearrayhashmap_b6.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b9 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    bytearrayhashmap_b9.clear();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b13 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array14 = new byte[] {  };
    java.lang.Boolean b16 = bytearrayhashmap_b13.put(byte_array14, (java.lang.Boolean)false);
    boolean b17 = bytearrayhashmap_b13.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b20 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array27 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b28 = bytearrayhashmap_b20.get(byte_array27);
    java.lang.Boolean b30 = bytearrayhashmap_b13.put(byte_array27, (java.lang.Boolean)false);
    java.lang.Boolean b31 = bytearrayhashmap_b9.remove(byte_array27);
    java.lang.Boolean b34 = bytearrayhashmap_b6.get(byte_array27, 1, (int)(short)1);
    boolean b35 = bytearrayhashmap_b2.containsKey(byte_array27);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b36 = new ByteArrayHashMap<java.lang.Boolean>();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b39 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b40 = bytearrayhashmap_b39.duplicate();
    java.util.List<java.lang.Boolean> list_b41 = bytearrayhashmap_b39.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b43 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    java.util.List<java.lang.Boolean> list_b44 = bytearrayhashmap_b43.values();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b46 = new ByteArrayHashMap<java.lang.Boolean>((int)(byte)1);
    bytearrayhashmap_b46.clear();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b50 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array51 = new byte[] {  };
    java.lang.Boolean b53 = bytearrayhashmap_b50.put(byte_array51, (java.lang.Boolean)false);
    boolean b54 = bytearrayhashmap_b50.isEmpty();
    ByteArrayHashMap<java.lang.Boolean> bytearrayhashmap_b57 = new ByteArrayHashMap<java.lang.Boolean>((int)(short)0, (float)100L);
    byte[] byte_array64 = new byte[] { (byte)1, (byte)100, (byte)0, (byte)10, (byte)100, (byte)0 };
    java.lang.Boolean b65 = bytearrayhashmap_b57.get(byte_array64);
    java.lang.Boolean b67 = bytearrayhashmap_b50.put(byte_array64, (java.lang.Boolean)false);
    java.lang.Boolean b68 = bytearrayhashmap_b46.remove(byte_array64);
    java.lang.Boolean b71 = bytearrayhashmap_b43.get(byte_array64, 1, (int)(short)1);
    boolean b72 = bytearrayhashmap_b39.containsKey(byte_array64);
    java.lang.Boolean b74 = bytearrayhashmap_b36.put(byte_array64, (java.lang.Boolean)false);
    boolean b75 = bytearrayhashmap_b2.containsKey(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_b40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_b44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

}
